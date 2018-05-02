
package DBconnections;


import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect {
    
    public Connection getConnection(){
            Connection con=null;
            
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Weightt?zeroDateTimeBehavior=convertToNull","root","");
            
            return con;
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;

        }
         
     }
    
}
