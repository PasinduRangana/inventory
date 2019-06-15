package abans;

import java.sql.*;
import dao.database;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class productController {
    
    public static boolean savestock_code(String stock_code) {
        Connection con = null;
        CallableStatement csmt = null;
        boolean t = true;
        try {
            con = database.getConnection();
            csmt = con.prepareCall("{CALL saveProduct(?)}");
            csmt.setString(1, stock_code);
            t = csmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                csmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return t;
    }

    //---------------------------------------------------------------------------------------------------------------
    public static void loadCombo(JComboBox combo) {
      Connection con =null;
      CallableStatement csmt = null; 
      ResultSet rs=null;
      
        try {
            con = database.getConnection();
            csmt = con.prepareCall("{CALL listProduct( )}");
           // csmt = con.prepareCall("{CALL listProduct( ) ORDER BY pname ASC}");
            csmt.execute();
            rs = csmt.getResultSet();
            List pList = new ArrayList();
            while(rs.next()){
            pList.add(rs.getString(1));
            }
            
           combo.setModel(new DefaultComboBoxModel(pList.toArray()));
           combo.insertItemAt("", 0);
           combo.setSelectedIndex(0);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     try {
                con.close();
                csmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }

   ////////////////////////////////////////////////////////////////////////////////
      public static void loadComboa(JComboBox combo) {
        Connection con = null;
        CallableStatement csmt = null;
        ResultSet rs = null;
        
        try {
            con = database.getConnection();
            csmt = con.prepareCall("{CALL sup_info( )}");
            
            // csmt = con.prepareCall("{CALL listProduct( ) ORDER BY pname ASC}");
            csmt.execute();
            rs = csmt.getResultSet();
            List pListtt = new ArrayList();
            while (rs.next()) {
                pListtt.add(rs.getString(1));
            }
            
            combo.setModel(new DefaultComboBoxModel(pListtt.toArray()));
            combo.insertItemAt(" ", 1);
            combo.setSelectedIndex(1);
            
        } catch (Exception e) {
          //  e.printStackTrace();
        }
        try {
            con.close();
            csmt.close();
        } catch (SQLException e ) {
          //  ex.printStackTrace();
        }
        
    }


    //////////////////////////////////////////////////////////////////////////////
    
    public static boolean savepurchase(String stock_code, String dealerPrice, String date, String qty) {
        Connection con = null;
        CallableStatement csmt = null;
        boolean t = true;
        try {
            con = database.getConnection();
            csmt = con.prepareCall("{CALL save_purchase(getProductId(?),?,?,?)}");
            csmt.setString(1, stock_code);
            csmt.setString(2, dealerPrice);
            csmt.setString(3, date);
            csmt.setString(4, qty);
            
            t = csmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                csmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return t;
    }
    
    public static boolean savesale(String stock_code, String dealerPrice, String date, String qty) {
        Connection con = null;
        CallableStatement csmt = null;
        boolean t = true;
        try {
            con = database.getConnection();
            csmt = con.prepareCall("{CALL save_sale(getProductId(?),?,?,?)}");
            // csmt = con.prepareCall("{CALL save_sale(getProductId(?),?,?,?) ORDER BY pname ASC}");
            csmt.setString(1, stock_code);
            csmt.setString(2, dealerPrice);
            csmt.setString(3, date);
            csmt.setString(4, qty);
            
            t = csmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                csmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return t;
    }
}
