/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HomeServiceAdmin;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
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

        setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setText("HOME SERVICE ADMIN ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}