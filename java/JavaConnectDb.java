/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Aditya
 */
public class JavaConnectDb {
    
    public static Connection ConnectDb()
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(url,"SYSTEM","mathias");
            return con;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    return null;
    }
}
