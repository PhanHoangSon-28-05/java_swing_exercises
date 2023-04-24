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
import model.Sach;

/**
 *
 * @author AD
 */
public class DocGiaDao {
    public boolean insert (DocGia docgia)throws Exception{
        String sql = "INSERT INTO dbo.DOCGIA(MaDG ,TenDG,DiaChi,Email,SDT)"
                + " VALUES(?,?,?,?,?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, docgia.getMaDG());
                psttm.setString(2, docgia.getTenDG());
                psttm.setString(3, docgia.getDiaChi());
                psttm.setString(4, docgia.getEmail());
                psttm.setString(5, docgia.getSDT());
                
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean update (DocGia docgia)throws Exception{
        
        String sql = "UPDATE DOCGIA"
                + " SET  TenDG = ?, DiaChi = ?, Email = ?, SDT = ?"
                + " Where  MaDG = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(5, docgia.getMaDG());
                psttm.setString(1, docgia.getTenDG());
                psttm.setString(2, docgia.getDiaChi());
                psttm.setString(3, docgia.getEmail());
                psttm.setString(4, docgia.getSDT());
                
                return psttm.executeUpdate() >= 0; 
            }
        }
    public boolean delete (String MaDG)throws Exception{
        
        String sql = "Delete from DOCGIA"
                + " Where  MaDG = ?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, MaDG);
                
                return psttm.executeUpdate() > 0; 
            }
        }
    public DocGia findByID (String MaDG)throws Exception{  
        String sql = "Select * from DOCGIA"
                + " Where  MaDG = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, MaDG);
                
                try(ResultSet rs = psttm.executeQuery()){
                    if (rs.next()) {
                        DocGia docgia = CreateDocGia(rs);
                        return docgia;
                    }
                } 
                return null;
            }
        }
    public List<DocGia> findAll()throws Exception{
        
        String sql = "Select * from DOCGIA";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                try(ResultSet rs = psttm.executeQuery()){
                    List<DocGia> list = new ArrayList<>();
                    while (rs.next()) {
                        DocGia docgia = CreateDocGia(rs);
                        list.add(docgia);
                    }
                    return list;
                }                 
            }
        }
    public List<DocGia> findByMaPhieu(String MaDG)throws Exception{  
        String sql = "Select * from DOCGIA "
                + " Where MaDG = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psttm = con.prepareStatement(sql);
            ){
                psttm.setString(1, MaDG);
                
                try(ResultSet rs = psttm.executeQuery()){
                    List<DocGia> list = new ArrayList<>();
                    while (rs.next()) {
                        DocGia sach = CreateDocGia(rs);
                        list.add(sach);
                    }
                    return list;
                } 
            }
        }

    private DocGia CreateDocGia(final ResultSet rs) throws SQLException {
        DocGia docgia = new DocGia();
        docgia.setMaDG(rs.getString("MaDG"));
        docgia.setTenDG(rs.getString("TenDG"));
        docgia.setEmail(rs.getString("Email"));
        docgia.setDiaChi(rs.getString("DiaChi"));
        docgia.setSDT(rs.getString("SDT"));

        return docgia;
    }
}
