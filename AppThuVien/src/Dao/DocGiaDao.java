/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author AD
 */
public class DocGiaDao {
    private String MaDG ,TenDG,DiaChi,Email,SDT;

    public DocGiaDao() {
    }

    public DocGiaDao(String MaDG, String TenDG, String DiaChi, String Email, String SDT) {
        this.MaDG = MaDG;
        this.TenDG = TenDG;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.SDT = SDT;
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getTenDG() {
        return TenDG;
    }

    public void setTenDG(String TenDG) {
        this.TenDG = TenDG;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
