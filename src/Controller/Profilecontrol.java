
package Controller;

import Model.Profilemodel;
import View.ProfileView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Profilecontrol implements ActionListener {
    
    private ProfileView pv;
    private Profilemodel pm;
    
    public Profilecontrol(){
        pv = new ProfileView();
        pm = new Profilemodel();
        pv.setVisible(true);
        pv.actionsRecord(this);
    }
    
    public static void main(String[] args){
        new Profilecontrol();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==pv.btnretrival()){
            pm.setUsername(pv.getTxt_username());
            pv.setTxt_password(pm.getPassword());
            pv.setTxt_email(pm.getEmail());
            pv.setTxt_age(pm.getAge());
            pv.setTxt_answer(pm.getAnswer());
            pv.setCbosq(pm.getSq());
            
            ResultSet rs = pm.Retrival();
        }
        else if(e.getSource()==pv.btnUpdate()){
            if(pv.getGender()=="m" || pv.getGender()=="f"){
                pm.setUsername(pv.getTxt_username());
            pm.setPassword(pv.getTxt_password());
            pm.setAge(pv.getTxt_age());
            pm.setEmail(pv.getTxt_email());
            pm.setGender(pv.getGender());
            pm.setAnswer(pv.getTxt_answer());
            pm.setSq(pv.getCbosq());
            
            int r = pm.Updateprofile();
            if(r==1){
                JOptionPane.showMessageDialog(null, "Hence Updated");
            }
                
            }else{
            JOptionPane.showMessageDialog(null,"please Select Gender");
            }
        }
    }
    
}
