package View;
import Controller.LoginControl;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class RegisterView extends javax.swing.JFrame {

    
    public RegisterView() {
        super("Register");
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txt_username = new javax.swing.JTextField();
        txt_answer = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        txt_sq = new javax.swing.JComboBox();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txt_age = new javax.swing.JTextField();
        btn_other = new javax.swing.JRadioButton();
        btn_male = new javax.swing.JRadioButton();
        btn_female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(139, 0, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Register");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 80, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 90, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 80, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Security Query");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 250, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 70, 20));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 250, 20));

        txt_username.setBackground(new java.awt.Color(139, 0, 139));
        txt_username.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(null);
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, 30));

        txt_answer.setBackground(new java.awt.Color(139, 0, 139));
        txt_answer.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_answer.setForeground(new java.awt.Color(255, 255, 255));
        txt_answer.setBorder(null);
        jPanel2.add(txt_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, 30));

        txt_password.setBackground(new java.awt.Color(139, 0, 139));
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(null);
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 250, 30));

        btn_register.setBackground(new java.awt.Color(97, 212, 195));
        btn_register.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Register");
        btn_register.setBorder(null);
        btn_register.setPreferredSize(new java.awt.Dimension(36, 19));
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 107, 44));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 210, 20));

        txt_sq.setBackground(new java.awt.Color(139, 0, 139));
        txt_sq.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_sq.setForeground(new java.awt.Color(255, 255, 255));
        txt_sq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your nick name ?", "your best friend Name?", "your best number ?", "your best teacher name ?" }));
        txt_sq.setBorder(null);
        jPanel2.add(txt_sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 230, 30));

        txt_email.setBackground(new java.awt.Color(139, 0, 139));
        txt_email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setBorder(null);
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 250, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 20));

        txt_age.setBackground(new java.awt.Color(139, 0, 139));
        txt_age.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_age.setForeground(new java.awt.Color(255, 255, 255));
        txt_age.setBorder(null);
        jPanel2.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 30));

        btn_other.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup1.add(btn_other);
        btn_other.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_other.setForeground(new java.awt.Color(255, 255, 255));
        btn_other.setText("Other");
        btn_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_otherActionPerformed(evt);
            }
        });
        jPanel2.add(btn_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        btn_male.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup1.add(btn_male);
        btn_male.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_male.setForeground(new java.awt.Color(255, 255, 255));
        btn_male.setText("Male");
        btn_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maleActionPerformed(evt);
            }
        });
        jPanel2.add(btn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        btn_female.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup1.add(btn_female);
        btn_female.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_female.setForeground(new java.awt.Color(255, 255, 255));
        btn_female.setText("Female");
        btn_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_femaleActionPerformed(evt);
            }
        });
        jPanel2.add(btn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 460, 480));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Please Fill up then Submit the form....");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 370, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Back To_48px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String getUsername(){
        return txt_username.getText();
    }
    
    
    public String getEmail(){
        return txt_email.getText();
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getAge(){
        return txt_age.getText();
    }
    
    public String getPassword(){
        return txt_password.getText();
    }
    
    public Object getQuest(){
        return txt_sq.getSelectedItem();
    }
    
    public String getAnswer(){
        return txt_answer.getText();
    }
    
    public void RegisterActionPerformed(ActionListener al){
        btn_register.addActionListener(al);
    }
    
    
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        dispose();
                        new LoginControl();
                    }
                });
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed

        if(txt_username.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "please Enter valid username");
            txt_username.requestFocus();
        }
        else if(txt_email.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "please Enter valid email");
            txt_username.requestFocus();
        }
        else if(txt_age.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "please Enter valid age");
            txt_username.requestFocus();
        }
        else if(txt_password.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "please Enter valid password");
            txt_username.requestFocus();
        }
        else if(txt_answer.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "please Enter valid Answer");
            txt_username.requestFocus(); 
        }
        else
        {
        
        
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maleActionPerformed
        gender = "m";
    }//GEN-LAST:event_btn_maleActionPerformed

    private void btn_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_femaleActionPerformed
       gender = "f";
    }//GEN-LAST:event_btn_femaleActionPerformed

    private void btn_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_otherActionPerformed
        gender = "o";
    }//GEN-LAST:event_btn_otherActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_female;
    private javax.swing.JRadioButton btn_male;
    private javax.swing.JRadioButton btn_other;
    private javax.swing.JButton btn_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JComboBox txt_sq;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
    private String gender;
    

}
