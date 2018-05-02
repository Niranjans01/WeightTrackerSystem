/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DBconnections.Javaconnect;
import View.ProfileView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TodayModel {
    
    private Javaconnect conJ;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pst;
    private int r;
    private String username,date,level,inweight,inwaist,incalorie,calorieburned,finweight,finwaist;

     public TodayModel(){
        conJ = new Javaconnect();
        con = conJ.getConnection();
    }

    public TodayModel(String username, String date, String level, String inweight, 
            String inwaist, String incalorie, String calorieburned, String finweight, String finwaist) {
        this.username = username;
        this.date = date;
        this.level = level;
        this.inweight = inweight;
        this.inwaist = inwaist;
        this.incalorie = incalorie;
        this.calorieburned = calorieburned;
        this.finweight = finweight;
        this.finwaist = finwaist;
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
    
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInweight() {
        return inweight;
    }

    public void setInweight(String inweight) {
        this.inweight = inweight;
    }

    public String getInwaist() {
        return inwaist;
    }

    public void setInwaist(String inwaist) {
        this.inwaist = inwaist;
    }

    public String getIncalorie() {
        return incalorie;
    }

    public void setIncalorie(String incalorie) {
        this.incalorie = incalorie;
    }

    public String getCalorieburned() {
        return calorieburned;
    }

    public void setCalorieburned(String calorieburned) {
        this.calorieburned = calorieburned;
    }

    public String getFinweight() {
        return finweight;
    }

    public void setFinweight(String finweight) {
        this.finweight = finweight;
    }

    public String getFinwaist() {
        return finwaist;
    }

    public void setFinwaist(String finwaist) {
        this.finwaist = finwaist;
    }

    public int updation(){
        try {
            pst = con.prepareStatement("update results set inweight='"+getInweight()+"', inwaist='"+getInwaist()+"',"
                    + "finweight='"+getFinweight()+"', finwaist='"+getFinwaist()+"',level='"+getLevel()+"' where"
                    + " username='"+getUsername()+"'And date='"+getDate()+"'");
            r = pst.executeUpdate();
                                    //JOptionPane.showMessageDialog(null, "Record Updated");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }
    
    public ResultSet Download(){
        try {
            pst=con.prepareStatement("Select * from results where date='"+getDate()+"' And username='"+getUsername()+"'");
            rs=pst.executeQuery();
            if(rs.next()){
                setInweight(rs.getString(4));
                setFinweight(rs.getString(8));
                setInwaist(rs.getString(5));
                setFinwaist(rs.getString(9));
                setLevel(rs.getString(3));
                setIncalorie(rs.getString(6));
                setCalorieburned(rs.getString(7));
                            JOptionPane.showMessageDialog(null, "Please Make Sure You have entered data");

                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }
     
     
    
}
