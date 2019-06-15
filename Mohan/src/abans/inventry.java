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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class inventry extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    CallableStatement csmt = null;
    ResultSet rs = null;

    public inventry() {
        initComponents();

        productController.loadCombo(jComboBox);
        productController.loadComboa(jComboBox_suppler);
        showDate();

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
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_date.setText(s.format(d));
    }

    ////////////////////////////////////////////////////////////////////// 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_purchase = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField_date = new javax.swing.JTextField();
        jTextField_qty = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jLabel_avg_pur_price = new javax.swing.JLabel();
        jLabel_avl_qty = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        jButtonAdmin_saveBIGbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Stock_Code = new javax.swing.JTextField();
        jTextField_Customer_price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        time2 = new javax.swing.JLabel();
        jButtonReturn = new javax.swing.JButton();
        jButtonSales2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_suppler = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton_Print = new javax.swing.JButton();
        jButton_Sup_total = new javax.swing.JButton();
        jTextField_Stock_Amount = new javax.swing.JTextField();
        jTextField_total = new javax.swing.JTextField();
        jButton_Stock_code = new javax.swing.JButton();
        jButton_add_price = new javax.swing.JButton();
        jButton_Sup_total1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField_p_id = new javax.swing.JTextField();
        jButton_add_price1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Product Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Available Quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Avg Purchase Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Cost");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jButton_purchase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_purchase.setForeground(new java.awt.Color(0, 153, 153));
        jButton_purchase.setText("Purchase");
        jButton_purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_purchaseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton_purchaseMouseReleased(evt);
            }
        });
        jButton_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_purchaseActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 645, -1, 47));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 645, 117, 47));

        jTextField_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dateActionPerformed(evt);
            }
        });
        jTextField_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_dateKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 330, 250, 30));

        jTextField_qty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_qty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_qtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_qtyKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 240, 250, 30));

        jTextField_price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_priceMousePressed(evt);
            }
        });
        jTextField_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_priceKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 200, 250, 30));

        jLabel_avg_pur_price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_avg_pur_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel_avg_pur_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 160, 250, 30));

        jLabel_avl_qty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_avl_qty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel_avl_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 120, 250, 30));

        jComboBox.setEditable(true);
        jComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxItemStateChanged(evt);
            }
        });
        jComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxMouseReleased(evt);
            }
        });
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 70, 790, 34));

        jButtonAdmin_saveBIGbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAdmin_saveBIGbtn.setForeground(new java.awt.Color(0, 153, 153));
        jButtonAdmin_saveBIGbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/calendar-icon.png"))); // NOI18N
        jButtonAdmin_saveBIGbtn.setText("Hire Sale");
        jButtonAdmin_saveBIGbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_saveBIGbtnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdmin_saveBIGbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 79, 230, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/user-add-icon.png"))); // NOI18N
        jButton1.setText("Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Sale Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("PURCHASE ORDERING SYSTEM ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Model Number ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("DIS.Of Goods");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 38));

        jTextField_Stock_Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_Stock_Code.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField_Stock_Code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_Stock_CodeMouseClicked(evt);
            }
        });
        jTextField_Stock_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Stock_CodeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Stock_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 380, 250, 30));

        jTextField_Customer_price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_Customer_price.setForeground(new java.awt.Color(0, 0, 204));
        jTextField_Customer_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField_Customer_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Customer_priceMousePressed(evt);
            }
        });
        jTextField_Customer_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Customer_priceActionPerformed(evt);
            }
        });
        jTextField_Customer_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Customer_priceKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Customer_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 534, 249, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 444, 249, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 530, 310));

        time2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time2.setForeground(new java.awt.Color(0, 102, 51));
        time2.setText("Ocean IT Solution - 071 5846223 / 076 4014355 / 072 1888080");
        getContentPane().add(time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 670, -1, -1));

        jButtonReturn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonReturn.setForeground(new java.awt.Color(0, 153, 153));
        jButtonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/arrow-right-icon.png"))); // NOI18N
        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 352, 230, -1));

        jButtonSales2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSales2.setForeground(new java.awt.Color(0, 153, 153));
        jButtonSales2.setText("Sales");
        jButtonSales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSales2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSales2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 261, 230, 80));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Supplier");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, -1, 38));

        jComboBox_suppler.setEditable(true);
        jComboBox_suppler.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_suppler.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        jComboBox_suppler.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBox_suppler.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_supplerItemStateChanged(evt);
            }
        });
        jComboBox_suppler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_supplerActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_suppler, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 584, 250, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("Low");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 645, 117, 47));

        jButton_Print.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Print.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Print.setText("Print");
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, 130, 50));

        jButton_Sup_total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Sup_total.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Sup_total.setText("supplier Total ");
        jButton_Sup_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Sup_totalMousePressed(evt);
            }
        });
        jButton_Sup_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sup_totalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Sup_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 454, -1, 50));

        jTextField_Stock_Amount.setEditable(false);
        jTextField_Stock_Amount.setBackground(new java.awt.Color(102, 102, 102));
        jTextField_Stock_Amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_Stock_Amount.setForeground(new java.awt.Color(204, 204, 255));
        jTextField_Stock_Amount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField_Stock_Amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_Stock_AmountMouseClicked(evt);
            }
        });
        jTextField_Stock_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Stock_AmountActionPerformed(evt);
            }
        });
        jTextField_Stock_Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Stock_AmountKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Stock_Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 280, 250, 30));

        jTextField_total.setEditable(false);
        jTextField_total.setBackground(new java.awt.Color(102, 102, 102));
        jTextField_total.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_total.setForeground(new java.awt.Color(204, 204, 255));
        jTextField_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 514, 340, 90));

        jButton_Stock_code.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Stock_code.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Stock_code.setText("Stock Code");
        jButton_Stock_code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Stock_codeMousePressed(evt);
            }
        });
        jButton_Stock_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Stock_codeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Stock_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 110, 50));

        jButton_add_price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_add_price.setForeground(new java.awt.Color(0, 153, 153));
        jButton_add_price.setText("Add Price List");
        jButton_add_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_priceActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 436, 230, 71));

        jButton_Sup_total1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Sup_total1.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Sup_total1.setText("Today Purchase ");
        jButton_Sup_total1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Sup_total1MousePressed(evt);
            }
        });
        jButton_Sup_total1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sup_total1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Sup_total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, 140, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Change Product name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 170, 40));

        jTextField_p_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_p_id.setForeground(new java.awt.Color(51, 0, 153));
        jTextField_p_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField_p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 140, 40));

        jButton_add_price1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_add_price1.setForeground(new java.awt.Color(0, 153, 153));
        jButton_add_price1.setText("Add Supplier");
        jButton_add_price1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_add_price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_price1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 518, 230, 72));

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
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Search");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 520, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_purchaseActionPerformed
        String date = jTextField_date.getText();
        String stock_code = jTextField_Stock_Code.getText();
        String discription_of_goods = jTextArea1.getText();
        String qty = jTextField_qty.getText();
        String deeler_price = jTextField_price.getText();
        String coustomer_price = jTextField_Customer_price.getText();
        String amount = jTextField_Stock_Amount.getText();

        String value = jComboBox_suppler.getSelectedItem().toString();
        String product = jComboBox.getSelectedItem().toString();
        // String suppler = jComboBox_suppler.getText();
        //String id=jTextField_id.getText();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            // pstmt =conn.prepareStatement("insert into adddata values(?,?,?,?,?,?)");
            ps = con.prepareStatement("INSERT INTO adddata (date,stock_code,discription_of_goods,qty,Cost,Sale_price,suppler,amount,product)VALUES (?,?,?,?,?,?,?,?,?)");

            ps.setString(1, date);
            ps.setString(2, stock_code);
            ps.setString(3, discription_of_goods);
            ps.setString(4, qty);
            ps.setString(5, deeler_price);
            ps.setString(6, coustomer_price);
            ps.setString(7, value);
            ps.setString(8, amount);
            ps.setString(9, product);

            int i = ps.executeUpdate();

            //  jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if (i > 0) {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

                Statement st = con.createStatement();

                st.executeUpdate("update ptice_list SET price='" + jTextField_Customer_price.getText() + "' WHERE product_Name='" + jComboBox.getSelectedItem() + "'");

                // JOptionPane.showConfirmDialog(rootPane, "Do you want to update this");
                //JOptionPane.showMessageDialog(rootPane, "Updated!");
                jTextField_price.setText(null);

                jTextField_Stock_Code.setText(null);
                jTextArea1.setText(null);
                jTextField_qty.setText(null);
                jTextField_price.setText(null);
                jTextField_Customer_price.setText(null);
                jLabel_avg_pur_price.setText(null);
                jLabel_avl_qty.setText(null);
                jTextField_Stock_Amount.setText(null);
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                jTextField_date.setText(s.format(d));

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

        try {

            String price = jComboBox_suppler.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            ps = con.prepareStatement("insert into suppliers2(Suppliers) values(?)");

            ps.setString(1, price);
            int i = ps.executeUpdate();

            if (i > 0) {
                //  productController.loadCombo2(jComboBox_suppler);
                // String q = "select * from ptice_list order by product_Name ASC";
                //ps = con.prepareStatement(q);
                // rs = ps.executeQuery();
                //  jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                //  JOptionPane.showMessageDialog(null, "Data is Saved");
                // jTextField_sale_price.setText(null);
            } else {
                //   JOptionPane.showMessageDialog(null, "Data is not saved");

            }
        } catch (Exception e) {
            //   Logger.getLogger(inventry.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton_purchaseActionPerformed

    private void clear() {
        jComboBox.setSelectedIndex(0);
        jLabel_avg_pur_price.setText("0");
        jLabel_avl_qty.setText(null);

        jTextField_price.setText(null);
        jTextField_qty.setText(null);
        jTextField_Stock_Amount.setText(null);
        jTextField_Stock_Code.setText(null);
        jTextArea1.setText(null);
        jTextField_Customer_price.setText(null);
        jComboBox_suppler.setSelectedIndex(0);

    }


    private void jTextField_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dateActionPerformed

    }//GEN-LAST:event_jTextField_dateActionPerformed

    private void jComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxItemStateChanged
           if (jComboBox.getSelectedIndex() > 0) {
            Connection con = null;
            CallableStatement csmt = null;
            ResultSet rs = null;
            PreparedStatement ps = null;

            try {
                con = database.getConnection();
                csmt = con.prepareCall("{?= call getProductQty(?)}");
                csmt.registerOutParameter(1, java.sql.Types.INTEGER);
                csmt.setString(1, jComboBox.getSelectedItem().toString());

                csmt.execute();
                int output = csmt.getInt(1);
                jLabel_avl_qty.setText(String.valueOf(output));

                //-------------------------------------------------------------------------------------
                csmt = con.prepareCall("CALL avg_price(getProductId(?))");
                csmt.setString(1, jComboBox.getSelectedItem().toString());

                csmt.execute();
                rs = csmt.getResultSet();
                while (rs.next()) {

                    jLabel_avg_pur_price.setText(rs.getString(1));

                    ps = con.prepareStatement("SELECT * from adddata where product =?");
                    int i;
                    ps.setString(1, (String) jComboBox.getSelectedItem());

                    rs = ps.executeQuery();

                    while (rs.next()) {

                        jTextField_Stock_Code.setText(rs.getString("stock_code"));
                        jTextField_price.setText(rs.getString("Cost"));
                        jComboBox_suppler.setSelectedItem(rs.getString("suppler"));
                        jTextArea1.setText(rs.getString("discription_of_goods"));
                        
                        
                      
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
        
        
        
        
        
         
        if (jComboBox.getSelectedIndex() > 0) {

            try {
                con = database.getConnection();
                csmt = con.prepareCall("{?= call getProductQty(?)}");
                csmt.registerOutParameter(1, java.sql.Types.INTEGER);
                csmt.setString(1, jComboBox.getSelectedItem().toString());

                csmt.execute();
                int output = csmt.getInt(1);
                jLabel_avl_qty.setText(String.valueOf(output));

                csmt = con.prepareCall("CALL avg_price(getProductId(?))");
                csmt.setString(1, jComboBox.getSelectedItem().toString());

                csmt.execute();
                rs = csmt.getResultSet();
                while (rs.next()) {

                    jLabel_avg_pur_price.setText(rs.getString(1));

                    ps = con.prepareStatement("SELECT * from adddata where product =?");
                    int i;
                    ps.setString(1, (String) jComboBox.getSelectedItem());

                    rs = ps.executeQuery();

                    while (rs.next()) {

                        jTextField_Stock_Code.setText(rs.getString("stock_code"));
                        jTextField_price.setText(rs.getString("Cost"));
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


    }//GEN-LAST:event_jComboBoxItemStateChanged

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed

    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jButtonAdmin_saveBIGbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_saveBIGbtnActionPerformed

        sales info = new sales();
        info.setVisible(true);
        // SystemExit();
        close();

    }//GEN-LAST:event_jButtonAdmin_saveBIGbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addUser info = new addUser();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_date.setText(s.format(d));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_purchaseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_purchaseMousePressed

        if (jComboBox.getSelectedIndex() < 0) {
            productController.savestock_code(jComboBox.getSelectedItem().toString());

        }
        boolean bool = productController.savepurchase(jComboBox.getSelectedItem().toString(), jTextField_price.getText(), jTextField_date.getText(), jTextField_qty.getText());

        if (!bool) {
            JOptionPane.showMessageDialog(rootPane, "Purshase Saved");
            productController.loadCombo(jComboBox);

        }

    }//GEN-LAST:event_jButton_purchaseMousePressed

    private void jButton_purchaseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_purchaseMouseReleased
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select * from product";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_jButton_purchaseMouseReleased

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed

        re_tern info = new re_tern();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonSales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSales2ActionPerformed

        cash_sale info = new cash_sale();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButtonSales2ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
     /*
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select * from product";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        
        */
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMousePressed

    }//GEN-LAST:event_jComboBoxMousePressed

    private void jComboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMouseReleased
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select price from purchase where";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jComboBoxMouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int p1 = 3;
        int p2 = 0;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select pname,qty from product where qty between '" + p2 + "' and '" + p1 + "' order by qty ";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField_dateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_dateKeyPressed

        if (jComboBox.getSelectedIndex() < 0) {
            productController.savestock_code(jComboBox.getSelectedItem().toString());

        }
        boolean bool = productController.savepurchase(jComboBox.getSelectedItem().toString(), jTextField_price.getText(), jTextField_date.getText(), jTextField_qty.getText());

        if (!bool) {
            JOptionPane.showMessageDialog(rootPane, "Purshase Saved");
            productController.loadCombo(jComboBox);

        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_jTextField_dateKeyPressed

    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed
        int i = 10;

        MessageFormat header = new MessageFormat("Pubudu Trade Center ");
        MessageFormat footer = new MessageFormat(jTextField_date.getText());

        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {

            System.err.format("can not print %s %n", e.getMessage());

        }
    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void jButton_Sup_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sup_totalActionPerformed

        Connection con;
        PreparedStatement ps;
        // PreparedStatement ps2;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("select stock_code,product,suppler,qty,Cost,Sale_price from adddata where date=? AND suppler =?");
            // ps2 = con.prepareStatement("select * from re_turn where Item_Name =?");

            // 
            // ps.setString(2, String.valueOf(jTextField_Item_name1.getText()));
            ps.setString(1, String.valueOf(jTextField_date.getText()));
            ps.setString(2, String.valueOf(jComboBox_suppler.getSelectedItem()));

            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {

                for (int i = 0; i < 1000000; i++) {
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton_Sup_totalActionPerformed

    private void jTextField_Stock_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Stock_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Stock_AmountActionPerformed

    private void jTextField_Stock_AmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Stock_AmountMouseClicked

        /*String price = jTextField_price.getText();
        int price1 = Integer.parseInt(price);

        String qty = jTextField_qty.getText();
        int qty1 = Integer.parseInt(qty);

        //int zz = b + cc + d + e + f + g + h + j + k + l + m + n + o + p;
        int amount = price1 * qty1;
        String mins = Integer.toString(amount);
        jTextField_Stock_Amount.setText(mins);
         */
    }//GEN-LAST:event_jTextField_Stock_AmountMouseClicked

    private void jTextField_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalActionPerformed

    private void jButton_Sup_totalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Sup_totalMousePressed

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            String sql = "select sum(amount) from adddata where date =? AND suppler=?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(jTextField_date.getText()));
            pstmt.setString(2, String.valueOf(jComboBox_suppler.getSelectedItem()));
            rs = pstmt.executeQuery();

            if (rs.next()) {

                String sum = rs.getString("sum(amount)");
                jTextField_total.setText(sum);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton_Sup_totalMousePressed

    private void jTextField_Stock_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Stock_CodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Stock_CodeActionPerformed

    private void jTextField_Customer_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Customer_priceActionPerformed


    }//GEN-LAST:event_jTextField_Customer_priceActionPerformed

    private void jComboBox_supplerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_supplerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_supplerActionPerformed

    private void jButton_Stock_codeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Stock_codeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Stock_codeMousePressed

    private void jButton_Stock_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Stock_codeActionPerformed
        Connection con;
        PreparedStatement ps;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("select product,stock_code,suppler,qty,Cost,Sale_price from adddata where stock_code=?");

            ps.setString(1, String.valueOf(jTextField_Stock_Code.getText()));
            // ps.setString(2,String.valueOf(jTextSerch_ID.getText()));

            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {

                for (int i = 0; i < 1000000; i++) {
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_Stock_codeActionPerformed

    private void jButton_add_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_priceActionPerformed

        add_Price info = new add_Price();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_add_priceActionPerformed

    private void jTextField_Customer_priceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Customer_priceMousePressed
        Connection con;
        PreparedStatement ps;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","1234");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("SELECT * from ptice_list where product_Name =?");
            int i;
            ps.setString(1, (String) jComboBox.getSelectedItem());
            //   ps.setString(jTextFielduser_NIC.getText());

            rs = ps.executeQuery();

            while (rs.next()) {

                jTextField_Customer_price.setText(rs.getString("price"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jTextField_Customer_priceMousePressed

    private void jTextField_priceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_priceMousePressed

        Connection con;
        PreparedStatement ps;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","1234");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("SELECT * from ptice_list where product_Name =?");
            int i;
            ps.setString(1, (String) jComboBox.getSelectedItem());
            //   ps.setString(jTextFielduser_NIC.getText());

            rs = ps.executeQuery();

            while (rs.next()) {

                jTextField_Customer_price.setText(rs.getString("price"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jTextField_priceMousePressed

    private void jTextField_Stock_CodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Stock_CodeMouseClicked


    }//GEN-LAST:event_jTextField_Stock_CodeMouseClicked

    private void jButton_Sup_total1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Sup_total1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Sup_total1MousePressed

    private void jButton_Sup_total1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sup_total1ActionPerformed

        Connection con;
        PreparedStatement ps;
        // PreparedStatement ps2;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("select product,stock_code,suppler,qty,Cost,Sale_price from adddata where date=?");
            // ps2 = con.prepareStatement("select * from re_turn where Item_Name =?");

            // 
            // ps.setString(2, String.valueOf(jTextField_Item_name1.getText()));
            ps.setString(1, String.valueOf(jTextField_date.getText()));

            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {

                for (int i = 0; i < 1000000; i++) {
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton_Sup_total1ActionPerformed

    private void jTextField_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_priceKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_priceKeyTyped

    private void jTextField_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_qtyKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            // getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_qtyKeyTyped

    private void jTextField_Stock_AmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Stock_AmountKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_Stock_AmountKeyTyped

    private void jTextField_Customer_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Customer_priceKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_Customer_priceKeyTyped

    private void jTextArea1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MousePressed
        String price = jTextField_price.getText();
        double price1 = Double.parseDouble(price);

        String qty = jTextField_qty.getText();
        int qty1 = Integer.parseInt(qty);

        //int zz = b + cc + d + e + f + g + h + j + k + l + m + n + o + p;
        double amount = price1 * qty1;
        String mins = Double.toString(amount);
        jTextField_Stock_Amount.setText(mins);
    }//GEN-LAST:event_jTextArea1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            Statement st = con.createStatement();

            st.executeUpdate("update product SET pname='" + jComboBox.getSelectedItem() + "' WHERE p_id='" + jTextField_p_id.getText() + "'");

            // JOptionPane.showConfirmDialog(rootPane, "Do you want to update this");
            JOptionPane.showMessageDialog(rootPane, "Updated!");
            jTextField_price.setText(null);

        } catch (Exception e) {

            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_qtyKeyReleased
        String price = jTextField_price.getText();
        double price1 = Double.parseDouble(price);

        String qty = jTextField_qty.getText();
        double qty1 = Double.parseDouble(qty);

        double amount = price1 * qty1;
        String mins = String.valueOf(amount);
        jTextField_Stock_Amount.setText(mins);
    }//GEN-LAST:event_jTextField_qtyKeyReleased

    private void jComboBox_supplerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_supplerItemStateChanged
     /*   if (jComboBox.getSelectedIndex() > 0) {
            Connection con = null;
            CallableStatement csmt = null;
            ResultSet rs = null;
            PreparedStatement ps = null;

            try {
                con = database.getConnection();
                csmt = con.prepareCall("select * from suppliers2");
                csmt.registerOutParameter(1, java.sql.Types.INTEGER);
                csmt.setString(2, jComboBox.getSelectedItem().toString());

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }
        }
*/
    }//GEN-LAST:event_jComboBox_supplerItemStateChanged

    private void jButton_add_price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_price1ActionPerformed

        Supplier_Info info = new Supplier_Info();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_add_price1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        try {

            String product = jTextField1.getText();
            ps = con.prepareStatement("SELECT pname FROM product where pname like '%" + product + "%'");

            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            while (rs.next()) {

                for (int i = 0; i < 1000000; i++) {
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        jComboBox.setSelectedIndex(0);

        jComboBox.setSelectedItem(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(inventry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAdmin_saveBIGbtn;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JButton jButtonSales2;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JButton jButton_Stock_code;
    private javax.swing.JButton jButton_Sup_total;
    private javax.swing.JButton jButton_Sup_total1;
    private javax.swing.JButton jButton_add_price;
    private javax.swing.JButton jButton_add_price1;
    private javax.swing.JButton jButton_purchase;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JComboBox jComboBox_suppler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_avg_pur_price;
    private javax.swing.JLabel jLabel_avl_qty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_Customer_price;
    private javax.swing.JTextField jTextField_Stock_Amount;
    private javax.swing.JTextField jTextField_Stock_Code;
    private javax.swing.JTextField jTextField_date;
    private javax.swing.JTextField jTextField_p_id;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_qty;
    private javax.swing.JTextField jTextField_total;
    private javax.swing.JLabel time2;
    // End of variables declaration//GEN-END:variables
}
