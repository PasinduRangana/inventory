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
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author pasindu
 */
public class cash_sale extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    CallableStatement csmt = null;
    ResultSet rs = null;

    /**
     * Creates new form cash_sale
     */
    public cash_sale() {
        initComponents();
        //getsum();

        productController.loadCombo(jComboBox);

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
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_Date1.setText(s.format(d));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Avg_Purchase_price = new javax.swing.JLabel();
        jLabel_Available_qty = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        jTextField_Quentity = new javax.swing.JTextField();
        jTextField_searial_number = new javax.swing.JTextField();
        jTextField_Date1 = new javax.swing.JTextField();
        jTextField_Price = new javax.swing.JTextField();
        jButton_get_paid = new javax.swing.JButton();
        jButton_Purches = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_ItemCode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton_cash = new javax.swing.JRadioButton();
        jRadioButton_buy_paid = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField_cash = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add2 = new javax.swing.JButton();
        jTextField_amount = new javax.swing.JTextField();
        jTextField_total = new javax.swing.JTextField();
        jTextField_balance = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lable_ocean = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton_Print = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField_total_sale = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton_Return = new javax.swing.JRadioButton();
        jButton_add_price = new javax.swing.JButton();
        jTextField_cheque = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField_cheque_b = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton_add_price1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField_customerAddress = new javax.swing.JTextField();
        jTextField_customerName1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1410, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("CASH SALE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, -1));

        jLabel_Avg_Purchase_price.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Avg_Purchase_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Avg_Purchase_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 1, true));
        getContentPane().add(jLabel_Avg_Purchase_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 240, 30));

        jLabel_Available_qty.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Available_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Available_qty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 1, true));
        getContentPane().add(jLabel_Available_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 240, 30));

        jComboBox.setEditable(true);
        jComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxItemStateChanged(evt);
            }
        });
        jComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxMousePressed(evt);
            }
        });
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        jComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxKeyTyped(evt);
            }
        });
        getContentPane().add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 830, 34));

        jTextField_Quentity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Quentity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_QuentityActionPerformed(evt);
            }
        });
        jTextField_Quentity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_QuentityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_QuentityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_QuentityKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Quentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 240, 30));

        jTextField_searial_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_searial_number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_searial_numberMousePressed(evt);
            }
        });
        jTextField_searial_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searial_numberActionPerformed(evt);
            }
        });
        jTextField_searial_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_searial_numberKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_searial_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 240, 30));

        jTextField_Date1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Date1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 240, 30));

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Price.setForeground(new java.awt.Color(0, 0, 153));
        jTextField_Price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_PriceMousePressed(evt);
            }
        });
        jTextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceActionPerformed(evt);
            }
        });
        jTextField_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PriceKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 240, 30));

        jButton_get_paid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_get_paid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/calendar-icon.png"))); // NOI18N
        jButton_get_paid.setText("Hire Sale");
        jButton_get_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_get_paidActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_get_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 100));

        jButton_Purches.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Purches.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/payment-icon.png"))); // NOI18N
        jButton_Purches.setText("Purches");
        jButton_Purches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PurchesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Purches, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 210, 98));

        jButtonReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/arrow-right-icon.png"))); // NOI18N
        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 210, 98));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Product Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Available Quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Avg Purchase Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Quantity ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText(" Serial Number ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Cheque");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Model Number ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jTextField_ItemCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_ItemCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_ItemCodeMousePressed(evt);
            }
        });
        jTextField_ItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ItemCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_ItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 240, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Amount");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Cheque");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, 20));

        buttonGroup1.add(jRadioButton_cash);
        jRadioButton_cash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_cash.setForeground(new java.awt.Color(204, 0, 153));
        jRadioButton_cash.setText("Cash Sale");
        jRadioButton_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_cashActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, -1));

        buttonGroup1.add(jRadioButton_buy_paid);
        jRadioButton_buy_paid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_buy_paid.setForeground(new java.awt.Color(204, 0, 153));
        jRadioButton_buy_paid.setText("Hire Sale");
        jRadioButton_buy_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_buy_paidActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_buy_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Balance");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        jTextField_cash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cashActionPerformed(evt);
            }
        });
        jTextField_cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cashKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_cashKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 240, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("CUS Address");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Print");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, -1, 40));

        jTable1.setBackground(new java.awt.Color(204, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 580, 460));

        add2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add2.setForeground(new java.awt.Color(0, 153, 153));
        add2.setText("Sale");
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add2MousePressed(evt);
            }
        });
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        getContentPane().add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 90, 40));

        jTextField_amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_amountMousePressed(evt);
            }
        });
        jTextField_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_amountActionPerformed(evt);
            }
        });
        jTextField_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_amountKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 240, 30));

        jTextField_total.setEditable(false);
        jTextField_total.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField_total.setForeground(new java.awt.Color(255, 0, 102));
        jTextField_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_totalMousePressed(evt);
            }
        });
        jTextField_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 610, 160, 40));

        jTextField_balance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_balance.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_balance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_balanceMousePressed(evt);
            }
        });
        jTextField_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_balanceActionPerformed(evt);
            }
        });
        jTextField_balance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_balanceKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 240, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 80, 40));

        lable_ocean.setText("Ocean");
        getContentPane().add(lable_ocean, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 714, 10, 10));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Daily Sale Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 150, 50));

        jButton_Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Print.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Print.setText("Print");
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 530, 100, 50));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 102));
        jButton4.setText("Total");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 120, 40));

        jTextField_total_sale.setEditable(false);
        jTextField_total_sale.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField_total_sale.setForeground(new java.awt.Color(255, 0, 102));
        jTextField_total_sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_total_saleMousePressed(evt);
            }
        });
        jTextField_total_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_total_saleActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_total_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 180, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Search");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, -1));

        buttonGroup1.add(jRadioButton_Return);
        jRadioButton_Return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_Return.setForeground(new java.awt.Color(204, 0, 153));
        jRadioButton_Return.setText("cheque");
        jRadioButton_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, -1));

        jButton_add_price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_add_price.setForeground(new java.awt.Color(0, 153, 153));
        jButton_add_price.setText("Add Price List");
        jButton_add_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_priceActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 200, 100));

        jTextField_cheque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_cheque.setForeground(new java.awt.Color(0, 204, 102));
        jTextField_cheque.setText("0");
        jTextField_cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_chequeActionPerformed(evt);
            }
        });
        jTextField_cheque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_chequeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_chequeKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 240, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("Cash");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, 20));

        jTextField_cheque_b.setEditable(false);
        jTextField_cheque_b.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField_cheque_b.setForeground(new java.awt.Color(255, 0, 102));
        jTextField_cheque_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_cheque_bMousePressed(evt);
            }
        });
        jTextField_cheque_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cheque_bActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_cheque_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 160, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("Total sale");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, -1, -1));

        jButton_add_price1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_add_price1.setForeground(new java.awt.Color(0, 153, 153));
        jButton_add_price1.setText("Transfer Goods ");
        jButton_add_price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_price1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 101));

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
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 160, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Sale type");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("Date");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 153));
        jLabel22.setText("CUS Name");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, 20));

        jTextField_customerAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_customerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_customerAddressActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_customerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 240, 30));

        jTextField_customerName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_customerName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_customerName1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_customerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 240, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 153));
        jLabel23.setText("Cash Sale");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_QuentityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_QuentityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_QuentityActionPerformed

    private void jTextField_searial_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searial_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_searial_numberActionPerformed

    private void jTextField_Date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Date1ActionPerformed

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jButton_get_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_get_paidActionPerformed

        sales info = new sales();
        info.setVisible(true);

        close();
    }//GEN-LAST:event_jButton_get_paidActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed

        re_tern info = new re_tern();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jTextField_ItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ItemCodeActionPerformed

    private void jRadioButton_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_cashActionPerformed
        type = "Cash Sale";
    }//GEN-LAST:event_jRadioButton_cashActionPerformed

    private void jTextField_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cashActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed

        String value = jComboBox.getSelectedItem().toString();
        // String p_name = jTextField.getText();
        String Item_code = jTextField_ItemCode.getText();
        String Seriyal_num = jTextField_searial_number.getText();

        String price = jTextField_Price.getText();
        String qty = jTextField_Quentity.getText();
        String amount = jTextField_amount.getText();

        String cash = jTextField_cash.getText();
        String balance = jTextField_balance.getText();
        String date = jTextField_Date1.getText();
        String cheque = jTextField_cheque.getText();
        String cusname = jTextField_customerName1.getText();
        String cusaddress = jTextField_Date1.getText();

        String sale_type = type;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            pstmt = con.prepareStatement("insert into cash_sale values(?,?,?,?,?,?,?,?,?,?,?)");

            pstmt.setString(1, value);
            pstmt.setString(2, Item_code);
            pstmt.setString(3, Seriyal_num);
            //  pstmt.setString(4, value);
            pstmt.setString(4, price);
            pstmt.setString(5, qty);
            pstmt.setString(6, amount);
            pstmt.setString(7, cash);
            pstmt.setString(8, balance);
            pstmt.setString(9, sale_type);
            pstmt.setString(10, date);
            pstmt.setString(11, cheque);

            int i = pstmt.executeUpdate();

            if (i > 0) {

                boolean bool = productController.savesale(jComboBox.getSelectedItem().toString(), jTextField_Price.getText(), jTextField_Date1.getText(), jTextField_Quentity.getText());

                if (!bool) {
                    // JOptionPane.showMessageDialog(rootPane, "Sale Saved");
                    productController.loadCombo(jComboBox);
                    System.getenv("CLASSPATH");

                }
                clear();

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_add2ActionPerformed

    private void jTextField_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_amountActionPerformed

    private void jTextField_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalActionPerformed

    private void jTextField_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_balanceActionPerformed

    private void add2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MousePressed

        String value = jComboBox.getSelectedItem().toString();
        // String p_name = jTextField.getText();
        String Item_code = jTextField_ItemCode.getText();
        String Seriyal_num = jTextField_searial_number.getText();

        String price = jTextField_Price.getText();
        String qty = jTextField_Quentity.getText();
        String amount = jTextField_amount.getText();

        String cash = jTextField_cash.getText();
        String balance = jTextField_balance.getText();

        ///////////////////////////
        String date = jTextField_Date1.getText();
        String print = lable_ocean.getText();
        String cheque = jTextField_cheque.getText();

        String cusaddress = jTextField_customerAddress.getText();
        String cusname = jTextField_customerName1.getText();

        String sale_type = type;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            pstmt = con.prepareStatement("insert into b_print(p_name,Item_code,Seriyal_num,price,qty,amount,cash,balance,sale_type,date,print,cheque,name,address) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstmt.setString(1, value);
            pstmt.setString(2, Item_code);
            pstmt.setString(3, Seriyal_num);
            //  pstmt.setString(4, value);
            pstmt.setString(4, price);
            pstmt.setString(5, qty);
            pstmt.setString(6, amount);
            pstmt.setString(7, cash);
            pstmt.setString(8, balance);
            pstmt.setString(9, sale_type);
            pstmt.setString(10, date);
            pstmt.setString(11, print);
            pstmt.setString(12, cheque);
            pstmt.setString(13, cusname);
            pstmt.setString(14, cusaddress);

            int i = pstmt.executeUpdate();

            if (i > 0) {

                String q = "select p_name,price,qty,amount from b_print";
                pstmt = con.prepareStatement(q);
                rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_add2MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            String report = ("D:\\Ocean IT\\all projects\\Pubudu Last\\pubudu\\pubudu\\pu_cash2.jrxml");
////////////////////////////////////////////////////////////////////////////
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp, false);
////////////////////////////////////////////////////////////////////////
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased


    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Connection conn = null;
        PreparedStatement pstmt = null;
        Connection con;
        PreparedStatement ps;
        ResultSet rs;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            String sql = ("Delete from b_print where print=?");
            //String sql = ("Delete from b_print where qty=?");

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, lable_ocean.getText());
           // st.setString(1, jTextField_Quentity.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted");
            clear();

            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_amountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_amountMousePressed


    }//GEN-LAST:event_jTextField_amountMousePressed

    private void jTextField_balanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_balanceMousePressed

        String cheque = jTextField_cheque.getText();
        double cheque1 = Double.parseDouble(cheque);

        String cash = jTextField_cash.getText();
        double cash1 = Double.parseDouble(cash);

        double abc = cash1 + cheque1;

        String amount = jTextField_amount.getText();
        double amount1 = Double.parseDouble(amount);

        double balance;
        balance = amount1 - abc;
        String mins = String.valueOf(balance);
        // jTextField_balance.setText(mins);

        //==========================================================================================
        //   String xxx = rs.getString("price");
        DecimalFormat df = new DecimalFormat("#.##");

        // price1 = Double.parseDouble(xxx);
        mins = String.valueOf(" %.2f" + balance);

        String numberAsString = String.format("%.2f", balance);

        jTextField_balance.setText(numberAsString);
        //============================================================================================


    }//GEN-LAST:event_jTextField_balanceMousePressed

    private void jRadioButton_buy_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_buy_paidActionPerformed
        type = "Hire Sale";
    }//GEN-LAST:event_jRadioButton_buy_paidActionPerformed

    private void jTextField_totalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_totalMousePressed


    }//GEN-LAST:event_jTextField_totalMousePressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

        /*      Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select p_name,price,qty,amount from b_print";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        
         */

    }//GEN-LAST:event_jTable1MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con;

        // PreparedStatement ps2;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("select p_name,price,qty,amount,cash,balance,cheque,saleType from cash_sale where date =?");
            // ps2 = con.prepareStatement("select * from re_turn where Item_Name =?");
            if (ps != null) {

                clear();
            }

            ps.setString(1, String.valueOf(jTextField_Date1.getText()));

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

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed
        int i = 10;

        MessageFormat header = new MessageFormat("Daily Sale Report");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");

        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {

            System.err.format("can not print %s %n", e.getMessage());

        }
    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            String sql = "select sum(cash) from cash_sale where date =?";

            ps = con.prepareStatement(sql);
            ps.setString(1, String.valueOf(jTextField_Date1.getText()));
            rs = ps.executeQuery();

            if (rs.next()) {

                String sum = rs.getString("sum(cash)");
                jTextField_total.setText(sum);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField_total_saleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_total_saleMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_total_saleMousePressed

    private void jTextField_total_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_total_saleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_total_saleActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        try {

            String sql = "select sum(amount) from cash_sale where date =?";

            ps = con.prepareStatement(sql);
            ps.setString(1, String.valueOf(jTextField_Date1.getText()));
            rs = ps.executeQuery();

            if (rs.next()) {

                String sum = rs.getString("sum(amount)");
                jTextField_total_sale.setText(sum);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton4MousePressed

    private void jButton_PurchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PurchesActionPerformed

        inventry info = new inventry();
        info.setVisible(true);
        close();

    }//GEN-LAST:event_jButton_PurchesActionPerformed

    private void jTextField_PriceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_PriceMousePressed

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

                String xxx = rs.getString("price");

                // DecimalFormat df = new DecimalFormat("#.##");
                double price1;

                price1 = Double.parseDouble(xxx);
                String mins = String.valueOf(" %.2f" + price1);

                String numberAsString = String.format("%.2f", price1);

                jTextField_Price.setText(numberAsString);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jTextField_PriceMousePressed

    private void jButton_add_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_priceActionPerformed

        add_Price info = new add_Price();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_add_priceActionPerformed

    private void jTextField_ItemCodeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_ItemCodeMousePressed

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select p_name,price,qty,amount from b_print";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_jTextField_ItemCodeMousePressed

    private void jTextField_searial_numberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_searial_numberMousePressed

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

                //==========================================================================================
                String xxx = rs.getString("price");

                DecimalFormat df = new DecimalFormat("#.##");

                double price1;

                price1 = Double.parseDouble(xxx);
                String mins = String.valueOf(" %.2f" + price1);

                String numberAsString = String.format("%.2f", price1);

                jTextField_Price.setText(numberAsString);
                //============================================================================================

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jTextField_searial_numberMousePressed

    private void jTextField_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PriceKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_PriceKeyTyped

    private void jTextField_QuentityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuentityKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_QuentityKeyTyped

    private void jTextField_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_amountKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_amountKeyTyped

    private void jTextField_cashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cashKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_cashKeyTyped

    private void jTextField_balanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_balanceKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField_balanceKeyTyped

    private void jTextField_searial_numberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searial_numberKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_TAB) {

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

                    jTextField_Price.setText(rs.getString("price"));
                    DecimalFormat df = new DecimalFormat("#.##");
                    String price = jTextField_Price.getText();
                    double price1 = Double.parseDouble(price);

                    jTextField_Price.setText(price);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_jTextField_searial_numberKeyPressed

    private void jTextField_QuentityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuentityKeyPressed

    }//GEN-LAST:event_jTextField_QuentityKeyPressed

    private void jTextField_cashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cashKeyPressed

    }//GEN-LAST:event_jTextField_cashKeyPressed

    private void jRadioButton_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ReturnActionPerformed
        type = "Cheque";
    }//GEN-LAST:event_jRadioButton_ReturnActionPerformed

    private void jTextField_chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_chequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_chequeActionPerformed

    private void jTextField_chequeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_chequeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_chequeKeyPressed

    private void jTextField_chequeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_chequeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_chequeKeyTyped

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased

        try {

            String sql = "select sum(cheque) from cash_sale where date =?";

            ps = con.prepareStatement(sql);
            ps.setString(1, String.valueOf(jTextField_Date1.getText()));
            rs = ps.executeQuery();

            if (rs.next()) {

                String sum = rs.getString("sum(cheque)");
                jTextField_cheque_b.setText(sum);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton4MouseReleased

    private void jTextField_cheque_bMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_cheque_bMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cheque_bMousePressed

    private void jTextField_cheque_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cheque_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cheque_bActionPerformed

    private void jButton_add_price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_price1ActionPerformed

        transfer info = new transfer();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_add_price1ActionPerformed

    private void jTextField_QuentityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuentityKeyReleased
        // DecimalFormat df = new DecimalFormat("#.##");
        String price = jTextField_Price.getText();
        double price1 = Double.parseDouble(price);

        String qty = jTextField_Quentity.getText();
        double qty1 = Double.parseDouble(qty);

        double amount = price1 * qty1;
        String mins = String.valueOf(amount);
        // jTextField_amount.setText(mins);

        //==========================================================================================
        // String xxx = rs.getString("price");
        DecimalFormat df = new DecimalFormat("#.##");

        // price1 = Double.parseDouble(xxx);
        mins = String.valueOf(" %.2f" + amount);

        String numberAsString = String.format("%.2f", amount);

        jTextField_amount.setText(numberAsString);
        //============================================================================================


    }//GEN-LAST:event_jTextField_QuentityKeyReleased

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxKeyTyped

    }//GEN-LAST:event_jComboBoxKeyTyped

    private void jComboBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxKeyReleased
        /*

        try {

            String product = jTextField1.getText();
            ps = con.prepareStatement("SELECT pname FROM product where pname like '%"+product+"%'");

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

         */
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
    }//GEN-LAST:event_jComboBoxKeyReleased

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed

    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMousePressed

    }//GEN-LAST:event_jComboBoxMousePressed

    private void jComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMouseClicked

    private void jComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxItemStateChanged
        if (jComboBox.getSelectedIndex() > 0) {
            Connection con = null;
            CallableStatement csmt = null;
            ResultSet rs = null;

            try {
                con = database.getConnection();
                csmt = con.prepareCall("{?= call getProductQty(?)}");
                csmt.registerOutParameter(1, java.sql.Types.INTEGER);
                csmt.setString(1, jComboBox.getSelectedItem().toString());

                csmt.execute();
                int output = csmt.getInt(1);
                jLabel_Available_qty.setText(String.valueOf(output));

                ///
                csmt = con.prepareCall("CALL avg_price(getProductId(?))");
                csmt.setString(1, jComboBox.getSelectedItem().toString());

                csmt.execute();
                rs = csmt.getResultSet();
                while (rs.next()) {

                    jLabel_Avg_Purchase_price.setText(rs.getString(1));

                    ps = con.prepareStatement("SELECT * from adddata where product =?");
                    int i;
                    ps.setString(1, (String) jComboBox.getSelectedItem());

                    rs = ps.executeQuery();

                    while (rs.next()) {

                        jTextField_ItemCode.setText(rs.getString("stock_code"));
                        //jTextField_price.setText(rs.getString("Cost"));
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        jComboBox.setSelectedIndex(0);

        jComboBox.setSelectedItem(model.getValueAt(selectedRowIndex, 0).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_customerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_customerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_customerAddressActionPerformed

    private void jTextField_customerName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_customerName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_customerName1ActionPerformed

    private void clear() {
        jComboBox.setSelectedIndex(0);
        jLabel_Available_qty.setText("0");
        jLabel_Avg_Purchase_price.setText("");
        jTextField_balance.setText("");
        jTextField_amount.setText("");

        jTextField_ItemCode.setText("");
        jTextField_Price.setText("");
        jTextField_Quentity.setText("");
        jTextField_cash.setText("");
        jTextField_searial_number.setText("");
        jTextField_cheque.setText("0");
        jTextField_Date1.setText("");
        jTextField_customerName1.setText("");
        jTextField_customerAddress.setText("");
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_Date1.setText(s.format(d));

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
            java.util.logging.Logger.getLogger(cash_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cash_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cash_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cash_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cash_sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JButton jButton_Purches;
    private javax.swing.JButton jButton_add_price;
    private javax.swing.JButton jButton_add_price1;
    private javax.swing.JButton jButton_get_paid;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Available_qty;
    private javax.swing.JLabel jLabel_Avg_Purchase_price;
    private javax.swing.JRadioButton jRadioButton_Return;
    private javax.swing.JRadioButton jRadioButton_buy_paid;
    private javax.swing.JRadioButton jRadioButton_cash;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_Date1;
    private javax.swing.JTextField jTextField_ItemCode;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Quentity;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextField jTextField_balance;
    private javax.swing.JTextField jTextField_cash;
    private javax.swing.JTextField jTextField_cheque;
    private javax.swing.JTextField jTextField_cheque_b;
    private javax.swing.JTextField jTextField_customerAddress;
    private javax.swing.JTextField jTextField_customerName1;
    private javax.swing.JTextField jTextField_searial_number;
    private javax.swing.JTextField jTextField_total;
    private javax.swing.JTextField jTextField_total_sale;
    private javax.swing.JLabel lable_ocean;
    // End of variables declaration//GEN-END:variables

    private String type;

}
