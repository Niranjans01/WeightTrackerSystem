/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DBconnections.Javaconnect;
import View.MealView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MealModel {
    
    private Javaconnect connectDB;
    private Connection con;
    private ResultSet rs;
    private MealView mv;
    private int r;
    private PreparedStatement pst;
    private String username,date,time,mealname,mealsize,mealcalorie,caloriepergram,cbodater;

       
    public MealModel(){
        connectDB = new Javaconnect();
        con = connectDB.getConnection();
    }
    
    public MealModel(String username, String date,String time, String mealname,
            String mealsize, String mealcalorie, String caloriepergram,String cbodater) {
        
        this.username = username;
        this.date = date;
        this.time = time;
        this.mealname = mealname;
        this.mealsize = mealsize;
        this.mealcalorie = mealcalorie;
        this.caloriepergram = caloriepergram;
        this.cbodater = cbodater;
        
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

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getMealsize() {
        return mealsize;
    }

    public void setMealsize(String mealsize) {
        this.mealsize = mealsize;
    }

    public String getMealcalorie() {
        return mealcalorie;
    }

    public void setMealcalorie(String mealcalorie) {
        this.mealcalorie = mealcalorie;
    }

    public String getCaloriepergram() {
        return caloriepergram;
    }

    public void setCaloriepergram(String caloriepergram) {
        this.caloriepergram = caloriepergram;
    }
    
    public String getCbomealnames() {
        return caloriepergram;
    }
    
    public void setCbodater(String cbodater){
        this.cbodater = cbodater;
    }
    
    public String getCbodater(){
        return cbodater;
    }

    public int Insertmeal(){
        
        try
        {
        PreparedStatement pst = con.prepareStatement("INSERT INTO meal_info(id,username,date,time,meal,amount,mealcalorie,caloriepergram) "
                + "values(?,?,?,?,?,?,?,?)");
        PreparedStatement ps = con.prepareStatement("INSERT INTO meals(mname,mcal) values(?,?)");
            ps.setString(1, getMealname());
            ps.setString(2, getMealcalorie());
        pst.setString(1,null);
        pst.setString(2, getUsername());
        pst.setString(3, getDate());
        pst.setString(4, getTime());
        pst.setString(5, getMealname());
        pst.setString(6, getMealsize());
        pst.setString(7, getMealcalorie());
        pst.setString(8, getCaloriepergram());
        r= pst.executeUpdate();
        r= ps.executeUpdate();
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
   
        }
        return r;
    }
    
    public ResultSet Retrive(){
        try {
            PreparedStatement pst = con.prepareStatement("Select * from meal_info where date='"+getDate()+"' "
                    + "AND time='"+getTime()+"' AND username='"+getUsername()+"'");
            rs = pst.executeQuery();
            
            if(rs.next()){ 
               setMealsize(rs.getString(6));
               setCaloriepergram(rs.getString(7));
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
            
        }
        return rs;
    }
    
    
    public int Updatemeal(){
       try {
            pst = con.prepareStatement("update meal_info set meal='"+getMealname()+"' ,amount = '"+getMealsize()+"' ,"
                    + "mealcalorie = '"+getMealcalorie()+"', caloriepergram= '"+getCaloriepergram()+"' where time='"+getCbodater()+"'"
                    + " and date='"+getDate()+"'");
            PreparedStatement ps = con.prepareStatement("update meals set mname='"+getMealname()+"',mcal ='"+getMealcalorie()+"'"
                    + " where mname='"+getMealname()+"'");
            r= pst.executeUpdate();
            r = ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       return r;
    }
    
    public int Deletemeal(){
        
        try {
            PreparedStatement pst = con.prepareStatement("Delete  from meal_info where time='"+getCbodater()+"'");
            r=pst.executeUpdate();
                        
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
            
        }
        return r;
        
    }
    
   
    
}
