
package Interface;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnect {

    public static Connection connect()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?","root","root");
            JOptionPane.showConfirmDialog(null,"connect to data base");

        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("inter.DBConnect.connect()");
            //JOptionPane.showConfirmDialog(null,e);
        }
       return con;
    }
    
    
}
