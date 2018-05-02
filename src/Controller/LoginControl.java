/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoginModel;
import View.ExerciseView;
import View.LoginView;

import View.RegisterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JOptionPane;


public class LoginControl implements ActionListener {
    
    private LoginModel lm;
    private LoginView lv;
    
    public LoginControl(){
        lm = new LoginModel();
        lv = new LoginView();
        lv.setVisible(true);
        lv.actionLogin(this);
    }
    
    public static void main(String[] args){
        new LoginControl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ResultSet rs = lm.Logins(lv.getUsername(), lv.getPassword());
        
        try {
            if(rs.next()){
                
                new MainControl();
                lv.setVisible(false);
                

            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }
    
}
