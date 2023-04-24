/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlSever;

import java.sql.*;

/**
 *
 * @author SonHeo
 */
public class NewClass {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=demo;";
        Connection conn = DriverManager.getConnection(url, "sa", "sa");
        Statement sttm = conn.createStatement();

        if (conn != null) {
            System.err.println("Thanh cong");

        } else {
            System.err.println("Khong Thanh cong");

        }

    }
}
