/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainControl;
import DBconnections.Javaconnect;
import Model.TodayModel;
import java.sql.*;

import static View.LoginView.txt_username;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ranzu
 */
public class TodayView extends javax.swing.JFrame implements ActionListener {

    Connection con;
ResultSet rs;
PreparedStatement pst;
private TodayModel tm;
    
    public TodayView() {
        initComponents();
        tm = new TodayModel();
        actionRec(this);
        
        String a= txt_username.getText();
        txt_usernameT.setText(a);
        String d= Datetoday.nowd();
        txt_date.setText(d);
        refreshedpnl.setVisible(false);
        txt_activitylevel.setVisible(true);
        lbl_act.setVisible(true);
        pnl_activity.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        txt_usernameT = new javax.swing.JTextField();
        btn_done = new javax.swing.JButton();
        chk = new javax.swing.JButton();
        refreshedpnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_calorieintake = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        txt_initweight = new javax.swing.JTextField();
        txt_iniwaistsize = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pnl_activity = new javax.swing.JPanel();
        btn_inactive = new javax.swing.JRadioButton();
        btn_active = new javax.swing.JRadioButton();
        btn_moderate = new javax.swing.JRadioButton();
        lbl_actb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_act = new javax.swing.JLabel();
        txt_activitylevel = new javax.swing.JTextField();
        txt_calorieburned = new javax.swing.JTextField();
        txt_finawaistsize = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_finaweight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("FangSong", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 10));

