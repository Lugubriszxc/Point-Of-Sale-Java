 
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
import javax.swing.JFormattedTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.text.NumberFormatter;
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        Timenow();
        Home();
        Connection();
        
    }
    
    private volatile boolean stop = false;
    String username;
    SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd");
    Date date3 = new Date(System.currentTimeMillis());
    String valProdName, valCatCombo, valProdQuan, valProdPrice, valProdDesc, valProdStatus, valProdDate;
    String preCategory = "";
    
    String date = "";
    String productID = "";
    String categoryID = "";
    String date1 = "";
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    DefaultTableModel dm;
    DefaultTableModel dm2;
    ArrayList<categoryClass> categoryArr = new ArrayList<>();
    ArrayList<productClass> productArr = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tab6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tab7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tab8 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelClock = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnAddOrder = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        productSearchText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelClock1 = new javax.swing.JLabel();
        btnProdAdd = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        btnProdUpdate = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        btnProdDelete = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jp3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        txtCatName = new javax.swing.JTextField();
        labelCategory = new javax.swing.JLabel();
        categoryStatusCombo = new javax.swing.JComboBox<>();
        categorySearchText = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        labelClock3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnCatDelete = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        btnCatUpdate = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        btnCatAdd = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jpProductAdd = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        prodaddTxtProdQuantity = new javax.swing.JTextField();
        prodaddTxtProdName = new javax.swing.JTextField();
        prodaddTxtProdPrice = new javax.swing.JTextField();
        prodaddTxtProdDescription = new javax.swing.JTextField();
        prodaddCategoryCombo = new javax.swing.JComboBox<>();
        btnProductAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        labelClock4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        prodaddDatePurchased = new com.toedter.calendar.JDateChooser();
        jpProductUpdate = new javax.swing.JPanel();
        produpdateCategoryCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnProductUpdate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        produpdateTxtProdQuantity = new javax.swing.JTextField();
        produpdateTxtProdName = new javax.swing.JTextField();
        produpdateTxtProdPrice = new javax.swing.JTextField();
        produpdateTxtProdDescription = new javax.swing.JTextField();
        productStatusCombo = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        labelClock5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        prodUpdateDatePurchased = new com.toedter.calendar.JDateChooser();
        OrderHistory = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOrderHistory = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableOrderDetails = new javax.swing.JTable();
        textChange1 = new javax.swing.JTextField();
        textDisc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        textTotalAm = new javax.swing.JTextField();
        textOrderTot = new javax.swing.JTextField();
        textPaidAm = new javax.swing.JTextField();
        comboCashier = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        cashierFilter = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        clearFilter = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        Reports = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lowOnStock = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        soldProducts = new javax.swing.JTable();
        dateFrom = new com.toedter.calendar.JDateChooser();
        dateTo = new com.toedter.calendar.JDateChooser();
        minTotal = new javax.swing.JTextField();
        filterbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        outOfStock = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(29, 30, 28));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        tab1.setBackground(new java.awt.Color(29, 30, 28));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-24 (1).png"))); // NOI18N
        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        tab2.setBackground(new java.awt.Color(29, 30, 28));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-grocery-shelf-24.png"))); // NOI18N
        jLabel2.setText("Products");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab3.setBackground(new java.awt.Color(29, 30, 28));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-categories-24.png"))); // NOI18N
        jLabel17.setText("Categories");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab6.setBackground(new java.awt.Color(29, 30, 28));
        tab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab6MouseClicked(evt);
            }
        });
        tab6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tab6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 41, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-24.png"))); // NOI18N
        jLabel16.setText("Logout");
        tab6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        tab7.setBackground(new java.awt.Color(29, 30, 28));
        tab7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab7MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-order-history-24.png"))); // NOI18N
        jLabel19.setText("Order History");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab7Layout = new javax.swing.GroupLayout(tab7);
        tab7.setLayout(tab7Layout);
        tab7Layout.setHorizontalGroup(
            tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab7Layout.setVerticalGroup(
            tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab8.setBackground(new java.awt.Color(29, 30, 28));
        tab8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab8MouseClicked(evt);
            }
        });
        tab8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tab8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 41, -1, -1));

        jLabel43.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-download-graph-report-24 (1).png"))); // NOI18N
        jLabel43.setText("Reports");
        tab8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jp1.setBackground(new java.awt.Color(29, 30, 28));
        jp1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp1MouseMoved(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(27, 174, 93));

        labelClock.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        labelClock.setText("TIME");

        labelWelcome.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        labelWelcome.setText("HELLOOOOOO");
        labelWelcome.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                labelWelcomeComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelClock, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel21.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Point of Sale System");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo (1).png"))); // NOI18N

        btnAddOrder.setBackground(new java.awt.Color(27, 174, 93));
        btnAddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddOrderMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-shopping-cart-36.png"))); // NOI18N

        javax.swing.GroupLayout btnAddOrderLayout = new javax.swing.GroupLayout(btnAddOrder);
        btnAddOrder.setLayout(btnAddOrderLayout);
        btnAddOrderLayout.setHorizontalGroup(
            btnAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddOrderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnAddOrderLayout.setVerticalGroup(
            btnAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddOrderLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel22))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel21))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1370, Short.MAX_VALUE))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(686, Short.MAX_VALUE))
        );

        jp2.setBackground(new java.awt.Color(29, 30, 28));
        jp2.setPreferredSize(new java.awt.Dimension(2000, 981));
        jp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableProduct.setBackground(new java.awt.Color(204, 204, 204));
        tableProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Description", "Quantity", "Category", "Price", "Date Purchased", "Status"
            }
        ));
        tableProduct.setDefaultEditor(Object.class, null);
        tableProduct.setGridColor(new java.awt.Color(255, 255, 255));
        tableProduct.setRowHeight(25);
        tableProduct.setSelectionBackground(new java.awt.Color(0, 204, 102));
        tableProduct.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tableProductComponentAdded(evt);
            }
        });
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        tableProduct.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableProductPropertyChange(evt);
            }
        });
        tableProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tableProductKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tableProduct);

        jp2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 366, 1130, 615));

        productSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productSearchTextKeyReleased(evt);
            }
        });
        jp2.add(productSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 324, 530, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-24.png"))); // NOI18N
        jp2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 324, -1, 31));

        jPanel6.setBackground(new java.awt.Color(27, 174, 93));

        labelClock1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        labelClock1.setText("TIME");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(839, 839, 839)
                .addComponent(labelClock1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(861, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClock1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, -1));

        btnProdAdd.setBackground(new java.awt.Color(27, 174, 93));
        btnProdAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProdAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProdAddMouseExited(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-24.png"))); // NOI18N
        jLabel45.setText("Add");

        javax.swing.GroupLayout btnProdAddLayout = new javax.swing.GroupLayout(btnProdAdd);
        btnProdAdd.setLayout(btnProdAddLayout);
        btnProdAddLayout.setHorizontalGroup(
            btnProdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProdAddLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel45)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        btnProdAddLayout.setVerticalGroup(
            btnProdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jp2.add(btnProdAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 160, 50));

        btnProdUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnProdUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProdUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProdUpdateMouseExited(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-update-24.png"))); // NOI18N
        jLabel46.setText("Update");

        javax.swing.GroupLayout btnProdUpdateLayout = new javax.swing.GroupLayout(btnProdUpdate);
        btnProdUpdate.setLayout(btnProdUpdateLayout);
        btnProdUpdateLayout.setHorizontalGroup(
            btnProdUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProdUpdateLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(38, 38, 38))
        );
        btnProdUpdateLayout.setVerticalGroup(
            btnProdUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jp2.add(btnProdUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 160, 50));

        btnProdDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnProdDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProdDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProdDeleteMouseExited(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-24.png"))); // NOI18N
        jLabel47.setText("Delete");

        javax.swing.GroupLayout btnProdDeleteLayout = new javax.swing.GroupLayout(btnProdDelete);
        btnProdDelete.setLayout(btnProdDeleteLayout);
        btnProdDeleteLayout.setHorizontalGroup(
            btnProdDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProdDeleteLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel47)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        btnProdDeleteLayout.setVerticalGroup(
            btnProdDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jp2.add(btnProdDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 160, 50));

        jp3.setBackground(new java.awt.Color(29, 30, 28));
        jp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCategory.setBackground(new java.awt.Color(204, 204, 204));
        tableCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Category ID", "Category Name", "Status"
            }
        ));
        tableCategory.setGridColor(new java.awt.Color(255, 255, 255));
        tableCategory.setRowHeight(25);
        tableCategory.setSelectionBackground(new java.awt.Color(0, 204, 102));
        tableCategory.setDefaultEditor(Object.class, null);
        tableCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCategory);

        jp3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 152, 668, 620));
        jp3.add(txtCatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, 473, 39));

        labelCategory.setBackground(new java.awt.Color(51, 51, 51));
        labelCategory.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        labelCategory.setForeground(new java.awt.Color(204, 255, 255));
        labelCategory.setText("Category");
        jp3.add(labelCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 294, 93, -1));

        categoryStatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active", "inactive" }));
        categoryStatusCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryStatusComboActionPerformed(evt);
            }
        });
        jp3.add(categoryStatusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 378, 202, -1));

        categorySearchText.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                categorySearchTextPropertyChange(evt);
            }
        });
        categorySearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categorySearchTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categorySearchTextKeyReleased(evt);
            }
        });
        jp3.add(categorySearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 111, 530, 30));

        jPanel7.setBackground(new java.awt.Color(27, 174, 93));

        labelClock3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        labelClock3.setText("TIME");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(887, Short.MAX_VALUE)
                .addComponent(labelClock3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(866, 866, 866))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClock3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2056, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-24.png"))); // NOI18N
        jp3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 117, -1, -1));

        btnCatDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnCatDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCatDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCatDeleteMouseExited(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-update-24.png"))); // NOI18N
        jLabel48.setText("Delete");

        javax.swing.GroupLayout btnCatDeleteLayout = new javax.swing.GroupLayout(btnCatDelete);
        btnCatDelete.setLayout(btnCatDeleteLayout);
        btnCatDeleteLayout.setHorizontalGroup(
            btnCatDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCatDeleteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel48)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        btnCatDeleteLayout.setVerticalGroup(
            btnCatDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jp3.add(btnCatDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        btnCatUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnCatUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCatUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCatUpdateMouseExited(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-update-24.png"))); // NOI18N
        jLabel49.setText("Update");

        javax.swing.GroupLayout btnCatUpdateLayout = new javax.swing.GroupLayout(btnCatUpdate);
        btnCatUpdate.setLayout(btnCatUpdateLayout);
        btnCatUpdateLayout.setHorizontalGroup(
            btnCatUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCatUpdateLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel49)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        btnCatUpdateLayout.setVerticalGroup(
            btnCatUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jp3.add(btnCatUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 160, -1));

        btnCatAdd.setBackground(new java.awt.Color(27, 174, 93));
        btnCatAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCatAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCatAddMouseExited(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-24.png"))); // NOI18N
        jLabel50.setText("Add");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCatAddLayout = new javax.swing.GroupLayout(btnCatAdd);
        btnCatAdd.setLayout(btnCatAddLayout);
        btnCatAddLayout.setHorizontalGroup(
            btnCatAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCatAddLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel50)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        btnCatAddLayout.setVerticalGroup(
            btnCatAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jp3.add(btnCatAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 160, 50));

        jpProductAdd.setBackground(new java.awt.Color(29, 30, 28));
        jpProductAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        jpProductAdd.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 378, 64, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Purchased:");
        jpProductAdd.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");
        jpProductAdd.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 78, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price:");
        jpProductAdd.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 42, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Description:");
        jpProductAdd.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 114, -1));

        prodaddTxtProdQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodaddTxtProdQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodaddTxtProdQuantityActionPerformed(evt);
            }
        });
        prodaddTxtProdQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prodaddTxtProdQuantityKeyTyped(evt);
            }
        });
        jpProductAdd.add(prodaddTxtProdQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 301, 42));

        prodaddTxtProdName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpProductAdd.add(prodaddTxtProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 301, 42));

        prodaddTxtProdPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodaddTxtProdPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prodaddTxtProdPriceKeyTyped(evt);
            }
        });
        jpProductAdd.add(prodaddTxtProdPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 301, 42));

        prodaddTxtProdDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodaddTxtProdDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prodaddTxtProdDescriptionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prodaddTxtProdDescriptionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prodaddTxtProdDescriptionKeyTyped(evt);
            }
        });
        jpProductAdd.add(prodaddTxtProdDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 301, 42));

        prodaddCategoryCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodaddCategoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpProductAdd.add(prodaddCategoryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 307, 301, 42));

        btnProductAdd.setBackground(new java.awt.Color(0, 51, 51));
        btnProductAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnProductAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnProductAdd.setText("Add");
        btnProductAdd.setToolTipText("");
        btnProductAdd.setBorder(null);
        btnProductAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductAddActionPerformed(evt);
            }
        });
        jpProductAdd.add(btnProductAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 170, 61));

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Category:");
        jpProductAdd.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 318, 102, -1));

        jPanel4.setBackground(new java.awt.Color(27, 174, 93));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2035, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpProductAdd.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 687, 2039, -1));

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));

        labelClock4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        labelClock4.setForeground(new java.awt.Color(255, 255, 255));
        labelClock4.setText("TIME");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(853, Short.MAX_VALUE)
                .addComponent(labelClock4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(617, 617, 617))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelClock4)
                .addGap(19, 19, 19))
        );

        jpProductAdd.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1790, -1));

        jPanel9.setBackground(new java.awt.Color(27, 174, 93));

        jLabel23.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Add Product");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpProductAdd.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, -1, 40));
        jpProductAdd.add(prodaddDatePurchased, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 300, 40));

        jpProductUpdate.setBackground(new java.awt.Color(29, 30, 28));
        jpProductUpdate.setLayout(null);

        produpdateCategoryCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        produpdateCategoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        produpdateCategoryCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produpdateCategoryComboMouseClicked(evt);
            }
        });
        produpdateCategoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produpdateCategoryComboActionPerformed(evt);
            }
        });
        jpProductUpdate.add(produpdateCategoryCombo);
        produpdateCategoryCombo.setBounds(150, 330, 300, 40);

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name:");
        jpProductUpdate.add(jLabel10);
        jLabel10.setBounds(20, 400, 102, 23);

        btnProductUpdate.setBackground(new java.awt.Color(0, 51, 51));
        btnProductUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnProductUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnProductUpdate.setText("Update");
        btnProductUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductUpdateActionPerformed(evt);
            }
        });
        jpProductUpdate.add(btnProductUpdate);
        btnProductUpdate.setBounds(280, 620, 170, 61);

        jLabel11.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date Purchased:");
        jpProductUpdate.add(jLabel11);
        jLabel11.setBounds(20, 280, 110, 23);

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Category:");
        jpProductUpdate.add(jLabel12);
        jLabel12.setBounds(20, 340, 102, 23);

        jLabel13.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quantity:");
        jpProductUpdate.add(jLabel13);
        jLabel13.setBounds(20, 460, 102, 23);

        jLabel14.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price:");
        jpProductUpdate.add(jLabel14);
        jLabel14.setBounds(20, 520, 102, 23);

        jLabel15.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Description:");
        jpProductUpdate.add(jLabel15);
        jLabel15.setBounds(20, 580, 102, 23);

        produpdateTxtProdQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        produpdateTxtProdQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                produpdateTxtProdQuantityKeyTyped(evt);
            }
        });
        jpProductUpdate.add(produpdateTxtProdQuantity);
        produpdateTxtProdQuantity.setBounds(150, 450, 300, 40);

        produpdateTxtProdName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpProductUpdate.add(produpdateTxtProdName);
        produpdateTxtProdName.setBounds(150, 390, 300, 40);

        produpdateTxtProdPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        produpdateTxtProdPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produpdateTxtProdPriceActionPerformed(evt);
            }
        });
        produpdateTxtProdPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                produpdateTxtProdPriceKeyTyped(evt);
            }
        });
        jpProductUpdate.add(produpdateTxtProdPrice);
        produpdateTxtProdPrice.setBounds(150, 510, 300, 40);

        produpdateTxtProdDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpProductUpdate.add(produpdateTxtProdDescription);
        produpdateTxtProdDescription.setBounds(150, 570, 300, 40);

        productStatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active", "inactive" }));
        jpProductUpdate.add(productStatusCombo);
        productStatusCombo.setBounds(310, 200, 140, 30);

        jPanel10.setBackground(new java.awt.Color(0, 51, 51));

        labelClock5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        labelClock5.setForeground(new java.awt.Color(255, 255, 255));
        labelClock5.setText("TIME");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(889, Short.MAX_VALUE)
                .addComponent(labelClock5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(837, 837, 837))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelClock5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpProductUpdate.add(jPanel10);
        jPanel10.setBounds(0, 0, 2046, 72);

        jPanel11.setBackground(new java.awt.Color(27, 174, 93));

        jLabel24.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Update Product");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel24)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jpProductUpdate.add(jPanel11);
        jPanel11.setBounds(0, 130, 454, 50);
        jpProductUpdate.add(prodUpdateDatePurchased);
        prodUpdateDatePurchased.setBounds(150, 270, 300, 40);

        OrderHistory.setBackground(new java.awt.Color(29, 30, 28));
        OrderHistory.setPreferredSize(new java.awt.Dimension(2000, 900));
        OrderHistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(27, 174, 93));

        jLabel18.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Order History");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addContainerGap(1864, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        OrderHistory.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tableOrderHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Order SET", "Date Purchased"
            }
        ));
        tableOrderHistory.setDefaultEditor(Object.class, null);
        tableOrderHistory.setColumnSelectionAllowed(true);
        tableOrderHistory.setRowHeight(30);
        tableOrderHistory.setSelectionBackground(new java.awt.Color(27, 174, 93));
        tableOrderHistory.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tableOrderHistoryHierarchyChanged(evt);
            }
        });
        tableOrderHistory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableOrderHistoryFocusGained(evt);
            }
        });
        tableOrderHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrderHistoryMouseClicked(evt);
            }
        });
        tableOrderHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableOrderHistoryKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tableOrderHistory);
        tableOrderHistory.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        OrderHistory.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 630, 314));

        tableOrderDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Description", "Quantity", "Price", "Total"
            }
        ));
        tableOrderDetails.setRowHeight(30);
        tableOrderDetails.setSelectionBackground(new java.awt.Color(27, 174, 93));
        tableOrderDetails.setDefaultEditor(Object.class, null);
        jScrollPane4.setViewportView(tableOrderDetails);

        OrderHistory.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 1020, 330));

        textChange1.setEditable(false);
        textChange1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textChange1.setForeground(new java.awt.Color(204, 0, 0));
        textChange1.setText("0.00");
        textChange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textChange1ActionPerformed(evt);
            }
        });
        OrderHistory.add(textChange1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 220, 40));

        textDisc.setEditable(false);
        textDisc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textDisc.setText("0.00");
        textDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDiscActionPerformed(evt);
            }
        });
        OrderHistory.add(textDisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 220, 40));

        jLabel26.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Total Amount:");
        OrderHistory.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 107, -1));

        jLabel27.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Discount :");
        OrderHistory.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 80, -1));

        jLabel28.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Paid Amount:");
        OrderHistory.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 107, -1));

        jLabel30.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Order Total:");
        OrderHistory.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 107, -1));

        jLabel31.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Change:");
        OrderHistory.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 107, -1));

        textTotalAm.setEditable(false);
        textTotalAm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textTotalAm.setText("0.00");
        textTotalAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTotalAmActionPerformed(evt);
            }
        });
        OrderHistory.add(textTotalAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 220, 40));

        textOrderTot.setEditable(false);
        textOrderTot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textOrderTot.setForeground(new java.awt.Color(204, 0, 0));
        textOrderTot.setText("0.00");
        textOrderTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOrderTotActionPerformed(evt);
            }
        });
        OrderHistory.add(textOrderTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 220, 40));

        textPaidAm.setEditable(false);
        textPaidAm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textPaidAm.setText("0.00");
        textPaidAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaidAmActionPerformed(evt);
            }
        });
        OrderHistory.add(textPaidAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 220, 40));

        comboCashier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3", "Item4" }));
        comboCashier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCashierItemStateChanged(evt);
            }
        });
        comboCashier.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                comboCashierHierarchyChanged(evt);
            }
        });
        comboCashier.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboCashierFocusGained(evt);
            }
        });
        comboCashier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboCashierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboCashierMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboCashierMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboCashierMouseReleased(evt);
            }
        });
        comboCashier.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                comboCashierComponentShown(evt);
            }
        });
        comboCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCashierActionPerformed(evt);
            }
        });
        comboCashier.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboCashierPropertyChange(evt);
            }
        });
        OrderHistory.add(comboCashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 260, 30));

        jLabel35.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Cashier");
        OrderHistory.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        cashierFilter.setBackground(new java.awt.Color(27, 174, 93));
        cashierFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashierFilterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cashierFilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cashierFilterMouseExited(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Filter");

        javax.swing.GroupLayout cashierFilterLayout = new javax.swing.GroupLayout(cashierFilter);
        cashierFilter.setLayout(cashierFilterLayout);
        cashierFilterLayout.setHorizontalGroup(
            cashierFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashierFilterLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel51)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        cashierFilterLayout.setVerticalGroup(
            cashierFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        OrderHistory.add(cashierFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 30));

        clearFilter.setBackground(new java.awt.Color(255, 0, 0));
        clearFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearFilterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearFilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearFilterMouseExited(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Clear");

        javax.swing.GroupLayout clearFilterLayout = new javax.swing.GroupLayout(clearFilter);
        clearFilter.setLayout(clearFilterLayout);
        clearFilterLayout.setHorizontalGroup(
            clearFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearFilterLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel52)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        clearFilterLayout.setVerticalGroup(
            clearFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        OrderHistory.add(clearFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        Reports.setBackground(new java.awt.Color(29, 30, 28));
        Reports.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        Reports.setMinimumSize(new java.awt.Dimension(112, 790));

        jPanel13.setBackground(new java.awt.Color(27, 174, 93));

        jLabel44.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Reports");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1530, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addContainerGap())
        );

        lowOnStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Description", "Quantity"
            }
        ));
        lowOnStock.setDefaultEditor(Object.class, null);
        jScrollPane5.setViewportView(lowOnStock);

        soldProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product Name", "Description", "Quantity", "Total Amount", "Date"
            }
        ));
        soldProducts.setDefaultEditor(Object.class, null);
        jScrollPane6.setViewportView(soldProducts);

        dateFrom.setMaxSelectableDate(date3);

        dateTo.setMaxSelectableDate(date3);

        minTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minTotalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minTotalKeyTyped(evt);
            }
        });

        filterbtn.setText("FILTER");
        filterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterbtnActionPerformed(evt);
            }
        });

        clearbtn.setText("REFRESH");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("LOW ON STOCK(S)");

        outOfStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Description", "Quantity"
            }
        ));
        lowOnStock.setDefaultEditor(Object.class, null);
        jScrollPane7.setViewportView(outOfStock);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("OUT OF STOCK(S)");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("PRODUCTS SOLD");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("-");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("FROM");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("TO");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("TOTAL AMOUNT");

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReportsLayout.createSequentialGroup()
                                .addComponent(jScrollPane6)
                                .addGap(594, 594, 594))
                            .addGroup(ReportsLayout.createSequentialGroup()
                                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(filterbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateTo, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ReportsLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ReportsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReportsLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel36)
                                    .addGroup(ReportsLayout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2074, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, 2054, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpProductAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpProductUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(OrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1207, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpProductAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpProductUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(OrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void Home()
    {
        tab1.setBackground(new Color(68,188,122));//green
        tab2.setBackground(new Color(29,30,28));//dark grey
        tab3.setBackground(new Color(29,30,28));//dark grey
        //tab1.setBackground(Color.white); 
        jp1.setVisible(true);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jpProductAdd.setVisible(false);
        jpProductUpdate.setVisible(false);
        OrderHistory.setVisible(false);
        
        //String username = login.getUsername();
        //String username = login.username.toString();
        labelWelcome.setText("Welcome, "+loginForm.username+"!");
    }
    private void Connection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posjava", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Timenow()
    {
        //stop = false;
        Thread thread = new Thread(() ->{
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM, yyyy | hh:mm:ss a");
            //SimpleDateFormat sdf2 = new SimpleDateFormat("E, dd MMMM yyyy");
            while(!stop)
            {
                try
                {
                    //Thread.sleep(1000);
                }catch(Exception e)
                {
                    System.out.println(e);
                }
                //final String datenow = sdf2.format(new Date());
                final String timenow = sdf.format(new Date());
                   labelClock.setText(timenow);
                   labelClock1.setText(timenow);
                   labelClock3.setText(timenow);
                   labelClock4.setText(timenow);
                   labelClock5.setText(timenow);
            }
        });
        thread.start();
    }
    
    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        tab1();
    }//GEN-LAST:event_tab1MouseClicked
   
    private void tab1()
    {
        //THIS BUTTON IS FOR HOME
        jp1.setVisible(true);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jpProductAdd.setVisible(false);
        jpProductUpdate.setVisible(false);
        OrderHistory.setVisible(false);
        Reports.setVisible(false);
        
        tab1.setBackground(new Color(68,188,122));//green
        tab2.setBackground(new Color(29,30,28));//dark grey
        tab3.setBackground(new Color(29,30,28));//dark grey
        tab6.setBackground(new Color(29,30,28));
        tab8.setBackground(new Color(29,30,28));
    }
    
    private void tab2()
    {
         // THIS BUTTON IS FOR PRODUCTS
        jp1.setVisible(false);
        jp2.setVisible(true);
        jp3.setVisible(false);
        jpProductAdd.setVisible(false);
        jpProductUpdate.setVisible(false);
        OrderHistory.setVisible(false);
        Reports.setVisible(false);
        
        tab2.setBackground(new Color(68,188,122));
        tab1.setBackground(new Color(29,30,28));
        tab7.setBackground(new Color(29,30,28));
        tab3.setBackground(new Color(29,30,28));
        tab6.setBackground(new Color(29,30,28));
        tab8.setBackground(new Color(29,30,28));
        loadProduct();
        clearProductAdd();
        loadCategoryAddProduct();
        //loadCategoryProduct();
    }
    
    private void tab3()
    {
        // THIS BUTTON IS FOR CATEGORIES
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(true);
        jpProductAdd.setVisible(false);
        jpProductUpdate.setVisible(false);
        OrderHistory.setVisible(false);
        Reports.setVisible(false);
        
        tab3.setBackground(new Color(68,188,122));
        tab2.setBackground(new Color(29,30,28));
        tab7.setBackground(new Color(29,30,28));
        tab1.setBackground(new Color(29,30,28));
        tab6.setBackground(new Color(29,30,28));
        tab8.setBackground(new Color(29,30,28));
        //to load categories
        clearCategory();
        refreshCategory();
        categoryStatusCombo.disable();
    }
    
    private void tab4()
    {
        loadCashier();
        orderHistory();
        OrderHistory.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jpProductAdd.setVisible(false);
        jpProductUpdate.setVisible(false);
        Reports.setVisible(false);
        
        tab7.setBackground(new Color(68,188,122));//green
        tab1.setBackground(new Color(29,30,28));
        tab2.setBackground(new Color(29,30,28));//dark grey
        tab3.setBackground(new Color(29,30,28));//dark grey
        tab6.setBackground(new Color(29,30,28));
        tab8.setBackground(new Color(29,30,28));
    }
    
    private void tab5()//Reports
    {
        orderOutOfStock();
        soldProducts();
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jpProductAdd.setVisible(false);
        jpProductUpdate.setVisible(false);
        OrderHistory.setVisible(false);
        Reports.setVisible(true);
        
        tab8.setBackground(new Color(68,188,122));
        tab1.setBackground(new Color(29,30,28));
        tab2.setBackground(new Color(29,30,28));
        tab7.setBackground(new Color(29,30,28));
        tab3.setBackground(new Color(29,30,28));
        tab6.setBackground(new Color(29,30,28));
    }
    
    private void orderOutOfStock()
    {
        dm2 = (DefaultTableModel) outOfStock.getModel();
        dm2.setRowCount(0);
        dm = (DefaultTableModel) lowOnStock.getModel();
        dm.setRowCount(0);
        try {
            String sql = "SELECT prodname, desci, quantity FROM products WHERE quantity BETWEEN 1 AND 10";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                String prodname = rs.getString(1);
                String desci = rs.getString(2);
                String quantity = rs.getString(3);
                String[] rowData = {prodname,desci, quantity};
                dm.addRow(rowData);
            }
            
            String sql1 = "SELECT prodname, desci, quantity FROM products WHERE quantity < 1";
            st = con.createStatement();
            rs = st.executeQuery(sql1);
                
            while(rs.next())
            {
                String prodname = rs.getString(1);
                String desci = rs.getString(2);
                String quantity = rs.getString(3);
                String[] rowData = {prodname,desci, quantity};
                dm2.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void soldProducts()
    {
        dm = (DefaultTableModel) soldProducts.getModel();
        dm.setRowCount(0);
        try {
            String sql = "SELECT DISTINCT(orders.orderSet),products.prodname, products.desci, orders.quantity, orders.total, orders.datepurchased"
                    + " FROM (orders) INNER JOIN products ON orders.productid = products.productid";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                String orderID = rs.getString(1);
                String prodname = rs.getString(2);
                String desci = rs.getString(3);
                String quantity = rs.getString(4);
                String total = rs.getString(5);
                String date = rs.getString(6);
                String[] rowData = {orderID,prodname,desci, quantity, total, date};
                dm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private void loadCashier()
    {
        comboCashier.removeAllItems();
        try {
            //pst = con.prepareStatement("select DISTINCT(cashier) from orders");
            pst = con.prepareStatement("SELECT DISTINCT(name) FROM login");
            rs = pst.executeQuery();
            comboCashier.removeAllItems();
            
            while(rs.next())
            {
                comboCashier.addItem(rs.getString(1));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
       tab2();
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
       tab3();
    }//GEN-LAST:event_tab3MouseClicked
    
    private void orderHistory()
    {
        dm = (DefaultTableModel) tableOrderHistory.getModel();
        dm.setRowCount(0);
        try {
            String sql = "SELECT DISTINCT(orderSet), datepurchased FROM orders WHERE orderSet IS NOT NULL";
            //String sql = "SELECT DISTINCT(orderid), datepurchased FROM orders WHERE orderid IS NOT NULL";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                String orderset = rs.getString("orderSet");

                String datepurchased = rs.getString("datepurchased");
                String[] rowData = {orderset,datepurchased};
                dm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void clearProductAdd()
    {
        prodaddTxtProdName.setText("");
        prodaddTxtProdQuantity.setText("");
        prodaddTxtProdPrice.setText("");
        prodaddTxtProdDescription.setText("");
    }
    
    private void loadProduct()
    {
        String status = "active";
        
        //String cat = comboProductCategory.getSelectedItem().toString();
        productArr.clear();
        try {
            //String sql = "SELECT productid, prodname, desci, quantity, category, price, datepurchased FROM products INNER JOIN categories ON products.category = categories.categoryname WHERE products.status = '"+status+"' AND categories.status = '"+status+"'";
            //String sql = "select * from products where status = '"+status+"'";
            //String sql = "SELECT  products.productid, products.prodname, products.desci, products.quantity, products.category, products.price, products.datepurchased, products.status FROM products INNER JOIN categories ON products.category = categories.categoryname WHERE categories.status = '"+status+"'";
            String sql = "SELECT * FROM products INNER JOIN categories ON products.category = categories.categoryname WHERE categories.status = '"+status+"'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                productClass prod = new productClass(rs.getString("productid"), rs.getString("category"), rs.getString("prodname"), rs.getString("desci"), rs.getString("quantity"), rs.getString("price"), rs.getString("datepurchased"), rs.getString("status"));
                productArr.add(prod);
            }
            DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
            model.setRowCount(0);
            for (productClass prod : productArr) {

                Object[] row = new Object[8];
                row[0] = prod.getProdId();
                row[1] = prod.getProdName();
                row[2] = prod.getDesc();
                row[3] = String.format("%,d", Integer.parseInt(prod.getQuantity()));
                row[4] = prod.getCat();
                row[5] = prod.getPrice();
                row[6] = prod.getDate();
                row[7] = prod.getStatus();

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tableCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoryMouseClicked
        // TODO add your handling code here:
        categoryStatusCombo.enable();
        int i = tableCategory.getSelectedRow();
        TableModel model = tableCategory.getModel();
        this.categoryID = model.getValueAt(i,0).toString();
        txtCatName.setText(model.getValueAt(i,1).toString());
        this.preCategory = txtCatName.getText().trim();
        String categoryStatus = model.getValueAt(i,2).toString();
        categoryStatusCombo.setSelectedItem(categoryStatus);
    }//GEN-LAST:event_tableCategoryMouseClicked

    private void deleteProduct(String id)
    {
        try {
            //"DELETE FROM `student` WHERE id_number='" + id + "'"
            //String sql = "UPDATE products SET status = '"+status+"' WHERE productid = '"+id+"'";
            String sql = "DELETE FROM products WHERE productid = '"+id+"'";
            st = con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadCategoryUpdateProduct()
    {
        try {
            //SELECT  ID, NAME, AMOUNT, DATE FROM CUSTOMERS INNER JOIN ORDERS ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;
            String status = "active";
            pst = con.prepareStatement("select categoryname from categories where status = '"+status+"'");
            rs = pst.executeQuery();
            produpdateCategoryCombo.removeAllItems();
            
            while(rs.next())
            {
                produpdateCategoryCombo.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadCategoryAddProduct()
    {
        try {
            
            prodaddDatePurchased.setDate(date3);
            //SELECT  ID, NAME, AMOUNT, DATE FROM CUSTOMERS INNER JOIN ORDERS ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;
            String status = "active";
            pst = con.prepareStatement("select categoryname from categories WHERE status ='"+status+"'");
            rs = pst.executeQuery();
            prodaddCategoryCombo.removeAllItems();
            
            while(rs.next())
            {
                prodaddCategoryCombo.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnProductAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductAddActionPerformed
        //DecimalFormat df = new DecimalFormat("0.00");
        String categoryname = prodaddCategoryCombo.getSelectedItem().toString();
        String productname = prodaddTxtProdName.getText().trim();
        String desc = prodaddTxtProdDescription.getText().trim();
        String quantity = prodaddTxtProdQuantity.getText().trim();
        String price = prodaddTxtProdPrice.getText().trim();
        price = String.format("PHP %,.2f", (Double.parseDouble(price)));
        //quantity = String.format("%,d", Integer.parseInt(quantity));
        //float price = Float.parseFloat(prodaddTxtProdPrice.getText().trim());
        //df.format(price);
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        try {
            
            if(!categoryname.isEmpty() && !productname.isEmpty() && !desc.isEmpty() && !quantity.isEmpty() && !price.isEmpty() && productname != desc)
            {
                if(productname.compareTo(desc) != 0)
                {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posjava", "root", "");
                    String sql = "SELECT * FROM products WHERE prodname = '"+productname+"' AND desci = '"+desc+"'";
                    st = con.createStatement();
                    rs = st.executeQuery(sql);
                    
                    if(!rs.first())
                    {
                        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to add this data?", "Add confirmation", JOptionPane.YES_NO_OPTION);
                        if(option == 0)
                        {
                            if(prodaddDatePurchased.getDate() == null)
                            {
                                this.date1 = "";
                            }
                            else
                            {
                                this.date1 = dcn.format(prodaddDatePurchased.getDate());
                            }
                           
                            saveProduct(categoryname,productname,quantity,price,desc, date1);
                            alert("New product added!");
                            clearAdd();
                            jp1.setVisible(false);
                            jp2.setVisible(true);
                            jp3.setVisible(false);
                            jpProductAdd.setVisible(false);
                            jpProductUpdate.setVisible(false);
                            loadProduct();
                            //loadCategoryProduct(); 
                        }
                    }
                    else
                    {
                        alert("Product name and description already exist!", "SAME VALUE FOUND");
                    }    
                }
                else
                {
                    alert("Product Name and Description should not be the same", "SAME VALUE");
                }
            }
            else
            {
                    alert("Please fill up all the forms", "EMPTY TEXT");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProductAddActionPerformed

    private void productAddValidation()
    {
        
    }
    private void btnProductUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductUpdateActionPerformed
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        String categoryname = produpdateCategoryCombo.getSelectedItem().toString();
        String productname = produpdateTxtProdName.getText().trim();
        String quantity = produpdateTxtProdQuantity.getText().trim();
        //float price = Float.parseFloat(produpdateTxtProdPrice.getText().trim());
        //df.format(price);
        String price = produpdateTxtProdPrice.getText().trim();
        price = price.replaceAll(",", "");
        price = price.replaceAll("PHP", "");
        price = price.replaceAll("₱", "");
        //price = String.format("PHP %,.2f", Double.parseDouble(price));
        price = String.format("₱ %,.2f", Double.parseDouble(price));
        quantity = quantity.replaceAll(",", "");
        //quantity = String.format("%,d", Integer.parseInt(quantity));
        String desc = produpdateTxtProdDescription.getText().trim();
        String status = productStatusCombo.getSelectedItem().toString();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        if(prodUpdateDatePurchased.getDate() == null)
        {
            this.date = "";
        }
        else
        {
            this.date = dcn.format(prodUpdateDatePurchased.getDate());
        }
        String dateUpdate = date;
        
        try {
            
                if(desc.compareTo(this.valProdDesc) != 0 || productname.compareTo(this.valProdName) != 0 ||categoryname.compareTo(this.valCatCombo) != 0 || quantity.compareTo(this.valProdQuan) != 0 || price.compareTo(this.valProdPrice) != 0 || status.compareTo(this.valProdStatus) != 0 || dateUpdate.compareTo(this.valProdDate) != 0)
                {
                    if(productname.compareTo(desc) == 0)
                    {
                        alert("Product Name and Description should not be the same", "SAME VALUE");
                    }
                    else
                    {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posjava", "root", "");
                        //String sql = "SELECT * FROM products WHERE prodname= '"+productname+"' AND desci = '"+desc+"' NOT IN (productid = '"+productID+"')'";
                        //String sql = "SELECT prodname = '"+productname+"', desci = '"+desc+"' FROM products EXCEPT (SELECT prodname = '"+productname+"', desci = '"+desc+"' FROM products WHERE productid = '"+productID+"')";
                        //String sql = "SELECT prodname = '"+productname+"', desci = '"+desc+"' FROM products WHERE productid = '"+productID+"'";
                        String sql = "SELECT * FROM products WHERE prodname = '"+productname+"' AND desci = '"+desc+"' AND productid NOT IN ('"+productID+"')";
                        st = con.createStatement();
                        rs = st.executeQuery(sql);
                    
                        if(!rs.first())
                        {
                            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to update this data?", "Update confirmation", JOptionPane.YES_NO_OPTION);
                            if(option == 0)
                            {
                                updateProduct(categoryname, productname, quantity, price, desc, dateUpdate, status);
                                alert("Product Updated!");
                                loadProduct();
                                //loadCategoryProduct();
                            }
                        }
                        else
                        {
                            alert("Product name and description already exist!", "SAME VALUE FOUND");
                        }
                    }
                }
                else
                {
                    alert("NOTHING TO CHANGE.");
                }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProductUpdateActionPerformed

    private void produpdateCategoryComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produpdateCategoryComboMouseClicked
        // TODO add your handling code here:
        
        //loadCategoryUpdateProduct();
    }//GEN-LAST:event_produpdateCategoryComboMouseClicked

    private void produpdateTxtProdPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produpdateTxtProdPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produpdateTxtProdPriceActionPerformed

    private void prodaddTxtProdQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodaddTxtProdQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodaddTxtProdQuantityActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jp1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jp1MouseMoved

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusGained

    private void categoryStatusComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryStatusComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryStatusComboActionPerformed

    private void categorySearchTextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_categorySearchTextPropertyChange

    }//GEN-LAST:event_categorySearchTextPropertyChange

    private void categorySearchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorySearchTextKeyPressed
        
    }//GEN-LAST:event_categorySearchTextKeyPressed

    private void categorySearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorySearchTextKeyReleased
        // TODO add your handling code here:
        clearCategory();
        if(categorySearchText.getText().trim() == "")
        {
            refreshCategory();
        }
        else
        {
           categorySearch();
        }
    }//GEN-LAST:event_categorySearchTextKeyReleased

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked

        int i = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        this.productID = (String) model.getValueAt(i, 0);
    }//GEN-LAST:event_tableProductMouseClicked

    private void productSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productSearchTextKeyReleased

        if(categorySearchText.getText().trim() == "")
        {
            loadProduct();
        }
        else
        {
           productSearch();
        }
        
    }//GEN-LAST:event_productSearchTextKeyReleased

    private void prodaddTxtProdPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodaddTxtProdPriceKeyTyped
        
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume(); 
        }
        try
        {
            Double.parseDouble(prodaddTxtProdPrice.getText()+evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        }
    }//GEN-LAST:event_prodaddTxtProdPriceKeyTyped

    private void prodaddTxtProdQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodaddTxtProdQuantityKeyTyped
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume();
        }
        try
        {
            Integer.parseInt(prodaddTxtProdQuantity.getText() +evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        }
    }//GEN-LAST:event_prodaddTxtProdQuantityKeyTyped

    private void produpdateTxtProdQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produpdateTxtProdQuantityKeyTyped
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume();
        }
        try
        {
            Integer.parseInt(produpdateTxtProdQuantity.getText() +evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        }
    }//GEN-LAST:event_produpdateTxtProdQuantityKeyTyped

    private void produpdateTxtProdPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produpdateTxtProdPriceKeyTyped
        
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume();
        }
        try
        {
            Double.parseDouble(produpdateTxtProdPrice.getText()+evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        }
    }//GEN-LAST:event_produpdateTxtProdPriceKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        stop = true;
    }//GEN-LAST:event_formWindowClosed

    private void produpdateCategoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produpdateCategoryComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produpdateCategoryComboActionPerformed

    private void labelWelcomeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_labelWelcomeComponentShown
        // TODO add your handling code here:
   
    }//GEN-LAST:event_labelWelcomeComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(Menu.MAXIMIZED_BOTH); 
        //setExtendedState(Menu.NORMAL);
        //this.setUndecorated(true);
    }//GEN-LAST:event_formWindowOpened

    private void prodaddTxtProdDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodaddTxtProdDescriptionKeyTyped
        
       
    }//GEN-LAST:event_prodaddTxtProdDescriptionKeyTyped

    private void prodaddTxtProdDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodaddTxtProdDescriptionKeyPressed

    }//GEN-LAST:event_prodaddTxtProdDescriptionKeyPressed

    private void prodaddTxtProdDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodaddTxtProdDescriptionKeyReleased
        /*
        String productname = prodaddTxtProdName.getText().trim();
        String desc = prodaddTxtProdDescription.getText().trim();
        try {
            String sql = "SELECT * FROM products WHERE prodname = '"+productname+"' AND desci = '"+desc+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            int i = 0;
            if(!rs.next())
            {
                jLabel20.setText("_/");
                btnProductAdd.setEnabled(true);
            }
            else
            {
                jLabel20.setText("MATCH FOUND!");
                btnProductAdd.setEnabled(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_prodaddTxtProdDescriptionKeyReleased

    private void tab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseClicked

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirmation", dialogButton);
        if(dialogResult == 0)
        {
            new loginForm().setVisible(true);
            this.dispose();
        }

        tab6.setBackground(new Color(68,188,122));
        tab3.setBackground(new Color(29,30,28));
        tab2.setBackground(new Color(29,30,28));
        tab1.setBackground(new Color(29,30,28));
        tab7.setBackground(new Color(29,30,28));
        tab8.setBackground(new Color(29,30,28));
    }//GEN-LAST:event_tab6MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jLabel1MouseExited

    private void tab7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab7MouseClicked
        tab4();
    }//GEN-LAST:event_tab7MouseClicked

    private void btnAddOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrderMouseEntered
        // TODO add your handling code here:
        btnAddOrder.setBackground(Color.gray);
        
    }//GEN-LAST:event_btnAddOrderMouseEntered

    private void btnAddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrderMouseClicked
        // TODO add your handling code here:
        new OrderUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddOrderMouseClicked

    private void btnAddOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrderMouseExited
        // TODO add your handling code here:
        btnAddOrder.setBackground(new Color(27,174,93));
    }//GEN-LAST:event_btnAddOrderMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        tab1();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        tab2();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        tab3();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        tab4();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void tableOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderHistoryMouseClicked
        int i = tableOrderHistory.getSelectedRow();
        int viewModelRow = tableOrderHistory.convertRowIndexToModel(i);
        TableModel model = tableOrderHistory.getModel();
            
        int rowSelect = viewModelRow;
            
        String orderset = model.getValueAt(viewModelRow, 0).toString();
        orderDetails(orderset);
        try {
                      
            pst = con.prepareStatement("SELECT DISTINCT(cashier) FROM orders WHERE orderset = '"+orderset+"'");
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                String cashier = rs.getString(1);
                comboCashier.setSelectedItem(cashier);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableOrderHistoryMouseClicked

    private void tableOrderHistoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableOrderHistoryFocusGained
        
    }//GEN-LAST:event_tableOrderHistoryFocusGained

    private void tableOrderHistoryHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tableOrderHistoryHierarchyChanged
        //
    }//GEN-LAST:event_tableOrderHistoryHierarchyChanged

    private void tableOrderHistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableOrderHistoryKeyReleased
        int i = tableOrderHistory.getSelectedRow();
        int viewModelRow = tableOrderHistory.convertRowIndexToModel(i);
        TableModel model = tableOrderHistory.getModel();
            
        int rowSelect = viewModelRow;
            
        String orderset = model.getValueAt(viewModelRow, 0).toString();
        orderDetails(orderset);
        try {
                      
            pst = con.prepareStatement("SELECT DISTINCT(cashier) FROM orders WHERE orderset = '"+orderset+"'");
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                String cashier = rs.getString(1);
                comboCashier.setSelectedItem(cashier);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableOrderHistoryKeyReleased

    private void tableProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProductKeyTyped
        
    }//GEN-LAST:event_tableProductKeyTyped

    private void tableProductPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableProductPropertyChange

    }//GEN-LAST:event_tableProductPropertyChange

    private void tableProductComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tableProductComponentAdded

    }//GEN-LAST:event_tableProductComponentAdded

    private void textChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textChange1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textChange1ActionPerformed

    private void textDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDiscActionPerformed

    private void textTotalAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalAmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalAmActionPerformed

    private void textOrderTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOrderTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textOrderTotActionPerformed

    private void textPaidAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaidAmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaidAmActionPerformed

    private void comboCashierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCashierItemStateChanged

    }//GEN-LAST:event_comboCashierItemStateChanged

    private void comboCashierHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_comboCashierHierarchyChanged

    }//GEN-LAST:event_comboCashierHierarchyChanged

    private void comboCashierFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboCashierFocusGained

    }//GEN-LAST:event_comboCashierFocusGained

    private void comboCashierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCashierMouseEntered

    }//GEN-LAST:event_comboCashierMouseEntered

    private void comboCashierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCashierMouseExited

    }//GEN-LAST:event_comboCashierMouseExited

    private void comboCashierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCashierMousePressed

    }//GEN-LAST:event_comboCashierMousePressed

    private void comboCashierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCashierMouseReleased

    }//GEN-LAST:event_comboCashierMouseReleased

    private void comboCashierComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_comboCashierComponentShown

    }//GEN-LAST:event_comboCashierComponentShown

    private void comboCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCashierActionPerformed
        //String selectedValue = (String) comboCashier.getSelectedItem().toString();
        //alert(selectedValue);
    }//GEN-LAST:event_comboCashierActionPerformed

    private void comboCashierPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboCashierPropertyChange

    }//GEN-LAST:event_comboCashierPropertyChange

    private void tab8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab8MouseClicked
        tab5(); 
    }//GEN-LAST:event_tab8MouseClicked

    private void btnProdAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdAddMouseClicked
        // TO ADD PRODUCT
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jpProductAdd.setVisible(true);
        jpProductUpdate.setVisible(false);
        loadCategoryAddProduct();
    }//GEN-LAST:event_btnProdAddMouseClicked

    private void btnProdAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdAddMouseEntered
        btnProdAdd.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnProdAddMouseEntered

    private void btnProdAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdAddMouseExited
        btnProdAdd.setBackground(new Color(27,174,93));
    }//GEN-LAST:event_btnProdAddMouseExited

    private void btnProdUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdUpdateMouseClicked
        // TO UPDATE PRODUCT

        int i = tableProduct.getSelectedRow();
        if(i >= 0)
        {
            jp1.setVisible(false);
            jp2.setVisible(false);
            jp3.setVisible(false);
            jpProductAdd.setVisible(false);
            jpProductUpdate.setVisible(true);
            loadCategoryUpdateProduct();
            loadProdInfo();
        }
        else
        {
            alert("Please select a row first to update.");
        }
    }//GEN-LAST:event_btnProdUpdateMouseClicked

    private void btnProdUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdUpdateMouseEntered
        btnProdUpdate.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnProdUpdateMouseEntered

    private void btnProdUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdUpdateMouseExited
        btnProdUpdate.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnProdUpdateMouseExited

    private void btnProdDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdDeleteMouseClicked
        // TO DELETE A PARTICULAR PRODUCT

        int i = tableProduct.getSelectedRow();
        if(i >= 0)
        {
            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
            if(option == 0)
            {
                TableModel model = tableProduct.getModel();
                String id = model.getValueAt(i, 0).toString();

                if(tableProduct.getSelectedRows().length == 1)
                {
                    //String status = "inactive";
                    deleteProduct(id);
                    loadProduct();
                    //loadCategoryProduct();
                }
            }
        }
        else
        {
            alert("Please select a row first to delete.");
        }
    }//GEN-LAST:event_btnProdDeleteMouseClicked

    private void btnProdDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdDeleteMouseEntered
        btnProdDelete.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnProdDeleteMouseEntered

    private void btnProdDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdDeleteMouseExited
        btnProdDelete.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_btnProdDeleteMouseExited

    private void btnCatDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatDeleteMouseClicked
        //TO DELETE A DATA IN CATEGORY

        int i = tableCategory.getSelectedRow();
        if(i >= 0)
        {
            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
            if(option == 0)
            {
                TableModel model = tableCategory.getModel();
                String id = model.getValueAt(i, 0).toString();

                if(tableCategory.getSelectedRows().length == 1)
                {
                    String status = "inactive";
                    deleteCategory(id);
                    //deleteProductsCat(status);
                    refreshCategory(); //php local host
                    clearCategory();
                }
            }
        }
        else
        {
            alert("Please select a row first to delete.");
        }
    }//GEN-LAST:event_btnCatDeleteMouseClicked

    private void btnCatDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatDeleteMouseEntered
        btnCatDelete.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnCatDeleteMouseEntered

    private void btnCatDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatDeleteMouseExited
        btnCatDelete.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_btnCatDeleteMouseExited

    private void btnCatUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatUpdateMouseClicked
        // TO UPDATE THE CATEGORY

        int i = tableCategory.getSelectedRow();
        if(i >= 0)
        {
            String categoryname = txtCatName.getText().trim();
            String catid = this.categoryID;
            String catstatus = categoryStatusCombo.getSelectedItem().toString();
            if(!catid.isEmpty() && !categoryname.isEmpty())
            {
                int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to update this data?", "Update confirmation", JOptionPane.YES_NO_OPTION);
                if(option == 0)
                {
                    try {
                        String sql = "SELECT * FROM categories WHERE catid = '"+catid+"'";
                        st = con.createStatement();
                        rs = st.executeQuery(sql);

                        if(rs.first())
                        {
                            updateCategory(catid,categoryname,catstatus, this.preCategory);
                            alert("Category, updated");
                            refreshCategory();
                        }
                        else
                        {
                            alert("There is no such category", "Update error");
                            refreshCategory();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        else
        {
            alert("Please select a row first to update.");
        }
    }//GEN-LAST:event_btnCatUpdateMouseClicked

    private void btnCatUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatUpdateMouseEntered
        btnCatUpdate.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnCatUpdateMouseEntered

    private void btnCatUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatUpdateMouseExited
        btnCatUpdate.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnCatUpdateMouseExited

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseClicked

    private void btnCatAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatAddMouseClicked
        // TO ADD DATA OF CATEGORY
        String status = "active";
        String categoryname = txtCatName.getText().trim();
        if(!categoryname.isEmpty())
        {
            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to add this data?", "Add confirmation", JOptionPane.YES_NO_OPTION);
            if(option == 0)
            {
                try {
                    String sql = "select * from categories where categoryname = '"+categoryname+"'";
                    st = con.createStatement();
                    rs = st.executeQuery(sql);

                    if(!rs.first())
                    {
                        saveCategory(categoryname);
                        alert("New category added!");
                        refreshCategory();
                        clearCategory();
                    }
                    else
                    {
                        //retrieveData(status, categoryname);
                        alert("Please provide a different name for the category", "Similar category name found");
                        refreshCategory();
                    }
                    clearCategory();
                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            alert("FILL UP THE TEXTBOX FIRST!", "Empty");
        }
    }//GEN-LAST:event_btnCatAddMouseClicked

    private void btnCatAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatAddMouseEntered
        btnCatAdd.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnCatAddMouseEntered

    private void btnCatAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatAddMouseExited
        btnCatAdd.setBackground(new Color(27,174,93));
    }//GEN-LAST:event_btnCatAddMouseExited

    private void cashierFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierFilterMouseClicked
        try {
            String selected = comboCashier.getSelectedItem().toString();

            dm = (DefaultTableModel) tableOrderHistory.getModel();
            dm.setRowCount(0);

            String sql = "SELECT DISTINCT(orderSet), datepurchased FROM orders WHERE orderSet IS NOT NULL AND cashier = '"+selected+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next())
            {
                String orderset = rs.getString("orderSet");
                String datepurchased = rs.getString("datepurchased");
                String[] rowData = {orderset,datepurchased};
                dm.addRow(rowData);
            }

            DefaultTableModel model = (DefaultTableModel) tableOrderDetails.getModel();
            model.setRowCount(0);
            textTotalAm.setText("0.00");
            textDisc.setText("0.00");
            textOrderTot.setText("0.00");
            textPaidAm.setText("0.00");
            textChange1.setText("0.00");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cashierFilterMouseClicked

    private void cashierFilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierFilterMouseEntered
        cashierFilter.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_cashierFilterMouseEntered

    private void cashierFilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierFilterMouseExited
        cashierFilter.setBackground(new Color(27,174,93));
    }//GEN-LAST:event_cashierFilterMouseExited

    private void clearFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFilterMouseClicked
        comboCashier.setSelectedIndex(0);
        textTotalAm.setText("0.00");
        textDisc.setText("0.00");
        textOrderTot.setText("0.00");
        textPaidAm.setText("0.00");
        textChange1.setText("0.00");
        DefaultTableModel model = (DefaultTableModel) tableOrderDetails.getModel();
        model.setRowCount(0);
        orderHistory();
    }//GEN-LAST:event_clearFilterMouseClicked

    private void clearFilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFilterMouseEntered
        clearFilter.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_clearFilterMouseEntered

    private void clearFilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFilterMouseExited
        clearFilter.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_clearFilterMouseExited

    private void minTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTotalKeyReleased
        if(minTotal.getText().isEmpty())
        {
            String query = minTotal.getText();
            filter(query);
        }
        else
        {
            float query = Float.parseFloat(minTotal.getText());
            filter(String.format("₱ %,.2f", query));
        }
    }//GEN-LAST:event_minTotalKeyReleased

    private void filter(String query)
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        soldProducts.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
    private void minTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTotalKeyTyped
        if(Character.isLetter(evt.getKeyChar()))
        {
            evt.consume();
        }

        try
        {
            Double.parseDouble(minTotal.getText() +evt.getKeyChar());
        }
        catch(NumberFormatException e)
        {
            evt.consume();
        }
    }//GEN-LAST:event_minTotalKeyTyped

    private void filterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel)soldProducts.getModel();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String dateFrom1 = "";
        String dateTo2 = "";
        String datefrom3 = "";
        String dateto3 = "";
        
        if(dateFrom.getDate() == null)
        {
            alert("Select a range of date first!", "No setted date");
        }
        else
        {
            dateFrom1 = dcn.format(dateFrom.getDate());
            if(dateTo.getDate() == null)
            {
                dateTo2 = dcn.format(date3);
            }
            else
            {
                dateTo2 = dcn.format(dateTo.getDate());
            }
            
            datefrom3 = dateFrom1;
            datefrom3 = datefrom3.replaceAll("-", "");
            dateto3 = dateTo2;
            dateto3 = dateto3.replaceAll("-", "");
            
            int datefrom4 = Integer.parseInt(datefrom3);
            int dateto4 = Integer.parseInt(dateto3);
            
            if(datefrom4 > dateto4)
            {
                alert("Minimum Date must be lower than the Maximum Date!", "Set the date correctly");
            }
            else
            {
            try {
                //String minTotal1 = String.format("%.2f", Float.parseFloat(minTotal.getText().trim()));
                //alert(minTotal1, "");
                String sql = "SELECT DISTINCT(orders.orderSet),products.prodname, products.desci, orders.quantity, orders.total, orders.datepurchased"
                + " FROM (orders) INNER JOIN products ON orders.productid = products.productid WHERE orders.datepurchased BETWEEN '"+dateFrom1+"' AND '"+dateTo2+"'";
                /*String sql = "SELECT DISTINCT(orders.orderSet),products.prodname, products.desci, orders.quantity, orders.total, orders.datepurchased"
                + " FROM (orders) INNER JOIN products ON orders.productid = products.productid WHERE orders.total = '"+minTotal1+"'";*/
                //String sql = "SELECT * FROM orders WHERE total = '"+minTotal1+"'";
                st = con.createStatement();
                rs = st.executeQuery(sql);

                if(rs.next())
                {
                    model.setRowCount(0);
                    while(rs.next())
                    {
                        String orderID = rs.getString(1);
                        String prodname = rs.getString(2);
                        String desci = rs.getString(3);
                        String quantity = rs.getString(4);
                        String total = rs.getString(5);
                        String date = rs.getString(6);
                        String[] rowData = {orderID,prodname,desci, quantity, total, date};
                        dm.addRow(rowData);
                    }
                }
                else
                {
                        model.setRowCount(0);
                        String orderID = "N";
                        String prodname = "O";
                        String desci = "RE";
                        String quantity = "SU";
                        String total = "LTS";
                        String date = "FOUND";
                        String[] rowData = {orderID,prodname,desci, quantity, total, date};
                        dm.addRow(rowData);
                    
                        alert("No results found", "Unfortunate ain't it?");
                }
                } catch (SQLException ex) {
                Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
        }
    }//GEN-LAST:event_filterbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel)soldProducts.getModel();
        model.setRowCount(0);
        soldProducts();
        dateFrom.setDate(null);
        dateTo.setDate(null);

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        soldProducts.setRowSorter(tr);

        tr.setRowFilter(null);
        minTotal.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void orderDetails(String orderset)
    {
        dm = (DefaultTableModel) tableOrderDetails.getModel();
        dm.setRowCount(0);
        try {
            String sql = "SELECT products.prodname, products.desci, products.price, orders.quantity, orders.total, orders.totalAmount, orders.discount, orders.orderTotal, orders.paidAmount, orders.change1"
                    + " FROM (orders) INNER JOIN products ON orders.productid = products.productid WHERE orders.orderSet = '"+orderset+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                String prodname = rs.getString(1);
                String desci = rs.getString(2);
                String price = rs.getString(3);
                String quantity = rs.getString(4);
                String total = rs.getString(5);
                textTotalAm.setText(rs.getString(6));
                textDisc.setText(rs.getString(7));
                textOrderTot.setText(rs.getString(8));
                textPaidAm.setText(rs.getString(9));
                textChange1.setText(rs.getString(10));
                
                String[] rowData = {prodname,desci,quantity,price,total};
                dm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void productSearch()
    {
        if(productSearchText.getText().trim() == "")
        {
            loadProduct();
        }
        productArr.clear();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posjava", "root", "");
            String prodText = productSearchText.getText();
            String sql = "SELECT * FROM products WHERE productid LIKE '"+prodText+"%' OR prodname LIKE '"+prodText+"%' OR quantity LIKE '"+prodText+"%' OR category LIKE '"+prodText+"%' OR price LIKE '"+prodText+"%' OR datepurchased LIKE '%"+prodText+"%' OR status LIKE '"+prodText+"%' OR desci LIKE '"+prodText+"%'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                productClass prod = new productClass(rs.getString("productid"), rs.getString("category"), rs.getString("prodname"), rs.getString("desci"), rs.getString("quantity"), rs.getString("price"), rs.getString("datepurchased"), rs.getString("status"));
                productArr.add(prod);
            }
            DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
            model.setRowCount(0);
            for (productClass prod : productArr) {

                Object[] row = new Object[8];
                row[0] = prod.getProdId();
                row[1] = prod.getProdName();
                row[2] = prod.getDesc();
                row[3] = String.format("%,d", Integer.parseInt(prod.getQuantity()));
                row[4] = prod.getCat();
                row[5] = prod.getPrice();
                row[6] = prod.getDate();
                row[7] = prod.getStatus();

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    private void categorySearch()
    {
        if(categorySearchText.getText().trim() == "")
        {
            refreshCategory();
        }
        categoryArr.clear();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posjava", "root", "");
            String catText = categorySearchText.getText();
            String sql = "SELECT * FROM categories WHERE catid LIKE '"+catText+"%' OR categoryname LIKE '"+catText+"%' OR status LIKE '"+catText+"%'";
            st = this.con.createStatement();
            rs = st.executeQuery(sql);
            
                while (rs.next()) {
                categoryClass cat = new categoryClass(rs.getString("catid"), rs.getString("categoryname"), rs.getString("status"));
                categoryArr.add(cat);
                }
                DefaultTableModel model = (DefaultTableModel) tableCategory.getModel();
                model.setRowCount(0);
                for (categoryClass cat : categoryArr) {

                Object[] row = new Object[4];
                row[0] = cat.getCatId();
                row[1] = cat.getCatName();
                row[2] = cat.getCatStatus();

                model.addRow(row);
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*private void loadProductSearch()
    {
        String status = "active";
        productArr.clear();
        try {
            //this.categoryname = comboProductCategory.getSelectedItem().toString();
            String categoryname = comboProductCategory.getSelectedItem().toString();
            String sql = "select * from products where status = '"+status+"' AND category = '"+categoryname+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                productClass prod = new productClass(rs.getString("productid"), rs.getString("category"), rs.getString("prodname"), rs.getString("desci"), rs.getString("quantity"), rs.getString("price"), rs.getString("datepurchased"));
                productArr.add(prod);
            }
            DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
            model.setRowCount(0);
            for (productClass prod : productArr) {

                Object[] row = new Object[7];
                row[0] = prod.getProdId();
                row[1] = prod.getProdName();
                row[2] = prod.getDesc();
                row[3] = prod.getQuantity();
                row[4] = prod.getCat();
                row[5] = prod.getPrice();
                row[6] = prod.getDate();

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    public void loadProdInfo()
    {
        try {
            String sql = "SELECT * FROM products WHERE productid = '"+productID+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            //prodaddDatePurchased.setD
            while(rs.next())
            {
                produpdateTxtProdName.setText(rs.getString("prodname"));
                //produpdateCategoryCombo.removeAllItems();
                produpdateCategoryCombo.setSelectedItem(rs.getString("category"));
                //produpdateCategoryCombo.addItem(rs.getString("category"));
                produpdateTxtProdQuantity.setText(rs.getString("quantity"));
                produpdateTxtProdPrice.setText(rs.getString("price"));
                produpdateTxtProdDescription.setText(rs.getString("desci"));
                productStatusCombo.setSelectedItem(rs.getString("status"));
                this.date = rs.getString("datepurchased");
                if(!date.isEmpty())
                {
                  SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
                  Date date2 = formatter1.parse(date);
                  prodUpdateDatePurchased.setDate(date2);  
                }
                
                this.valProdName = rs.getString("prodname");
                this.valCatCombo = rs.getString("category");
                this.valProdQuan = rs.getString("quantity");
                this.valProdPrice = rs.getString("price");
                this.valProdDesc = rs.getString("desci");
                this.valProdStatus = rs.getString("status");
                this.valProdDate = rs.getString("datepurchased");
                //long date = Date.parse(rs.getString("datepurchased"));
                //prodUpdateDatePurchased.setDate(date);
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updateProduct(String categoryname, String productname, String quantity, String price, String desc, String date, String status)
    {
        try {
            String sql = "UPDATE products SET prodname = '"+productname+"', category = '"+categoryname+"', desci = '"+desc+"', quantity = '"+quantity+"', price = '"+price+"', datepurchased = '"+date+"', status = '"+status+"' WHERE productid = '"+productID+"'";
            st = con.createStatement();
            st.execute(sql);
            clearUpdate();
            jp1.setVisible(false);
            jp2.setVisible(true);
            jp3.setVisible(false);
            jpProductAdd.setVisible(false);
            jpProductUpdate.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearUpdate()
    {
        prodUpdateDatePurchased.setDate(null);
        produpdateCategoryCombo.removeAllItems();
        produpdateTxtProdName.setText("");
        produpdateTxtProdQuantity.setText("");
        produpdateTxtProdPrice.setText("");
        produpdateTxtProdDescription.setText("");
    }
    
    private void clearAdd()
    {
        prodaddDatePurchased.setDate(null);
        prodaddCategoryCombo.removeAllItems();
        prodaddTxtProdName.setText("");
        prodaddTxtProdQuantity.setText("");
        prodaddTxtProdPrice.setText("");
        prodaddTxtProdDescription.setText("");
    }
    
    private void saveProduct(String categoryname, String prodname, String quantity, String price, String desc, String date)
    {
        try {
            con.close();
            Connection();
            String status = "active";
            //String sql = "INSERT INTO products (category, prodname, quantity, price, desc, status)"
                    //+ "VALUES ('"+categoryname+"', '"+prodname+"', '"+quantity+"', '"+price+"', '"+description+"', '"+status+"')";
            String sql = "INSERT INTO products (category, prodname, quantity, price, status, desci, datepurchased) VALUES ('"+categoryname+"', '"+prodname+"', '"+quantity+"', '"+price+"', '"+status+"', '"+desc+"', '"+date+"')";
            st = con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveCategory(String categoryname)
    {
        try {
            String status = "active";
            String sql = "INSERT INTO categories (categoryname, status)"
                    + "VALUES ('"+categoryname+"', '"+status+"')";
            st = con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void deleteCategory(String catid)
    {
        try {
            //String sql = "UPDATE categories SET status = '"+status+"' WHERE catid = '"+catid+"'";
            //"DELETE FROM `student` WHERE id_number='" + id + "'"
            String sql = "DELETE FROM categories WHERE catid = '"+catid+"'";
            st = con.createStatement();
            st.execute(sql);
           
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updateCategory(String catid, String categoryname, String status, String preCategory)
    {
        try {
            String sql = "UPDATE categories SET categoryname = '"+categoryname+"', status = '"+status+"' WHERE catid = '"+catid+"'";
            st = con.createStatement();
            st.execute(sql);
            
            String sql2 = "UPDATE products SET category = '"+categoryname+"' WHERE category = '"+preCategory+"'";
            st = con.createStatement();
            st.execute(sql2);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void refreshCategory()
    {
        String status = "active";
        categoryArr.clear();
        try {
            String sql = "SELECT * FROM categories";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                categoryClass cat = new categoryClass(rs.getString("catid"), rs.getString("categoryname"), rs.getString("status"));
                categoryArr.add(cat);
            }
            DefaultTableModel model = (DefaultTableModel) tableCategory.getModel();
            model.setRowCount(0);
            for (categoryClass cat : categoryArr) {

                Object[] row = new Object[4];
                row[0] = cat.getCatId();
                row[1] = cat.getCatName();
                row[2] = cat.getCatStatus();

                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void retrieveData(String status, String categoryname)
    {
        try {
            
            String sql1 = "SELECT categoryname FROM categories WHERE status = 'inactive' AND categoryname = '"+categoryname+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql1);
            
            if(rs.next()) // found inactive
            {
                String sql = "UPDATE categories SET status = '"+status+"' WHERE categoryname = '"+categoryname+"'";
                st = con.createStatement();
                st.execute(sql);
            }
            else
            {
                 alert("Please provide a different name for the category", "Similar category name found");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alert(String msg)
    {
        JOptionPane.showMessageDialog(rootPane, msg);
    }
    
    //method to show an error alert
    public void alert(String msg, String title)
    {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public void clearCategory()
    {
        //labelId.setText("-");
        txtCatName.setText("");
        categoryStatusCombo.disable();
        categoryStatusCombo.setSelectedItem("active");
    
        
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OrderHistory;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel btnAddOrder;
    private javax.swing.JPanel btnCatAdd;
    private javax.swing.JPanel btnCatDelete;
    private javax.swing.JPanel btnCatUpdate;
    private javax.swing.JPanel btnProdAdd;
    private javax.swing.JPanel btnProdDelete;
    private javax.swing.JPanel btnProdUpdate;
    private javax.swing.JButton btnProductAdd;
    private javax.swing.JButton btnProductUpdate;
    private javax.swing.JPanel cashierFilter;
    private javax.swing.JTextField categorySearchText;
    private javax.swing.JComboBox<String> categoryStatusCombo;
    private javax.swing.JPanel clearFilter;
    private javax.swing.JButton clearbtn;
    private javax.swing.JComboBox<String> comboCashier;
    private com.toedter.calendar.JDateChooser dateFrom;
    private com.toedter.calendar.JDateChooser dateTo;
    private javax.swing.JButton filterbtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jpProductAdd;
    private javax.swing.JPanel jpProductUpdate;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelClock;
    private javax.swing.JLabel labelClock1;
    private javax.swing.JLabel labelClock3;
    private javax.swing.JLabel labelClock4;
    private javax.swing.JLabel labelClock5;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JTable lowOnStock;
    private javax.swing.JTextField minTotal;
    private javax.swing.JTable outOfStock;
    private com.toedter.calendar.JDateChooser prodUpdateDatePurchased;
    private javax.swing.JComboBox<String> prodaddCategoryCombo;
    private com.toedter.calendar.JDateChooser prodaddDatePurchased;
    private javax.swing.JTextField prodaddTxtProdDescription;
    private javax.swing.JTextField prodaddTxtProdName;
    private javax.swing.JTextField prodaddTxtProdPrice;
    private javax.swing.JTextField prodaddTxtProdQuantity;
    private javax.swing.JTextField productSearchText;
    private javax.swing.JComboBox<String> productStatusCombo;
    private javax.swing.JComboBox<String> produpdateCategoryCombo;
    private javax.swing.JTextField produpdateTxtProdDescription;
    private javax.swing.JTextField produpdateTxtProdName;
    private javax.swing.JTextField produpdateTxtProdPrice;
    private javax.swing.JTextField produpdateTxtProdQuantity;
    private javax.swing.JTable soldProducts;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab6;
    private javax.swing.JPanel tab7;
    private javax.swing.JPanel tab8;
    private javax.swing.JTable tableCategory;
    private javax.swing.JTable tableOrderDetails;
    private javax.swing.JTable tableOrderHistory;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField textChange1;
    private javax.swing.JTextField textDisc;
    private javax.swing.JTextField textOrderTot;
    private javax.swing.JTextField textPaidAm;
    private javax.swing.JTextField textTotalAm;
    private javax.swing.JTextField txtCatName;
    // End of variables declaration//GEN-END:variables
}
