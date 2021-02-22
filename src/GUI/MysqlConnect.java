/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author drilz
 */
// connection for the database, added in all forms to allow access to database
public class MysqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");      //The name of the sql driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bapers_database","root","rpgdragon"); //Need root username and password to access database
            // JOptionPane.showMessageDialog(null, "Connected to database!");    //Message dialog for successfull connection
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
