
package View;

import Controller.MainControl;
import Model.MainModel;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

import static View.LoginView.txt_username;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainView extends javax.swing.JFrame {

private Connection con;
private ResultSet rs;
private MainModel mmd;
private PreparedStatement pst;
private String a;

    public MainView() {
        initComponents();
        mmd = new MainModel();
        pnl_intakecalorie.setVisible(true);
        a= txt_username.getText();
        txt_username1.setText(a);
        String d= Datetoday.nowd();
        String t = Datetoday.nowt();
        txt_date.setText(d);
        tyam.setText(t);
        //panels and buttons being set invisible 
        btn_update.setVisible(false);
        insertw.setVisible(false);
        pnl_final.setVisible(false);
        pnl_initial.setVisible(false);
        
        
    }
    

    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnprofile = new javax.swing.JButton();
        pnl_initial = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_iniwaist = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_iniweight = new javax.swing.JTextField();
        btn_today = new javax.swing.JButton();
        txt_username1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        btn_viewreport = new javax.swing.JButton();
        pnl_intakecalorie = new javax.swing.JPanel();
        txt_calorietotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_calorieburnM = new javax.swing.JTextField();
        insertw = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        mealrecord = new javax.swing.JButton();
        exerciserecord = new javax.swing.JButton();
        pnllevel = new javax.swing.JPanel();
        lbl_act = new javax.swing.JLabel();
        btn_active = new javax.swing.JRadioButton();
        btn_moderate = new javax.swing.JRadioButton();
        btn_inactive = new javax.swing.JRadioButton();
        tyam = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btninweight = new javax.swing.JButton();
        pnl_final = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_finwaist = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_finweight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnfinweight = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnprofile.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 10)); // NOI18N
        btnprofile.setText("User Account");
        jPanel1.add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 110, 40));

        pnl_initial.setBackground(new java.awt.Color(0, 204, 102));
        pnl_initial.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Waist-weight-Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18), java.awt.Color.white)); // NOI18N
        pnl_initial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("initial Waist-size");
        pnl_initial.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 40));

        txt_iniwaist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_initial.add(txt_iniwaist, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 80, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Initial Weight");
        pnl_initial.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 40));

        txt_iniweight.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_initial.add(txt_iniweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 80, 30));

        jPanel1.add(pnl_initial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 280, 160));

        btn_today.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btn_today.setText("Today's Report");
        jPanel1.add(btn_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 150, 50));

        txt_username1.setEditable(false);
        txt_username1.setBackground(new java.awt.Color(0, 153, 153));
        txt_username1.setForeground(new java.awt.Color(0, 0, 0));
        txt_username1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), java.awt.Color.blue)); // NOI18N
        jPanel1.add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 110, 50));

        jLabel2.setFont(new java.awt.Font("FangSong", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 10));

        txt_date.setEditable(false);
        txt_date.setBackground(new java.awt.Color(0, 153, 153));
        txt_date.setForeground(new java.awt.Color(255, 255, 255));
        txt_date.setText("DD/MM/YYYY");
        txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 30));

        btn_viewreport.setText("All Report");
        jPanel1.add(btn_viewreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 140, 50));

        pnl_intakecalorie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_calorietotal.setEditable(false);
        txt_calorietotal.setBackground(new java.awt.Color(0, 102, 51));
        txt_calorietotal.setForeground(new java.awt.Color(255, 255, 255));
        pnl_intakecalorie.add(txt_calorietotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 40));

        jLabel1.setText("calorie Intake");
        pnl_intakecalorie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jLabel3.setText("calorie Burned");
        pnl_intakecalorie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 30));

        txt_calorieburnM.setEditable(false);
        txt_calorieburnM.setBackground(new java.awt.Color(0, 102, 51));
        txt_calorieburnM.setForeground(new java.awt.Color(255, 255, 255));
        pnl_intakecalorie.add(txt_calorieburnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 40));

        jPanel1.add(pnl_intakecalorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 100, 160));

        insertw.setText("Record");
        insertw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertwActionPerformed(evt);
            }
        });
        jPanel1.add(insertw, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 120, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("Add TODAY's");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        btn_update.setText("Record");
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 130, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 204))); // NOI18N
        jPanel2.setLayout(null);

        mealrecord.setBackground(new java.awt.Color(255, 255, 0));
        mealrecord.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        mealrecord.setText("Meal Record");
        jPanel2.add(mealrecord);
        mealrecord.setBounds(240, 20, 120, 40);

        exerciserecord.setBackground(new java.awt.Color(255, 255, 0));
        exerciserecord.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        exerciserecord.setText("Exercise Record");
        jPanel2.add(exerciserecord);
        exerciserecord.setBounds(410, 20, 160, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 109, 780, 70));

        pnllevel.setBackground(new java.awt.Color(0, 153, 153));
        pnllevel.setLayout(null);

        lbl_act.setBackground(new java.awt.Color(51, 51, 51));
        lbl_act.setFont(new java.awt.Font("FangSong", 1, 18)); // NOI18N
        lbl_act.setForeground(new java.awt.Color(255, 255, 255));
        lbl_act.setText("Activity Label");
        pnllevel.add(lbl_act);
        lbl_act.setBounds(5, 8, 140, 21);

        btn_active.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(btn_active);
        btn_active.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_active.setText("Active");
        btn_active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activeActionPerformed(evt);
            }
        });
        pnllevel.add(btn_active);
        btn_active.setBounds(150, 5, 76, 28);

        btn_moderate.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(btn_moderate);
        btn_moderate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_moderate.setText("Moderate");
        btn_moderate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moderateActionPerformed(evt);
            }
        });
        pnllevel.add(btn_moderate);
        btn_moderate.setBounds(231, 5, 100, 28);

        btn_inactive.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(btn_inactive);
        btn_inactive.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_inactive.setText("Inactive");
        btn_inactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inactiveActionPerformed(evt);
            }
        });
        pnllevel.add(btn_inactive);
        btn_inactive.setBounds(336, 5, 88, 28);

        jPanel1.add(pnllevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 430, 40));

        tyam.setBackground(new java.awt.Color(0, 255, 0));
        tyam.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tyam.setForeground(new java.awt.Color(0, 255, 0));
        tyam.setText("jLabel7");
        jPanel1.add(tyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jButton1.setText("Extract");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        btninweight.setText("Initial Weight");
        btninweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninweightActionPerformed(evt);
            }
        });
        jPanel1.add(btninweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 130, 50));

        pnl_final.setBackground(new java.awt.Color(0, 204, 102));
        pnl_final.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Waist-weight-Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18), java.awt.Color.white)); // NOI18N
        pnl_final.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Final Waist-size");
        pnl_final.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 40));

        txt_finwaist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_finwaist.setText("0");
        pnl_final.add(txt_finwaist, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Final Weight");
        pnl_final.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 40));

        txt_finweight.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_finweight.setText("0");
        pnl_final.add(txt_finweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, 30));

        jPanel1.add(pnl_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 270, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 153));
        jLabel7.setText("Add TODAY's");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        btnfinweight.setText("Final Weight");
        btnfinweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinweightActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    public String getUsername() {
        return txt_username1.getText();
    }

    public void setUsername(String username) {
        txt_username1.setText(username);
    }

    public String getDate() {
        return txt_date.getText();
    }

    public void setDate(String date) {
        txt_date.setText(date);
    }
    
    public String getTime() {
        return tyam.getText();
    }

    public void setTime(String time) {
        tyam.setText(time);
    }
    
    

    public String getLevel() {
        return dlevel;
    }

    public void setLevel(String level) {
        this.dlevel = level;
    }

    public String getInweight() {
        return txt_iniweight.getText();
    }

    public void setInweight(String inweight) {
        txt_iniweight.setText(inweight);
    }

    public String getInwaist() {
        return txt_iniwaist.getText();
    }

    public void setInwaist(String inwaist) {
        txt_iniwaist.setText(inwaist);
    }

    public String getIncalorie() {
        return txt_calorietotal.getText();
    }

    public void setIncalorie(String incalorie) {
        txt_calorietotal.setText(incalorie);
    }

    public String getCalorieburned() {
        return txt_calorieburnM.getText();
    }

    public void setCalorieburned(String calorieburned) {
        txt_calorieburnM.setText(calorieburned);
    }

    public String getFinweight() {
        return txt_finweight.getText();
    }

    public void setFinweight(String finweight) {
        txt_finweight.setText(finweight);
    }

    public String getFinwaist() {
        return txt_finwaist.getText();
    }

    public void setFinwaist(String finwaist) {
        txt_finwaist.setText(finwaist);
    }
    
    public JPanel getInitials(){
        return pnl_initial;
    }
    
    public JPanel getFinals(){
        return pnl_final;
    }
    
    public JPanel getDayLevel(){
        return pnllevel;
    }
    
    public JButton getInsertw(){
        return insertw;
    }
    
    public JButton getUpdatew(){
        return btn_update;
    }
    
    public JButton Meals(){
        return mealrecord;
    }
    
    public JButton Exercises(){
        return exerciserecord;
    }
    
    public JButton Profile(){
        return btnprofile;
    }
    
    public JButton Todayto(){
        return btn_today;
    }
    
    public JButton Finals(){
        return btn_viewreport;
    }
    
    public void actionMains(ActionListener acl){
        insertw.addActionListener(acl);
        btn_update.addActionListener(acl);
        mealrecord.addActionListener(acl);
        exerciserecord.addActionListener(acl);
        btnprofile.addActionListener(acl);
        btn_today.addActionListener(acl);
        btn_viewreport.addActionListener(acl);
    }
    
    
    private void btn_activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activeActionPerformed
        dlevel = "A";
    }//GEN-LAST:event_btn_activeActionPerformed

    private void btn_moderateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moderateActionPerformed
        dlevel = "C";
    }//GEN-LAST:event_btn_moderateActionPerformed

    private void btn_inactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inactiveActionPerformed
        dlevel = "I";
    }//GEN-LAST:event_btn_inactiveActionPerformed

    private void insertwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertwActionPerformed
        
            if(getInwaist().isEmpty() || getInweight().isEmpty()){
               
            JOptionPane.showMessageDialog(null,"Please enter your \nInitial weight and waist size");
            getInitials().setVisible(true);
           getInitials().setBackground(Color.red); 
            }
            else if(getIncalorie().isEmpty() || getCalorieburned().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Double Click \n 'Extract button'");
            }
            else{
        mmd.setUsername(getUsername());
        mmd.setDate(getDate());
        //mmd.setTime(getTime());
        mmd.setLevel(getLevel());
        mmd.setInwaist(getInwaist());
        mmd.setInweight(getInweight());
        mmd.setIncalorie(getIncalorie());
        mmd.setFinweight(getFinweight());
        mmd.setFinwaist(getFinwaist());
        mmd.setCalorieburned(getCalorieburned());
        mmd.TodayCalorieinout();
        int r = mmd.Insertmodel();
        if(r==1){
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully");
            
            getInitials().setVisible(false);
            getInsertw().setVisible(false);
            getUpdatew().setVisible(true);
            getFinals().setVisible(true);
            btnfinweight.setVisible(false);
            
        }
        
        }
        
        
    }//GEN-LAST:event_insertwActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            setCalorieburned(mmd.getCalorieburned());
            setIncalorie(mmd.getIncalorie());
            mmd.setUsername(getUsername());
            mmd.setDate(getDate());
           
        ResultSet rs= mmd.TodayCalorieinout();
        rs = mmd.TodayCalburn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btninweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninweightActionPerformed
      pnl_initial.setVisible(true);
       insertw.setVisible(true);
      btninweight.setVisible(false);
      pnl_final.setVisible(false);
      btn_update.setVisible(false);
      btnfinweight.setVisible(true);
    }//GEN-LAST:event_btninweightActionPerformed

    private void btnfinweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinweightActionPerformed
       pnl_final.setVisible(true);
      btn_update.setVisible(true);
      btnfinweight.setVisible(false);
      pnl_initial.setVisible(false);
       insertw.setVisible(false);
      btninweight.setVisible(true);
    }//GEN-LAST:event_btnfinweightActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_active;
    private javax.swing.JRadioButton btn_inactive;
    private javax.swing.JRadioButton btn_moderate;
    private javax.swing.JButton btn_today;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_viewreport;
    private javax.swing.JButton btnfinweight;
    private javax.swing.JButton btninweight;
    private javax.swing.JButton btnprofile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exerciserecord;
    private javax.swing.JButton insertw;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_act;
    private javax.swing.JButton mealrecord;
    private javax.swing.JPanel pnl_final;
    private javax.swing.JPanel pnl_initial;
    private javax.swing.JPanel pnl_intakecalorie;
    private javax.swing.JPanel pnllevel;
    private javax.swing.JTextField txt_calorieburnM;
    private javax.swing.JTextField txt_calorietotal;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_finwaist;
    private javax.swing.JTextField txt_finweight;
    private javax.swing.JTextField txt_iniwaist;
    private javax.swing.JTextField txt_iniweight;
    private javax.swing.JTextField txt_username1;
    private javax.swing.JLabel tyam;
    // End of variables declaration//GEN-END:variables
    private String dlevel;
}
