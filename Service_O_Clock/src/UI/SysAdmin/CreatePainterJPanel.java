/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SysAdmin;

import Business.Ecosystem;
import Painter.Painter;
import Role.PainterRole;
import UserAccounts.UserAccounts;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hi
 */
public class CreatePainterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePainterJPanel
     */
    private JPanel workAreaContainer;
    private Ecosystem system;
    UserAccounts userAccounts;
    
    public CreatePainterJPanel(JPanel workAreaContainer, Ecosystem system) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.system = system;
        populateTable();
    }
    
    public CreatePainterJPanel() {
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
        updateBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orgTable = new javax.swing.JTable();
        saveBtn = new javax.swing.JButton();
        fieldPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldAdminName = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        updateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        updateBtn.setText("Update");
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        viewBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        viewBtn.setText("View");
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("PAINTER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 327, -1));

        orgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orgTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 370, 230));

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 130, -1));
        add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 291, 127, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 294, 69, -1));
        add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 241, 127, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Username:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 244, -1, -1));
        add(fieldAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 191, 127, -1));

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deleteBtn.setText("Delete");
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/SysAdmin/painter.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, -160, 1140, 1300));
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable() {
        DefaultTableModel orgTableModel = (DefaultTableModel) orgTable.getModel();
        orgTableModel.setRowCount(0);

        for (UserAccounts user : system.getUserAccountDirectory().getUserAccountDirectory()) {

            if ("Role.PainterRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                orgTableModel.addRow(row);
            }
            
        }
    }
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String adminName = fieldAdminName.getText();
        String username = fieldUsername.getText();
        String password = fieldPassword.getText();

        try {
            if(adminName == null || adminName.isEmpty()){
                throw new NullPointerException("Please Enter Admin Name");
            }else if(Pattern.matches("^[A-Za-z ]+$", adminName) == false){
                throw new Exception("Please Enter A Valid Name");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please Enter Admin Name");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Name");
            return;
        }

        try {
            if(username == null || username.isEmpty()){
                throw new NullPointerException("Please Enter Username");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please Enter Username");
            return;
        }

        try {
            if(password == null || password.isEmpty()){
                throw new NullPointerException("Please Enter a Password");
            }else if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8,}$", password) == false){
                throw new Exception("Password is weak");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please Enter a Password");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is weak");
            return;
        }

        if (system.getUserAccountDirectory().checkIsUnique(username) == false) {
            JOptionPane.showMessageDialog(null,"Username Already Exists");
        }else{

            UserAccounts userAccounts = system.getUserAccountDirectory().createUser(adminName, username, password, null, new PainterRole());
            Painter paint = system.getPainterDirectory().createPainter(adminName,username);

            populateTable();

            fieldAdminName.setText("");
            fieldUsername.setText("");
            fieldPassword.setText("");
        }
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldAdminName;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orgTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
