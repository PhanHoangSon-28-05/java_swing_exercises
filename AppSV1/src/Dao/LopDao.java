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
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import model.Lop;
import model.SinhVien;


/**
 *
 * @author Admin
 */
public class LopDao {
    public boolean insert (Lop lop)throws Exception{
        
        String sql = "INSERT INTO dbo.Lop(MaSinhVien,TenLop)"
                + "values(?,?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, lop.getMaSinhVien());
                psttm.setString(2, lop.getTenLop());

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
    public List<Lop> findAll()throws Exception{
        
        String sql = "Select * from Lop";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                try(ResultSet rs = psttm.executeQuery()){
                    List<Lop> list = new ArrayList<>();
                    while (rs.next()) {
                        Lop lop = new Lop();
                        lop.setMaSinhVien(rs.getString("maSinhVien"));
                        lop.setTenLop(rs.getString("TenLop"));
                        list.add(lop);
                    }
                    return list;
                }                 
            }
        }

    public Lop findByMaSinhVien (String maSinhVien)throws Exception{         
        String sql = "Select * from Lop WHERE  MaSinhVien = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
                psttm.setString(1, maSinhVien);
              
                try(ResultSet rs = psttm.executeQuery();){
                    if (rs.next()) {
                        Lop lop = new Lop();
                        lop.setMaSinhVien(rs.getString("maSinhVien"));
                        lop.setTenLop(rs.getString("TenLop"));
                        
                        return lop;
                    }
                }
                return null;
            }
        }
}
