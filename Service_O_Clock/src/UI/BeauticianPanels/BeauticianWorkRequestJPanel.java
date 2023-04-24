/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BeauticianPanels;

import Beautician.BeauticianWorker;
import Business.Ecosystem;
import Customer.Customer;
import UserAccounts.UserAccounts;
import WorkQueue.SalonWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 91730
 */
public class BeauticianWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BeauticianWorkRequestJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;
    SalonWorkRequest request;
    
    public BeauticianWorkRequestJPanel() {
        initComponents();
    }

    BeauticianWorkRequestJPanel(JPanel workAreaContainer, SalonWorkRequest request, Ecosystem ecosystem, UserAccounts userAccount) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.request=request;
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

        completeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        completeBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        completeBtn.setText("Completed");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BeauticianPanels/images.jpeg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BeauticianPanels/salon2.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(completeBtn)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        // TODO add your handling code here:
        request.setStatus("Completed");
        for(Customer cust:ecosystem.getCustomerDirectory().getCustomerList()){
            if(request.getCustomerName().equals(cust.getCustomerName())){
                for(SalonWorkRequest request : cust.getSalonWorkRequestList()){
                    if(request.getStatus().equals("Assigned Field Worker")) {
                        request.setStatus("Completed");
                    }
                }
            }
        }
        for(BeauticianWorker beautician : ecosystem.getBeauticianDirectory().getBeauticianList()){
            if(beautician.getBeauticianUsrnme().equals(userAccount.getUsername())){
                beautician.setAvailability(true);
            }
        }
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_completeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
