/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.DatabaseHelper;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.JTextField;
import model.Lop;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class SinhVienDao {
     public boolean insert (SinhVien sv)throws Exception{
        
     
        String sql = "INSERT INTO dbo.SinhVien(MaSinhVien,HoTen,Email,SoDT,GioiTinh,DiaChi,Hinh,NgaySinh,TinhTrang)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, sv.getMaSinhVien());
                psttm.setString(2, sv.getHoTen());
                psttm.setString(3, sv.getEmail());
                psttm.setString(4, sv.getSoDT());
                psttm.setInt(5, sv.getGioiTinh());
                psttm.setString(6, sv.getDiaChi());
                
                if(sv.getHinh() != null){
                    Blob hinh = new SerialBlob(sv.getHinh());//SerialBlob(bytes) Giá trị gắng hình
                    psttm.setBlob(7, hinh);
                }else{
                    Blob hinh = null;
                    psttm.setBlob(7, hinh); // tham số hình 
                }  
                psttm.setString(8, sv.getNgaySinh());
                
                psttm.setInt(9, sv.getTinhTrang());
                
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean update (SinhVien sv)throws Exception{
        
        String sql = "UPDATE SinhVien"
                + " SET HoTen = ?,Email = ?,SoDT = ?,GioiTinh = ?,DiaChi = ?,Hinh = ?,NgaySinh = ?, TinhTrang = ?"
                + " Where  MaSinhVien = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, sv.getHoTen());
                psttm.setString(2, sv.getEmail());
                psttm.setString(3, sv.getSoDT());
                psttm.setInt(4, sv.getGioiTinh());
                psttm.setString(5, sv.getDiaChi());
                
                if(sv.getHinh() != null){
                    Blob hinh = new SerialBlob(sv.getHinh());//SerialBlob(bytes) Giá trị gắng hình
                    psttm.setBlob(6, hinh);
                }else{
                    Blob hinh = null;
                    psttm.setBlob(6, hinh); // tham số hình 
                }  
                psttm.setString(7, sv.getNgaySinh());
                psttm.setInt(8, sv.getTinhTrang());
                
                psttm.setString(9, sv.getMaSinhVien());
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean delete (String maSinhVien)throws Exception{
        
        String sql = "Delete from SinhVien"
                + " Where  MaSinhVien = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, maSinhVien);
                
                return psttm.executeUpdate() > 0; 
            }
        }
    public SinhVien findByID (String maSinhVien)throws Exception{  
        String sql = "Select * from SinhVien"
                + " Where  MaSinhVien = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, maSinhVien);
                
                try(ResultSet rs = psttm.executeQuery()){
                    if (rs.next()) {
                        SinhVien sv = CreateSinhVien(rs);
                        return sv;
                    }
                } 
                return null;
            }
        }
    public List<SinhVien> findAll()throws Exception{
        
        String sql = "Select * from SinhVien";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                try(ResultSet rs = psttm.executeQuery()){
                    List<SinhVien> list = new ArrayList<>();
                    while (rs.next()) {
                        SinhVien sv = CreateSinhVien(rs);
                        list.add(sv);
                    }
                    return list;
                }                 
            }
        }
    public List<SinhVien> find_TinhTrang(String TinhTrang) throws Exception{
        String sql = "select * from SinhVien where TinhTrang = ?";
        
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
                ){
                psttm.setString(1, TinhTrang);
            try(ResultSet rs = psttm.executeQuery()){
                List<SinhVien> list = new ArrayList<>();
                while (rs.next()){
                    SinhVien sv = CreateSinhVien(rs);
                        list.add(sv);
                }
                return list;
            }
            
        }
    }
    //Phần Lớp
    public List<SinhVien> findByID_TenLop (String TenSinhVien, String TenLop)throws Exception{  
        String sql = "Select sv.* from SinhVien sv, Lop l "
                + " Where sv.MaSinhVien = l.MaSinhVien and HoTen = ? and TenLop = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, TenSinhVien);
                psttm.setString(2, TenLop);
                
                try(ResultSet rs = psttm.executeQuery()){
                    List<SinhVien> list = new ArrayList<>();
                    while (rs.next()) {
                        SinhVien sv = CreateSinhVien(rs);
                        list.add(sv);
                    }
                    return list;
                } 
            }
        }
    public List<SinhVien> findByTenLop (String TenLop)throws Exception{  
        String sql = "Select sv.* from SinhVien sv, Lop l "
                + " Where sv.MaSinhVien = l.MaSinhVien and  TenLop = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, TenLop);
                
                try(ResultSet rs = psttm.executeQuery()){
                    List<SinhVien> list = new ArrayList<>();
                    while (rs.next()) {
                        SinhVien sv = CreateSinhVien(rs);
                        list.add(sv);
                    }
                    return list;
                } 
            }
        }

// Tìm kiếm sinh viên
    public List<SinhVien> findByTenSinhVien (String SinhVien)throws Exception{  
        String sql = "Select * from SinhVien "
                + " Where HoTen = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, SinhVien);
                
                try(ResultSet rs = psttm.executeQuery()){
                    List<SinhVien> list = new ArrayList<>();
                    while (rs.next()) {
                        SinhVien sv = CreateSinhVien(rs);
                        list.add(sv);
                    }
                    return list;
                } 
            }
        }
    public List<SinhVien> findByMaSinhVien (String MaSinhVien)throws Exception{  
        String sql = "Select * from SinhVien "
                + " Where MaSinhVien = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, MaSinhVien);
                
                try(ResultSet rs = psttm.executeQuery()){
                    List<SinhVien> list = new ArrayList<>();
                    while (rs.next()) {
                        SinhVien sv = CreateSinhVien(rs);
                        list.add(sv);
                    }
                    return list;
                } 
            }
        }
    
    private SinhVien CreateSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(rs.getString("maSinhVien"));
        sv.setHoTen(rs.getString("HoTen"));
        sv.setNgaySinh(rs.getString("NgaySinh"));
        sv.setEmail(rs.getString("Email"));
        sv.setSoDT(rs.getString("SoDT"));
        sv.setDiaChi(rs.getString("DiaChi"));
        sv.setGioiTinh(rs.getInt("GioiTinh"));
        sv.setTinhTrang(rs.getInt("TinhTrang"));
        
        Blob blob = rs.getBlob("Hinh");
        if (blob != null)
            sv.setHinh(blob.getBytes(1, (int) blob.length()));
        return sv;
    }


}
