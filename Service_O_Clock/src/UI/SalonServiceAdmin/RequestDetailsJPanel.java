/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SalonServiceAdmin;

import Business.Ecosystem;
import Customer.Customer;
import UserAccounts.UserAccounts;
import WorkQueue.HomePaintingWorkRequest;
import WorkQueue.SalonWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanujkodali
 */
public class RequestDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestDetailsJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;
    private SalonWorkRequest request;
    
    public RequestDetailsJPanel() {
        initComponents();
    }

    public RequestDetailsJPanel(JPanel workAreaContainer, UserAccounts userAccount, SalonWorkRequest request, Ecosystem ecosystem) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.request = request;
        populateTable();
        specialInstruction.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        specialInstruction = new javax.swing.JTextField();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Request Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 6, -1, -1));

        serviceTable.setBackground(new java.awt.Color(255, 204, 204));
        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Name", "Description", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(serviceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 156));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Special Instruction:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 280, -1, -1));
        add(specialInstruction, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 275, 239, -1));

        acceptButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        acceptButton.setText("Accept ");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        add(acceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 352, -1, -1));

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 352, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/SalonServiceAdmin/salon6.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 276));

        backButton.setBackground(new java.awt.Color(133, 211, 255));
        backButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        // TODO add your handling code here:
        if(request.getStatus().equals("In Progress")) {
            JOptionPane.showMessageDialog(null, "Already Accepted", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(request.getStatus().equals("Assigned Beautician")) {
            JOptionPane.showMessageDialog(null, "Already Accepted", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(request.getStatus().equals("Request Cancelled")) {
            JOptionPane.showMessageDialog(null, "Request Cancelled Already", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            request.setStatus("In Progress");
            for(Customer cust:ecosystem.getCustomerDirectory().getCustomerList()){
                if(request.getCustomerName().equals(cust.getCustomerName())){
                    for(SalonWorkRequest request : cust.getSalonWorkRequestList()){
                        if(request.getStatus().equals("New Request")) {
                            request.setStatus("In Progress");
                        }

                    }
                }
            }
            workAreaContainer.remove(this);
            CardLayout layout = (CardLayout) workAreaContainer.getLayout();
            layout.previous(workAreaContainer);
        }
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        if(request.getStatus().equals("New Request")) {
            request.setStatus("Request Cancelled");
            for(Customer cust:ecosystem.getCustomerDirectory().getCustomerList()){
                if(request.getCustomerName().equals(cust.getUsername())){
                    for(SalonWorkRequest request : cust.getSalonWorkRequestList()){
                        if(request.getStatus().equals("New Request")) {
                            request.setStatus("Request Cancelled");
                        }
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Request is Accepted already. Cannot cancel Request !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) serviceTable.getModel();
        model.setRowCount(0);

        Object[] row = new Object[3];
                for(SalonServices.SalonServicesOffered serv:request.getSalonServicerequest()){
                     row[0] = serv;
                     row[1] = serv.getServiceDescription();
                     row[2] = serv.getServiceType();
                     model.addRow(row);
                }
        specialInstruction.setText(request.getMessage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable serviceTable;
    private javax.swing.JTextField specialInstruction;
    // End of variables declaration//GEN-END:variables
}
