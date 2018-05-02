/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DBconnections.Javaconnect;
import View.ProfileView;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Profilemodel {
    
    private Javaconnect conJ;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pst;
    private int r;
    private ProfileView pv;
    private String username,email,password,age,sq,answer,gender;

     public Profilemodel(){
        conJ = new Javaconnect();
        con = conJ.getConnection();
        
    } 

    public Profilemodel(String username, String email, String password, String age,String sq, String answer, String gender) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
         this.sq = sq;
        this.answer = answer;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }
    
        
    public ResultSet Retrival(){
        try {
            PreparedStatement pst = con.prepareStatement("Select * from logindetails where username='"+getUsername()+"'");
            rs = pst.executeQuery();
            if(rs.next()){
                setEmail(rs.getString(2));
                setPassword(rs.getString(5));
                setAge(rs.getString(4));
                setAnswer(rs.getString(7));
                
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Username");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return rs;
    }
    
    public int Updateprofile(){
         try {
           PreparedStatement ps = con.prepareStatement("update logindetails set email='"+getEmail()+"', gender='"+getGender()+"',"
                   + "age='"+getAge()+"',password='"+getPassword()+"',"
                   + "sq='"+getSq()+"',answer='"+getAnswer()+"' where username='"+getUsername()+"'");
            r = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         return r;
    }
    
}
