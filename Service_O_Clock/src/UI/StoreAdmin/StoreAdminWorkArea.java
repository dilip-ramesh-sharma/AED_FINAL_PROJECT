/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.StoreAdmin;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author tanujkodali
 */
public class StoreAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form StoreAdminWorkArea
     */
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;

    
   
    public StoreAdminWorkArea(JPanel workAreaContainer, UserAccounts userAccount,Ecosystem ecosystem) {
        initComponents();
        
        this.workAreaContainer = workAreaContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        
        
    }
    
    
    public StoreAdminWorkArea() {
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

        jLabel1 = new javax.swing.JLabel();
        viewSalesBtn = new javax.swing.JButton();
        createProducts = new javax.swing.JButton();
        editProfileBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("                                      Store Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 645, -1));

        viewSalesBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        viewSalesBtn.setText("View Products");
        viewSalesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSalesBtnActionPerformed(evt);
            }
        });
        add(viewSalesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 174, 165, -1));

        createProducts.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        createProducts.setText("Create Products");
        createProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProductsActionPerformed(evt);
            }
        });
        add(createProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 174, 182, -1));

        editProfileBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        editProfileBtn.setText("Edit Profile");
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });
        add(editProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 174, 164, -1));

        jButton1.setText("View Metrics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewSalesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSalesBtnActionPerformed
        // TODO add your handling code here:
        ViewProductBoughtJPanel view = new ViewProductBoughtJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Sales",view);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_viewSalesBtnActionPerformed

    private void createProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProductsActionPerformed
        // TODO add your handling code here:
        CretaeProductsPanel create = new CretaeProductsPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Create Products",create);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_createProductsActionPerformed

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed
        // TODO add your handling code here:
        EditProfileJPanel edit = new EditProfileJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Edit Profile",edit);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_editProfileBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MetricsJPanel edit = new MetricsJPanel(workAreaContainer, userAccount, ecosystem);
        workAreaContainer.add("Metrics Panel",edit);
        CardLayout layout = (CardLayout)workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createProducts;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewSalesBtn;
    // End of variables declaration//GEN-END:variables
}
