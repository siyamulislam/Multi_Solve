package multisolve;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SiamPC
 */
public class TutorHair extends javax.swing.JFrame {

    /**
     * Creates new form
     *
     */
    String Version, Stype;
    Connect conn = new Connect();
    Statement stm;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TutorHair() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        PhoneT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        DateT = new javax.swing.JTextField();
        SubjectRB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MonthRB = new javax.swing.JRadioButton();
        HourRB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ClassT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EnglishRB = new javax.swing.JRadioButton();
        BanglaRB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/submit.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton);
        submitButton.setBounds(190, 350, 130, 40);

        PhoneT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(PhoneT);
        PhoneT.setBounds(140, 300, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Contact Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 297, 110, 20);

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset.png"))); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton);
        resetButton.setBounds(40, 350, 120, 40);

        DateT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(DateT);
        DateT.setBounds(140, 250, 180, 30);

        SubjectRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(SubjectRB);
        SubjectRB.setBounds(130, 160, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Subject");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 160, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 250, 40, 20);

        buttonGroup2.add(MonthRB);
        MonthRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MonthRB.setText("Monthly");
        MonthRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthRBActionPerformed(evt);
            }
        });
        jPanel1.add(MonthRB);
        MonthRB.setBounds(230, 210, 93, 25);

        buttonGroup2.add(HourRB);
        HourRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HourRB.setText("Hourly");
        jPanel1.add(HourRB);
        HourRB.setBounds(140, 210, 70, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Service Type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 210, 90, 20);

        ClassT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(ClassT);
        ClassT.setBounds(130, 120, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Class");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 70, 20);

        buttonGroup1.add(EnglishRB);
        EnglishRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnglishRB.setText("English");
        EnglishRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishRBActionPerformed(evt);
            }
        });
        jPanel1.add(EnglishRB);
        EnglishRB.setBounds(240, 80, 80, 25);

        buttonGroup1.add(BanglaRB);
        BanglaRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BanglaRB.setText("Bangla");
        BanglaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanglaRBActionPerformed(evt);
            }
        });
        jPanel1.add(BanglaRB);
        BanglaRB.setBounds(150, 80, 70, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Version");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 80, 60, 17);

        jPanel2.setBackground(new java.awt.Color(153, 255, 51));

        backButton.setBackground(new java.awt.Color(153, 255, 204));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tutor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books-3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BanglaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanglaRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BanglaRBActionPerformed

    private void EnglishRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnglishRBActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        String Version = Version = "Bangla";
        if (BanglaRB.isSelected()) {
            Version = "Bangla";
        }
        if (EnglishRB.isSelected()) {
            Version = "English";
        }
        String Class = ClassT.getText();
        String Subject = SubjectRB.getText();
        String Type = "Hourly";
        if (HourRB.isSelected()) {
            Type = "Hourly";
        }
        if (MonthRB.isSelected()) {
            Type = "Monthly";
        }
        String Date = DateT.getText();
        String Contact_Number = PhoneT.getText();

        String insertQuery = "Insert into tutor_order(version,class,subject,type,date,contact_number) Values('" + Version + "', '" + Class + "', '" + Subject + "', '" + Type + "', '" + Date + "','" + Contact_Number + "' )";
        try {
            stm = conn.obtainConnection().createStatement();
            stm.execute(insertQuery);
            JOptionPane.showMessageDialog(null, "Order Succesfully!..");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void MonthRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthRBActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:

        ClassT.setText("");
        SubjectRB.setText("");
        DateT.setText("");
        PhoneT.setText("");


    }//GEN-LAST:event_resetButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        UserProfile up = new UserProfile();
        up.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorHair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BanglaRB;
    private javax.swing.JTextField ClassT;
    private javax.swing.JTextField DateT;
    private javax.swing.JRadioButton EnglishRB;
    private javax.swing.JRadioButton HourRB;
    private javax.swing.JRadioButton MonthRB;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JTextField SubjectRB;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
