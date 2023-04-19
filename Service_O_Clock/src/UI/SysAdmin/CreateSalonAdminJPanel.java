/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SysAdmin;

import Business.Ecosystem;
import Role.SalonServicesAdminRole;
import SalonServices.Salon;
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
public class CreateSalonAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSalonAdminJPanel
     */
    
    private JPanel workAreaContainer;
    private Ecosystem system;
    UserAccounts userAccounts;
    DefaultTableModel orgTableModel;
    
    public CreateSalonAdminJPanel() {
        initComponents();
    }
    
    public CreateSalonAdminJPanel(JPanel workAreaContainer, Ecosystem system) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.system = system;
        orgTableModel = (DefaultTableModel) orgTable.getModel();
        populateTable();
        updateBtn.setEnabled(false);
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
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fieldAdminName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("SALON ADMIN ORGANIZATION");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Admin Name:");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        orgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
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
        jScrollPane1.setViewportView(orgTable);

        viewBtn.setText("View");

        updateBtn.setText("Update");

        deleteBtn.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldAdminName)
                            .addComponent(fieldUsername)
                            .addComponent(fieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(saveBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(viewBtn)
                .addGap(58, 58, 58)
                .addComponent(updateBtn)
                .addGap(49, 49, 49)
                .addComponent(deleteBtn)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fieldAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(saveBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable() {
       
        System.out.println("a");
        orgTableModel.setRowCount(0);
        for (UserAccounts user : system.getUserAccountDirectory().getUserAccountDirectory()) {

            if ("Role.SalonServicesAdminRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                orgTableModel.addRow(row);
            }
            
        }
        System.out.println("b");
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        Component[] componentArray = workAreaContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_backBtnActionPerformed

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
            

        UserAccounts userAccounts = system.getUserAccountDirectory().createUser(adminName, username, password, null, new SalonServicesAdminRole());
        Salon salon = system.getSalonDirectory().createSalon(username);

        populateTable();
        
        fieldAdminName.setText("");
        fieldUsername.setText("");
        fieldPassword.setText("");
        }
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldAdminName;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orgTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
