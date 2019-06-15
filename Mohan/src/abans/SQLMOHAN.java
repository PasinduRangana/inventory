/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abans;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Pasindu
 */
public class SQLMOHAN {
    
 public static Connection CDB(){
 
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan","root","1234");
      
   
            
                    
                   
            return con;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    
    }
    
}


