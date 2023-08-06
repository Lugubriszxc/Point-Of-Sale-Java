
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.AttributedString;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Neil Chris
 */
public class Receipt extends javax.swing.JFrame {

    /**
     * Creates new form Receipt
     */
    public Receipt(int user) {
        initComponents();
        Connection();
        FetchData(user);
        displayReceipt(user);
    }

    SimpleDateFormat stf = new SimpleDateFormat("hh:mm a");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String datenow = sdf.format(new Date());
    String timenow = stf.format(new Date());
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    DefaultTableModel dm;
    
    String orderid = "";
    String productid = "";
    String quantity = "";
    String total = "";
    String datepurchased = "";
    String orderSet = "";
    String discount = "";
    String orderTotal = "";
    String totalAmount = "";
    String paidAmount = "";
    String change1 = "";
    String cashier = "";
    
    private void FetchData(int user)
    {
        String sql = "";
        try {
            
            if(user == 1)
            {
                sql = "SELECT * FROM orders WHERE orderSet = '"+Order.orderNum+"'";
            }
            else if(user == 2)
            {
                sql = "SELECT * FROM orders WHERE orderSet = '"+OrderUser.orderNum+"'";
            }
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            if(rs.next())
            {
                orderid = rs.getString(1);
                productid = rs.getString(2);
                quantity = rs.getString(3);
                total = rs.getString(4);
                datepurchased = rs.getString(5);
                orderSet = rs.getString(6);
                discount = rs.getString(7);
                orderTotal = rs.getString(8);
                totalAmount = rs.getString(9);
                paidAmount = rs.getString(10);
                change1 = rs.getString(11);
                cashier = rs.getString(12);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void displayReceipt(int user)
    {
        
        area.setText("=============================================\n");
        area.setText(area.getText() + "\t       TEAM 50/50 RANDOM STORE\n");
        area.setText(area.getText() + "\t     Bogo City, Cebu, 6010 Philippines\n");
        area.setText(area.getText() + "\t                    09123456789\n");
        area.setText(area.getText() + "=============================================\n");
        
        area.setText(area.getText() + "ORDER ID : "+ this.orderSet +"\n");
        area.setText(area.getText() + "=============================================\n");
        
        //LOOP THE PRODUCTS;
        String sql = "";
        try {
            if(user == 1)
            {
                sql = "SELECT products.prodname, products.price, orders.quantity, orders.total, products.productid, products.desci"
                    + " FROM (orders) INNER JOIN products ON orders.productid = products.productid WHERE orders.orderSet = '"+Order.orderNum+"'";
            }
            else if(user == 2)
            {
                sql = "SELECT products.prodname, products.price, orders.quantity, orders.total, products.productid, products.desci"
                    + " FROM (orders) INNER JOIN products ON orders.productid = products.productid WHERE orders.orderSet = '"+OrderUser.orderNum+"'";
            }
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                area.setText(area.getText() + rs.getString(1) + "\n");
                area.setText(area.getText() + rs.getString(6) + "\n");
                area.setText(area.getText() + rs.getString(5) + "\t" + rs.getString(3) + " x " + rs.getString(2) +  "\t\t" + rs.getString(4) + "\n");
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int valOrder = Order.val;
        int valOrderUser = OrderUser.val;
        //int valMenu = 
        
        if(user == 1)
        {
            area.setText(area.getText() + "Items(s) : " + Order.item + "\t\t\t" + "Qty(s) : " + Order.qty +"\n");
        }
        else if(user == 2)
        {
            area.setText(area.getText() + "Items(s) : " + OrderUser.item + "\t\t\t" + "Qty(s) : " + OrderUser.qty +"\n");
        }
        
        area.setText(area.getText() + "=============================================\n");
        area.setText(area.getText() + "SUBTOTAL \t\t\t" + this.totalAmount + "\n");
        area.setText(area.getText() + "DISCOUNT APPLIED \t\t-" + this.discount + "\n");
        area.setText(area.getText() + "=============================================\n");
        area.setText(area.getText() + "TOTAL \t\t\t" + this.orderTotal + "\n");
        //area.setText(area.getText() + String.format(Font.BOLD, "TOTAL") + "\n");
        area.setText(area.getText() + "CASH \t\t\t" + this.paidAmount + "\n");
        area.setText(area.getText() + "CHANGE \t\t\t" + this.change1 + "\n");
        area.setText(area.getText() + "=============================================\n");
        area.setText(area.getText() + "Date Issued : " + datenow + "\t\t"  + "Time issued : " + timenow +"\n");
        area.setText(area.getText() + "CASHIER NAME : " + this.cashier + "\n");
        area.setText(area.getText() + "=============================================\n\n");
        area.setText(area.getText() + "\t       THANK YOU FOR YOUR PURCHASE\n\n");
    }
    
    private void Connection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posjava", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        int valOrder = Order.val;
        int valOrderUser = OrderUser.val;
        
        if(valOrder == 1)
        {
            new MenuUser().setVisible(true);
            new Order().dispose();
            this.dispose();
        }
        else if(valOrderUser == 2)
        {
            new Menu().setVisible(true);
            new OrderUser().dispose();
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
