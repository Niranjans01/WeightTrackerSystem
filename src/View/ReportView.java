
package View;

import Controller.MainControl;
import DBconnections.Javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import static View.LoginView.txt_username;


public class ReportView extends javax.swing.JFrame {

private Connection con;
    private Javaconnect connectDB;
    private ResultSet rs;
    private PreparedStatement pst;
String a;
    public ReportView() {
        initComponents();
        connectDB = new Javaconnect();
        con = connectDB.getConnection();
        String d= Datetoday.nowd();
        txt_date.setText(d);
        a= txt_username.getText();
        txt_usernamerr.setText(a);
        lbl_necessary.setVisible(false);
        txt_necessary.setVisible(true);
        pnl_necessary.setVisible(false);
        Extractdata();
        Necessarycalorie();
        lbl_noweight.setVisible(false);
        Weightchange();
        Calorieleft();
        CalorieReq();
        FillDate();
        
        
        
    }
    
    public void FillDate(){
       try {
           pst=con.prepareStatement("select * from weightreport where username='"+txt_usernamerr.getText()+"'");
           rs=pst.executeQuery();
           while(rs.next()){
               String dt = rs.getString(2);
               cbo_wtfrom.addItem(dt);
               cbo_wtto.addItem(dt);
           }
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
       }
    }
    
    public void CalorieReq(){
        Double ncl = Double.parseDouble(txt_necessary.getText());
        Double clf = Double.parseDouble(txt_calorielefttoburn.getText());
        if(ncl>clf){
        Double crq = ncl - clf;
        txt_requiredcalorie.setText(Double.toString(crq));
        txt_calorietoburn.setVisible(false);
        lbl_ctob.setVisible(false);
        txt_requiredcalorie.setVisible(true);
        lbl_reqcalorie.setVisible(true);
        }
        else{
            Double ctb = clf-ncl;
            txt_calorietoburn.setText(Double.toString(ctb));
            txt_calorietoburn.setVisible(true);
            lbl_ctob.setVisible(true);
            txt_requiredcalorie.setVisible(false);
            lbl_reqcalorie.setVisible(false);
        }
        
    }
    
    public void Calorieleft(){
        Double ct = Double.parseDouble(txt_calorietaken.getText());
        Double cb= Double.parseDouble(txt_calorieburnt.getText());
        Double re = ct-cb;
        txt_calorielefttoburn.setText(Double.toString(re));
    }
    
    public void Weightchange(){
               
               if (txt_finweight.getText().isEmpty()  || txt_inweight.getText().isEmpty()){
                   lbl_noweight.setVisible(true);
                   txt_wtchange.setVisible(false);
                   txt_waistchange.setVisible(false);
               }else{
        Double fc = Double.parseDouble(txt_finweight.getText());         
        Double ic = Double.parseDouble(txt_inweight.getText());
        Double wc = ic - fc;
        Double aw = (ic+fc)/2;
        txt_wtchange.setText(Double.toString(wc));
        txt_avgweight.setText(Double.toString(aw));
        Double fws = Double.parseDouble(txt_finwaist.getText());
        Double iws = Double.parseDouble(txt_inwaist.getText());
        Double wsc= iws-fws;
        txt_waistchange.setText(Double.toString(wsc));
        if(wsc<0){
            lbl_wtup.setVisible(true);
            lbl_wtdown.setVisible(false);
            lbl_wsup.setVisible(true);
            lbl_wsdown.setVisible(false);
        }else{
            lbl_wtdown.setVisible(true);
            lbl_wsup.setVisible(false);
            lbl_wsdown.setVisible(true);
            lbl_wtup.setVisible(false);
        }
               }
    }
    
