/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.DatabaseHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;
import model.BangDiem;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class BangDiemDao {
    public boolean insert (BangDiem bd)throws Exception{        
        String sql = "INSERT INTO dbo.BangDiem(MaSinhVien,Java,SQL,PhanTichHeThong,Ios,Php)"
                + "values(?,?,?,?,?,?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, bd.getMaSinhVien());
                psttm.setFloat(2, bd.getJava());
                psttm.setFloat(3, bd.getSQL());
                psttm.setFloat(4, bd.getPhanTichHeThong());
                psttm.setFloat(5, bd.getIos());
                psttm.setFloat(6, bd.getPhp());
                
              
                return psttm.executeUpdate() > 0; 
            }
        }
     public boolean update (BangDiem bd)throws Exception{         
        String sql = "UPDATE dbo.BangDiem"
                + " SET Java = ?,SQL = ?,PhanTichHeThong = ?,Ios = ?,Php = ? "
                + "WHERE  MaSinhVien = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
                psttm.setFloat(1, bd.getJava());
                psttm.setFloat(2, bd.getSQL());
                psttm.setFloat(3, bd.getPhanTichHeThong());
                psttm.setFloat(4, bd.getIos());
                psttm.setFloat(5, bd.getPhp());
                psttm.setString(6, bd.getMaSinhVien());
              
                return psttm.executeUpdate() > 0; 
            }
        }
     public boolean deleteByMaSinhVien (String maSinhVien)throws Exception{         
        String sql = "Delete from BangDiem "
                + "WHERE  MaSinhVien = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
                psttm.setString(1, maSinhVien);
              
                return psttm.executeUpdate() > 0; 
            }
        }
     public BangDiem findByMaSinhVien (String maSinhVien)throws Exception{         
        String sql = "Select * from BangDiem WHERE  MaSinhVien = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
                psttm.setString(1, maSinhVien);
              
                try(ResultSet rs = psttm.executeQuery();){
                    if (rs.next()) {
                        BangDiem bd = new BangDiem();
                        bd.setMaSinhVien(rs.getString("Ma"));
                        bd.setMaSinhVien(rs.getString("MaSinhVien"));
                        bd.setJava(rs.getFloat("Java"));
                        bd.setSQL(rs.getFloat("SQL"));
                        bd.setPhanTichHeThong(rs.getFloat("PhanTichHeThong"));
                        bd.setIos(rs.getFloat("Ios"));
                        bd.setPhp(rs.getFloat("PHP"));
                        
                        return bd;
                    }
                }
                return null;
            }
        }
     public List<BangDiem> findAll ()throws Exception{         
        String sql = "Select * from BangDiem";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
              
                try(ResultSet rs = psttm.executeQuery();){
                    List<BangDiem> list = new ArrayList<>();
                    while (rs.next()) {
                        CreateBangDiem(rs, list);
                    }
                    return list;
                }
            }
        }

    private void CreateBangDiem(final ResultSet rs, List<BangDiem> list) throws SQLException {
        BangDiem bd = new BangDiem();
        bd.setMaSinhVien(rs.getString("Ma"));
        bd.setMaSinhVien(rs.getString("MaSinhVien"));
        bd.setJava(rs.getFloat("Java"));
        bd.setSQL(rs.getFloat("SQL"));
        bd.setPhanTichHeThong(rs.getFloat("PhanTichHeThong"));
        bd.setIos(rs.getFloat("Ios"));
        bd.setPhp(rs.getFloat("PHP"));
        list.add(bd);
    }
     public List<BangDiem> findTop(int Top)throws Exception{         
        String sql = String.format("Select top %d *,(Java + SQL + PhanTichHeThong + Ios + Php)/5 as 'DTB'"
                + " from BangDiem order by DTB desc", Top);

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){ 
              
                try(ResultSet rs = psttm.executeQuery();){
                    List<BangDiem> list = new ArrayList<>();
                    while (rs.next()) {
                        CreateBangDiem(rs, list);         
                    }
                    return list;
                }
            }
        }

}
