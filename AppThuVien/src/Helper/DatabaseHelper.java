/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DatabaseHelper {
    public  static  Connection openConnection() throws  Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl =  "jdbc:sqlserver://localhost;database=QLTV";
        String username = "sa";
        String password = "sa";
        Connection con = DriverManager.getConnection(connectionUrl,username,password);
        return con;
    }
    
}
