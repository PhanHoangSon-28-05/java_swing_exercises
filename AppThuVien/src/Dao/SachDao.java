/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.DatabaseHelper;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import model.Sach;

/**
 *
 * @author AD
 */
public class SachDao {
    public boolean insert (Sach sach)throws Exception{
        String sql = "INSERT INTO dbo.SACH(Masach,Tensach,Theloai,Tacgia,Soluong,Tinhtrang)"
                + " VALUES(?,?,?,?,?,?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, sach.getMasach());
                psttm.setString(2, sach.getTensach());
                psttm.setString(3, sach.getTheloai());
                psttm.setString(4, sach.getTacgia());
                psttm.setInt(5, sach.getSoluong());
                psttm.setString(6, sach.getTinhtrang());
 
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean update (Sach sach)throws Exception{
        
        String sql = "UPDATE SACH"
                + " SET Masach = ?, Tensach = ?, Theloai = ?, Tacgia = ?, Soluong = ?, Tinhtrang = ?"
                + " Where  MaSinhVien = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, sach.getMasach());
                psttm.setString(2, sach.getTensach());
                psttm.setString(3, sach.getTheloai());
                psttm.setString(4, sach.getTacgia());
                psttm.setInt(5, sach.getSoluong());
                psttm.setString(6, sach.getTinhtrang());
                
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean delete (String maSach)throws Exception{
        
        String sql = "Delete from SACH"
                + " Where  Masach = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, maSach);
                
                return psttm.executeUpdate() > 0; 
            }
        }
    public Sach findByID (String maSach)throws Exception{  
        String sql = "Select * from Sach"
                + " Where  MaSinhVien = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, maSach);
                
                try(ResultSet rs = psttm.executeQuery()){
                    if (rs.next()) {
                        Sach sach = CreateSach(rs);
                        return sach;
                    }
                } 
                return null;
            }
        }
    public List<Sach> findAll()throws Exception{
        
        String sql = "Select * from Sach";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                try(ResultSet rs = psttm.executeQuery()){
                    List<Sach> list = new ArrayList<>();
                    while (rs.next()) {
                        Sach sach = CreateSach(rs);
                        list.add(sach);
                    }
                    return list;
                }                 
            }
        }

    private Sach CreateSach(final ResultSet rs) throws SQLException {
        Sach sach = new Sach();
        sach.setMasach(rs.getString("Masach"));
        sach.setTensach(rs.getString("Tensach"));
        sach.setTheloai(rs.getString("Theloai"));
        sach.setTacgia(rs.getString("Tacgia"));
        sach.setSoluong(rs.getInt("Soluong"));
        sach.setTinhtrang(rs.getString("Tinhtrang"));
        return sach;
    }
    
}
