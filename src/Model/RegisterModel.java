package Model;

import DBconnections.Javaconnect;
import View.LoginView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class RegisterModel {
    
    private Javaconnect connectDB;
    private Connection con;
    private ResultSet rs;
    private int r;
    private PreparedStatement pst;
    
    private String username,email,gender,age,password,quest,answer;

        
    public RegisterModel(){
        connectDB = new Javaconnect();
        con = connectDB.getConnection();
    }
    
    public RegisterModel(String username,String email,String gender,String age,String password, String quest,String answer){
        
        this.username = username;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.password = password;
        this.quest = quest;
        this.answer = answer;
        
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public int Registration(){
        
        try
        {
        PreparedStatement pst = con.prepareStatement("INSERT INTO logindetails(username,email,gender,age,password,sq,answer) "
                + "values(?,?,?,?,?,?,?)");
        pst.setString(1, getUsername());
        pst.setString(2, getEmail());
        pst.setString(3, getGender());
        pst.setString(4, getAge());
        pst.setString(5, getPassword());
        pst.setString(6, getQuest());
        pst.setString(7, getAnswer());
        
        r= pst.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
   
        }
        return r;
    }
    
    
}
