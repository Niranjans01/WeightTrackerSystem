
package Controller;

import Model.MealModel;
import View.MealView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;


public class MealControl implements ActionListener {
    
    private MealView mv;
    private MealModel mm;
    
    
    public MealControl(){
        mv = new MealView();
        mm = new MealModel();
        mv.setVisible(true);
        mv.btnlistner(this);
        
    }
    
    public static void main(String[] args){
        new MealControl();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        
        if(e.getSource()==mv.getUpdate()){
            
            mm.setUsername(mv.getUsername());
            mm.setDate(mv.getDate());
            mm.setCbodater(mv.getCbodater());
            mm.setMealname(mv.getMealname());
            mm.setMealsize(mv.getMealsize());
            mm.setMealcalorie(mv.getMealcalorie());
            mm.setCaloriepergram(mv.getCaloriepergram());
            
            int result = mm.Updatemeal();
            if(result==1){
                                JOptionPane.showMessageDialog(null,"Updated");
            }
        }
        
        else if(e.getSource()==mv.getDelete()){
            if(mv.getCbodater().isEmpty()){
                                JOptionPane.showMessageDialog(null, "Please Retrive");
            }else{
            mm.setCbodater(mv.getCbodater());
            int result = mm.Deletemeal();
            if(result==1){
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            }
        }
        
           
    
    
    
}
    
}
