/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

/**
 *
 * @author Admin
 */
public class SinhVien {
        private String ID;
        private String HoTen;
        private String Email;
        private String GioiTinh;
        private String TinhTrang;

    public SinhVien() {
    }

    public SinhVien(String ID, String HoTen, String Email, String GioiTinh, String TinhTrang) {
        this.ID = ID;
        this.HoTen = HoTen;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.TinhTrang = TinhTrang;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
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
        
}