    public void Necessarycalorie(){
        if(txt_gender.getText().equals("m") && txt_actlevel.getText().equals("A")){
            Double am = Double.parseDouble(txt_inweight.getText());
            Double cI = 7.5*am;
            txt_necessary.setText(Double.toString(cI));
        }
        else if (txt_gender.getText().equals("m") && txt_actlevel.getText().equals("I")){
          Double am = Double.parseDouble(txt_inweight.getText());
            Double cI = 5*am;
            txt_necessary.setText(Double.toString(cI));
        }
        else if(txt_gender.getText().equals("m") && txt_actlevel.getText().equals("C")){
        Double am = Double.parseDouble(txt_inweight.getText());
            Double cI = 6*am;
            txt_necessary.setText(Double.toString(cI));
        }
        else if (txt_gender.getText().equals("f") && txt_actlevel.getText().equals("A")){
            Double am = Double.parseDouble(txt_inweight.getText());
            Double cI = 7.5*am;
            txt_necessary.setText(Double.toString(cI));
        }
        else if(txt_gender.getText().equals("f") && txt_actlevel.getText().equals("C")){
            Double am = Double.parseDouble(txt_inweight.getText());
            Double cI = 6*am;
            txt_necessary.setText(Double.toString(cI));
        }
        else if(txt_gender.getText().equals("f") && txt_actlevel.getText().equals("I")){
            Double am = Double.parseDouble(txt_inweight.getText());
            Double cI = 5*am;
            txt_necessary.setText(Double.toString(cI));
        }
        else{
            txt_necessary.setVisible(false);
            lbl_necessary.setVisible(true);
        }
    }

