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
public class PaintingOrganisationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PaintingOrganisationJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem system;
    UserAccounts userAccounts;
    
    public PaintingOrganisationJPanel(JPanel workAreaContainer, Ecosystem system) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.system = system;
    }
    
    public PaintingOrganisationJPanel() {
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
        paintAdmin = new javax.swing.JButton();
        painter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        createPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Painting Organisation");

        paintAdmin.setText("Create Painting Org Admin");
        paintAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paintAdminActionPerformed(evt);
            }
        });

        painter.setText("Create Painter");
        painter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painterActionPerformed(evt);
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
                            .addComponent(painter)
                            .addComponent(paintAdmin)))
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
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(paintAdmin)
                .addGap(41, 41, 41)
                .addComponent(painter)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(selectPanel);

        createPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(createPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void paintAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paintAdminActionPerformed
        // TODO add your handling code here:
        CreatePaintingAdminJPanel paintJPanel=new CreatePaintingAdminJPanel(createPanel, system);
        createPanel.add("Create Painting Org Admin",paintJPanel);
        CardLayout lay = (CardLayout)createPanel.getLayout();
        lay.next(createPanel);
    }//GEN-LAST:event_paintAdminActionPerformed

    private void painterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painterActionPerformed
        // TODO add your handling code here:
        CreatePainterJPanel painterJPanel=new CreatePainterJPanel(createPanel, system);
        createPanel.add("Create Painter",painterJPanel);
        CardLayout lay = (CardLayout)createPanel.getLayout();
        lay.next(createPanel);
    }//GEN-LAST:event_painterActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton paintAdmin;
    private javax.swing.JButton painter;
    private javax.swing.JPanel selectPanel;
    // End of variables declaration//GEN-END:variables
}