/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide5;

import java.sql.*;
/**
 *
 * @author Admin
 */
public class DeleteEmployee1 {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl =  "jdbc:sqlserver://localhost;database=DemoDB";
        String username = "sa";
        String password = "sa";
        Connection con = DriverManager.getConnection(connectionUrl,username,password);
        Statement stmt = con.createStatement();// Tạo ra đối tượng statemet
        String sql = "Delete from Employee where ID = 2";
        int affectedRows =  stmt.executeUpdate(sql);
        
            System.err.println("" + affectedRows + " deleted");
        
        String sql1 = "Select * from Employee";
        ResultSet rs = stmt.executeQuery(sql1);
        while(rs.next()){
            int ID = rs.getInt("ID");
            int age = rs. getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");
            
            System.out.println(String.format("ID: %d, Họ và tên: %s %s, Tuổi: %d", ID,first, last, age));
        }
        
        
        rs.close();// lưu ý cần phải đống keeys nối
        stmt.close();
        con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
