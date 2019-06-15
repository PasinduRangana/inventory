/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abans;
//package employee_system;

import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;;

import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JRViewer;
//import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Gihan
 */
public class reportview {
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hasindu
 */


    public reportview(String fileName)
    {
      //  this(fileName, null);
    }
    public reportview(String fileName, HashMap para) throws SQLException
    {
  //      super("ABC Solutions Employee/Project Management System (Report Viewer)");

        //DataAccess dba = new DataAccess();
        //Connection con = dba.getConnection();
       java.sql.Connection conn = null;
        try
        {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            JasperPrint print = JasperFillManager.fillReport(fileName, para, conn);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            
        }
        setBounds(10, 10, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void setBounds(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


