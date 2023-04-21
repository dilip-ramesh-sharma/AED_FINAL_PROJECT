/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PestControlTechnician;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
import javax.swing.JPanel;

/**
 *
 * @author 91730
 */
public class TechnicianAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TechnicianAreaJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;

    
   
    public TechnicianAreaJPanel(JPanel workAreaContainer, UserAccounts userAccount,Ecosystem ecosystem) {
        initComponents();
        
        this.workAreaContainer = workAreaContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        
        
    }
    
    
    public TechnicianAreaJPanel() {
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PestControlTechnician/PestControlTechnician.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 567));

        tblRequestDetails.setBackground(new java.awt.Color(133, 211, 255));
        tblRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Pest Control Org Name", "Member Name", "Pickup Address", "Status", "Problem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 894, 200));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("In Progress");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 200, -1));

        jLabel1.setFont(new java.awt.Font("Al Nile", 1, 24)); // NOI18N
        jLabel1.setText("Technician Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jButton2.setText("Back");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 560, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestDetails;
    // End of variables declaration//GEN-END:variables
}
