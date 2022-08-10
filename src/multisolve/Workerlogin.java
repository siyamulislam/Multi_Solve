package multisolve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Siam
 */
public class Workerlogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    Connect conn = new Connect();
    Statement stm;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Workerlogin() {
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

        mainPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordTextFiled = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        phoneTextFiled = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        headPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(null);

        createButton.setBackground(new java.awt.Color(204, 255, 255));
        createButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        mainPanel.add(createButton);
        createButton.setBounds(360, 390, 93, 40);

        infoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        infoLabel.setText("If you don't have a account, then create a account.");
        mainPanel.add(infoLabel);
        infoLabel.setBounds(220, 470, 550, 29);

        loginButton.setBackground(new java.awt.Color(204, 255, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        mainPanel.add(loginButton);
        loginButton.setBounds(490, 390, 90, 40);

        passwordTextFiled.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainPanel.add(passwordTextFiled);
        passwordTextFiled.setBounds(330, 310, 290, 50);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passwordLabel.setText("Password");
        mainPanel.add(passwordLabel);
        passwordLabel.setBounds(200, 320, 120, 30);

        phoneTextFiled.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainPanel.add(phoneTextFiled);
        phoneTextFiled.setBounds(330, 240, 290, 50);

        phoneLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        phoneLabel.setText("Phone ");
        mainPanel.add(phoneLabel);
        phoneLabel.setBounds(240, 230, 110, 70);

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        headerLabel.setText("Log In as Worker ");
        mainPanel.add(headerLabel);
        headerLabel.setBounds(210, 110, 440, 70);

        headPanel.setBackground(new java.awt.Color(204, 255, 51));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("MultiSolve");

        backButton.setBackground(new java.awt.Color(51, 255, 204));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 613, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(58, 58, 58))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(backButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        mainPanel.add(headPanel);
        headPanel.setBounds(0, 0, 900, 80);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3IzejQ.jpg"))); // NOI18N
        backgroundLabel.setToolTipText("");
        mainPanel.add(backgroundLabel);
        backgroundLabel.setBounds(-10, 0, 900, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        HomePage hm = new HomePage();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        workReg wr = new workReg();
        wr.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_createButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        try {
            String phone = phoneTextFiled.getText();
        String password = passwordTextFiled.getText();
            String sql = "Select * from worker_data where phone="+phone+" and password="+password+"";
            stm = conn.obtainConnection().createStatement();
            rs = stm.executeQuery(sql);

//            pst.setString(1, WPhonetext.getText());
//            pst.setString(2, WPasText.getText());
            while(rs.next()){
                if(rs.getString("phone")==phone){
                      System.out.println(rs.getString("age"));
                }
              
            }
            
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null, "Phone and Password Matched");
//                
////             WorkerProfile wp= new WorkerProfile();
////             wp.setVisible(true);
////             dispose();
//              
//              
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "Phone and password not Correct");
//                WPhonetext.setText("");
//                WPasText.setText("");
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Workerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workerlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextFiled;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextFiled;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
