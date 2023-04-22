/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HomeServiceAdmin;

import Business.Ecosystem;
import UI.PaitingAdmin.ManagePaintingServicesJPanel;
import UserAccounts.UserAccounts;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author hi
 */
public class HomeServiceAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomeServiceAdminWorkAreaJPanel
     */
    
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;
    
    public HomeServiceAdminWorkAreaJPanel() {
        initComponents();
    }
    
     public HomeServiceAdminWorkAreaJPanel(JPanel workAreaContainer, UserAccounts userAccount, Ecosystem ecosystem) {
        initComponents();
        
        this.workAreaContainer = workAreaContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
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
        btnRequests = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        btnServiceOrganisation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("HOME SERVICE ADMIN ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 6, -1, -1));

        btnRequests.setText("Manage Requests");
        btnRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestsActionPerformed(evt);
            }
        });
        add(btnRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 180, -1));

        btnServices.setText("Manage Services");
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });
        add(btnServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 156, -1));

        btnServiceOrganisation.setText("Manage Home services Organisation");
        btnServiceOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceOrganisationActionPerformed(evt);
            }
        });
        add(btnServiceOrganisation, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 260, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/HomeServiceAdmin/homeservices6.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 840, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestsActionPerformed
        // TODO add your handling code here:
      ManageHomeWorkerRequestJPanel requests = new ManageHomeWorkerRequestJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Manage Homeservices Requests", requests);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_btnRequestsActionPerformed

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
        // TODO add your handling code here:
        ManageHomeWorkerServicesJPanel services = new  ManageHomeWorkerServicesJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Manage HomeServices Services", services);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
        
    }//GEN-LAST:event_btnServicesActionPerformed

    private void btnServiceOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceOrganisationActionPerformed
        // TODO add your handling code here:
        ManageHomeWorkerInfoJPanel info = new ManageHomeWorkerInfoJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Manage HomeServices Info", info);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
        
    }//GEN-LAST:event_btnServiceOrganisationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequests;
    private javax.swing.JButton btnServiceOrganisation;
    private javax.swing.JButton btnServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
