
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.* ;
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
public class THE_CONNECTION {
    private static String servername="localhost";
    private static String dbname ="realestate";
    private static String username = "root";
    private static Integer portnumber = 4306;
    private static String password = "";
    
    
    //creating a function to get the connection
    public static Connection getTheConnection(){
        Connection connection = null;
        MysqlDataSource datasource  = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            connection = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
       return connection;
    }
}