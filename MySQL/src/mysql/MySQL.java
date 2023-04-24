/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysql;
 import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author AD
 */
// hàm kết nối
public class MySQL {
    public static Connection getJBCConnetion(){
        
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root"; //root
        String password = "123456789"; // mk trong my sql worbench
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }
    
    //Đăng nhập
    public boolean logic(String username, String password ){
        
        Connection conn = getJBCConnetion();
        
        String sql = "SELECT * FROM accuont WHERE username = ? and password = ?";// học thuộc chú viết đừng từng cột bạn muốn lấy thông tin
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){// nghĩ có dữ liệu mới next được
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        return false;
    }
    //Đăng ký
    public void register (Accccount accuont){// khởi tạo account
        Connection conn = getJBCConnetion();
        
        String sql = "INSERT INTO accuont(username, password, fullname, address) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accuont.getUsername());
            ps.setString(2, accuont.getPassword());
            ps.setString(3, accuont.getFullname());
            ps.setString(4, accuont.getAddress());
            
            int rs = ps.executeUpdate();
            
            if(rs != 0){
                System.out.println("Them thanh cong");
            }else{
                System.out.println("Them that bai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        Connection con = getJBCConnetion();
        if ( con != null){
            System.out.println("Thanh cong");
        }else{
            System.out.println("Khong thanh cong");
        }
    }
}
