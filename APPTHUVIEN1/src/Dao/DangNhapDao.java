/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DangNhap;

/**
 *
 * @author AD
 */
public class DangNhapDao {
    public DangNhap checkLogin(String TenDangNhap,String MatKhau, String MatKhauLai)throws Exception{
        String sql = "select Username, Pass, Confirm from ACCOUNT"
                    + " Where Username = ? and Pass = ? and Confirm = ?";
        //select Username, Pass, Confirm from ACCOUNT Where Username = 'admin' and Pass = '1234' and Confirm = '1234'

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, TenDangNhap);
                psttm.setString(2, MatKhau);
                psttm.setString(3, MatKhauLai);
                try(ResultSet rs = psttm.executeQuery();){
                    if (rs.next()) {
                        DangNhap nd = new DangNhap();
                        nd.setUsername(TenDangNhap);
//                        nd.setMaKhau(MatKhau);    
                        return nd;
                    }
                  
              }
            
            } catch (Exception e) {
        }
        return null;
    }
}
