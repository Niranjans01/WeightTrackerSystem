/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainControl;
import DBconnections.Javaconnect;
import static View.LoginView.txt_username;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ProfileView extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    Javaconnect conJ;
    
    public ProfileView() {
        super("Update Profile");
        initComponents();
        
        String a = txt_username.getText();
        txt_usernamep.setText(a);
    }
   
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_usernamep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_set = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_answer = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        cbosq = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(139, 0, 139));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USER PROFILE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usernamep.setEditable(false);
        txt_usernamep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_usernamep, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 39, 130, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 31, 104, 49));

        btn_search.setText("Search");
        btn_search.setBorder(null);
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 40, 74, 30));

        btn_set.setText("Back");
        btn_set.setBorder(null);
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });
        jPanel1.add(btn_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 69, 32));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Security Question");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 49));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 104, 49));

        txt_answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 180, 30));

        txt_email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 98, 101, 30));

        txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 180, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 86, 104, 49));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 104, 49));

        btn_update.setText("Update");
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        cbosq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your nick name ?", "your best friend Name?", "your best number ?", "your best teacher name ?" }));
        jPanel1.add(cbosq, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 190, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        txt_age.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_age.setForeground(new java.awt.Color(0, 0, 0));
        txt_age.setBorder(null);
        jPanel1.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 50, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jender="m";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jender = "f";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed
        dispose();
        new MainControl();
    }//GEN-LAST:event_btn_setActionPerformed

    
    public void setTxt_age(String txtage) {
        txt_age.setText(txtage);
    }
    
    public String getTxt_age() {
        return txt_age.getText();
    }

    
    public void setCbosq(String cbos) {
        cbosq.setSelectedItem(cbos);
    }
    
    public String  getCbosq() {
        return cbosq.getSelectedItem().toString();
    }

    
    public void setTxt_answer(String txtanswer) {
        txt_answer.setText(txtanswer);
    }
    
    public String getTxt_answer() {
        return txt_answer.getText();
    }

    
    public void setTxt_email(String txtemail) {
        txt_email.setText(txtemail);
    }
    
    public String getTxt_email() {
        return txt_email.getText();
    }

    
    public void setTxt_password(String txtpassword) {
        txt_password.setText(txtpassword);
    }
    
    public String getTxt_password() {
        return txt_password.getText();
    }

    
    public void setTxt_username(String txtusername) {
        txt_usernamep.setText(txtusername);
    }
    
    public String getTxt_username() {
        return txt_usernamep.getText();
    }
    
    public void setGender(String gender){
        this.jender = gender;
    }
    public String getGender(){
        return jender;
    }
    
    public JButton btnretrival(){
        return btn_search;
    }
    
    public JButton btnUpdate(){
        return btn_update;
    }

    public void actionsRecord(ActionListener acl){
        btn_search.addActionListener(acl);
        btn_update.addActionListener(acl);
    }
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_set;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbosq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_usernamep;
    // End of variables declaration//GEN-END:variables
    private String jender;
}
