/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SysAdmin;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author hi
 */
public class HomeServicesOrganisationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomeServicesOrganisationJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem system;
    UserAccounts userAccounts;
    
    public HomeServicesOrganisationJPanel(JPanel workAreaContainer, Ecosystem system) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.system = system;
    }
    
    public HomeServicesOrganisationJPanel() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        selectPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeAdminBtn = new javax.swing.JButton();
        homeTechBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        createPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Home Services Organisation");

        homeAdminBtn.setText("Create Home Service Admin");
        homeAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeAdminBtnActionPerformed(evt);
            }
        });

        homeTechBtn.setText("Create Home Service Technician");
        homeTechBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeTechBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectPanelLayout = new javax.swing.GroupLayout(selectPanel);
        selectPanel.setLayout(selectPanelLayout);
        selectPanelLayout.setHorizontalGroup(
            selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPanelLayout.createSequentialGroup()
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(homeTechBtn)
                            .addComponent(homeAdminBtn)))
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectPanelLayout.setVerticalGroup(
            selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(homeAdminBtn)
                .addGap(33, 33, 33)
                .addComponent(homeTechBtn)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(selectPanel);

        createPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(createPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void homeAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeAdminBtnActionPerformed
        // TODO add your handling code here:
        CreateHomeServiceAdminJPanel homeJPanel=new CreateHomeServiceAdminJPanel(createPanel, system);
        createPanel.add("Create Home Service Org Admin",homeJPanel);
        CardLayout lay = (CardLayout)createPanel.getLayout();
        lay.next(createPanel);
    }//GEN-LAST:event_homeAdminBtnActionPerformed

    private void homeTechBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeTechBtnActionPerformed
        // TODO add your handling code here:
        CreateHomeServiceTechnicianJPanel homeTechJPanel=new CreateHomeServiceTechnicianJPanel(createPanel, system);
        createPanel.add("Create Home Service Technician",homeTechJPanel);
        CardLayout lay = (CardLayout)createPanel.getLayout();
        lay.next(createPanel);
    }//GEN-LAST:event_homeTechBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        Component[] componentArray = workAreaContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel createPanel;
    private javax.swing.JButton homeAdminBtn;
    private javax.swing.JButton homeTechBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel selectPanel;
    // End of variables declaration//GEN-END:variables
}
