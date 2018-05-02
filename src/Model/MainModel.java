/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DBconnections.Javaconnect;
import java.sql.*;
import javax.swing.JOptionPane;


public class MainModel {
    private Connection con;
    private Javaconnect connectDB;
    private ResultSet rs;
    private PreparedStatement pst;
    private int r;
    private String username,date,level,inweight,inwaist,incalorie,calorieburned,finweight,finwaist;

    public MainModel(){
        connectDB = new Javaconnect();
        con = connectDB.getConnection();
    }
    
    public MainModel(String username, String date, String level, String inweight, String inwaist, String incalorie, String calorieburned, String finweight, String finwaist) {
        
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
    
    public int Insertmodel(){
        try {
        pst = con.prepareStatement("Insert into results(username,date,level,inweight,"
                + "inwaist,incalorie,calorieburned,finweight,finwaist)"
                + "values(?,?,?,?,?,?,?,?,?)");
        
        
        pst.setString(1, getUsername());
        pst.setString(2, getDate());
        pst.setString(3, getLevel());
        pst.setString(4, getInweight());
        pst.setString(5, getInwaist());
        pst.setString(6, getIncalorie());
        pst.setString(7, getCalorieburned());
        pst.setString(8, getFinweight());
        pst.setString(9,getFinwaist());
        r = pst.executeUpdate();
    
          

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
        return r;
    }
    
    public int Updatin(){
        try {
            pst = con.prepareStatement("update results set incalorie='"+getIncalorie()+"',"
                    + "calorieburned='"+getCalorieburned()+"', finweight='"+getFinweight()+"', "
                    + "finwaist='"+getFinwaist()+"',level='"+getLevel()+"' "
                    + "where username='"+getUsername()+"' And date='"+getDate()+"'");
            r = pst.executeUpdate();
                                    

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }
    
    public ResultSet TodayCalorieinout(){
        try {
            pst = con.prepareStatement("Select AVG(caloriepergram) from meal_info where username='"+getUsername()+"' "
                    + "and date='"+getDate()+"' ");
            rs = pst.executeQuery();
            if(rs.next()){
                Double a =rs.getDouble(1);
                setIncalorie(a.toString());
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        
        }
        return rs;
    }
    
    public ResultSet TodayCalburn(){
        try {
            pst = con.prepareStatement("Select AVG(calorieburnt) from exercise_info where username='"+getUsername()+"' "
                    + "and date='"+getDate()+"'");
            rs = pst.executeQuery();
            if(rs.next()){
                Double a =rs.getDouble(1);
                setCalorieburned(a.toString());
            }
        } catch (SQLException ex) {

        }
        return rs;
    }
    
}

