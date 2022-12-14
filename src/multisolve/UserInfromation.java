package multisolve;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SiamPC
 */
public class UserInfromation extends javax.swing.JFrame {

    String gender;

    /**
     * Creates new form HomeTutorList
     */
    Connect conn = new Connect();
    Statement stm;
    ResultSet rs = null;

    public UserInfromation() {
        initComponents();

        Show_User();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public ArrayList<User> userList() {
        ArrayList<User> userList = new ArrayList<>();

        try {
            stm = conn.obtainConnection().createStatement();
            ResultSet rs = stm.executeQuery("Select *from user_data");
            User user;
            while (rs.next()) {
                user = new User(rs.getInt("user_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("address"), rs.getString("email"), rs.getString("gender"), rs.getInt("age"), rs.getString("phone"), rs.getString("password"));
                userList.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList;
    }

    public void Show_User() {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) WorkerTB.getModel();
        Object[] row = new Object[9];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getuID();
            row[1] = list.get(i).getUFName();
            row[2] = list.get(i).getULName();
            row[3] = list.get(i).getUAdd();
            row[4] = list.get(i).getUEmail();
            row[5] = list.get(i).getUgender();
            row[6] = list.get(i).getUAge();
            row[7] = list.get(i).getUPhone();
            row[8] = list.get(i).getUpassword();

            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkerTB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        FNameT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LNameT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddressT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PhoneT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PasswordT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FemaleRB = new javax.swing.JRadioButton();
        MaleRB = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        AgeT = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        UIDT = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User List");

        WorkerTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "FName", "LName", "Address", "Email", "Gender", "Age", "Phone", "Password"
            }
        ));
        WorkerTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkerTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(WorkerTB);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SearchText.setText(" ");
        SearchText.setToolTipText("");
        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        SearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextKeyReleased(evt);
            }
        });

        FNameT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FNameT.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");

        LNameT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LNameT.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");

        AddressT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddressT.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        EmailT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailT.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Phone");

        PhoneT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneT.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password");

        PasswordT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordT.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender");

        buttonGroup1.add(FemaleRB);
        FemaleRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FemaleRB.setText("Female");

        buttonGroup1.add(MaleRB);
        MaleRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MaleRB.setText("Male");
        MaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRBActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Age");

        AgeT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgeT.setToolTipText("");

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/restart32.png"))); // NOI18N
        resetButton.setText("ReSet");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/update.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Fast Name");

        UIDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        jLabel12.setText("Search By Worker ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FNameT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LNameT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddressT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneT)
                                    .addComponent(PasswordT)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(MaleRB)
                                                .addGap(18, 18, 18)
                                                .addComponent(FemaleRB)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaleRB)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FemaleRB))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        SearchText.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomePage hm = new HomePage();
        hm.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed

    private void MaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRBActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        ReSet();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
         try {
            int row = WorkerTB.getSelectedRow();
            String value = (WorkerTB.getModel().getValueAt(row, 0).toString());
            String fName = FNameT.getText();
            String lName = LNameT.getText();
            String address = AddressT.getText();
            String email = EmailT.getText();
            String gender = "male";
            if (MaleRB.isSelected()) {
                gender = "Male";
            }
            if (FemaleRB.isSelected()) {
                gender = "Female";
            }
            String age = AgeT.getText();
            String phone = PhoneT.getText();
            String password = PasswordT.getText();
            if (JOptionPane.showConfirmDialog(null, "Are sure to Update this ?", "Update Conformation",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                stm.executeUpdate("UPDATE user_data SET first_name='" + fName + "',last_name='" + lName + "',address='" + address + "',email='" + email + "',gender='" + gender + "',age='" + age + "',phone='" + phone + "',password='" + password + "' WHERE user_id= " + value);
            }
            JOptionPane.showMessageDialog(null, "Update Sucessfully!");
            Refesh();
            ReSet();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Error!!!" + e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void WorkerTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkerTBMouseClicked

        int j = WorkerTB.getSelectedRow();
        TableModel model = WorkerTB.getModel();
        UIDT.setText(model.getValueAt(j, 0).toString());
        FNameT.setText(model.getValueAt(j, 1).toString());
        LNameT.setText(model.getValueAt(j, 2).toString());
        AddressT.setText(model.getValueAt(j, 3).toString());
        EmailT.setText(model.getValueAt(j, 4).toString());
        String sex = model.getValueAt(j, 5).toString();
        if (sex.equals("Male")) {
            MaleRB.setSelected(true);
        } else {
            FemaleRB.setSelected(true);
        }

        AgeT.setText(model.getValueAt(j, 6).toString());
        PhoneT.setText(model.getValueAt(j, 7).toString());
        PasswordT.setText(model.getValueAt(j, 8).toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerTBMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
         try {
            if (JOptionPane.showConfirmDialog(null, "Be careful you removing a user!, Are you sure?", "Delete User", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                if (UIDT.getText().length() != 0) {
                    stm.executeUpdate("Delete From user_data where user_id= " + UIDT.getText());
                    JOptionPane.showMessageDialog(null, "Delete Sucessfully!");
                    Refesh();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a user !");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete error!! \n" + e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void SearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyReleased
        // TODO add your handling code here:
        try {
            stm = conn.obtainConnection().createStatement();
            rs = stm.executeQuery("Select * From user_data where user_id = '" + SearchText.getText() + "'");
            boolean flag = false;
            if (rs.next()) {
                flag = true;
            } else {
                flag = false;
            }
            if (flag == true) {
                String setid = rs.getString("user_id");
                UIDT.setText(setid);
                String setFN = rs.getString("first_name");
                FNameT.setText(setFN);
                String setLN = rs.getString("last_name");
                LNameT.setText(setLN);
                String setAD = rs.getString("address");
                AddressT.setText(setAD);
                String setEM = rs.getString("email");
                EmailT.setText(setEM);

                String sex = rs.getString("gender");
                if (sex.equals("Male")) {
                    MaleRB.setSelected(true);
                } else {
                    FemaleRB.setSelected(true);
                }
                String setAG = rs.getString("age");
                AgeT.setText(setAG);
                String setPN = rs.getString("phone");
                PhoneT.setText(setPN);
                String setPS = rs.getString("password");
                PasswordT.setText(setPS);
            } else {
                ReSet();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_SearchTextKeyReleased

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
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfromation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressT;
    private javax.swing.JTextField AgeT;
    private javax.swing.JTextField EmailT;
    private javax.swing.JTextField FNameT;
    private javax.swing.JRadioButton FemaleRB;
    private javax.swing.JTextField LNameT;
    private javax.swing.JRadioButton MaleRB;
    private javax.swing.JTextField PasswordT;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JTextField SearchText;
    private javax.swing.JLabel UIDT;
    private javax.swing.JTable WorkerTB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    void Refesh() {
        DefaultTableModel model = (DefaultTableModel) WorkerTB.getModel();
        model.setRowCount(0);
        Show_User();
    }

    void ReSet() {
        UIDT.setText("");
        FNameT.setText("");
        LNameT.setText("");
        AddressT.setText("");
        EmailT.setText("");
        MaleRB.setSelected(false);
        FemaleRB.setSelected(false);
        AgeT.setText("");
        PhoneT.setText("");
        PasswordT.setText("");
    }
}