    public void Extractdata(){
        
       try {
           pst= con.prepareStatement("Select * from results where username='"+txt_usernamerr.getText()+"' "
                   + "And date='"+txt_date.getText()+"'");
           rs=pst.executeQuery();
           if(rs.next ()){
               txt_actlevel.setText(rs.getString(3));
               txt_inweight.setText(rs.getString(4));
               txt_finweight.setText(rs.getString(8));
               txt_inwaist.setText(rs.getString(5));
               txt_finwaist.setText(rs.getString(9));
               txt_calorietaken.setText(rs.getString(6));
               txt_calorieburnt.setText(rs.getString(7));
               
           }
       } catch (Exception e) {
                      JOptionPane.showMessageDialog(null, e);
       }
       try {
           pst =con.prepareStatement("select * from logindetails where username='"+txt_usernamerr.getText()+"'");
           rs=pst.executeQuery();
           if(rs.next()){
               txt_gender.setText(rs.getString(3));
           }
           
       } catch (Exception x) {
           JOptionPane.showMessageDialog(null, x);
       }
          
            
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_waistchange = new javax.swing.JTextField();
        txt_wtchange = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_calorietaken = new javax.swing.JTextField();
        txt_necessary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_requiredcalorie = new javax.swing.JTextField();
        lbl_reqcalorie = new javax.swing.JLabel();
        txt_calorieburnt = new javax.swing.JTextField();
        lbl_ctob = new javax.swing.JLabel();
        txt_calorielefttoburn = new javax.swing.JTextField();
        txt_calorietoburn = new javax.swing.JTextField();
        btn_refreshed = new javax.swing.JButton();
        btn_refreshed1 = new javax.swing.JButton();
        txt_usernamerr = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        lbl_necessary = new javax.swing.JLabel();
        pnl_necessary = new javax.swing.JPanel();
        txt_inweight = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_actlevel = new javax.swing.JTextField();
        txt_finweight = new javax.swing.JTextField();
        txt_finwaist = new javax.swing.JTextField();
        txt_inwaist = new javax.swing.JTextField();
        lbl_noweight = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_wsdown = new javax.swing.JLabel();
        lbl_wtdown = new javax.swing.JLabel();
        lbl_wsup = new javax.swing.JLabel();
        lbl_wtup = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_avgweight = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbo_wtto = new javax.swing.JComboBox();
        cbo_wtfrom = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_wtchangeis = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_wtfrom = new javax.swing.JTextField();
        txt_wtto = new javax.swing.JTextField();
        btn_weightchange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 24), java.awt.Color.white)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_waistchange.setEditable(false);
        txt_waistchange.setBackground(new java.awt.Color(0, 102, 51));
        txt_waistchange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_waistchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 70, 30));

        txt_wtchange.setEditable(false);
        txt_wtchange.setBackground(new java.awt.Color(0, 102, 51));
        txt_wtchange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_wtchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 70, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Waist Change");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 44));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Calorie Burnt");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 44));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calorie Intake");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 44));

        txt_calorietaken.setEditable(false);
        txt_calorietaken.setBackground(new java.awt.Color(0, 102, 51));
        txt_calorietaken.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_calorietaken, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 90, 30));

        txt_necessary.setEditable(false);
        txt_necessary.setBackground(new java.awt.Color(0, 102, 51));
        txt_necessary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_necessary, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 90, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Calorie Difference");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 44));

        txt_requiredcalorie.setEditable(false);
        txt_requiredcalorie.setBackground(new java.awt.Color(0, 102, 51));
        txt_requiredcalorie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_requiredcalorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 90, 30));

        lbl_reqcalorie.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_reqcalorie.setForeground(new java.awt.Color(255, 255, 255));
        lbl_reqcalorie.setText("Calorie Requirement");
        jPanel1.add(lbl_reqcalorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 30));

        txt_calorieburnt.setEditable(false);
        txt_calorieburnt.setBackground(new java.awt.Color(0, 102, 51));
        txt_calorieburnt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_calorieburnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 30));

        lbl_ctob.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_ctob.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ctob.setText("Calorie to Burn");
        jPanel1.add(lbl_ctob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 44));

        txt_calorielefttoburn.setBackground(new java.awt.Color(0, 102, 51));
        txt_calorielefttoburn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_calorielefttoburn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 90, 30));

        txt_calorietoburn.setEditable(false);
        txt_calorietoburn.setBackground(new java.awt.Color(0, 102, 51));
        txt_calorietoburn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_calorietoburn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 90, 30));

        btn_refreshed.setBackground(new java.awt.Color(139, 0, 139));
        btn_refreshed.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_refreshed.setText("Graph Report");
        btn_refreshed.setBorder(null);
        btn_refreshed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshedActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refreshed, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 107, 44));

        btn_refreshed1.setBackground(new java.awt.Color(139, 0, 139));
        btn_refreshed1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_refreshed1.setText("Back");
        btn_refreshed1.setBorder(null);
        btn_refreshed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshed1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refreshed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 107, 44));

        txt_usernamerr.setEditable(false);
        txt_usernamerr.setBackground(new java.awt.Color(0, 153, 153));
        txt_usernamerr.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), java.awt.Color.blue)); // NOI18N
        jPanel1.add(txt_usernamerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 50));

        txt_date.setEditable(false);
        txt_date.setBackground(new java.awt.Color(0, 153, 153));
        txt_date.setForeground(new java.awt.Color(255, 255, 255));
        txt_date.setText("DD/MM/YYYY");
        txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, 30));

        lbl_necessary.setText("You havent entered Todays Data");
        jPanel1.add(lbl_necessary, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, 30));

        pnl_necessary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_inweight.setEditable(false);
        pnl_necessary.add(txt_inweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 0, 30, 40));

        txt_gender.setEditable(false);
        pnl_necessary.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 0, 30, 40));

        txt_actlevel.setEditable(false);
        pnl_necessary.add(txt_actlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 0, 30, 40));

        txt_finweight.setEditable(false);
        pnl_necessary.add(txt_finweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 0, 30, 40));

        txt_finwaist.setEditable(false);
        pnl_necessary.add(txt_finwaist, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 30, 40));

        txt_inwaist.setEditable(false);
        pnl_necessary.add(txt_inwaist, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 40));

        jPanel1.add(pnl_necessary, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 290, 50));

        lbl_noweight.setText("You haven't entered All Datas");
        jPanel1.add(lbl_noweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 180, 20));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Weight Change");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 50));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Today's");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 40));

        lbl_wsdown.setForeground(new java.awt.Color(255, 204, 204));
        lbl_wsdown.setText("Size Decreased");
        jPanel1.add(lbl_wsdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        lbl_wtdown.setForeground(new java.awt.Color(255, 204, 204));
        lbl_wtdown.setText("Size Decreased");
        jPanel1.add(lbl_wtdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        lbl_wsup.setForeground(new java.awt.Color(255, 204, 204));
        lbl_wsup.setText("Size increased");
        jPanel1.add(lbl_wsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        lbl_wtup.setForeground(new java.awt.Color(255, 204, 204));
        lbl_wtup.setText("Size increased");
        jPanel1.add(lbl_wtup, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Necessary Calorie");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 60));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Today's");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 50));

        txt_avgweight.setEditable(false);
        txt_avgweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_avgweightActionPerformed(evt);
            }
        });
        jPanel1.add(txt_avgweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 104, 60, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Average Weight");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, 60));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Today's");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 50));

        cbo_wtto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbo_wttoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(cbo_wtto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 140, 30));

        cbo_wtfrom.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbo_wtfromPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(cbo_wtfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 140, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("to");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Weight  from:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, 60));

        txt_wtchangeis.setEditable(false);
        jPanel1.add(txt_wtchangeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 140, 30));

        jButton1.setText("Save to Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 130, -1));

        txt_wtfrom.setEditable(false);
        jPanel1.add(txt_wtfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 30, 30));

        txt_wtto.setEditable(false);
        jPanel1.add(txt_wtto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 30, 30));

        btn_weightchange.setText("Weight  change:");
        btn_weightchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_weightchangeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_weightchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refreshed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshed1ActionPerformed
        dispose();
        MainControl mp = new MainControl();
        
    }//GEN-LAST:event_btn_refreshed1ActionPerformed

    private void txt_avgweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_avgweightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_avgweightActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
           pst=con.prepareStatement("Insert into weightreport(id,date,username,avgweight) values(?,?,?,?)");
           pst.setString(1,null);
           pst.setString(2, txt_date.getText());
           pst.setString(3, txt_usernamerr.getText());
           pst.setString(4, txt_avgweight.getText());
           pst.execute();
                      JOptionPane.showMessageDialog(null, "Sucessfully Recorded");
           
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbo_wtfromPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbo_wtfromPopupMenuWillBecomeInvisible
        try {
            pst = con.prepareStatement("select * from weightreport where date='"+cbo_wtfrom.getSelectedItem()+"'");
            rs=pst.executeQuery();
            if(rs.next()){
                txt_wtfrom.setText(rs.getString(4));
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_cbo_wtfromPopupMenuWillBecomeInvisible

    private void cbo_wttoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbo_wttoPopupMenuWillBecomeInvisible
        try {
            pst = con.prepareStatement("select * from weightreport where date='"+cbo_wtto.getSelectedItem()+"'");
            rs=pst.executeQuery();
            if(rs.next()){
                txt_wtto.setText(rs.getString(4));
                
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_cbo_wttoPopupMenuWillBecomeInvisible

    private void btn_weightchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_weightchangeActionPerformed
        Double from = Double.parseDouble(txt_wtfrom.getText());
        Double to = Double.parseDouble(txt_wtto.getText());
        Double chng = from-to;
        txt_wtchangeis.setText(Double.toString(chng));
    }//GEN-LAST:event_btn_weightchangeActionPerformed

    private void btn_refreshedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshedActionPerformed
       try {
           String query="select date,avgweight from weightreport";
           JDBCCategoryDataset dataset = new JDBCCategoryDataset(connectDB.getConnection(),query);
           JFreeChart chart = ChartFactory.createLineChart("Weight Track", "Date","Weight", 
                   dataset, PlotOrientation.VERTICAL, false, true, true);
           BarRenderer renderer = null;
           CategoryPlot plot =null;
           renderer =new BarRenderer();
           ChartFrame frame = new ChartFrame("Weight Track",chart);
           frame.setVisible(true);
           frame.setSize(400,600);
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
       }
    }//GEN-LAST:event_btn_refreshedActionPerformed

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refreshed;
    private javax.swing.JButton btn_refreshed1;
    private javax.swing.JButton btn_weightchange;
    private javax.swing.JComboBox cbo_wtfrom;
    private javax.swing.JComboBox cbo_wtto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_ctob;
    private javax.swing.JLabel lbl_necessary;
    private javax.swing.JLabel lbl_noweight;
    private javax.swing.JLabel lbl_reqcalorie;
    private javax.swing.JLabel lbl_wsdown;
    private javax.swing.JLabel lbl_wsup;
    private javax.swing.JLabel lbl_wtdown;
    private javax.swing.JLabel lbl_wtup;
    private javax.swing.JPanel pnl_necessary;
    private javax.swing.JTextField txt_actlevel;
    private javax.swing.JTextField txt_avgweight;
    private javax.swing.JTextField txt_calorieburnt;
    private javax.swing.JTextField txt_calorielefttoburn;
    private javax.swing.JTextField txt_calorietaken;
    private javax.swing.JTextField txt_calorietoburn;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_finwaist;
    private javax.swing.JTextField txt_finweight;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_inwaist;
    private javax.swing.JTextField txt_inweight;
    private javax.swing.JTextField txt_necessary;
    private javax.swing.JTextField txt_requiredcalorie;
    private javax.swing.JTextField txt_usernamerr;
    private javax.swing.JTextField txt_waistchange;
    private javax.swing.JTextField txt_wtchange;
    private javax.swing.JTextField txt_wtchangeis;
    private javax.swing.JTextField txt_wtfrom;
    private javax.swing.JTextField txt_wtto;
    // End of variables declaration//GEN-END:variables
}
