/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abans;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;  
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import abans.inventry;
import dao.database;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import net.proteanit.sql.DbUtils;
import org.xml.sax.Attributes;
/**
 *
 * @author pasindu
 */
public class addUser extends javax.swing.JFrame {
  Connection con = null;
    PreparedStatement ps = null;
    CallableStatement csmt = null;
    ResultSet rs = null;
    /**
     * Creates new form addUser
     */
    public addUser() {
        initComponents();
              con = database.getConnection();
        PreparedStatement ps = null;
        CallableStatement csmt = null;
        ResultSet rs = null;
    }
  public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAdmin_saveBIGbtn = new javax.swing.JButton();
        jButtonadmin_addData_Bigbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFielduser_NIC = new javax.swing.JTextField();
        jTextFielduser_Contact = new javax.swing.JTextField();
        jButtonuser_Delete = new javax.swing.JButton();
        jButtonuser_save = new javax.swing.JButton();
        jButtonuser_search = new javax.swing.JButton();
        jButtonuser_update = new javax.swing.JButton();
        jTextFielduser_Name = new javax.swing.JTextField();
        jPasswordad_us_password = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreauser_Address = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        time1 = new javax.swing.JLabel();
        jButtonAdmin_saveBIGbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1393, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/User-Group-icon.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButtonAdmin_saveBIGbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAdmin_saveBIGbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Sale-icon.png"))); // NOI18N
        jButtonAdmin_saveBIGbtn.setText("Sale");
        jButtonAdmin_saveBIGbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_saveBIGbtnActionPerformed(evt);
            }
        });

        jButtonadmin_addData_Bigbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonadmin_addData_Bigbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/payment-icon.png"))); // NOI18N
        jButtonadmin_addData_Bigbtn.setText("Purchase");
        jButtonadmin_addData_Bigbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadmin_addData_BigbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("ADD USER");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("NIC");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Address");
        jLabel7.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Contact");
        jLabel9.setToolTipText("");

        jTextFielduser_NIC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFielduser_NIC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFielduser_Contact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFielduser_Contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButtonuser_Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonuser_Delete.setForeground(new java.awt.Color(0, 102, 102));
        jButtonuser_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Status-dialog-error-icon.png"))); // NOI18N
        jButtonuser_Delete.setText("Delete");
        jButtonuser_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonuser_DeleteActionPerformed(evt);
            }
        });

        jButtonuser_save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonuser_save.setForeground(new java.awt.Color(0, 102, 102));
        jButtonuser_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/save-icon.png"))); // NOI18N
        jButtonuser_save.setText("Save");
        jButtonuser_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonuser_saveActionPerformed(evt);
            }
        });

        jButtonuser_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonuser_search.setForeground(new java.awt.Color(0, 102, 102));
        jButtonuser_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Search-icon.png"))); // NOI18N
        jButtonuser_search.setText("Search");
        jButtonuser_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonuser_searchActionPerformed(evt);
            }
        });

        jButtonuser_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonuser_update.setForeground(new java.awt.Color(0, 102, 102));
        jButtonuser_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Update-icon.png"))); // NOI18N
        jButtonuser_update.setText("Update");
        jButtonuser_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonuser_updateActionPerformed(evt);
            }
        });

        jTextFielduser_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFielduser_Name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPasswordad_us_password.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPasswordad_us_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextAreauser_Address.setColumns(20);
        jTextAreauser_Address.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jTextAreauser_Address.setRows(5);
        jTextAreauser_Address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextAreauser_Address);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIC", "Name", "Password", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        time1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(0, 102, 51));
        time1.setText("Ocean IT Solution - 071 5846223 / 076 4014355 / 072 1888080");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFielduser_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordad_us_password, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielduser_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielduser_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonuser_save, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonuser_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonuser_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonuser_update, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(time1)
                        .addGap(101, 101, 101))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFielduser_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFielduser_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jPasswordad_us_password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFielduser_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonuser_save, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonuser_search, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonuser_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonuser_update, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(time1)
                        .addContainerGap())))
        );

        jButtonAdmin_saveBIGbtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAdmin_saveBIGbtn1.setForeground(new java.awt.Color(0, 153, 153));
        jButtonAdmin_saveBIGbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/calendar-icon.png"))); // NOI18N
        jButtonAdmin_saveBIGbtn1.setText("Hire Sale");
        jButtonAdmin_saveBIGbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_saveBIGbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(586, 586, 586)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(499, 499, 499))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonadmin_addData_Bigbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdmin_saveBIGbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAdmin_saveBIGbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdmin_saveBIGbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonadmin_addData_Bigbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonAdmin_saveBIGbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonuser_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonuser_saveActionPerformed

        
