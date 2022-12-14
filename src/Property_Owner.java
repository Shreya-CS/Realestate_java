
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Property_Owner {
    public int id;
    public String firstname;
    public String lastname;
    public String phone;
    public String email;
    public String address;
    
    public int getId()
    {
        return this.id;
    }
    public void setId(int Id)
    {
        this.id = Id;
    }
    public String getFname(){
        return this.firstname;
    }
     public void setFname(String Fname)
    {
        this.firstname = Fname;
    }
    public String getLname(){
        return this.lastname;
    }
     public void setLname(String Lname)
    {
        this.lastname = Lname;
    }
     public String getPhone(){
        return this.phone;
    }
     public void setPhone(String Phone)
    {
        this.phone = Phone;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String Email)
    {
        this.email = Email;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String Address)
    {
        this.address = Address;
    }
    
    public Property_Owner(){}
    public Property_Owner(int Id,String Fname,String Lname,String Phone,String Email,String Address){
        this.id = Id;
        this.firstname = Fname;
        this.lastname = Lname;
        this.phone = Phone;
        this.email = Email;
        this.address = Address;
    }
    
    //function to add new owner
    public boolean addNewOwner(Property_Owner owner){
        PreparedStatement ps;
        String addQuery = "INSERT INTO `property_owner`(`firstname`, `lastname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        try{
        ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
        ps.setString(1,owner.getFname());
        ps.setString(2,owner.getLname());
        ps.setString(3,owner.getPhone());
        ps.setString(4,owner.getEmail());
        ps.setString(5,owner.getAddress());
        
        return(ps.executeUpdate()>0);
        }
        catch (SQLException ex) {
            Logger.getLogger(Property_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //function to edit the owner data
    public boolean editOwnerData(Property_Owner owner){
        PreparedStatement ps;
        String editQuery = "UPDATE `property_owner` SET `firstname`= ?,`lastname`=?,`phone`= ?,`email`= ?,`address`= ? WHERE `id` = ?";
        try{
        ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
        ps.setString(1,owner.getFname());
        ps.setString(2,owner.getLname());
        ps.setString(3,owner.getPhone());
        ps.setString(4,owner.getEmail());
        ps.setString(5,owner.getAddress());
        ps.setInt(6,owner.getId());
        
        return(ps.executeUpdate()>0);
        }
        catch (SQLException ex) {
            Logger.getLogger(Property_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     //function to delete the onwer data
    public boolean deleteOwnerData(int ownerId){
        PreparedStatement ps;
        String deleteQuery = "DELETE FROM `property_owner` WHERE `id` = ?";
        try{
        ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
        ps.setInt(1,ownerId);
        
        return(ps.executeUpdate()>0);
        }
        catch (SQLException ex) {
            Logger.getLogger(Property_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     //show the owners in the array list
    public ArrayList<Property_Owner> ownersList(){
         ArrayList<Property_Owner> list = new ArrayList<>();
         
         Statement st;
         ResultSet rs;
         String selectQuery = "SELECT * FROM `property_owner`";
         
         try{
             st = (Statement) THE_CONNECTION.getTheConnection().createStatement();
             rs = st.executeQuery(selectQuery);
             
             Property_Owner owner;
             while(rs.next()){
                 owner = new Property_Owner(rs.getInt(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5),
                         rs.getString(6));
                 list.add(owner);
             }

         }
         catch(SQLException ex) {
            Logger.getLogger(Property_Owner.class.getName()).log(Level.SEVERE, null, ex);
         }
         return list;
    }
}