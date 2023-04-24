/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Business.Ecosystem;
import DB4Outil.DB4Outil;
import UserAccounts.UserAccounts;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 91730
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Ecosystem system;
    private DB4Outil dB4OUtil = DB4Outil.getInstance();
    
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
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
        loginPanel = new javax.swing.JPanel();
        fieldUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signInBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        chatBot = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        workAreaContainer = new javax.swing.JPanel();
        workPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        loginPanel.setBackground(new java.awt.Color(255, 153, 51));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginPanel.add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 111, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Username:");
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, 20));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Pasword:");
        loginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, 20));

        signInBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        signInBtn.setText("Sign In");
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });
        loginPanel.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        signOutBtn.setText("Sign Out");
        signOutBtn.setEnabled(false);
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });
        loginPanel.add(signOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel3.setText("Login ");
        loginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));
        loginPanel.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 122, -1));
        loginPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 105, -1, -1));

        chatBot.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        chatBot.setText("Chat With Us!");
        chatBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBotActionPerformed(evt);
            }
        });
        loginPanel.add(chatBot, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 120, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/chatbot.png"))); // NOI18N
        loginPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, -10, 120, 80));

        jSplitPane1.setTopComponent(loginPanel);

        workAreaContainer.setLayout(new java.awt.CardLayout());

        workPanel.setBackground(new java.awt.Color(255, 255, 255));
        workPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel4.setText("Service O' Clock");
        workPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kokonor", 1, 18)); // NOI18N
        jLabel5.setText("....Service Round the Clock!!");
        workPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/logo04.jpeg"))); // NOI18N
        workPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 20, 2310, 900));

        workAreaContainer.add(workPanel, "card2");

        jSplitPane1.setRightComponent(workAreaContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        // TODO add your handling code here:
        String username = fieldUsername.getText();
        String password = fieldPassword.getText();
        
        UserAccounts userAccounts = system.getUserAccountDirectory().authenticateUser(username, password);
        try {
           if(userAccounts==null){
                 
                JOptionPane.showMessageDialog(null," Please Enter the Correct Username or Password");
                fieldUsername.setText("");
                fieldPassword.setText("");    
            }
        } catch(Exception e){
            return;
        }
        
        CardLayout cardLayout = (CardLayout) workAreaContainer.getLayout();
        workAreaContainer.add(userAccounts.getRole().createWorkArea(workAreaContainer, userAccounts, system));
        cardLayout.next(workAreaContainer);
        
        
        signOutBtn.setEnabled(true);
        signInBtn.setEnabled(false);
        fieldUsername.setEnabled(false);
        fieldPassword.setEnabled(false);
        
    }//GEN-LAST:event_signInBtnActionPerformed

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        // TODO add your handling code here:
        
        /*
         logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        blankJP.setBackground(new java.awt.Color(206,255,255));
        blankJP.setLayout(new java.awt.CardLayout());
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
        */
        
        signOutBtn.setEnabled(false);
        fieldUsername.setEnabled(true);
        fieldPassword.setEnabled(true);
        signInBtn.setEnabled(true);

        fieldUsername.setText("");
        fieldPassword.setText("");

        workAreaContainer.removeAll();
        CardLayout cl = (CardLayout) workAreaContainer.getLayout();
        workAreaContainer.add("serviceoclock", workPanel);
        cl.next(workAreaContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_signOutBtnActionPerformed

    private void chatBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBotActionPerformed
        // TODO add your handling code here:
        ArrayList<String> user_input = new ArrayList<String>();
        JTextArea chatarea = new JTextArea();
        JTextField chatbox = new JTextField();
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setLayout(null);
        jframe.setSize(700, 700);
        jframe.setTitle("Service'OClock");
        jframe.add(chatarea);
        jframe.add(chatbox);
        
        //For chat area
        chatarea.setSize(600, 500);
        chatarea.setLocation(2,2);
        
        // for input area
        chatbox.setSize(600,30);
        chatbox.setLocation(2,500);
        
        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean chat_end = false;
                String gtext = chatbox.getText().toLowerCase();
                chatarea.append("Tanuj -> "+gtext+"\n");
                chatbox.setText("");
                String req_cat  = "";
                if(gtext.contains("hi")){
                    bot("Hi, How may I assist you?",chatarea);
                }
                
                if(gtext.contains("service o clock") || gtext.contains("services o clock") ){
                    
                    bot("Please find a list of Enterprises that we have: \n \n HomeService Enterprise \n Salon Enterprise \n PestControl Enterprise \n Painting Enterprise \n Store Enterprise \n " ,chatarea);
                }
                
                if(gtext.contains("service") && gtext.contains("provider")){
                    
                    bot("We have two types of organizations in painting : \t painting Admin Organization and Painter Organization \n Please give the organization you want to explore",chatarea);
                }
                if(gtext.contains("painting")){
                    
                    bot("The painting Organisation Admin can edit his profile. He can add the painting packages provided by the painting enterprise. When a customer raises a request for painting services, he can accept/reject them. If accepted, he can then assign the customer to a painter.",chatarea);
                }
                if(gtext.contains("painter")){
                    
                    bot("View the orders assigned to him. Process and then complete the order." ,chatarea);
                }
               
            
            }
   
        });
      
        
    }//GEN-LAST:event_chatBotActionPerformed

    /**
     * @param args the command line arguments
     */
     private void bot(String bot_resp, JTextArea chatarea){
        chatarea.append("BOT ->"+bot_resp+"\n");
    } 
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chatBot;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton signInBtn;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JPanel workAreaContainer;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
