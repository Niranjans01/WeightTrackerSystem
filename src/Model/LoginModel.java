/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DBconnections.Javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class LoginModel {
    
    private Javaconnect connectDB;
    private Connection con;
    private ResultSet rs;
    private int r;
    private PreparedStatement pst;
    private String username,password;

       
    public LoginModel(){
        connectDB = new Javaconnect();
        con = connectDB.getConnection();
    
    } 
    public ResultSet Logins(String username,String password){
        try {
            PreparedStatement pst = con.prepareStatement("Select * from logindetails where username=? and password=?" );
            pst.setString(1, username);
            pst.setString(2, password);
            rs=pst.executeQuery();
            

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        return rs;
    }
    
}
