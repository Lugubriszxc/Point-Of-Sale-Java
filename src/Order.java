import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import javax.swing.DefaultListModel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class Order extends javax.swing.JFrame {


    public Order() {
        initComponents();
        Connect();
        clearSelectedOrder();
        createColumn();
        loadProduct();
    }
    int act = 0; //if found or not
    int choice = 0;
    String productID;
    float totalAmount = 0, value;
    float paidAmount = 0;
    float orderTotal = 0;
    float discount = 0;
    float change = -1;
    
    public static String orderNum = "";
    public static String item = "";
    public static int qty = 0;
    public static int val = 0;
    
    String prodsID;
    int origQuan;
    int rowOrder;
    int rowQuan;
    int rowCount = 0;
    int rowrowCount = 0;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    DefaultTableModel dm;
    int Quantity;
    ArrayList<productClass> productArr = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        textSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrders = new javax.swing.JTable();
        textProdName = new javax.swing.JTextField();
        textProdDesc = new javax.swing.JTextField();
        textProdQuantity = new javax.swing.JTextField();
        textProdPrice = new javax.swing.JTextField();
        textPaidAmount = new javax.swing.JTextField();
        textDiscount = new javax.swing.JTextField();
        textChange = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelDiscount = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelOrderTotal = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelTotalAmount = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnProductSave = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnOrderCancel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnOrderSave = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(29, 30, 28));

        textSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-24.png"))); // NOI18N

        tableProducts.setBackground(new java.awt.Color(204, 204, 204));
        tableProducts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProducts.setDefaultEditor(Object.class, null);
        tableProducts.setGridColor(new java.awt.Color(255, 255, 255));
        tableProducts.setRowHeight(25);
        tableProducts.setSelectionBackground(new java.awt.Color(155, 89, 182));
        tableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducts);

        tableOrders.setBackground(new java.awt.Color(204, 204, 204));
        tableOrders.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Description", "Quantity", "Price", "TOTAL"
            }
        ));
        tableOrders.setDefaultEditor(Object.class, null);
        tableOrders.setGridColor(new java.awt.Color(255, 255, 255));
        tableOrders.setRowHeight(25);
        tableOrders.setSelectionBackground(new java.awt.Color(155, 89, 182));
        tableOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrdersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableOrders);

        textProdName.setEditable(false);
        textProdName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textProdDesc.setEditable(false);
        textProdDesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textProdQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textProdQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textProdQuantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProdQuantityKeyTyped(evt);
            }
        });

        textProdPrice.setEditable(false);
        textProdPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textProdPrice.setForeground(new java.awt.Color(255, 0, 51));
        textProdPrice.setText("0.00");
        textProdPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textPaidAmount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textPaidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPaidAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPaidAmountKeyTyped(evt);
            }
        });

        textDiscount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textDiscountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDiscountKeyTyped(evt);
            }
        });

        textChange.setEditable(false);
        textChange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textChange.setForeground(new java.awt.Color(255, 0, 0));
        textChange.setText("0.00");
        textChange.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name:");

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-coins-16.png"))); // NOI18N
        jLabel5.setText("Change:");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Description:");

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Paid Amount:");

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-price-16.png"))); // NOI18N
        jLabel8.setText("Price:");

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity:");

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Discount:");

        jPanel4.setBackground(new java.awt.Color(155, 89, 182));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order Total:");

        labelDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDiscount.setForeground(new java.awt.Color(255, 255, 255));
        labelDiscount.setText("0.00");

        jLabel15.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Amount:");

        labelOrderTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelOrderTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelOrderTotal.setText("0.00");

        jLabel17.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Discount:");

        labelTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalAmount.setText("0.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOrderTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDiscount, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTotalAmount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelTotalAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDiscount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelOrderTotal))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        btnClear.setBackground(new java.awt.Color(155, 89, 182));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        btnClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnClearKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Clear");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jLabel19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel19KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 51, 51));
        jLabel20.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Delete");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel20)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDeleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        btnProductSave.setBackground(new java.awt.Color(155, 89, 182));
        btnProductSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductSaveMouseEntered(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 51, 51));
        jLabel21.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Save");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnProductSaveLayout = new javax.swing.GroupLayout(btnProductSave);
        btnProductSave.setLayout(btnProductSaveLayout);
        btnProductSaveLayout.setHorizontalGroup(
            btnProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductSaveLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel21)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnProductSaveLayout.setVerticalGroup(
            btnProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        btnOrderCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnOrderCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderCancelMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 51, 51));
        jLabel22.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cancel");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnOrderCancelLayout = new javax.swing.GroupLayout(btnOrderCancel);
        btnOrderCancel.setLayout(btnOrderCancelLayout);
        btnOrderCancelLayout.setHorizontalGroup(
            btnOrderCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrderCancelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel22)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        btnOrderCancelLayout.setVerticalGroup(
            btnOrderCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrderCancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOrderSave.setBackground(new java.awt.Color(27, 174, 93));
        btnOrderSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderSaveMouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 51, 51));
        jLabel23.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Proceed");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnOrderSaveLayout = new javax.swing.GroupLayout(btnOrderSave);
        btnOrderSave.setLayout(btnOrderSaveLayout);
        btnOrderSaveLayout.setHorizontalGroup(
            btnOrderSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrderSaveLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel23)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnOrderSaveLayout.setVerticalGroup(
            btnOrderSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrderSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(155, 89, 182));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Order List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(155, 89, 182));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Product List");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel18)
                .addContainerGap(683, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-36.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(347, 347, 347))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textPaidAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnOrderCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOrderSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(textDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textProdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textProdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(textProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textProdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textChange, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrderCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrderSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 171, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Connect()
    {
        DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
        model.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posjava", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadProduct()
    {
        productArr.clear();
        try {
            //String sql = "SELECT productid,prodname,desci,quantity,price FROM products";
            String sql = "SELECT * FROM products WHERE status = 'active'";
            //String sql = "SELECT * FROM products INNER JOIN categories ON products.category = categories.categoryname WHERE categories.status = 'active' AND products.status = 'active'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                String prodid = rs.getString("productid");
                String prodname = rs.getString("prodname");
                String proddesc = rs.getString("desci");
                String prodQuan = String.format("%,d", Integer.parseInt(rs.getString("quantity")));
                String price = rs.getString("price");
                
                String[] rowData = {prodid,prodname,proddesc,prodQuan,price};
                dm.addRow(rowData);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(Menu.MAXIMIZED_BOTH); 
    }//GEN-LAST:event_formWindowOpened

    private void btnOrderSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderSaveMouseClicked

        if(textChange.getText().isEmpty())
        {
            alert("PLEASE INPUT AN AMOUNT FIRST!");
        }
        else if(textChange.getText().matches("INSUFFICIENT MONEY"))
        {
            alert("INSUFFICIENT MONEY");
        }
        else if(textPaidAmount.getText().isEmpty())
        {
            alert("PLEASE INPUT AN AMOUNT FIRST!");
        }
        else
        {
            btnSave();
        }
    }//GEN-LAST:event_btnOrderSaveMouseClicked

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
        jLabel23.setForeground(Color.white);
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
        jLabel23.setForeground(Color.black);
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        
        if(textChange.getText().isEmpty())
        {
            alert("PLEASE INPUT AN AMOUNT FIRST!");
        }
        else if(textChange.getText().matches("INSUFFICIENT MONEY"))
        {
            alert("INSUFFICIENT MONEY");
        }
        else if(textPaidAmount.getText().isEmpty())
        {
            alert("PLEASE INPUT AN AMOUNT FIRST!");
        }
        else
        {
            btnSave();
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void btnOrderCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderCancelMouseClicked
        int option = JOptionPane.showConfirmDialog(rootPane, "YOU WILL CANCEL ALL YOUR ORDERS. PROCEED?", "CANCEL CONFIRMATION", JOptionPane.YES_NO_OPTION);
        if(option == 0)
        {
            restart();
        }
    }//GEN-LAST:event_btnOrderCancelMouseClicked

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
        jLabel22.setForeground(Color.white);
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
        jLabel22.setForeground(Color.black);
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        int option = JOptionPane.showConfirmDialog(rootPane, "YOU WILL CANCEL ALL YOUR ORDERS. PROCEED?", "CANCEL CONFIRMATION", JOptionPane.YES_NO_OPTION);
        if(option == 0)
        {
            restart();
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void btnProductSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductSaveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductSaveMouseEntered

    private void btnProductSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductSaveMouseClicked
        clearSearch();
        if(choice == 0)
        {
            addToOrder();
        }
        else if(choice == 1)
        {
            updateOrder();
        }

        tableProducts.setSelectionBackground(new Color(204,204,204));
        tableProducts.setSelectionForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnProductSaveMouseClicked

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
        jLabel21.setForeground(Color.white);
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
        jLabel21.setForeground(Color.black);
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        clearSearch();
        if(choice == 0)
        {
            addToOrder();
        }
        else if(choice == 1)
        {
            updateOrder();
        }

        tableProducts.setSelectionBackground(new Color(204,204,204));
        tableProducts.setSelectionForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel21MouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        clearSearch();
        deleteOrder();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
        jLabel20.setForeground(Color.white);
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
        jLabel20.setForeground(Color.black);
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        clearSearch();
        deleteOrder();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void btnClearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClearKeyPressed

    }//GEN-LAST:event_btnClearKeyPressed

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        clearSearch();
    }//GEN-LAST:event_btnClearMouseClicked

    private void jLabel19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19KeyPressed

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.white);
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
        jLabel19.setForeground(Color.black);
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        clearSearch();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void textDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDiscountKeyTyped
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume();
        }
        try
        {
            Double.parseDouble(textDiscount.getText() +evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        }
    }//GEN-LAST:event_textDiscountKeyTyped

    private void textDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDiscountKeyReleased
        if(textDiscount.getText().isEmpty())
        {
            textDiscount.setText("");
        }
        try
        {
            calculate();
        }
        catch(NumberFormatException e)
        {
            //nothing
        }
    }//GEN-LAST:event_textDiscountKeyReleased

    private void textPaidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPaidAmountKeyTyped
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume();
        }

        try
        {
            Double.parseDouble(textPaidAmount.getText() +evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        } /*catch (ParseException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
     
    }//GEN-LAST:event_textPaidAmountKeyTyped

    private void textPaidAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPaidAmountKeyReleased
        String discountVal = textDiscount.getText();
        
        if(discountVal.isEmpty())
        {
            textDiscount.setText("0");
        }
        try{
            calculate();
        }
        catch(NumberFormatException e)
        {
            //evt.consume();
        }
    }//GEN-LAST:event_textPaidAmountKeyReleased

    private void textProdQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProdQuantityKeyTyped
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume();
        }
        try
        {
            Integer.parseInt(textDiscount.getText() +evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        }
    }//GEN-LAST:event_textProdQuantityKeyTyped

    private void textProdQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProdQuantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdQuantityKeyReleased

    private void tableOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrdersMouseClicked
        this.choice = 1;
        jLabel21.setText("UPDATE");
        this.rowOrder = tableOrders.getSelectedRow();

        int i = tableOrders.getSelectedRow();
        TableModel model = tableOrders.getModel();

        productID = model.getValueAt(i, 0).toString();
        prodsID = tableOrders.getValueAt(i, 0).toString();
        textProdName.setText(model.getValueAt(i, 1).toString());
        textProdDesc.setText(model.getValueAt(i, 2).toString());
        textProdQuantity.setText(model.getValueAt(i, 3).toString());
        textProdPrice.setText(model.getValueAt(i, 4).toString());

        clearSearch();
        btnProductSave.setEnabled(true);
        textProdQuantity.setEnabled(true);
    }//GEN-LAST:event_tableOrdersMouseClicked

    private void tableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMouseClicked
        clearSelectedOrder();
        this.choice = 0;
        jLabel21.setText("SAVE");
        tableProducts.setSelectionBackground(new Color(155,89,182));

        int i = tableProducts.getSelectedRow();
        int viewModelRow = tableProducts.convertRowIndexToModel(i);
        TableModel model = tableProducts.getModel();

        this.rowQuan = viewModelRow;

        productID = model.getValueAt(viewModelRow, 0).toString();
        textProdName.setText(model.getValueAt(viewModelRow, 1).toString());
        textProdDesc.setText(model.getValueAt(viewModelRow, 2).toString());
        textProdPrice.setText(model.getValueAt(viewModelRow, 4).toString());

        clearSearch();
        btnProductSave.setEnabled(true);
        textProdQuantity.setEnabled(true);
    }//GEN-LAST:event_tableProductsMouseClicked

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        String query = textSearch.getText();
        filter(query);
    }//GEN-LAST:event_textSearchKeyReleased

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        new MenuUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void clearSearch()
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        tableProducts.setRowSorter(tr);
        
        tr.setRowFilter(null);
        textSearch.setText("");
    }
    
    private void addToOrder()
    {
        act = 0;
        String quantity = textProdQuantity.getText().trim();
        String prodname = textProdName.getText().trim();
        if(!prodname.isEmpty())
        {
            if(!quantity.isEmpty())
            {
                String selectedProductID = this.productID;
                String quan1 = textProdQuantity.getText();
                quan1 = quan1.replaceAll(",", "");
                int quan = Integer.valueOf(quan1);
                
                String price1 = textProdPrice.getText();
                price1 = price1.replaceAll(",", "");
                price1 = price1.replaceAll("₱", "");
                float price = Float.valueOf(price1);                
                
                for(int i = 0; i < tableOrders.getRowCount(); i++) //validation
                {
                    String getID = tableOrders.getValueAt(i, 0).toString();
                    if(selectedProductID.compareTo(getID) == 0)
                    {
                        //int quantDum = Integer.parseInt(tableOrders.getValueAt(i, 3).toString());
                        String quantDum1 = tableOrders.getValueAt(i, 3).toString();
                        quantDum1 = quantDum1.replaceAll(",", "");
                        int quantDum = Integer.valueOf(quantDum1);
                        
                        //int quants = Integer.parseInt(tableProducts.getValueAt(rowQuan, 3).toString());
                        String quants1 = tableProducts.getValueAt(rowQuan, 3).toString();
                        quants1 = quants1.replaceAll(",", "");
                        int quants = Integer.valueOf(quants1);
                        
                        if(quants < quan)
                        {
                            //alert("THE PRODUCT IS OUT OF STOCK");
                        }
                        else
                        {
                            if(Integer.parseInt(textProdQuantity.getText().toString().replaceAll(",", ""))== 0)
                            {
                                alert("EMPTY STOCK");
                            }
                            else
                            {   
                                float total = (quantDum + quan) * price;
                                tableOrders.setValueAt(productID, i, 0);
                                tableOrders.setValueAt(textProdName.getText(), i, 1);
                                tableOrders.setValueAt(textProdDesc.getText(), i, 2);
                                tableOrders.setValueAt(String.format("%,d", quantDum + quan), i, 3);
                                tableOrders.setValueAt(textProdPrice.getText(), i, 4);
                                tableOrders.setValueAt(String.format("₱ %,.2f", total), i, 5);
                        
                                DefaultTableModel model2 = (DefaultTableModel) tableProducts.getModel();
                                model2.setValueAt(String.format("%,d", quants - quan), rowQuan, 3);
                                clearSelectedOrder();
                                calculate();
                        
                                act = 1;
                            }
                        }
                    }
                }
        
                if(act == 0) // if nothing identical found then create a new row
                {   
                    DefaultTableModel model3 = (DefaultTableModel) tableProducts.getModel();
                
                    //int quants = Integer.parseInt(model3.getValueAt(rowQuan, 3).toString());
                    String quants1 = model3.getValueAt(rowQuan, 3).toString();
                    quants1 = quants1.replaceAll(",", "");
                    int quants = Integer.valueOf(quants1);
                    
                    //this.origQuan = Integer.parseInt(model3.getValueAt(rowQuan, 3).toString());
                    String origQuan1 = model3.getValueAt(rowQuan, 3).toString();
                    origQuan1 = origQuan1.replaceAll(",", "");
                    this.origQuan = Integer.parseInt(origQuan1);//Integer.valueOf(origQuan1);
                    
                    if(quants < quan)
                    {
                        alert("THE PRODUCT IS OUT OF STOCK");
                    }
                    else
                    {
                        if(Integer.parseInt(textProdQuantity.getText().toString().replaceAll(",", ""))== 0)
                        {
                            alert("EMPTY STOCK");
                        }
                        else
                        {
                            //float price = Float.parseFloat(textProdPrice.getText());
                            float total = quan * price;
                            
                            DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
                            Object[] row = new Object[6];
                            row[0] = productID;
                            row[1] = textProdName.getText();
                            row[2] = textProdDesc.getText();
                            row[3] = String.format("%,d", Integer.parseInt(textProdQuantity.getText()));
                            row[4] = textProdPrice.getText();
                            row[5] = String.format("₱ %,.2f", total);
                            model.addRow(row);
                
                            DefaultTableModel model2 = (DefaultTableModel) tableProducts.getModel();
                            int resultquan = quants - quan;
                            
                            model2.setValueAt(String.format("%,d", resultquan), rowQuan, 3);
                            clearSelectedOrder();
                            calculate();
                        }
                    }
                }
            }
            else
            {
                alert("INPUT QUANTITY FIRST!");
            }
        }
        else
        {
            alert("FILL IT UP FIRST BY SELECTING YOUR DESIRED PRODUCT");
        }
    }
    
    private void updateOrder()
    {
        //int quan = Integer.parseInt(textProdQuantity.getText());
        String quan1 = textProdQuantity.getText();
        quan1 = quan1.replaceAll(",", "");
        int quan = Integer.valueOf(quan1);
        
        int i = tableOrders.getSelectedRow();
        String idprod = tableOrders.getValueAt(i, 0).toString();
        //int currentQuan = Integer.parseInt(tableOrders.getValueAt(i, 3).toString());
        String currentQuan1 = tableOrders.getValueAt(i, 3).toString();
        currentQuan1 = currentQuan1.replaceAll(",", "");
        int currentQuan = Integer.valueOf(currentQuan1);
        
        if(Integer.parseInt(textProdQuantity.getText().toString().replaceAll(",", ""))== 0)
        {
            alert("EMPTY STOCK!");
        }
        else
        {
            try {
                String sql = "SELECT quantity FROM products WHERE productid = '"+idprod+"'";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                while(rs.next())
                {
                    String origQuan1 = rs.getString(1);
                    origQuan1 = origQuan1.replaceAll(",", "");
                    this.origQuan = Integer.valueOf(origQuan1);
                }
                
                if(origQuan < quan)
                {
                    alert("YOU REQUESTED AN OUT OF BOUND VALUE OF AVAILABLE STOCKS");
                }
                else
                {
                    int option = JOptionPane.showConfirmDialog(rootPane, "ARE YOU SURE YOU WANT TO UPDATE YOUR ORDER?", "UPDATE CONFIRMATION", JOptionPane.YES_NO_OPTION);
                    if(option == 0)
                    {
                        int rowC = tableProducts.getRowCount();
                        for(int k = 0; k < rowC; k++)
                        {
                            String prodsID2 = tableProducts.getValueAt(k, 0).toString();
                            if(prodsID.compareTo(prodsID2)==0)
                            {
                                if(currentQuan > quan)
                                {
                                    //int prodQuan = Integer.parseInt(tableProducts.getValueAt(k, 3).toString());
                                    String prodQuan1 = tableProducts.getValueAt(k, 3).toString();
                                    prodQuan1 = prodQuan1.replaceAll(",", "");
                                    int prodQuan = Integer.valueOf(prodQuan1);
                                    int result = currentQuan - quan;
                                    tableProducts.setValueAt(String.format("%,d", prodQuan + result), k, 3);
                                }
                                else
                                {
                                    //int prodQuan = Integer.parseInt(tableProducts.getValueAt(k, 3).toString());
                                    String prodQuan1 = tableProducts.getValueAt(k, 3).toString();
                                    prodQuan1 = prodQuan1.replaceAll(",", "");
                                    int prodQuan = Integer.valueOf(prodQuan1);
                                    int result = quan - currentQuan;
                                    tableProducts.setValueAt(prodQuan - result, k, 3);
                                }
                            }
                        }
                        tableOrders.setValueAt(String.format("%,d", quan), i, 3);
                        
                        //float price = Float.parseFloat(tableOrders.getValueAt(i, 4).toString());
                        String price1 = tableOrders.getValueAt(i, 4).toString();
                        price1 = price1.replaceAll(",", "");
                        price1 = price1.replaceAll("₱", "");
                        float price = Float.valueOf(price1);
                        float total = price * quan;
                        
                        tableOrders.setValueAt(String.format("₱ %,.2f", total), i, 5);
                        clearSelectedOrder();
                        calculate();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void deleteOrder()
    {
        try
        {
            String valQuan = textProdQuantity.getText().trim();
            String prodName = textProdName.getText().trim();
            
            if(!prodName.isEmpty())
            {
                int option = JOptionPane.showConfirmDialog(rootPane, "ARE YOU SURE YOU WANT TO DELETE THIS ORDER?", "DELETE CONFIRMATION", JOptionPane.YES_NO_OPTION);
                if(option == 0)
                {
                    clearSelectedOrder();
                    String productname, description;
                    DefaultTableModel model2 = (DefaultTableModel) tableOrders.getModel();
                    int i = tableOrders.getSelectedRow();
                    productname = model2.getValueAt(i, 1).toString();
                    description = model2.getValueAt(i, 2).toString();
                    
                    
                    //int quantity = Integer.parseInt(model2.getValueAt(i, 3).toString());
                    String quantity1 = model2.getValueAt(i, 3).toString();
                    quantity1 = quantity1.replaceAll(",", "");
                    int quantity = Integer.valueOf(quantity1);
                
                    int rowC = tableProducts.getRowCount();
                    for(i = 0; i<rowC; i++)
                    {
                        String prodname = tableProducts.getValueAt(i, 1).toString();
                        String desc = tableProducts.getValueAt(i, 2).toString();
                        if( productname.compareTo(prodname) == 0 && description.compareTo(desc) == 0)
                        {
                            //int quantityProd = Integer.parseInt(tableProducts.getValueAt(i, 3).toString());
                            String quantityProd1 = tableProducts.getValueAt(i, 3).toString();
                            quantityProd1 = quantityProd1.replaceAll(",", "");
                            int quantityProd = Integer.valueOf(quantityProd1);
                            tableProducts.setValueAt(String.format("%,d", quantityProd + quantity), i, 3);
                        }
                    }
        
            
                    TableModel model = tableOrders.getModel();
                    DefaultTableModel model1 = (DefaultTableModel) tableOrders.getModel();
    
                    model1.removeRow(this.rowOrder);
                    btnDelete.setEnabled(false);
                    calculate(); 
                    act = 0;
                }
            }
            else
            {
                alert("SELECT FROM THE ORDER FIRST");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            //do nothing
        }
    }
    
    private void restart()
    {
        DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tableProducts.getModel();
        model.setRowCount(0);
        model2.setRowCount(0);
        clearSearch();
        loadProduct();
        btnProductSave.setEnabled(false);
        textProdQuantity.setEnabled(false);
        textProdName.setText("");
        textProdDesc.setText("");
        textProdQuantity.setText("");
        textProdPrice.setText("0.0");
        textDiscount.setText("");
        textPaidAmount.setText("");
        textChange.setText("0.0");
        labelTotalAmount.setText("0.0");
        labelDiscount.setText("0.0");
        labelOrderTotal.setText("0.0");
        act = 0;
    }
    
    private void btnSave()
    {
        val = 0;
        qty = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String timenow = sdf.format(new Date());
        
        int rowCountOrder = tableOrders.getRowCount();
        int rowCountProduct = tableProducts.getRowCount();
        int i, k;
        
        int orderset = 0;
        
        if(rowCountOrder <= 0)
        {
            alert("YOU HAVEN'T ADDED YOUR ORDER!");
        }
        else
        {
            int option = JOptionPane.showConfirmDialog(rootPane, "Is this your final order?", "Add confirmation", JOptionPane.YES_NO_OPTION);
            if(option == 0)
            {
                try {
                    String sql = "SELECT MAX(orderSet) FROM orders";
                    //String sql = "SELECT MAX(orderid) FROM orders";
                    st = con.createStatement();
                    rs = st.executeQuery(sql);
                    
                    while(rs.next())
                    {
                        orderset = rs.getInt(1);
                        if(Integer.toString(orderset).isEmpty())
                        {
                            orderset = 1;
                        }
                        else
                        {
                            orderset++;
                        }
                    }
                    this.item = Integer.toString(rowCountOrder);
                    for(i = 0; i<rowCountOrder; i++)
                    {
                        this.orderNum = Integer.toString(orderset);
                        String cashier = loginForm.username;
                        String productID = tableOrders.getValueAt(i, 0).toString();
                        String quantity = tableOrders.getValueAt(i, 3).toString();
                        String quantity1 = tableOrders.getValueAt(i, 3).toString();
                        
                        quantity1 = quantity1.replaceAll(",", "");
                        this.qty+=Integer.parseInt(quantity1);
                        
                        
                        String total = tableOrders.getValueAt(i, 5).toString();
                        //total = total.replaceAll(",", "");
                        
                        String paid = String.format("₱ %,.2f", Float.parseFloat(textPaidAmount.getText().trim()));
                        String change = textChange.getText().trim();
                        String totalAm = labelTotalAmount.getText().trim();
                        String disc = labelDiscount.getText().trim();
                        String orderTot = labelOrderTotal.getText().trim();
                        saveOrder(productID,quantity,total,timenow,paid,change,totalAm,disc,orderTot,orderset, cashier);
                        
                        for(k = 0; k<rowCountProduct; k++)
                        {
                            String prodID = tableProducts.getValueAt(k, 0).toString();
                            if(productID.compareTo(prodID) == 0)
                            {
                                String updateQuan = tableProducts.getValueAt(k, 3).toString();
                                updateQuan = updateQuan.replaceAll(",", "");
                                updateProduct(updateQuan,prodID);
                            }
                        }
                    }
                    int option2 = JOptionPane.showConfirmDialog(rootPane, "ORDER SUCCESSFULLY ADDED! \n SEE RECEIPT?", "CONFIRMATION", JOptionPane.YES_NO_OPTION);
                    if(option2 == 0)
                    {
                        this.val = 1;
                        new Receipt(1).setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        new MenuUser().setVisible(true);
                        this.dispose();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
                } //catch (NumberFormatException ex) {
                       //do nothing
                //}
            }   
        }
    }
    
    private void saveOrder(String productID, String quantity, String total, String date, String paid, String change, String totalAm, String disc, String orderTot, int orderset, String cashier)
    {
        try {
            String sql = "INSERT INTO orders (productid, quantity, total, datepurchased, paidAmount, change1, totalAmount, discount, orderTotal, orderSet, cashier) VALUES ('"+productID+"', '"+quantity+"', '"+total+"', '"+date+"', '"+paid+"', '"+change+"', '"+totalAm+"', '"+disc+"', '"+orderTot+"', '"+orderset+"', '"+cashier+"')";
            st = con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updateProduct(String quantity, String productID)
    {
        try {
            //String sql = "UPDATE products SET prodname = '"+productname+"', category = '"+categoryname+"', desci = '"+desc+"', quantity = '"+quantity+"', price = '"+price+"', datepurchased = '"+date+"', status = '"+status+"' WHERE productid = '"+productID+"'";
            String sql = "UPDATE products SET quantity = '"+quantity+"' WHERE productid = '"+productID+"'";
            st = con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearSelectedOrder()
    {
        btnProductSave.setEnabled(false);
        textProdQuantity.setEnabled(false);
        textProdName.setText("");
        textProdDesc.setText("");
        textProdQuantity.setText("");
        textProdPrice.setText("0.0");
    }
    
    //CREATE COLUMN
    private void createColumn()
    {
        dm = (DefaultTableModel) tableProducts.getModel();
        dm.addColumn("Product ID");
        dm.addColumn("Product Name");
        dm.addColumn("Description");
        dm.addColumn("Available Stocks");
        dm.addColumn("Price");
    }
    
    //FILTER DATA
    private void filter(String query)
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        tableProducts.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void alert(String msg)
    {
        JOptionPane.showMessageDialog(rootPane, msg);
    }
    
    private void calculate()
    {
        try
        {
            //TOTAL AMOUNT SECTION
            this.totalAmount = 0;
            this.orderTotal = 0;
            DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
            for(int i = 0; i < model.getRowCount(); i++)
            {
                //this.value = Float.parseFloat(model.getValueAt(i, 5).toString());
                String value1 = model.getValueAt(i, 5).toString();
                value1 = value1.replaceAll(",", "");
                value1 = value1.replaceAll("₱", "");
                this.value = Float.valueOf(value1);
                this.totalAmount +=  value;
            }
            labelTotalAmount.setText(String.format("₱ %,.2f", this.totalAmount));
            orderTotal += totalAmount;
            labelOrderTotal.setText(String.format("₱ %,.2f", this.orderTotal));
        
            //DISCOUNT SECTION
            float discountValue;
            labelDiscount.setText("0.00");
            discountValue = Float.parseFloat(textDiscount.getText());
            String discountVal = textDiscount.getText();
            if(discountValue > 100)
            {
                textDiscount.setText("100"); // ang nalahi
                this.discount = (totalAmount * 100) / 100;
                labelDiscount.setText(String.format("₱ %,.2f", this.discount));
                this.orderTotal = totalAmount - discount;
                labelOrderTotal.setText(String.format("₱ %,.2f", orderTotal));
            }
            else if(discountVal.isEmpty())
            {
                textDiscount.setText("0");
                this.discount = (totalAmount * discountValue) / 100;
                labelDiscount.setText(String.format("₱ %,.2f", this.discount));
                this.orderTotal = totalAmount - discount;
                labelOrderTotal.setText(String.format("₱ %,.2f", orderTotal));
            }
            else
            {
                this.discount = (totalAmount * discountValue) / 100;
                labelDiscount.setText(String.format("₱ %,.2f", this.discount));
                this.orderTotal = totalAmount - discount;
                labelOrderTotal.setText(String.format("₱ %,.2f", orderTotal));
            }

            //CHANGE SECTION
            textChange.setText("");
            
            String paidAm = textPaidAmount.getText();
            String orderT = labelOrderTotal.getText();
            
            paidAm = paidAm.replaceAll(",", "");
            paidAm = paidAm.replaceAll("₱", "");
            orderT = orderT.replaceAll(",", "");
            orderT = orderT.replaceAll("₱", "");
            
            this.paidAmount = Float.valueOf(paidAm);
            this.orderTotal = Float.valueOf(orderT);
            
            //int num = Integer.valueOf(strNumber).intValue();
            this.change = paidAmount - orderTotal;
            if(change < 0)
            {
                textChange.setText("INSUFFICIENT MONEY");
            }
            else
            {
                textChange.setText(String.format("₱ %,.2f", change));
            }
            }
        catch(NumberFormatException e)
        {
            //do nothing
        }
    }
    
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClear;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnOrderCancel;
    private javax.swing.JPanel btnOrderSave;
    private javax.swing.JPanel btnProductSave;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelOrderTotal;
    private javax.swing.JLabel labelTotalAmount;
    private javax.swing.JTable tableOrders;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField textChange;
    private javax.swing.JTextField textDiscount;
    private javax.swing.JTextField textPaidAmount;
    private javax.swing.JTextField textProdDesc;
    private javax.swing.JTextField textProdName;
    private javax.swing.JTextField textProdPrice;
    private javax.swing.JTextField textProdQuantity;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
