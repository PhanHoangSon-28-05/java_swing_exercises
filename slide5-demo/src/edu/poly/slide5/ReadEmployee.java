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
public class ReadEmployee {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl =  "jdbc:sqlserver://localhost;database=DemoDB";
        String username = "sa";
        String password = "sa";
        Connection con = DriverManager.getConnection(connectionUrl,username,password);
        Statement stmt = con.createStatement();// Tạo ra đối tượng statemet
        String sql = "Select * from Employee";
        ResultSet rs = stmt.executeQuery(sql);// Lấy tâp kết lưu trong resultSet
        if(rs.next()){//di chuyển đến bảng ghi đầu tiên rồi tiếp tục next là bảng dòng 2, tiếp tục.. đến không còn giá trị là false
            System.err.println("ID: " + rs.getInt("ID"));//rs.getInt(1) có thể để theo số cột nếu nắm chắc 
            System.err.println("First: " + rs.getString("first") + " Last: " + rs.getString("last"));
            System.err.println("Age " + rs.getInt("age"));
        }
        
        while(rs.next()){
            int id = rs.getInt("ID");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");
            
            System.err.println("ID: " + id);
            System.err.println("Họ và tên: " + last + " "+ first);
            System.err.println("Age: " + age + "\n");
            
        }
        
        
        rs.close();// lưu ý cần phải đống keeys nối
        stmt.close();
        con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
