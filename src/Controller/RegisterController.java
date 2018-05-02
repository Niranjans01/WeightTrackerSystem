
package Controller;

import Model.RegisterModel;
import View.RegisterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class RegisterController implements ActionListener{
    
    private RegisterView rv;
    private RegisterModel rm;
    
    
    public RegisterController(){
        rv = new RegisterView();
        rm = new RegisterModel();
        
        rv.setVisible(true);
        rv.RegisterActionPerformed(this);
    }

    
    public static void main(String[] args) {
        new RegisterController();
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        rm.setUsername(rv.getUsername());
        rm.setEmail(rv.getEmail());
        rm.setGender(rv.getGender());
        rm.setAge(rv.getAge());
        rm.setPassword(rv.getPassword());
        rm.setQuest((String) rv.getQuest());
        rm.setAnswer(rv.getAnswer());
    
        int result = rm.Registration();
        if(result==1){
                        JOptionPane.showMessageDialog(null, "Sucessfully Registered");
        }
    }
    
    
    
}
