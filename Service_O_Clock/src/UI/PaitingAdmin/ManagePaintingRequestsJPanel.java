/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PaitingAdmin;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
import WorkQueue.HomePaintingWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 91730
 */
public class ManagePaintingRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePaintingRequestsJPanel
     */
    
    private JPanel workAreaContainer;
    private Ecosystem ecosystem;
    private UserAccounts userAccount;
    
    public ManagePaintingRequestsJPanel() {
        initComponents();
    }
    
    public ManagePaintingRequestsJPanel(JPanel workAreaContainer, UserAccounts userAccount, Ecosystem ecosystem) {
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

        backButton = new javax.swing.JButton();
        paintingRequestTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paintRequestTable = new javax.swing.JTable();
        viewRequestButton = new javax.swing.JButton();
        assignPainterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, 30));

        paintingRequestTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        paintingRequestTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paintingRequestTitle.setText("Manage Painting Order Request");
        add(paintingRequestTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 612, -1));

        paintRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Customer Name", "Customer Address", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(paintRequestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 580, 90));

        viewRequestButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        viewRequestButton.setText("Accept/Reject Request");
        viewRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestButtonActionPerformed(evt);
            }
        });
        add(viewRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 170, 30));

        assignPainterButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        assignPainterButton.setText("Assign Painter");
        assignPainterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignPainterButtonActionPerformed(evt);
            }
        });
        add(assignPainterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PaitingAdmin/painter3.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 270, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = paintRequestTable.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            HomePaintingWorkRequest request  = (HomePaintingWorkRequest)paintRequestTable.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("In Progress")){
                JOptionPane.showMessageDialog(null, "Painting Request Accepted Already !!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Request Cancelled")){
                JOptionPane.showMessageDialog(null,"Request Cancelled !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Completed Service")){
                JOptionPane.showMessageDialog(null,"Service Completed Already !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                ViewPaintingRequestOrderJPanel viewRequest=new ViewPaintingRequestOrderJPanel(workAreaContainer, userAccount, request, ecosystem);
                workAreaContainer.add("View Painting Request", viewRequest);
                CardLayout layout=(CardLayout)workAreaContainer.getLayout();
                layout.next(workAreaContainer);
            }
        }
    }//GEN-LAST:event_viewRequestButtonActionPerformed

    private void assignPainterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignPainterButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = paintRequestTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            HomePaintingWorkRequest request  = (HomePaintingWorkRequest)paintRequestTable.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("New Request")){
                JOptionPane.showMessageDialog(null,"Accept the Request First", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Request Cancelled")){
                JOptionPane.showMessageDialog(null,"Request Cancelled !!! Cannot Assign.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Service Completed")){
                JOptionPane.showMessageDialog(null,"Request COmpleted Already !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Assigned Painter")){
                JOptionPane.showMessageDialog(null,"Already Assigned Painter !!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                AssignPainterJPanel assignPainter = new AssignPainterJPanel(workAreaContainer, userAccount, request, ecosystem);
                workAreaContainer.add("Assign Painter", assignPainter);
                CardLayout layout=(CardLayout)workAreaContainer.getLayout();
                layout.next(workAreaContainer);
            }
        }
    }//GEN-LAST:event_assignPainterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignPainterButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable paintRequestTable;
    private javax.swing.JLabel paintingRequestTitle;
    private javax.swing.JButton viewRequestButton;
    // End of variables declaration//GEN-END:variables
}
