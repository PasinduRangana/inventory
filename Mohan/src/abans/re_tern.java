package abans;

import dao.database;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.JRException;

public class re_tern extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement ps = null;
    CallableStatement csmt = null;
    ResultSet rs = null;
 

    public re_tern() {
        initComponents();
        showDate();
        con=database.getConnection();
        productController.loadCombo(jComboBox);
        productController.loadComboa(jComboBox_supliyer);
        con = database.getConnection();
        PreparedStatement ps = null;
        CallableStatement csmt = null;
        ResultSet rs = null;
        

    }
      public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    
    
    }

    void showDate() {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_Return_date.setText(s.format(d));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_get_paid = new javax.swing.JButton();
        jButton_Ad_User = new javax.swing.JButton();
        jButton_Purches = new javax.swing.JButton();
        jButton_Sales = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Iteam_Reason = new javax.swing.JTextField();
        jTextField_Return_date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton_search = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Returned = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox_supliyer = new javax.swing.JComboBox();
        jTextField_Item_name1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_qty = new javax.swing.JTextField();
        jButton_Returned_list = new javax.swing.JButton();
        jButton_Print = new javax.swing.JButton();
        jButton_Reset = new javax.swing.JButton();
        jButton_Reruened_search = new javax.swing.JButton();
        jButton_add_price = new javax.swing.JButton();
        jButton_Add1 = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox();
        jLabel_Avg_Purchase_price = new javax.swing.JLabel();
        jLabel_Available_qty = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 675));

        jButton_get_paid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_get_paid.setForeground(new java.awt.Color(0, 153, 153));
        jButton_get_paid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/calendar-icon.png"))); // NOI18N
        jButton_get_paid.setText("Hire Sale ");
        jButton_get_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_get_paidActionPerformed(evt);
            }
        });

        jButton_Ad_User.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Ad_User.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Ad_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/user-add-icon.png"))); // NOI18N
        jButton_Ad_User.setText("Add User");
        jButton_Ad_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Ad_UserActionPerformed(evt);
            }
        });

        jButton_Purches.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Purches.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Purches.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Ecommerce-Return-Purchase-icon.png"))); // NOI18N
        jButton_Purches.setText("Purches");
        jButton_Purches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PurchesActionPerformed(evt);
            }
        });

        jButton_Sales.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Sales.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abans/Sale-icon.png"))); // NOI18N
        jButton_Sales.setText("Sales");
        jButton_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Items to be Returned");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Return Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Supplier ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Reason");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Product Name");

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Price.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Cost");

        jTextField_Iteam_Reason.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Iteam_Reason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Iteam_ReasonActionPerformed(evt);
            }
        });

        jTextField_Return_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Return_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Return_dateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Model Number");

        jButton_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_search.setForeground(new java.awt.Color(0, 153, 153));
        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jButton_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Add.setText("E.rerurn");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Returned.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Returned.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Returned.setText("Returned");
        jButton_Returned.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_ReturnedMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton_ReturnedMouseReleased(evt);
            }
        });
        jButton_Returned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnedActionPerformed(evt);
            }
        });

        jButton_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(0, 153, 153));
        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 0, 102));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox_supliyer.setEditable(true);
        jComboBox_supliyer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField_Item_name1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Item_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Item_name1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Quantity ");

        jTextField_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_qtyActionPerformed(evt);
            }
        });
        jTextField_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_qtyKeyTyped(evt);
            }
        });

        jButton_Returned_list.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Returned_list.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Returned_list.setText("R.list");
        jButton_Returned_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Returned_listActionPerformed(evt);
            }
        });

        jButton_Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Print.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Print.setText("Print");
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });

        jButton_Reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Reset.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jButton_Reruened_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Reruened_search.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Reruened_search.setText("Search Returned List");
        jButton_Reruened_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reruened_searchActionPerformed(evt);
            }
        });

        jButton_add_price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_add_price.setForeground(new java.awt.Color(0, 153, 153));
        jButton_add_price.setText("Add Price List");
        jButton_add_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_priceActionPerformed(evt);
            }
        });

        jButton_Add1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Add1.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Add1.setText("I. Return");
        jButton_Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add1ActionPerformed(evt);
            }
        });

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

        jLabel_Avg_Purchase_price.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Avg_Purchase_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Avg_Purchase_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 1, true));

        jLabel_Available_qty.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Available_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Available_qty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 1, true));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Available Quantity");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Avg Purchase Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jButton_Returned, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton_Returned_list, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton_get_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Purches, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Sales, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Ad_User, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_add_price, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Available_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Avg_Purchase_price, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Item_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Iteam_Reason, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_supliyer, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Return_date, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton_Reruened_search)
                                .addGap(133, 133, 133)
                                .addComponent(jButton_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Reruened_search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel_Available_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel9)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_Avg_Purchase_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_Item_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_Iteam_Reason, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBox_supliyer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_Return_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Returned, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Returned_list, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_get_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Purches, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton_Sales, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Ad_User, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton_add_price, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_get_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_get_paidActionPerformed

        sales info = new sales();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_get_paidActionPerformed

    private void jButton_Ad_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Ad_UserActionPerformed
        addUser info = new addUser();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_Ad_UserActionPerformed

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jTextField_Iteam_ReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Iteam_ReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Iteam_ReasonActionPerformed

    private void jTextField_Return_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Return_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Return_dateActionPerformed

    private void jButton_ReturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnedActionPerformed
        String Item_code = jComboBox.getSelectedItem().toString();
        String Item_Name = jTextField_Item_name1.getText();
        String Reason = jTextField_Iteam_Reason.getText();

        String value = jComboBox_supliyer.getSelectedItem().toString();

        String R_date = jTextField_Return_date.getText();
        String qty = jTextField_qty.getText();
        String price = jTextField_Price.getText();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            pstmt = conn.prepareStatement("insert into reurened values(?,?,?,?,?,?,?)");

            pstmt.setString(1, Item_code);
            pstmt.setString(2, Item_Name);
            pstmt.setString(3, Reason);
            pstmt.setString(4, value);
            pstmt.setString(5, R_date);
            pstmt.setString(6, qty);
            pstmt.setString(7, price);

            int i = pstmt.executeUpdate();

            if (i > 0) {

                //   JOptionPane.showMessageDialog(null, "Data is Saved");
                String sql = ("Delete from re_turn where product=?");
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1,jComboBox.getSelectedItem().toString());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Returned !!");

                jComboBox.setSelectedItem(null);
                jTextField_Item_name1.setText(null);
                jTextField_Iteam_Reason.setText(null);
                jTextField_qty.setText(null);
                jTextField_Price.setText(null);

                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                jTextField_Return_date.setText(s.format(d));

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButton_ReturnedActionPerformed

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            Statement st = c.createStatement();

            st.executeUpdate("update re_turn SET R_Date='" + jTextField_Return_date.getText() + "',model_num= '" + jTextField_Item_name1.getText() + "',Reason= '" + jTextField_Iteam_Reason.getText() + "',Supplier_N= '" + jComboBox_supliyer.getSelectedItem() + "',qty='" + jTextField_qty.getText() + "',price= '" + jTextField_Price.getText() + "'WHERE product='" + jComboBox.getSelectedItem()+ "'");

            // JOptionPane.showConfirmDialog(rootPane, "Do you want to update this");
            JOptionPane.showMessageDialog(rootPane, "Updated!");
            jComboBox.setSelectedItem(null);
            jTextField_Item_name1.setText(null);
            jTextField_Iteam_Reason.setText(null);
            jTextField_qty.setText(null);
            jTextField_Price.setText(null);

            java.util.Date d = new java.util.Date();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            jTextField_Return_date.setText(s.format(d));

        } catch (Exception e) {

            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        Connection con;
        PreparedStatement ps;
        // PreparedStatement ps2;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("select * from re_turn where product =? OR model_num =? OR Supplier_N=? OR R_Date=? ");
            // ps2 = con.prepareStatement("select * from re_turn where Item_Name =?");

            ps.setString(1, String.valueOf(jComboBox.getSelectedItem()));
            ps.setString(2, String.valueOf(jTextField_Item_name1.getText()));
            ps.setString(3, String.valueOf(jComboBox_supliyer.getSelectedItem()));
            ps.setString(4, String.valueOf(jTextField_Return_date.getText()));

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


    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed

       
        String Item_code = jComboBox.getSelectedItem().toString();
        String Item_Name = jTextField_Item_name1.getText();
        String Reason = jTextField_Iteam_Reason.getText();

        String value = jComboBox_supliyer.getSelectedItem().toString();

        String R_date = jTextField_Return_date.getText();
        String qty = jTextField_qty.getText();
        String price = jTextField_Price.getText();
        
 
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            pstmt = conn.prepareStatement("insert into re_turn values(?,?,?,?,?,?,?)");

            pstmt.setString(1, Item_code);
            pstmt.setString(2, Item_Name);
            pstmt.setString(3, Reason);
            pstmt.setString(4, value);
            pstmt.setString(5, R_date);
            pstmt.setString(6, qty);
            pstmt.setString(7, price);

            int i = pstmt.executeUpdate();

            if (i > 0) {

                String q = "select * from re_turn";
                pstmt = conn.prepareStatement(q);
                rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                JOptionPane.showMessageDialog(null, "Data is Saved");

                jComboBox.setSelectedItem(null);
                jTextField_Item_name1.setText(null);
                jTextField_Iteam_Reason.setText(null);
                jTextField_qty.setText(null);
                jTextField_Price.setText(null);

                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                jTextField_Return_date.setText(s.format(d));

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jTextField_Item_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Item_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Item_name1ActionPerformed

    private void jTextField_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_qtyActionPerformed

    private void jButton_Returned_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Returned_listActionPerformed
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select * from reurened";
            pstmt = conn.prepareStatement(q);
            rs = pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButton_Returned_listActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();

        String value = jComboBox_supliyer.getSelectedItem().toString();

        jComboBox.setSelectedItem(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField_Item_name1.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField_Iteam_Reason.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jComboBox_supliyer.setSelectedItem(model.getValueAt(selectedRowIndex, 3).toString());
        jTextField_Return_date.setText(model.getValueAt(selectedRowIndex, 4).toString());
        jTextField_qty.setText(model.getValueAt(selectedRowIndex, 5).toString());
        jTextField_Price.setText(model.getValueAt(selectedRowIndex, 6).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_ReturnedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ReturnedMouseReleased


    }//GEN-LAST:event_jButton_ReturnedMouseReleased

    private void jButton_ReturnedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ReturnedMousePressed

    }//GEN-LAST:event_jButton_ReturnedMousePressed

    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed
        int i = 10;

        MessageFormat header = new MessageFormat("Pubudu Trade Center"
                + " Return List");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");

        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {

            System.err.format("can not print %s %n", e.getMessage());

        }

    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        jComboBox.setSelectedItem(null);
        jTextField_Item_name1.setText(null);
        jTextField_Iteam_Reason.setText(null);
        jTextField_qty.setText(null);
        jTextField_Price.setText(null);
        jComboBox_supliyer.setSelectedItem("Abans");

        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField_Return_date.setText(s.format(d));
    }//GEN-LAST:event_jButton_ResetActionPerformed

    private void jButton_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalesActionPerformed
        cash_sale info = new cash_sale();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_SalesActionPerformed

    private void jButton_PurchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PurchesActionPerformed
  inventry info = new inventry();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_PurchesActionPerformed

    private void jButton_Reruened_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reruened_searchActionPerformed
       
         Connection con;
        PreparedStatement ps;
        // PreparedStatement ps2;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");

            ps = con.prepareStatement("select * from reurened where Suppler_N=? OR product=? OR Return_Date=? ");
            // ps2 = con.prepareStatement("select * from re_turn where Item_Name =?");

           // 
           // ps.setString(2, String.valueOf(jTextField_Item_name1.getText()));
            ps.setString(1, String.valueOf(jComboBox_supliyer.getSelectedItem()));
            ps.setString(2, String.valueOf(jComboBox.getSelectedItem()));
            ps.setString(3, String.valueOf(jTextField_Return_date.getText()));

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


        
    }//GEN-LAST:event_jButton_Reruened_searchActionPerformed

    private void jButton_add_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_priceActionPerformed

        add_Price info = new add_Price();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_jButton_add_priceActionPerformed

    private void jTextField_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PriceKeyTyped
       /*  
        char c = evt.getKeyChar(); 
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) ||( c==KeyEvent.VK_DELETE) )){
       // getToolkit().beep();
        evt.consume();
    
    }*/
        
    }//GEN-LAST:event_jTextField_PriceKeyTyped

    private void jTextField_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_qtyKeyTyped
   
               
    /*   char c = evt.getKeyChar(); 
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) ||( c==KeyEvent.VK_DELETE) )){
      //  getToolkit().beep();
        evt.consume();
    
    } */
    }//GEN-LAST:event_jTextField_qtyKeyTyped

    private void jButton_Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add1ActionPerformed
       
        
       
        String Item_code = jComboBox.getSelectedItem().toString();
        String Item_Name = jTextField_Item_name1.getText();
        String Reason = jTextField_Iteam_Reason.getText();

        String value = jComboBox_supliyer.getSelectedItem().toString();

        String R_date = jTextField_Return_date.getText();
        String qty = jTextField_qty.getText();
        String price = jTextField_Price.getText();
        
 
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            pstmt = conn.prepareStatement("insert into re_turn values(?,?,?,?,?,?,?)");

            pstmt.setString(1, Item_code);
            pstmt.setString(2, Item_Name);
            pstmt.setString(3, Reason);
            pstmt.setString(4, value);
            pstmt.setString(5, R_date);
            pstmt.setString(6, qty);
            pstmt.setString(7, price);

            int i = pstmt.executeUpdate();

            if (i > 0) {
                
                  boolean bool = productController.savesale(jComboBox.getSelectedItem().toString(), jTextField_Price.getText(),jTextField_Return_date.getText(), jTextField_qty.getText());

                if (!bool) {
                    // JOptionPane.showMessageDialog(rootPane, "Sale Saved");
                    productController.loadCombo(jComboBox);
                    System.getenv("CLASSPATH");

                }
                

                String q = "select * from re_turn";
                pstmt = conn.prepareStatement(q);
                rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                JOptionPane.showMessageDialog(null, "Data is Saved");

                jComboBox.setSelectedItem(null);
                jTextField_Item_name1.setText(null);
                jTextField_Iteam_Reason.setText(null);
                jTextField_qty.setText(null);
                jTextField_Price.setText(null);

                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                jTextField_Return_date.setText(s.format(d));

            } else {
                JOptionPane.showMessageDialog(null, "Data is not saved");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        
        
    }//GEN-LAST:event_jButton_Add1ActionPerformed

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

                        jTextField_Item_name1.setText(rs.getString("stock_code"));
                        jTextField_Price.setText(rs.getString("Cost"));
                        jComboBox_supliyer.setSelectedItem(rs.getString("suppler"));
                   
                     Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mohan", "root", "1234");
            String q = "select * from re_turn";
            ps = con.prepareStatement(q);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    
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

    private void jComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMouseClicked

    private void jComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMousePressed

    }//GEN-LAST:event_jComboBoxMousePressed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed

    }//GEN-LAST:event_jComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(re_tern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(re_tern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(re_tern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(re_tern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new re_tern().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ad_User;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Add1;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JButton jButton_Purches;
    private javax.swing.JButton jButton_Reruened_search;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_Returned;
    private javax.swing.JButton jButton_Returned_list;
    private javax.swing.JButton jButton_Sales;
    private javax.swing.JButton jButton_add_price;
    private javax.swing.JButton jButton_get_paid;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_update;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JComboBox jComboBox_supliyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Available_qty;
    private javax.swing.JLabel jLabel_Avg_Purchase_price;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Iteam_Reason;
    private javax.swing.JTextField jTextField_Item_name1;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Return_date;
    private javax.swing.JTextField jTextField_qty;
    // End of variables declaration//GEN-END:variables
}
