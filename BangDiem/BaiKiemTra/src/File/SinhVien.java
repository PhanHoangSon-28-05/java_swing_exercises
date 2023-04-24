/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable{
    private String MaSV;
    private String HoTenSV;
    private String Email;
    private String GioiTinh;
    private String TinhTrang;


    public SinhVien(String MaSV, String HoTenSV, String Email, String GioiTinh, String TinhTrang) {
        this.MaSV = MaSV;
        this.HoTenSV = HoTenSV;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.TinhTrang = TinhTrang;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTenSV() {
        return HoTenSV;
    }

    public void setHoTenSV(String HoTenSV) {
        this.HoTenSV = HoTenSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    public String ToString(){
        return MaSV + " " + HoTenSV + " " + Email + " " + GioiTinh + " " + TinhTrang;
    }
}
