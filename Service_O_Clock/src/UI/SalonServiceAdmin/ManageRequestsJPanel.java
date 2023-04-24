/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SalonServiceAdmin;

import Business.Ecosystem;
import SalonServices.Salon;
import UserAccounts.UserAccounts;
import WorkQueue.SalonWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanujkodali
 */
public class ManageRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBeauticianJPanel
     */
    
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;
    
    public ManageRequestsJPanel() {
        initComponents();
    }

    public ManageRequestsJPanel(JPanel workAreaContainer, UserAccounts userAccount, Ecosystem ecosystem) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        
        populateRequestsTable();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salonTable = new javax.swing.JTable();
        assignRequest = new javax.swing.JButton();
        viewRequest = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("                                 Manage Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 10, 472, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/SalonServiceAdmin/beautysalon.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 565, 619));

        salonTable.setBackground(new java.awt.Color(255, 204, 204));
        salonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Member Name", "Request Address", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salonTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 158, 477, 211));

        assignRequest.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        assignRequest.setText("Assign For Request");
        assignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignRequestActionPerformed(evt);
            }
        });
        add(assignRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 387, -1, -1));

        viewRequest.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        viewRequest.setText("View Request");
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });
        add(viewRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 387, 136, -1));

        backButton.setBackground(new java.awt.Color(133, 211, 255));
        backButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, 30));

        refreshBtn.setText("Refresh Table");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = salonTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            SalonWorkRequest request  = (SalonWorkRequest)salonTable.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("New Salon Service Request")){
                JOptionPane.showMessageDialog(null,"Accept the Request First", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Request Cancelled")){
                JOptionPane.showMessageDialog(null,"Request Cancelled !!! Cannot Assign.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Completed")){
                JOptionPane.showMessageDialog(null,"Request Completed Already !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Assigned Beautician")){
                JOptionPane.showMessageDialog(null,"Already Assigned Field Worker !!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                AssignBeauticianJPanel assignBeautician=new AssignBeauticianJPanel(workAreaContainer, userAccount, request, ecosystem);
                workAreaContainer.add("Assign Beautician", assignBeautician);
                CardLayout layout=(CardLayout)workAreaContainer.getLayout();
                layout.next(workAreaContainer);
            }
        }
    }//GEN-LAST:event_assignRequestActionPerformed

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = salonTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            SalonWorkRequest request  = (SalonWorkRequest)salonTable.getValueAt(selectedRow, 0);  
            if(request.getStatus().equals("Request Cancelled")){
                JOptionPane.showMessageDialog(null,"Request Cancelled !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Completed")){
                JOptionPane.showMessageDialog(null,"Request Completed Already !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                
                RequestDetailsJPanel rd = new RequestDetailsJPanel(workAreaContainer, userAccount, request, ecosystem);
                workAreaContainer.add("View Beautician Request", rd);
                CardLayout layout=(CardLayout)workAreaContainer.getLayout();
                layout.next(workAreaContainer);
            }
        }
    }//GEN-LAST:event_viewRequestActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateRequestsTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void populateRequestsTable() {
        DefaultTableModel model = (DefaultTableModel) salonTable.getModel();        
        model.setRowCount(0);               
        for (Salon salon:ecosystem.getSalonDirectory().getSalonsList()) {          
            if (salon.getUsername().equals(userAccount.getUsername())) {
               for(SalonWorkRequest service:salon.getSalonWorkRequestList()){
                Object[] row = new Object[4];
                row[0] = service;
                row[1] = service.getCustomerName();
                row[2] = service.getServiceAddress();
                row[3] = service.getStatus();
                model.addRow(row);
               }                
            }            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignRequest;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable salonTable;
    private javax.swing.JButton viewRequest;
    // End of variables declaration//GEN-END:variables
}
