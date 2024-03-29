/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Business.Ecosystem;
import Customer.Customer;
import HomePainting.HomePainting;
import UserAccounts.UserAccounts;
import WorkQueue.HomePaintingWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hi
 */
public class PaintingCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PaintingCustomerJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;

    
     public PaintingCustomerJPanel(JPanel workAreaContainer, UserAccounts userAccount, Ecosystem ecosystem) {
        initComponents();
        
        this.workAreaContainer = workAreaContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        populatePaintTable();
        populateRequestTable();
    }
     
    public PaintingCustomerJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cartBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setText("Your Service Requests:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 216, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setText("Pick A Painting Organisation of your choice:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 69, 487, -1));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Organisation Name", "Address", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 538, 155));

        orgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organisation Name", "Organisation Address", "Organisation Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 109, 542, 155));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("PAINTING SERVICE DASHBOARD");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 6, 472, -1));

        cartBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cartBtn.setText("View Services Offered");
        cartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtnActionPerformed(evt);
            }
        });
        add(cartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 276, -1, -1));

        refreshBtn.setText("Refresh Table");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Customer/painting7777.jpeg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, -120, 950, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void populatePaintTable() {
        
        DefaultTableModel paintTableModel = (DefaultTableModel) orgTable.getModel();
        paintTableModel.setRowCount(0);
        
            Object[] row = new Object[4];    
            for(HomePainting paint:ecosystem.getHomePaintingDirectory().getHomePaintingList()){
                 row[0] = paint;
                 row[1] = paint.getPaintArea();
                 row[2] = paint.getPaintContact();
                 
                 paintTableModel.addRow(row);
            }
            
    }

    public void populateRequestTable() {
        
        DefaultTableModel requestTableModel = (DefaultTableModel) requestTable.getModel();
        requestTableModel.setRowCount(0);

          for (Customer cust:ecosystem.getCustomerDirectory().getCustomerList()) {   
            if (cust.getUsername().equals(userAccount.getUsername())) {
               for(HomePaintingWorkRequest home:cust.getHomePaintingWorkRequestList()){
                Object[] row = new Object[4];
                row[0] = home;
                row[1] = home.getPaintingCompanyName();
                row[2] = home.getServiceAddress();
                row[3] = home.getStatus();
                requestTableModel.addRow(row);
               }            
            }  
        }
    }
    
    private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orgTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"No Selections Made!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            HomePainting home = (HomePainting)orgTable.getValueAt(selectedRow, 0);
            PaintingCartJPanel cart = new PaintingCartJPanel(workAreaContainer, userAccount, ecosystem, home);
            workAreaContainer.add("Painting Cart", cart);
            CardLayout layout=(CardLayout)workAreaContainer.getLayout();
            layout.next(workAreaContainer);
        }
    }//GEN-LAST:event_cartBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orgTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
