/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class LichSu {
    private String MaSV,NgayLuu,GhiChu;

    public LichSu() {
    }

    public LichSu(String MaSV, String NgayLuu, String GhiChu) {
        this.MaSV = MaSV;
        this.NgayLuu = NgayLuu;
        this.GhiChu = GhiChu;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getNgayLuu() {
        return NgayLuu;
    }

    public void setNgayLuu(String NgayLuu) {
        this.NgayLuu = NgayLuu;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