String NIC=jTextFielduser_NIC.getText();
String name=jTextFielduser_Name.getText();
String password=jPasswordad_us_password.getText();
String contact=jTextFielduser_Contact.getText(); 
String address=jTextAreauser_Address.getText();

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs= null;
        try {
            
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan","root","1234");
           pstmt =conn.prepareStatement("insert into users values(?,?,?,?,?)");
            
            pstmt.setString(1,NIC);
            pstmt.setString(2,name);
            pstmt.setString(3,password);
            pstmt.setString(4,contact);
            pstmt.setString(5,address);
            
            int i=pstmt.executeUpdate(); 
          
            
            if(i>0){
            
                String q = "select * from users";
                pstmt = conn.prepareStatement(q);
                rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                JOptionPane.showMessageDialog(null, "Data is Saved");
                
             jTextFielduser_NIC.setText(null);
             jTextFielduser_Name.setText(null);
             jPasswordad_us_password.setText(null);
             jTextFielduser_Contact.setText(null);
             jTextAreauser_Address.setText(null);
             
            
            }
            
            else{
        JOptionPane.showMessageDialog(null, "Data is not saved");
        
        
        }
            
        } 
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_jButtonuser_saveActionPerformed

    private void jButtonuser_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonuser_searchActionPerformed
       
                
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","1234");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan","root","1234");
            
            ps=con.prepareStatement("SELECT * from users where NIC =?");
        int i;
            ps.setString(1,String.valueOf(jTextFielduser_NIC.getText()));
        //   ps.setString(jTextFielduser_NIC.getText());

            rs=ps.executeQuery();
            
            while(rs.next())
            {
            
            jTextFielduser_NIC.setText(rs.getString("NIC"));
            jTextFielduser_Name.setText(rs.getString("name"));
            jPasswordad_us_password.setText(rs.getString("password"));
            jTextFielduser_Contact.setText(rs.getString("contact"));
            jTextAreauser_Address.setText(rs.getString("address"));
            }
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
     
        
        
    }//GEN-LAST:event_jButtonuser_searchActionPerformed

    private void jButtonuser_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonuser_DeleteActionPerformed
       
        Connection conn=null;
        PreparedStatement pstmt=null;
        Connection con;
        PreparedStatement ps;
        ResultSet rs;

                try {
            
          Class.forName("com.mysql.jdbc.Driver");
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan","root","1234");
          
          String sql=("Delete from users where NIC=?");
          
          PreparedStatement st= conn.prepareStatement(sql);
          st.setString(1,jTextFielduser_NIC.getText());
          st.executeUpdate();
          JOptionPane.showMessageDialog(this,"Deleted");

           jTextFielduser_NIC.setText(null);
           jTextFielduser_Name.setText(null);
           jPasswordad_us_password.setText(null);
           jTextFielduser_Contact.setText(null);
           jTextAreauser_Address.setText(null);
             
        } catch (Exception e) {
        
         JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
                
    }//GEN-LAST:event_jButtonuser_DeleteActionPerformed

    private void jButtonuser_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonuser_updateActionPerformed
       

Connection conn=null;
PreparedStatement pstmt=null;
ResultSet rs;
      
        try {
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan","root","1234");
          
            
            
           Statement st=c.createStatement();
                    
         
            
        st.executeUpdate("update users SET name='"+jTextFielduser_Name.getText()+"',password= '"+jPasswordad_us_password.getText()+"',contact= '"+jTextFielduser_Contact.getText()+"',address= '"+jTextAreauser_Address.getText()+"'WHERE NIC='"+jTextFielduser_NIC.getText()+"'");
        

         // JOptionPane.showConfirmDialog(rootPane, "Do you want to update this");
        JOptionPane.showMessageDialog(rootPane, "Updated!");
            jTextFielduser_NIC.setText(null);
             jTextFielduser_Name.setText(null);
             jPasswordad_us_password.setText(null);
             jTextFielduser_Contact.setText(null);
             jTextAreauser_Address.setText(null);
        
        }catch(Exception e){
        
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_jButtonuser_updateActionPerformed

    private void jButtonAdmin_saveBIGbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_saveBIGbtnActionPerformed
      
          cash_sale info = new cash_sale();
   info.setVisible(true);
   close();
   
    }//GEN-LAST:event_jButtonAdmin_saveBIGbtnActionPerformed

    private void jButtonadmin_addData_BigbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadmin_addData_BigbtnActionPerformed
inventry info = new inventry();
info.setVisible(true);
   close();
    }//GEN-LAST:event_jButtonadmin_addData_BigbtnActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
     
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             
             
            Connection conn=null;
            PreparedStatement pstmt=null;
            ResultSet rs= null;      
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan","root","1234");
            String q = "select * from users";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        
      
        
        
        }
            
        
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        } 
             
             
             
             
         }   
    }//GEN-LAST:event_jTable1KeyPressed

    private void jButtonAdmin_saveBIGbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_saveBIGbtn1ActionPerformed

        sales info = new sales();
        info.setVisible(true);
        // SystemExit();
        close();
    }//GEN-LAST:event_jButtonAdmin_saveBIGbtn1ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
         String q = "select* from users";
        try {
            ps = con.prepareStatement(q);

            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jTable1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin_saveBIGbtn;
    private javax.swing.JButton jButtonAdmin_saveBIGbtn1;
    private javax.swing.JButton jButtonadmin_addData_Bigbtn;
    private javax.swing.JButton jButtonuser_Delete;
    private javax.swing.JButton jButtonuser_save;
    private javax.swing.JButton jButtonuser_search;
    private javax.swing.JButton jButtonuser_update;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordad_us_password;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreauser_Address;
    private javax.swing.JTextField jTextFielduser_Contact;
    private javax.swing.JTextField jTextFielduser_NIC;
    private javax.swing.JTextField jTextFielduser_Name;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}
