/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DocGia;
import model.MuonSach;

/**
 *
 * @author AD
 */
public class MuonSachDao {
    public boolean insert (MuonSach ms)throws Exception{
        String sql = "INSERT INTO dbo.PhieuMuon(Maphieu,Masach,MaDG,NgayMuon)"
                + " VALUES(?,?,?,?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, ms.getMaphieu());
                psttm.setString(2, ms.getMasach());
                psttm.setString(3, ms.getMaDG());
                psttm.setString(4, ms.getNgayMuon());
                
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean update (MuonSach ms)throws Exception{
        
        String sql = "UPDATE PhieuMuon"
                + " SET  Masach = ?, MaDG = ?, NgayMuon = ?"
                + " Where  Maphieu = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(4, ms.getMaphieu());
                psttm.setString(1, ms.getMasach());
                psttm.setString(2, ms.getMaDG());
                psttm.setString(3, ms.getNgayMuon());
                
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean delete (String Maphieu)throws Exception{
        
        String sql = "Delete from PhieuMuon"
                + " Where  Maphieu = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, Maphieu);
                
                return psttm.executeUpdate() > 0; 
            }
        }
    public MuonSach findByID (String Maphieu)throws Exception{  
        String sql = "Select * from PhieuMuon"
                + " Where  Maphieu = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, Maphieu);
                
                try(ResultSet rs = psttm.executeQuery()){
                    if (rs.next()) {
                        MuonSach muonsach = CreateMuonSach(rs);
                        return muonsach;
                    }
                } 
                return null;
            }
        }
    public List<MuonSach> findAll()throws Exception{
        
        String sql = "Select * from PhieuMuon";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                try(ResultSet rs = psttm.executeQuery()){
                    List<MuonSach> list = new ArrayList<>();
                    while (rs.next()) {
                        MuonSach muonsach = CreateMuonSach(rs);
                        list.add(muonsach);
                    }
                    return list;
                }                 
            }
        }
    public List<MuonSach> findByMaPhieu(String Maphieu)throws Exception{  
        String sql = "Select * from PhieuMuon "
                + " Where Maphieu = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, Maphieu);
                
                try(ResultSet rs = psttm.executeQuery()){
                    List<MuonSach> list = new ArrayList<>();
                    while (rs.next()) {
                        MuonSach sach = CreateMuonSach(rs);
                        list.add(sach);
                    }
                    return list;
                } 
            }
        }

    private MuonSach CreateMuonSach(final ResultSet rs) throws SQLException {
        MuonSach ms = new MuonSach();
        ms.setMaphieu(rs.getString("Maphieu"));
        ms.setMasach(rs.getString("Masach"));
        ms.setMaDG(rs.getString("MaDG"));
        ms.setNgayMuon(rs.getString("NgayMuon"));

        return ms;
    }
}
