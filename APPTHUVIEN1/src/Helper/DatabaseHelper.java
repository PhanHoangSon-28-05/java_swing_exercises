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
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLTV;";
        Connection conn = DriverManager.getConnection(url, "sa", "sa");
        return conn;
    }
    public static void main(String[] args) throws Exception {
        openConnection();
    }
}