        txt_date.setEditable(false);
        txt_date.setBackground(new java.awt.Color(51, 102, 255));
        txt_date.setForeground(new java.awt.Color(0, 0, 0));
        txt_date.setText("DD/MM/YYYY");
        txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 30));

        txt_usernameT.setEditable(false);
        txt_usernameT.setBackground(new java.awt.Color(51, 102, 255));
        txt_usernameT.setForeground(new java.awt.Color(0, 0, 0));
        txt_usernameT.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), java.awt.Color.blue)); // NOI18N
        jPanel1.add(txt_usernameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 110, 50));

        btn_done.setText("Go Back");
        btn_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doneActionPerformed(evt);
            }
        });
        jPanel1.add(btn_done, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        chk.setText("Refresh");
        chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActionPerformed(evt);
            }
        });
        jPanel1.add(chk, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        refreshedpnl.setBackground(new java.awt.Color(51, 102, 255));
        refreshedpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("final Weight:");
        refreshedpnl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, -1));

        txt_calorieintake.setEditable(false);
        refreshedpnl.add(txt_calorieintake, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));

        btn_update.setText("Update");
        refreshedpnl.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 100, 40));

        txt_initweight.setEditable(false);
        txt_initweight.setForeground(new java.awt.Color(0, 255, 0));
        refreshedpnl.add(txt_initweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, -1));

        txt_iniwaistsize.setEditable(false);
        refreshedpnl.add(txt_iniwaistsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 140, -1));

        jLabel4.setText("Total Calorie Burned:");
        refreshedpnl.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 120, -1));

        pnl_activity.setBackground(new java.awt.Color(51, 102, 255));
        pnl_activity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inactive.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_inactive.setText("Inactive");
        btn_inactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inactiveActionPerformed(evt);
            }
        });
        pnl_activity.add(btn_inactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, 20));

        btn_active.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_active.setText("Active");
        btn_active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activeActionPerformed(evt);
            }
        });
        pnl_activity.add(btn_active, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 20));

        btn_moderate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_moderate.setText("Moderate");
        btn_moderate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moderateActionPerformed(evt);
            }
        });
        pnl_activity.add(btn_moderate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 20));

        lbl_actb.setBackground(new java.awt.Color(51, 51, 51));
        lbl_actb.setFont(new java.awt.Font("FangSong", 1, 18)); // NOI18N
        lbl_actb.setForeground(new java.awt.Color(102, 102, 102));
        lbl_actb.setText("Activity Label");
        pnl_activity.add(lbl_actb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        refreshedpnl.add(pnl_activity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel2.setText("Initial Weight:");
        refreshedpnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 78, 90, -1));

        lbl_act.setText("Activity level:");
        refreshedpnl.add(lbl_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, -1));

        txt_activitylevel.setEditable(false);
        refreshedpnl.add(txt_activitylevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 140, -1));

        txt_calorieburned.setEditable(false);
        refreshedpnl.add(txt_calorieburned, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 140, -1));

        txt_finawaistsize.setEditable(false);
        refreshedpnl.add(txt_finawaistsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, -1));

        jLabel7.setText("Total Calorie Intake:");
        refreshedpnl.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, -1));

        jLabel6.setFont(new java.awt.Font("Kokila", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Calorie Report");
        refreshedpnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 130, -1));

        jLabel5.setText("Initial Waist size");
        refreshedpnl.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, -1));

        txt_finaweight.setEditable(false);
        refreshedpnl.add(txt_finaweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, -1));

        jLabel1.setText("Final Waist size:");
        refreshedpnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, -1));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        refreshedpnl.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jPanel1.add(refreshedpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, 400));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Click the Refresh Button for the full access");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 420, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String getUsername() {
        return txt_usernameT.getText();
    }  

    public String getDate() {
        return txt_date.getText();
    }

    
    public String getLevel() {
        return dlevel;
    }

    public void setLevel(String level) {
        this.dlevel = level;
    }

    public String getInweight() {
        return txt_initweight.getText();
    }

    public void setInweight(String inweight) {
        txt_initweight.setText(inweight);
    }

    public String getInwaist() {
        return txt_iniwaistsize.getText();
    }

    public void setInwaist(String inwaist) {
        txt_iniwaistsize.setText(inwaist);
    }

    public String getIncalorie() {
        return txt_calorieintake.getText();
    }

    public void setIncalorie(String incalorie) {
        txt_calorieintake.setText(incalorie);
    }

    public String getCalorieburned() {
        return txt_calorieburned.getText();
    }

    public void setCalorieburned(String calorieburned) {
       txt_calorieburned.setText(calorieburned);
    }

    public String getFinweight() {
        return txt_finaweight.getText();
    }

    public void setFinweight(String finweight) {
        txt_finaweight.setText(finweight);
    }

    public String getFinwaist() {
        return txt_finawaistsize.getText();
    }

    public void setFinwaist(String finwaist) {
        txt_finawaistsize.setText(finwaist);
    }
    
    public JButton Updational(){
        return btn_update;
    }
    
    public void actionRec(ActionListener aal){
        btn_update.addActionListener(aal);
       
    }
    
    private void btn_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doneActionPerformed
        dispose();
       new MainControl();
        
        
    }//GEN-LAST:event_btn_doneActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        txt_initweight.setEditable(true);
        txt_finaweight.setEditable(true);
        txt_iniwaistsize.setEditable(true);
        txt_finawaistsize.setEditable(true);
        txt_activitylevel.setVisible(false);
        lbl_act.setVisible(false);
        pnl_activity.setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activeActionPerformed
        dlevel = "A";
    }//GEN-LAST:event_btn_activeActionPerformed

    private void btn_moderateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moderateActionPerformed
        dlevel = "C";
    }//GEN-LAST:event_btn_moderateActionPerformed

    private void btn_inactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inactiveActionPerformed
        dlevel = "I";
    }//GEN-LAST:event_btn_inactiveActionPerformed

    private void chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActionPerformed
       
           
            tm.setUsername(getUsername());
            tm.setDate(getDate());
            setInwaist(tm.getInwaist());
            setInweight(tm.getInweight());
            setIncalorie(tm.getIncalorie());
            setFinwaist(tm.getFinwaist());
            setFinweight(tm.getFinweight());
            setCalorieburned(tm.getCalorieburned());
            setLevel(tm.getLevel());
            ResultSet rs = tm.Download();
            if(rs!=null){
               
                 refreshedpnl.setVisible(true);
            }
            
        
        
    }//GEN-LAST:event_chkActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_active;
    private javax.swing.JButton btn_done;
    private javax.swing.JButton btn_edit;
    private javax.swing.JRadioButton btn_inactive;
    private javax.swing.JRadioButton btn_moderate;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton chk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_act;
    private javax.swing.JLabel lbl_actb;
    private javax.swing.JPanel pnl_activity;
    private javax.swing.JPanel refreshedpnl;
    private javax.swing.JTextField txt_activitylevel;
    private javax.swing.JTextField txt_calorieburned;
    private javax.swing.JTextField txt_calorieintake;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_finawaistsize;
    private javax.swing.JTextField txt_finaweight;
    private javax.swing.JTextField txt_initweight;
    private javax.swing.JTextField txt_iniwaistsize;
    private javax.swing.JTextField txt_usernameT;
    // End of variables declaration//GEN-END:variables
    private String dlevel;

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if(e.getSource()==btn_update){
            {
            tm.setUsername(getUsername());
            tm.setDate(getDate());
            tm.setInwaist(getInwaist());
            tm.setInweight(getInweight());
            tm.setIncalorie(getIncalorie());
            tm.setFinwaist(getFinwaist());
            tm.setFinweight(getFinweight());
            tm.setCalorieburned(getCalorieburned());
            tm.setLevel(getLevel());
            int r = tm.updation();
            if(r==1){
                JOptionPane.showMessageDialog(null,"Update Suceed");
            }
        }
        
        }
        
    
    }
}
