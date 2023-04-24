/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.DatabaseHelper;
import java.sql.*;
import model.NguoiDung;


/**
 *
 * @author Admin
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String TenDangNhap,String MatKhau)throws Exception{
        String sql = "select TenDangNhap, MatKhau, VaiTro from NguoiDung"
                    + " Where TenDangNhap = ? and MatKhau = ?";
        //select[TenDangNhap], [MatKhau],[VaiTro]from[dbo].[NguoiDung]where [TenDangNhap] = 'admin' and [MatKhau] = '12345'

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, TenDangNhap);
                psttm.setString(2, MatKhau);
                try(ResultSet rs = psttm.executeQuery();){
                    if (rs.next()) {
                        NguoiDung nd = new NguoiDung();
                        nd.setTenDangNhap(TenDangNhap);
//                        nd.setMaKhau(MatKhau);
                        nd.setVaiTro(rs.getString("VaiTro"));
                        return nd;
                    }
                  
              }
            
            } catch (Exception e) {
        }
        return null;
    }
    
}
