/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BeauticianPanels;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
import javax.swing.JPanel;

/**
 *
 * @author 91730
 */
public class BeauticianWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BeauticianWorkAreaJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;
    
    public BeauticianWorkAreaJPanel() {
        initComponents();
    }
    
    public BeauticianWorkAreaJPanel(JPanel workAreaContainer, UserAccounts userAccount, Ecosystem ecosystem) {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Salon Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 24));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BeauticianPanels/salonReq.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 255, 279));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Organisation Name", "Member Name", "Service Address", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 50, -1, 182));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("Process");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 250, -1, -1));

        backButton.setBackground(new java.awt.Color(133, 211, 255));
        backButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        //        userProcessContainer.remove(this);
        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
