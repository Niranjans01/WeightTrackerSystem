/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ExerciseModel;
import View.ExerciseView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ExerciseControl implements ActionListener  {
    
    private ExerciseView ev;
    private ExerciseModel em;
    
    
    public ExerciseControl(){
        em = new ExerciseModel();
        ev = new ExerciseView();
        ev.setVisible(true);
        ev.btnlistner(this);
        
    }
    
    public static void main(String[] args){
        new ExerciseControl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==ev.getRecord()){
            
            em.setUsername(ev.getUsername());
            em.setDate(ev.getDate());
            em.setTime(ev.getTime());
            em.setExercise(ev.getExercise());
            em.setCalpermin(ev.getCalpermin());
            em.setExstime(ev.getExstime());
            em.setCalorieburnt(ev.getCalorieburnt());
            
            int r= em.Record();
            if(r==1){
                        JOptionPane.showMessageDialog(null, "Exercise Information Recorded");
            }
        }
        
        else if(e.getSource()==ev.getUpdate()){
            
            em.setUsername(ev.getUsername());
            em.setDate(ev.getDate());
            em.setCbotime(ev.getCbodates());
            em.setExercise(ev.getExercise());
            em.setCalpermin(ev.getCalpermin());
            em.setExstime(ev.getExstime());
            em.setCalorieburnt(ev.getCalorieburnt());
            
            int r= em.Updates();
            if(r==1){
               JOptionPane.showMessageDialog(null, "Exercise Information Updated");
            }
        }
        else if(e.getSource()==ev.getDelete()){
            if(ev.getCbodates().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Retrive");
            }else{
            em.setCbotime(ev.getCbodates());
            em.setDate(ev.getDate());
            
            int r = em.Delets();
            if(r==1){
                               JOptionPane.showMessageDialog(null, "Delete Successful");
            }
            }
        }
        
        
    }
    
}
