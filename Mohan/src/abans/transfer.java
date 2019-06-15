/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abans;

import dao.database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import abans.productController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class transfer extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    CallableStatement csmt = null;
    ResultSet rs = null;

    public transfer() {
        initComponents();

        showDate();
        con = database.getConnection();
        productController.loadCombo(jComboBoxTR);
        con = database.getConnection();
        PreparedStatement ps = null;
        CallableStatement csmt = null;
        ResultSet rs = null;
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }

    void showDate() {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_date.setText(s.format(d));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTR = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Available_qty = new javax.swing.JLabel();
        jLabel_Avg_Purchase_price = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_cost = new javax.swing.JTextField();
        jTextField_sale_price = new javax.swing.JTextField();
        jTextField_date = new javax.swing.JTextField();
        jTextField_qty = new javax.swing.JTextField();
        jButton_get_paid = new javax.swing.JButton();
        jButton_Purches = new javax.swing.JButton();
        jButton_Sales = new javax.swing.JButton();
        jButton_Ad_User = new javax.swing.JButton();
        jButton_add_price = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel_oeean = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1TR = new javax.swing.JTable();
        jTextField_amount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 700));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("TRANSFER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 11, 220, -1));

        jComboBoxTR.setEditable(true);
        jComboBoxTR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxTR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxTR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTRItemStateChanged(evt);
            }
        });
        jComboBoxTR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTRMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxTRMousePressed(evt);
            }
        });
        jComboBoxTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTRActionPerformed(evt);
            }
        });
        jComboBoxTR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxTRKeyReleased(evt);
            }
        });
        jPanel1.add(jComboBoxTR, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 112, 830, 34));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Product Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 118, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Available Quantity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 168, -1, -1));

        jLabel_Available_qty.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Available_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Available_qty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 1, true));
        jPanel1.add(jLabel_Available_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 168, 240, 30));

        jLabel_Avg_Purchase_price.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Avg_Purchase_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Avg_Purchase_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 1, true));
        jPanel1.add(jLabel_Avg_Purchase_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 229, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Avg Purchase Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 229, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Quantity ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 387, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Cost");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 289, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Sale Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 338, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 492, -1, -1));

        jTextField_cost.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField_cost.setForeground(new java.awt.Color(0, 0, 204));
        jTextField_cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_costKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 287, 240, 31));

        jTextField_sale_price.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField_sale_price.setForeground(new java.awt.Color(0, 0, 204));
        jTextField_sale_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_sale_priceMousePressed(evt);
            }
        });
        jTextField_sale_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_sale_priceActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_sale_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 336, 240, 31));

        jTextField_date.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField_date.setForeground(new java.awt.Color(0, 0, 204));
        jTextField_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dateActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 483, 240, 31));

        jTextField_qty.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField_qty.setForeground(new java.awt.Color(0, 0, 204));
        jTextField_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_qtyKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 385, 240, 31));

        jButton_get_paid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_get_paid.setForeground(new java.awt.Color(0, 153, 153));
        jButton_get_paid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/calendar-icon.png"))); // NOI18N
        jButton_get_paid.setText("Hire Sale ");
        jButton_get_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_get_paidActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_get_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 51, 220, 95));

        jButton_Purches.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Purches.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Purches.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Ecommerce-Return-Purchase-icon.png"))); // NOI18N
        jButton_Purches.setText("Purches");
        jButton_Purches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PurchesActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Purches, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 168, 220, 98));

        jButton_Sales.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Sales.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Sale-icon.png"))); // NOI18N
        jButton_Sales.setText("Sales");
        jButton_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalesActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 287, 220, 98));

        jButton_Ad_User.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Ad_User.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Ad_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/user-add-icon.png"))); // NOI18N
        jButton_Ad_User.setText("Add User");
        jButton_Ad_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Ad_UserActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Ad_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 403, 220, 95));

        jButton_add_price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_add_price.setForeground(new java.awt.Color(0, 153, 153));
        jButton_add_price.setText("Add Price List");
        jButton_add_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_priceActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_add_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 518, 223, 101));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Transfer");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 87, 51));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Print");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 87, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Clear");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 93, 51));

        jLabel_oeean.setText("000");
        jPanel1.add(jLabel_oeean, new org.netbeans.lib.awtextra.AbsoluteConstraints(1273, 639, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1TR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1TR.setForeground(new java.awt.Color(255, 51, 51));
        jTable1TR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1TR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1TR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1TRMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1TRMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1TR);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 177, 574, 370));

        jTextField_amount.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField_amount.setForeground(new java.awt.Color(0, 0, 204));
        jTextField_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_amountMousePressed(evt);
            }
        });
        jPanel1.add(jTextField_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 434, 240, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Cost Amount");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 443, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("Date Wise Report");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 205, 51));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, 240, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Search");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 570, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTRItemStateChanged
        if (jComboBoxTR.getSelectedIndex() > 0) {
            Connection con = null;
            CallableStatement csmt = null;
            ResultSet rs = null;

            try {
                con = database.getConnection();
                csmt = con.prepareCall("{?= call getProductQty(?)}");
                csmt.registerOutParameter(1, java.sql.Types.INTEGER);
                csmt.setString(1, jComboBoxTR.getSelectedItem().toString());

                csmt.execute();
                int output = csmt.getInt(1);
                jLabel_Available_qty.setText(String.valueOf(output));

                ///
                csmt = con.prepareCall("CALL avg_price(getProductId(?))");
                csmt.setString(1, jComboBoxTR.getSelectedItem().toString());

                csmt.execute();
                rs = csmt.getResultSet();
                while (rs.next()) {

                    jLabel_Avg_Purchase_price.setText(rs.getString(1));

                    ps = con.prepareStatement("SELECT * from adddata where product =?");
                    int i;
                    ps.setString(1, (String) jComboBoxTR.getSelectedItem());

                    rs = ps.executeQuery();

                    while (rs.next()) {

                        //  jTextField_ItemCode.setText(rs.getString("stock_code"));
                        jTextField_cost.setText(rs.getString("Cost"));

                        String q = "select product,cost,sale_price,qty,date,cost_amount from transfer_p";
                        try {
                            ps = con.prepareStatement(q);

                            rs = ps.executeQuery();
                            jTable1TR.setModel(DbUtils.resultSetToTableModel(rs));
                        } catch (SQLException ex) {

                        }

                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    con.close();
                    csmt.close();
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }

        }
    }//GEN-LAST:event_jComboBoxTRItemStateChanged

    private void jComboBoxTRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTRMouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable1TR.getModel();
        int selectedRowIndex = jTable1TR.getSelectedRow();
        jComboBoxTR.setSelectedIndex(0);

        jComboBoxTR.setSelectedItem(model.getValueAt(selectedRowIndex, 0).toString());


    }//GEN-LAST:event_jComboBoxTRMouseClicked

    private void jComboBoxTRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTRMousePressed

    }//GEN-LAST:event_jComboBoxTRMousePressed

    private void jComboBoxTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTRActionPerformed

    }//GEN-LAST:event_jComboBoxTRActionPerformed

    private void jButton_get_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_get_paidActionPerformed

        sales info = new sales();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_get_paidActionPerformed

    private void jButton_PurchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PurchesActionPerformed
        inventry info = new inventry();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_PurchesActionPerformed

    private void jButton_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalesActionPerformed
        cash_sale info = new cash_sale();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_SalesActionPerformed

    private void jButton_Ad_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Ad_UserActionPerformed
        addUser info = new addUser();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_Ad_UserActionPerformed

    private void jButton_add_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_priceActionPerformed

        add_Price info = new add_Price();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_add_priceActionPerformed

    private void jTextField_costKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_costKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_costKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            String sql = ("Delete from transfer_p where print=?");
            //String sql = ("Delete from b_print where qty=?");

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, jLabel_oeean.getText());
            //st.setString(1, jTextField_Quentity.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted");
            clear();

            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String value = jComboBoxTR.getSelectedItem().toString();
        // String p_name = jTextField.getText();
        String cost = jTextField_cost.getText();
        String sale_price = jTextField_sale_price.getText();

        String qty = jTextField_qty.getText();
        String date = jTextField_date.getText();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            pstmt = con.prepareStatement("insert into transfer(product,cost,sale_price,qty,date)  values(?,?,?,?,?)");

            pstmt.setString(1, value);
            pstmt.setString(2, cost);
            pstmt.setString(3, sale_price);

            pstmt.setString(4, qty);
            pstmt.setString(5, date);

            int i = pstmt.executeUpdate();

            if (i > 0) {

                boolean bool = productController.savesale(jComboBoxTR.getSelectedItem().toString(), jLabel_oeean.getText(), jTextField_date.getText(), jTextField_qty.getText());

                if (!bool) {
                    // JOptionPane.showMessageDialog(rootPane, "Sale Saved");
                    productController.loadCombo(jComboBoxTR);
                    System.getenv("CLASSPATH");

                }
                clear();

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        String value = jComboBoxTR.getSelectedItem().toString();
        // String p_name = jTextField.getText();
        String cost = jTextField_cost.getText();
        String sale_price = jTextField_sale_price.getText();

        String qty = jTextField_qty.getText();
        String date = jTextField_date.getText();
        String print = jLabel_oeean.getText();
        String amount = jTextField_amount.getText();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            pstmt = con.prepareStatement("insert into transfer_p(product,cost,sale_price,qty,date,print,cost_amount) values(?,?,?,?,?,?,?)");

            pstmt.setString(1, value);
            pstmt.setString(2, cost);
            pstmt.setString(3, sale_price);

            pstmt.setString(4, qty);
            pstmt.setString(5, date);
            pstmt.setString(6, print);
            pstmt.setString(7, amount);

            int i = pstmt.executeUpdate();

            if (i > 0) {

                String q = "select product,cost,sale_price,qty,date,cost_amount from transfer_p";
                pstmt = con.prepareStatement(q);
                rs = pstmt.executeQuery();
                jTable1TR.setModel(DbUtils.resultSetToTableModel(rs));

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_jButton1MousePressed

    private void jTextField_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dateActionPerformed

    private void jTextField_amountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_amountMousePressed
        String price = jTextField_cost.getText();
        int price1 = Integer.parseInt(price);

        String qty = jTextField_qty.getText();
        int qty1 = Integer.parseInt(qty);

        //int zz = b + cc + d + e + f + g + h + j + k + l + m + n + o + p;
        int amount = price1 * qty1;
        String mins = Integer.toString(amount);
        jTextField_amount.setText(mins);


    }//GEN-LAST:event_jTextField_amountMousePressed

    private void jTable1TRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1TRMousePressed
        /*    String q = "select product,cost,sale_price,qty,date,cost_amount from transfer_p";
        try {
            ps = con.prepareStatement(q);

            rs = ps.executeQuery();
            jTable1TR.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {

        }
        
        
        
         */
    }//GEN-LAST:event_jTable1TRMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MessageFormat header = new MessageFormat("Transfer Report");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");

        try {
            jTable1TR.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {

            System.err.format("can not print %s %n", e.getMessage());

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_sale_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_sale_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_sale_priceActionPerformed

    private void jTextField_sale_priceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_sale_priceMousePressed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","1234");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("SELECT * from ptice_list where product_Name =?");
            int i;
            ps.setString(1, (String) jComboBoxTR.getSelectedItem());
            //   ps.setString(jTextFielduser_NIC.getText());

            rs = ps.executeQuery();

            while (rs.next()) {

                jTextField_sale_price.setText(rs.getString("price"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jTextField_sale_priceMousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("select product,cost,sale_price,qty,date from transfer where date=? ");
            // ps2 = con.prepareStatement("select * from re_turn where Item_Name =?");

            // 
            // ps.setString(2, String.valueOf(jTextField_Item_name1.getText()));
            ps.setString(1, String.valueOf(jTextField_date.getText()));

            rs = ps.executeQuery();
            jTable1TR.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {

                for (int i = 0; i < 1000000; i++) {
                    jTable1TR.setModel(DbUtils.resultSetToTableModel(rs));

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        try {

            String product = jTextField1.getText();
            ps = con.prepareStatement("SELECT pname FROM product where pname like '%" + product + "%'");

            rs = ps.executeQuery();
            jTable1TR.setModel(DbUtils.resultSetToTableModel(rs));

            while (rs.next()) {

                for (int i = 0; i < 1000000; i++) {
                    jTable1TR.setModel(DbUtils.resultSetToTableModel(rs));

                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1TRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1TRMouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable1TR.getModel();
        int selectedRowIndex = jTable1TR.getSelectedRow();
        jComboBoxTR.setSelectedIndex(0);

        jComboBoxTR.setSelectedItem(model.getValueAt(selectedRowIndex, 0).toString());

    }//GEN-LAST:event_jTable1TRMouseClicked

    private void jComboBoxTRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxTRKeyReleased


    }//GEN-LAST:event_jComboBoxTRKeyReleased

    private void jTextField_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_qtyKeyReleased
        String cost = jTextField_cost.getText();
        String qty = jTextField_qty.getText();
        double cost1 = Double.parseDouble(cost);
        double qty1 = Double.parseDouble(qty);
        double amount = cost1 * qty1;
        String amountt = Double.toString(amount);
        jTextField_amount.setText(amountt);

    }//GEN-LAST:event_jTextField_qtyKeyReleased

    private void clear() {
        jComboBoxTR.setSelectedIndex(0);
        jLabel_Available_qty.setText("0");
        jLabel_Avg_Purchase_price.setText("");
        jTextField_cost.setText("");
        jTextField_sale_price.setText("");
        jTextField_amount.setText("");

        jTextField_qty.setText("");

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_date.setText(s.format(d));

    }

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
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_Ad_User;
    private javax.swing.JButton jButton_Purches;
    private javax.swing.JButton jButton_Sales;
    private javax.swing.JButton jButton_add_price;
    private javax.swing.JButton jButton_get_paid;
    private javax.swing.JComboBox jComboBoxTR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Available_qty;
    private javax.swing.JLabel jLabel_Avg_Purchase_price;
    private javax.swing.JLabel jLabel_oeean;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1TR;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextField jTextField_cost;
    private javax.swing.JTextField jTextField_date;
    private javax.swing.JTextField jTextField_qty;
    private javax.swing.JTextField jTextField_sale_price;
    // End of variables declaration//GEN-END:variables
}
