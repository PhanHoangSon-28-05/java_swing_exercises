/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author AD
 */
public class MuonSachDao {
    private String Maphieu,Masach,MaDG,NgayMuon;

    public MuonSachDao() {
    }

    public MuonSachDao(String Maphieu, String Masach, String MaDG, String NgayMuon) {
        this.Maphieu = Maphieu;
        this.Masach = Masach;
        this.MaDG = MaDG;
        this.NgayMuon = NgayMuon;
    }

    public String getMaphieu() {
        return Maphieu;
    }

    public void setMaphieu(String Maphieu) {
        this.Maphieu = Maphieu;
    }

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }
    
}
