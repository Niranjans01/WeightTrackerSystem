/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainControl;
import DBconnections.Javaconnect;
import Model.MealModel;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static View.LoginView.txt_username;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;


public class MealView extends javax.swing.JFrame implements ActionListener {

Connection con;
ResultSet rs;
PreparedStatement pst;
Javaconnect connectDB ;
private String a;
private String mealname;
private MealModel mm;
    public MealView() {
        initComponents();
        connectDB = new Javaconnect();
        con = connectDB.getConnection();
        mm= new MealModel();
        btnlistner(this);
        btn_record.setVisible(false);
        btn_update.setVisible(false);
        btn_retrive.setVisible(false);
        btn_delete.setVisible(false);
        pnl_data.setVisible(false);
        lbl_main.setVisible(true);
        cboDater.setVisible(false);
        
        a = txt_username.getText();
        txt_usernameu.setText(a);
        String d= Datetoday.nowd();
                String t= Datetoday.nowt();
        txt_date.setText(d);
        timer.setText(t);
        
    }
    
    
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnfinish = new javax.swing.JButton();
        btn_record = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txt_usernameu = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        pnl_data = new javax.swing.JPanel();
        txt_mealportion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_caloriepergram = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_mealcalorie = new javax.swing.JTextField();
        btn_caloriepergram1 = new javax.swing.JButton();
        cbo_mealnames = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btn_retrive = new javax.swing.JButton();
        lbl_main = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        cboDater = new javax.swing.JComboBox();
        txt_date = new javax.swing.JTextField();
        timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(139, 0, 139));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true), "Meal Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        btnfinish.setBackground(new java.awt.Color(153, 153, 153));
        btnfinish.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnfinish.setText("Done");
        btnfinish.setBorder(null);
        btnfinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinishActionPerformed(evt);
            }
        });
        jPanel2.add(btnfinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 70, 30));

        btn_record.setBackground(new java.awt.Color(153, 153, 153));
        btn_record.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_record.setText("Record");
        btn_record.setBorder(null);
        jPanel2.add(btn_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 70, 40));

        btn_update.setBackground(new java.awt.Color(204, 255, 204));
        btn_update.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(null);
        jPanel2.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 70, 40));

        txt_usernameu.setEditable(false);
        txt_usernameu.setBackground(new java.awt.Color(102, 102, 102));
        txt_usernameu.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txt_usernameu.setForeground(new java.awt.Color(255, 255, 255));
        txt_usernameu.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), "User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), java.awt.Color.white)); // NOI18N
        jPanel2.add(txt_usernameu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 110, 40));

        jRadioButton1.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Delete");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Record");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Update");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        pnl_data.setBackground(new java.awt.Color(139, 0, 139));
        pnl_data.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_mealportion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_data.add(txt_mealportion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Amount (in .gms)");
        pnl_data.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 40));

        txt_caloriepergram.setEditable(false);
        txt_caloriepergram.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_data.add(txt_caloriepergram, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Meal Name");
        pnl_data.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Calorie of Meal");
        pnl_data.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 40));

        txt_mealcalorie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_data.add(txt_mealcalorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 140, 30));

        btn_caloriepergram1.setBackground(new java.awt.Color(153, 153, 153));
        btn_caloriepergram1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_caloriepergram1.setText("Calorie intake");
        btn_caloriepergram1.setBorder(null);
        btn_caloriepergram1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_caloriepergram1ActionPerformed(evt);
            }
        });
        pnl_data.add(btn_caloriepergram1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 30));

        cbo_mealnames.setEditable(true);
        cbo_mealnames.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbo_mealnamesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        pnl_data.add(cbo_mealnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 160, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("in .gms");
        pnl_data.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 50, 50));

        jPanel2.add(pnl_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 400, 200));

        btn_retrive.setBackground(new java.awt.Color(102, 204, 255));
        btn_retrive.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_retrive.setText("Retrive");
        btn_retrive.setBorder(null);
        jPanel2.add(btn_retrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 70, 30));

        lbl_main.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        lbl_main.setForeground(new java.awt.Color(255, 255, 255));
        lbl_main.setText("Please Select Changes You want to make");
        jPanel2.add(lbl_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 420, -1));

        btn_delete.setBackground(new java.awt.Color(255, 204, 204));
        btn_delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorder(null);
        jPanel2.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, 30));

        cboDater.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboDaterPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel2.add(cboDater, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, 30));

        txt_date.setEditable(false);
        txt_date.setText("DD/MM/YYYY");
        jPanel2.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 100, -1));

        timer.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        timer.setForeground(new java.awt.Color(0, 204, 0));
        timer.setText("TIMER");
        jPanel2.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 80, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void setUsername(String username){
        txt_usernameu.setText(username);
    }
    
    public String getUsername() {
        return txt_usernameu.getText();
    }

     public void setDate(String date){
        txt_date.setText(date);
    }
     
     public String getTime(){
         return timer.getText();
     }
     
     public void setTime(String time){
         timer.setText(time);
     }
    
    public String getDate() {
        return txt_date.getText();
    }

    public void setMealname(String mealname){
         cbo_mealnames.addItem(mealname);
    }
    
    public String getMealname() {
        mealname = cbo_mealnames.getSelectedItem().toString();
        return mealname;
    }

    public void setMealsize(String mealsize){
        txt_mealportion.setText(mealsize);
    }
    public String getMealsize() {
        return txt_mealportion.getText();
    }

    public void setMealcalorie(String mealcalorie){
        txt_date.setText(mealcalorie);
    }

    public String getMealcalorie() {
        return txt_mealcalorie.getText();
    }


    public void setCaloriepergram(String caloriepergram){
        txt_caloriepergram.setText(caloriepergram);
    }
    
    public String getCaloriepergram() {
        return txt_caloriepergram.getText();
    }
    
    public String getCbodater(){
        return cboDater.getSelectedItem().toString();
    }
    
    public void setCbodater(String cbodater){
        cboDater.addItem(cbodater);
    }
    
    public JButton getInsert(){
        return btn_record;
    }
    
    public JButton getUpdate(){
        return btn_update;
    }
    
    public JButton getDelete(){
        return btn_delete;
    }
    
    public JButton getRetrive(){
        return btn_retrive;
    }

    public void btnlistner(ActionListener aal){
        btn_record.addActionListener(aal);
        btn_update.addActionListener(aal);
        btn_retrive.addActionListener(aal);
        cbo_mealnames.addActionListener(aal);
        btn_delete.addActionListener(aal);
        btn_retrive.addActionListener(aal);
    }
    
    public void Fillcombo(){
    try {
        pst = con.prepareStatement("select * from meal_info where username='"+getUsername()+"' and date='"+getDate()+"'");
        rs = pst.executeQuery();
        while(rs.next()){
            String name = rs.getString(4);
            cboDater.addItem(name);
        }
    } catch (SQLException ex) {
        
    }
    }
    
    public void Fillmeals(){
        
        try {
            pst = con.prepareStatement("select * from meals");
            rs= pst.executeQuery();
            
            while(rs.next()){
                String exs = rs.getString(1);
                cbo_mealnames.addItem(exs);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    
    }
    
    
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Fillmeals();
        lbl_main.setVisible(false);
        btn_record.setVisible(true);
        btn_update.setVisible(false);
        btn_delete.setVisible(false);
        btn_retrive.setVisible(false);
        pnl_data.setVisible(true);
        cboDater.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       //Fillmeals();
        cboDater.setVisible(true);
        lbl_main.setVisible(false);
        btn_record.setVisible(false);
        btn_update.setVisible(true);
        btn_delete.setVisible(false);
        btn_retrive.setVisible(true);
        pnl_data.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
                lbl_main.setVisible(false);
        btn_record.setVisible(false);
        btn_update.setVisible(false);
        btn_retrive.setVisible(true);
        btn_delete.setVisible(true);
        cboDater.setVisible(true);
        pnl_data.setVisible(false);
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btn_caloriepergram1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_caloriepergram1ActionPerformed
        int val1 = Integer.parseInt(txt_mealportion.getText());
        int val2= Integer.parseInt(txt_mealcalorie.getText());
        int val3 = val2*val1;
        txt_caloriepergram.setText(Integer.toString(val3));
    }//GEN-LAST:event_btn_caloriepergram1ActionPerformed

    private void btnfinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinishActionPerformed
        new MainControl();
        dispose();
    }//GEN-LAST:event_btnfinishActionPerformed

    private void cboDaterPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboDaterPopupMenuWillBecomeInvisible
       
        try {
            pst = con.prepareStatement("select * from meal_info where time='"+cboDater.getSelectedItem()+"'");
            rs=pst.executeQuery();
            if(rs.next()){
                txt_mealportion.setText(rs.getString(6));
                txt_mealcalorie.setText(rs.getString(7));
                txt_caloriepergram.setText(rs.getString(8));
                
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
        }
    
    }//GEN-LAST:event_cboDaterPopupMenuWillBecomeInvisible

    private void cbo_mealnamesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbo_mealnamesPopupMenuWillBecomeInvisible
       
        try {
            pst = con.prepareStatement("select * from meals where mname='"+cbo_mealnames.getSelectedItem()+"'");
            rs=pst.executeQuery();
            if(rs.next()){
                
                txt_mealcalorie.setText(rs.getString(2));
                
                
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_cbo_mealnamesPopupMenuWillBecomeInvisible

    public static void main(String[] args){
        new MealView();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_caloriepergram1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_record;
    private javax.swing.JButton btn_retrive;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btnfinish;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cboDater;
    public javax.swing.JComboBox cbo_mealnames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_main;
    private javax.swing.JPanel pnl_data;
    private javax.swing.JLabel timer;
    private javax.swing.JTextField txt_caloriepergram;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_mealcalorie;
    private javax.swing.JTextField txt_mealportion;
    private javax.swing.JTextField txt_usernameu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getRetrive()){
            Fillcombo();
            //Fillmeals();
            
        }
        else if(e.getSource()== getInsert()){
            mm.setUsername(txt_username.getText());
            mm.setDate(txt_date.getText());
            mm.setTime(timer.getText());
            mm.setMealname(cbo_mealnames.getSelectedItem().toString());
            mm.setMealsize(txt_mealportion.getText());
            mm.setMealcalorie(txt_mealcalorie.getText());
            mm.setCaloriepergram(txt_caloriepergram.getText());
            
            int result = mm.Insertmeal();
            if(result==1){
                JOptionPane.showMessageDialog(null,"Meals details inserted");
            }
    }
    
    }

    
    
}
