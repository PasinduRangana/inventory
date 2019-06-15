
package dao;

// @author Gihan
import java.sql.*;


public class database {
    public static Connection getConnection(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan","root","1234");
            return con;
            
            
        } catch (Exception e) {
            System.err.println("Connection error");
            return null;
        }
    
    }
    
    
}
