/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multisolve;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siam
 */
public class AvailableOrders extends javax.swing.JFrame {

    /**
     * Creates new form WorkerProfile
     */
    Connect conn = new Connect();
    Statement stm;
    ResultSet rs = null;

    public AvailableOrders() {
        initComponents();
        Show_Worker();
        Show_Worker_PG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public ArrayList<Tutor_Order> workerList() {
        ArrayList<Tutor_Order> workerList = new ArrayList<>();
        try {
            stm = conn.obtainConnection().createStatement();
            ResultSet rs = stm.executeQuery("Select *from tutor_order");
            Tutor_Order worker;
            while (rs.next()) {
                worker = new Tutor_Order(rs.getString("version"), rs.getString("class"), rs.getString("subject"), rs.getString("type"), rs.getString("date"), rs.getString("contact_number"));
                workerList.add(worker);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return workerList;
    }
    public void Show_Worker() {
        ArrayList<Tutor_Order> list = workerList();
        DefaultTableModel model = (DefaultTableModel) TutorTB.getModel();
        Object[] row = new Object[6];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getuTversion();
            row[1] = list.get(i).getTclass();
            row[2] = list.get(i).getTsubject();
            row[3] = list.get(i).getsertype();
            row[4] = list.get(i).getsdate();
            row[5] = list.get(i).getphone();
            model.addRow(row);
        }
    }
    
    
    //photoGrapher
    
     public ArrayList<PGrapher_Order> workerList_PG(){
    ArrayList<PGrapher_Order> workerList_PG= new ArrayList<>();
    
    try{
        stm = conn.obtainConnection().createStatement();
            ResultSet rs = stm.executeQuery("Select *from photo_order");
        
        PGrapher_Order worker;
        while(rs.next ()){
            worker = new PGrapher_Order(rs.getString("event"),rs.getString("duration"), rs.getString("type"),rs.getString("date"),rs.getString("contact_number"));
            workerList_PG.add(worker);       
        }
    }
    
   catch( SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return workerList_PG;
     }
     
      public void Show_Worker_PG(){
       ArrayList<PGrapher_Order> list=  workerList_PG(); 
       DefaultTableModel model = (DefaultTableModel) PhotographerTB.getModel();
       Object[] row =new Object[5];
         
       for(int i=0 ;i< list.size(); i++){
           row[0]=list.get(i).getPevent();
           row[1]=list.get(i).getDuration();
           row[2]=list.get(i).getsertype();
           row[3]=list.get(i).getsdate();
           row[4]=list.get(i).getphone();
           
           
           model.addRow(row);
       }
   
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TutorTB = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PhotographerTB = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        TutorTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Version", "Class", "Subject", "Service Type", "S. Date", "Contact No"
            }
        ));
        jScrollPane1.setViewportView(TutorTB);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 710, 250);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Home Tutor");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 50, 170, 30);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Available Orders");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 0, 210, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 13, 140, 33);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText(" Photographer");

        PhotographerTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event", "Duration", "Service Type", "Service Date", "Contact Info"
            }
        ));
        jScrollPane2.setViewportView(PhotographerTB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AvailableOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvailableOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvailableOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvailableOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailableOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PhotographerTB;
    private javax.swing.JTable TutorTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
