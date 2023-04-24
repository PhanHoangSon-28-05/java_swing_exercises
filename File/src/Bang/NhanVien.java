/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bang;

import java.io.Serializable;// chu y cai thu vien 
/**
 *
 * @author SonHeo
 */
public class NhanVien implements Serializable{
    private String Manv;
    private String Hoten;
    private String Email;
    private String Gioitinh;
    private String Tinhtrang;

    public NhanVien(String Manv, String Hoten, String Email, String Gioitinh, String Tinhtrang) {
        this.Manv = Manv;
        this.Hoten = Hoten;
        this.Email = Email;
        this.Gioitinh = Gioitinh;
        this.Tinhtrang = Tinhtrang;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    private String ToString(){
        return (Manv+" "+Hoten+" "+Email+" "+Gioitinh+" "+Tinhtrang);
    }
}
