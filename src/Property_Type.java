
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Property_Type {
    private int id;
    private String name;
    private String description;
    
   
    public Integer getId(){
        return id;
    }
    public void setId(Integer Id){
        this.id=Id;
    }
    public String getName(){
        return name;
    }
    public void setName(String NAME){
        this.name = NAME;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String DESCRIPTION){
        this.description = DESCRIPTION;
    }
    
    //constructors
    public Property_Type(){}
        public Property_Type(Integer ID,String NAME,String DESCRIPTION){
            this.id=ID;
            this.name=NAME;
            this.description=DESCRIPTION;
    }
   // function to add-remove-edit 
    public boolean execTypeQuery(String queryType,Property_Type type){
        PreparedStatement ps;
        if(queryType.equals("add")){
            try{
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement("INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)");
            ps.setString(1,type.getName());
            ps.setString(2,type.getDescription());
            
           return (ps.executeUpdate()>0);
            }
            catch (SQLException ex) {
            Logger.getLogger(Property_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }
        else if(queryType.equals("edit")){
            try{
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement("UPDATE `property_type` SET `name`=?,`description`=? WHERE `id` = ?");
            ps.setString(1,type.getName());
            ps.setString(2,type.getDescription());
            ps.setInt(3,type.getId());
           return (ps.executeUpdate()>0);
            }
            catch (SQLException ex) {
            Logger.getLogger(Property_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }
        else if(queryType.equals("remove")){
            try{
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement("DELETE FROM `property_type` WHERE `id` = ?");
            ps.setInt(1,type.getId());
           return (ps.executeUpdate()>0);
            }
            catch (SQLException ex) {
            Logger.getLogger(Property_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter The Correct Query (add,edit,remove)","Invalid Operation",2);
            return false;
        }
    }
    //create a function to return a list of all types in hashmap
    public HashMap<String,Integer>getTypesMap(){
        HashMap<String,Integer>map = new HashMap<>();
        Statement st;
        ResultSet rs;
        try{
            st = (Statement) THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `property_type`");
            Property_Type type;
            while(rs.next()){
                type = new Property_Type(rs.getInt(1),rs.getString(2),rs.getString(3));
                map.put(type.getName(),type.getId());
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Enter the Valid Type Id","Invalid ID",0);
        }
        return map;
    }
    // create a function to get the type data by id
    public Property_Type getTypeById(Integer id){
            PreparedStatement ps;
            ResultSet rs;
            Property_Type type = new Property_Type();;

            try{
                    ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement("SELECT * FROM `property_type` WHERE `id`=?");
                    ps.setInt(1,id);
                    rs = ps.executeQuery();

                    if(rs.next()){
                        type.setId(id);
                        type.setName(rs.getString(2));
                        type.setDescription(rs.getString(3));
                        }
                }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Enter the Valid Type Id","Invalid ID",0);
        }
           return type; 
    }
}