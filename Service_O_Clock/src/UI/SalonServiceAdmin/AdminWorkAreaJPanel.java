/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SalonServiceAdmin;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author tanujkodali
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */ 
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;

    
    
    public AdminWorkAreaJPanel() {
        initComponents();
    }
    
   
    public AdminWorkAreaJPanel(JPanel workAreaContainer, UserAccounts userAccount,Ecosystem ecosystem) {
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

        headingLabel = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        btnManagereq = new javax.swing.JButton();
        btnManageSer = new javax.swing.JButton();
        btnManageEnterInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        headingLabel.setText("Salon Organisation Admin");
        add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 6, -1, -1));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/SalonServiceAdmin/salon2.jpeg"))); // NOI18N
        add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 122, 298, 187));

        btnManagereq.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManagereq.setText("Manage Requests");
        btnManagereq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagereqActionPerformed(evt);
            }
        });
        add(btnManagereq, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 113, 242, -1));

        btnManageSer.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageSer.setText("Manage Services");
        btnManageSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSerActionPerformed(evt);
            }
        });
        add(btnManageSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 173, 242, -1));

        btnManageEnterInfo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageEnterInfo.setText("Manage Salon Enterprise Info");
        btnManageEnterInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterInfoActionPerformed(evt);
            }
        });
        add(btnManageEnterInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 236, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagereqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagereqActionPerformed
        // TODO add your handling code here:
        ManageRequestsJPanel mr = new ManageRequestsJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Manage Requests", mr);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);

    }//GEN-LAST:event_btnManagereqActionPerformed

    private void btnManageSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSerActionPerformed
        // TODO add your handling code here:
        ManageServicesJPanel ms = new ManageServicesJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Manage Services",ms);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_btnManageSerActionPerformed

    private void btnManageEnterInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterInfoActionPerformed
        // TODO add your handling code here:
        ManageSalonInfoJPanel info = new ManageSalonInfoJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Manage Salon Organization Info",info);
        CardLayout layout=(CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_btnManageEnterInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterInfo;
    private javax.swing.JButton btnManageSer;
    private javax.swing.JButton btnManagereq;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
