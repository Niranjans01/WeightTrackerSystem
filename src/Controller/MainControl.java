/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MainModel;
import View.MainView;
import View.ReportView;
import View.TodayView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class MainControl implements ActionListener{
    
    private MainView mnv;
    private MainModel mmd;
    
    
    public MainControl(){
        mnv = new MainView();
        mmd = new MainModel();
        mnv.setVisible(true);
        mnv.actionMains(this);
        
    }
    public static void main(String[] args){
        new MainControl();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==mnv.getUpdatew()){
            if(mnv.getFinwaist().equals("0")|| mnv.getFinwaist().isEmpty() || mnv.getFinwaist().isEmpty()||mnv.getFinweight().equals("0")){
                JOptionPane.showMessageDialog(null,"Please Enter todays Final weight");
                mnv.getFinals().setVisible(true);
                mnv.getFinals().setBackground(Color.red);
            }
            else if(mnv.getIncalorie().isEmpty() || mnv.getCalorieburned().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Double Click \n 'Extract button'");
            }
            else if(mnv.getLevel()=="A" || mnv.getLevel()=="C" || mnv.getLevel()=="I"){
                mmd.setUsername(mnv.getUsername());
            mmd.setDate(mnv.getDate());
            //mmd.setTime(mnv.getTime());
            mmd.setLevel(mnv.getLevel());
            mmd.setInwaist(mnv.getInwaist());
            mmd.setInweight(mnv.getInweight());
            mmd.setIncalorie(mnv.getIncalorie());
            mmd.setFinweight(mnv.getFinweight());
            mmd.setFinwaist(mnv.getFinwaist());
            mmd.setCalorieburned(mnv.getCalorieburned());
                int r= mmd.Updatin();
                if(r==1){
                                    JOptionPane.showMessageDialog(null,"Record Updated");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Please enter \n Todays Activity Level");
                mnv.getDayLevel().setBackground(Color.red);
            
            }
        }
        else if (e.getSource()==mnv.Exercises()){
            mnv.dispose();
            new ExerciseControl();
            //Calorieloader();
        }
        else if(e.getSource()==mnv.Meals()){
            mnv.dispose();
            new MealControl();
        }
        else if(e.getSource()==mnv.Profile()){
            mnv.dispose();
            new Profilecontrol();
        }
        else if(e.getSource()==mnv.Todayto()){
            mnv.dispose();
            TodayView tv = new TodayView();
            tv.setVisible(true);
        }
        else if(e.getSource()==mnv.Finals()){
            if(mnv.getCalorieburned().isEmpty() || mnv.getIncalorie().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please get Initial calorie and calorie burned");
            }else{
            mnv.dispose();
            ReportView rev =new ReportView();
            rev.setVisible(true);
            }
        }
        
        
        
    }
    
}
