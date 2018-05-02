package View;

import Controller.MainControl;
import DBconnections.Javaconnect;
import Model.ExerciseModel;
import Model.MealModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static View.LoginView.txt_username;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ExerciseView extends javax.swing.JFrame implements ActionListener {

Connection con;
ResultSet rs;
PreparedStatement pst;
Javaconnect connectDB ;
private String a;
private String exercise=null;
private ExerciseModel edl;

    public ExerciseView() {
        initComponents();
        connectDB = new Javaconnect();
        con = connectDB.getConnection();
        edl = new ExerciseModel();
    txt_info.setVisible(true);
    pnl_dta.setVisible(false);
    btn_insert.setVisible(false);
    btn_update.setVisible(false);
    btn_delete.setVisible(false);
    cbodate.setVisible(false);
    
    btn_retrive.setVisible(false);
    a= txt_username.getText();
    txt_usernameEx.setText(a);
    String d= Datetoday.nowd();
    String t = Datetoday.nowt();
        txt_date.setText(d);
        etyam.setText(t);
        
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        txt_usernameEx = new javax.swing.JTextField();
        rdbtn_delete = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        rbbtn_update = new javax.swing.JRadioButton();
        txt_info = new javax.swing.JLabel();
        pnl_dta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbo_exercisetype = new javax.swing.JComboBox();
        txt_exercisetime = new javax.swing.JTextField();
        txt_calburnt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_callpermin = new javax.swing.JTextField();
        btn_retrive = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        etyam = new javax.swing.JLabel();
        cbodate = new javax.swing.JComboBox();
        txt_date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(139, 0, 139));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 212, 195), 1, true), "Exercise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_insert.setBackground(new java.awt.Color(204, 204, 204));
        btn_insert.setForeground(new java.awt.Color(0, 0, 0));
        btn_insert.setText("Record");
        btn_insert.setBorder(null);
        jPanel3.add(btn_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 80, 50));

        btn_update.setBackground(new java.awt.Color(204, 255, 255));
        btn_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_update.setText("Update");
        btn_update.setBorder(null);
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 80, 50));

        btn_back.setBackground(new java.awt.Color(97, 212, 195));
        btn_back.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 0, 0));
        btn_back.setText("Done");
        btn_back.setBorder(null);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel3.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 70, 30));

        txt_usernameEx.setEditable(false);
        txt_usernameEx.setBackground(new java.awt.Color(0, 153, 153));
        txt_usernameEx.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_usernameEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 110, 30));

        rdbtn_delete.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup2.add(rdbtn_delete);
        rdbtn_delete.setText("Delete");
        rdbtn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(rdbtn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Record");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        rbbtn_update.setBackground(new java.awt.Color(139, 0, 139));
        buttonGroup2.add(rbbtn_update);
        rbbtn_update.setText("Update");
        rbbtn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbtn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(rbbtn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        txt_info.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_info.setForeground(new java.awt.Color(255, 255, 255));
        txt_info.setText("Please select the changes you want to make");
        jPanel3.add(txt_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        pnl_dta.setBackground(new java.awt.Color(139, 0, 139));
        pnl_dta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Exercise type");
        pnl_dta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 30));

        cbo_exercisetype.setEditable(true);
        cbo_exercisetype.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbo_exercisetypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        pnl_dta.add(cbo_exercisetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 150, 30));

        txt_exercisetime.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_dta.add(txt_exercisetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 30));

        txt_calburnt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_dta.add(txt_calburnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Calorie burn/min");
        pnl_dta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Exercise Time");
        pnl_dta.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jButton1.setText("Calorie burnt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnl_dta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        txt_callpermin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnl_dta.add(txt_callpermin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 150, 30));

        jPanel3.add(pnl_dta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 380, 200));

        btn_retrive.setText("Retrive");
        btn_retrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retriveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_retrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, 40));

        btn_delete.setBackground(new java.awt.Color(255, 204, 204));
        btn_delete.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete.setText("Delete");
        btn_delete.setBorder(null);
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 30));

        etyam.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        etyam.setForeground(new java.awt.Color(0, 255, 0));
        etyam.setText("jLabel1");
        jPanel3.add(etyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        cbodate.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbodatePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel3.add(cbodate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 150, 40));

        txt_date.setEditable(false);
        txt_date.setBackground(new java.awt.Color(139, 0, 139));
        txt_date.setForeground(new java.awt.Color(255, 255, 255));
        txt_date.setText("DD/MM/YYYY");
        txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    public String getUsername() {
        return txt_usernameEx.getText();
    }

    public void setUsername(String username) {
        txt_usernameEx.setText(username);
    }

    public String getDate() {
        return txt_date.getText();
    }

    public void setDate(String date) {
        txt_date.setText(date);
    }
    
    public String getTime() {
        return etyam.getText();
    }

    public void setTime(String tyam) {
        etyam.setText(tyam);
    }

    public String getExercise() {
       exercise = cbo_exercisetype.getSelectedItem().toString();
        return exercise;
    }

    public void setExercise(String exercise) {
        cbo_exercisetype.addItem(exercise);
    }

    public String getCalpermin() {
        return txt_callpermin.getText();
    }

    public void setCalpermin(String calpermin) {
        txt_callpermin.setText(calpermin);
    }

    public String getExstime() {
        return txt_exercisetime.getText();
    }

    public void setExstime(String exstime) {
        txt_exercisetime.setText(exstime);
    }

    public String getCalorieburnt() {
        return txt_calburnt.getText();
    }

    public void setCalorieburnt(String calorieburnt) {
        txt_calburnt.setText(calorieburnt);
    }
    
    public String getCbodates(){
        return cbodate.getSelectedItem().toString();
    }
    
    public JButton getRecord(){
        return btn_insert;
    }
    
    public JButton getUpdate(){
        return btn_update;
    }
    public JButton getDelete()
    {
        return btn_delete;
    } 
    
    public JComboBox getExercises(){
        return cbo_exercisetype;
    }
    public void btnlistner(ActionListener alr){
        btn_insert.addActionListener(alr);
        btn_update.addActionListener(alr);
       // btn_retrive.addActionListener(alr);
        btn_delete.addActionListener(alr);
        cbo_exercisetype.addActionListener(alr);
    }
    
    public void Fillexercise(){
        try {
            pst = con.prepareStatement("select * from exercises");
            rs= pst.executeQuery();
            
            while(rs.next()){
                String exs = rs.getString(1);
                cbo_exercisetype.addItem(exs);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

       Fillexercise();
    txt_info.setVisible(false);
    pnl_dta.setVisible(true);
    btn_insert.setVisible(true);
    btn_update.setVisible(false);
    btn_delete.setVisible(false);
   
    
    btn_retrive.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void rbbtn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbtn_updateActionPerformed
          txt_info.setVisible(false);
    pnl_dta.setVisible(true);
    btn_insert.setVisible(false);
    btn_update.setVisible(true);
    btn_delete.setVisible(false);
    btn_retrive.setVisible(true);
    cbodate.setVisible(true);
    }//GEN-LAST:event_rbbtn_updateActionPerformed

    private void rdbtn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtn_deleteActionPerformed
       // Fillexercise();
    txt_info.setVisible(false);
    pnl_dta.setVisible(false);
    btn_insert.setVisible(false);
    btn_update.setVisible(false);
    btn_delete.setVisible(true);
    btn_retrive.setVisible(true);
    cbodate.setVisible(true);
    }//GEN-LAST:event_rdbtn_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int valc = Integer.parseInt(txt_callpermin.getText());
        int valt= Integer.parseInt(txt_exercisetime.getText());
        int valr = valc*valt;
        txt_calburnt.setText(Integer.toString(valr));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
       dispose();
       new MainControl();
    }//GEN-LAST:event_btn_backActionPerformed

    public void Exerciseup(){
        try {
        pst = con.prepareStatement("select * from exercise_info where username='"+getUsername()+"' and date='"+getDate()+"'");
        rs = pst.executeQuery();
        while(rs.next()){
            String name = rs.getString(4);
            cbodate.addItem(name);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }
    
    private void btn_retriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retriveActionPerformed
        Exerciseup();
    }//GEN-LAST:event_btn_retriveActionPerformed

    private void cbodatePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbodatePopupMenuWillBecomeInvisible
            edl.setUsername(getUsername());
            edl.setDate(getDate());
            edl.setTime(cbodate.getSelectedItem().toString());
            setCalpermin(edl.getCalpermin());
            setExstime(edl.getExstime());
            ResultSet rs = edl.Retrivedatas();
    }//GEN-LAST:event_cbodatePopupMenuWillBecomeInvisible

    private void cbo_exercisetypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbo_exercisetypePopupMenuWillBecomeInvisible
        try {
            pst = con.prepareStatement("select * from exercises where exsname='"+cbo_exercisetype.getSelectedItem()+"'");
            rs=pst.executeQuery();
            if(rs.next()){
                
                txt_callpermin.setText(rs.getString(2));
                
                
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_cbo_exercisetypePopupMenuWillBecomeInvisible

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_retrive;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbo_exercisetype;
    private javax.swing.JComboBox cbodate;
    private javax.swing.JLabel etyam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel pnl_dta;
    private javax.swing.JRadioButton rbbtn_update;
    private javax.swing.JRadioButton rdbtn_delete;
    private javax.swing.JTextField txt_calburnt;
    private javax.swing.JTextField txt_callpermin;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_exercisetime;
    private javax.swing.JLabel txt_info;
    private javax.swing.JTextField txt_usernameEx;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
