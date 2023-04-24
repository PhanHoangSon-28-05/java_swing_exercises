/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.LichSu;

/**
 *
 * @author Admin
 */
public class LichSuDao {
    //Sinh Viên
    public List<LichSu> findAll_SV ()throws Exception{         
        String sql = "Select * from LichSuSinhVien order by ThoiGian desc";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
              
                try(ResultSet rs = psttm.executeQuery();){
                    List<LichSu> list = new ArrayList<>();
                    while (rs.next()) {
                        
                        LichSu LS = new LichSu();
                        LS.setMaSV(rs.getString("MaSinhVien"));
                        LS.setNgayLuu(rs.getString("ThoiGian"));
                        LS.setGhiChu(rs.getString("GhiChu"));
                        list.add(LS);
                    }
                    return list;
                }
            }
        }
    public boolean insert_SV (LichSu LS)throws Exception{        
        String sql = "INSERT INTO dbo.LichSuSinhVien(MaSinhVien,ThoiGian,GhiChu)"
                + " values(?,GETDATE(),?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, LS.getMaSV());
                
                psttm.setString(2, LS.getGhiChu());
                
              
                return psttm.executeUpdate() > 0; 
            }
        }
    //Điểm
    public List<LichSu> findAll_Diem ()throws Exception{         
        String sql = "Select * from LichSuDiem order by ThoiGian desc";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
              
                try(ResultSet rs = psttm.executeQuery();){
                    List<LichSu> list = new ArrayList<>();
                    while (rs.next()) {
                        
                        LichSu LS = new LichSu();
                        LS.setMaSV(rs.getString("MaSinhVien"));
                        LS.setNgayLuu(rs.getString("ThoiGian"));
                        LS.setGhiChu(rs.getString("GhiChu"));
                        list.add(LS);
                    }
                    return list;
                }
            }
        }
    public boolean insert_Diem (LichSu LS)throws Exception{        
        String sql = "INSERT INTO dbo.LichSuDiem(MaSinhVien,ThoiGian,GhiChu)"
                + " values(?,GETDATE(),?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, LS.getMaSV());
                
                psttm.setString(2, LS.getGhiChu());
                
              
                return psttm.executeUpdate() > 0; 
            }
        }
    // Class
    public List<LichSu> findAll_Class ()throws Exception{         
        String sql = "Select * from LichSuLop  order by ThoiGian desc";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
              
                try(ResultSet rs = psttm.executeQuery();){
                    List<LichSu> list = new ArrayList<>();
                    while (rs.next()) {
                        
                        LichSu LS = new LichSu();
                        LS.setMaSV(rs.getString("MaSinhVien"));
                        LS.setNgayLuu(rs.getString("ThoiGian"));
                        LS.setGhiChu(rs.getString("GhiChu"));
                        list.add(LS);
                    }
                    return list;
                }
            }
        }
    public boolean insert_Class (LichSu LS)throws Exception{        
        String sql = "INSERT INTO dbo.LichSuLop(MaSinhVien,ThoiGian,GhiChu)"
                + " values(?,GETDATE(),?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, LS.getMaSV());
                
                psttm.setString(2, LS.getGhiChu());
                
              
                return psttm.executeUpdate() > 0; 
            }
        }
}
