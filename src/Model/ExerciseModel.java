
package Model;

import DBconnections.Javaconnect;
import java.sql.*;
import javax.swing.JOptionPane;


public class ExerciseModel {
    
    private Connection con;
    private Javaconnect conectDB;
    private ResultSet rs;
    private PreparedStatement pst;
    private String id,username,date,time,exercise,calpermin,exstime,calorieburnt,cbotime;
    private int r;
        
    public ExerciseModel(){
        conectDB = new Javaconnect();
        con= conectDB.getConnection();
    }
    
    public ExerciseModel(String id, String username, String date,String time, String exercise, String calpermin, String exstime, String calorieburnt,String cbotime) {
        this.id = id;
        this.username = username;
        this.date = date;
        this.time = time;
        this.exercise = exercise;
        this.calpermin = calpermin;
        this.exstime = exstime;
        this.calorieburnt = calorieburnt;
        this.cbotime = cbotime;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getCalpermin() {
        return calpermin;
    }

    public void setCalpermin(String calpermin) {
        this.calpermin = calpermin;
    }

    public String getExstime() {
        return exstime;
    }

    public void setExstime(String exstime) {
        this.exstime = exstime;
    }

    public String getCalorieburnt() {
        return calorieburnt;
    }

    public void setCalorieburnt(String calorieburnt) {
        this.calorieburnt = calorieburnt;
    }
    
    public void setCbotime(String cbotime) {
        this.cbotime = cbotime;
    }
    
    public String getCbotime() {
        return cbotime;
    }

    
    
    
    public int Record(){
    
        try
        {
        PreparedStatement pst = con.prepareStatement("INSERT INTO exercise_info(id,username,date,time,exercise,calpermin,"
                + "exstime,calorieburnt)"
                + "values(?,?,?,?,?,?,?,?)");
        PreparedStatement ps = con.prepareStatement("INSERT INTO exercises(exsname,exscal) values(?,?)");
            ps.setString(1, getExercise());
            ps.setString(2, getExstime());
        pst.setString(1,null);
        pst.setString(2, getUsername());
        pst.setString(3, getDate());
        pst.setString(4, getTime());
        pst.setString(5, getExercise());
        pst.setString(6, getCalpermin());
        pst.setString(7, getExstime());
        pst.setString(8, getCalorieburnt());
        r= pst.executeUpdate();
        r= ps.executeUpdate();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
   
        }
        return r;
    }
    
    public int Updates(){
        try {
            pst = con.prepareStatement("update exercise_info set exercise = '"+getExercise()+"', calpermin='"+getCalpermin()+"' , exstime = '"+getExstime()+"' , calorieburnt = '"+getCalorieburnt()+"' where time='"+getCbotime()+"'  AND username='"+getUsername()+"'");
            PreparedStatement ps=con.prepareStatement("update exercises set exscal='"+getCalpermin()+"' "
                    + "where exsname='"+getExercise()+"'");
            r = pst.executeUpdate();
            r= ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }
    
    public ResultSet Retrival(){
        try {
          PreparedStatement pst = con.prepareStatement("Select * from exercise_info where date='"+getDate()+"' and time='"+getTime()+"' AND username='"+getUsername()+"'");
          rs = pst.executeQuery();
          if(rs.next()){
              setExstime(rs.getString(6));
              setCalorieburnt(rs.getString(7));
          }
      } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex);
      }
        return rs;
    }
    
    public int Delets(){
        try {
            PreparedStatement pst = con.prepareStatement("Delete  from exercise_info where time='"+getCbotime()+"' AND username='"+getUsername()+"'");
            r = pst.executeUpdate();

        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
            
        }
        return r;
    }
    public ResultSet Retrivedatas(){
        try {
            pst = con.prepareStatement("select * from exercise_info where time='"+getTime()+"'");
            rs=pst.executeQuery();
            if(rs.next()){
                setCalpermin(rs.getString(6));
                setExstime(rs.getString(7));
                
                
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
    
}
