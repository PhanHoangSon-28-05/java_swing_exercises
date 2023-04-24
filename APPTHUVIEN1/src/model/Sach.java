/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Dao.*;

/**
 *
 * @author AD
 */
public class Sach {
    private String Masach,Tensach,Theloai,Tacgia,Tinhtrang;
    private int Soluong;

    public Sach() {
    }

    public Sach(String Masach, String Tensach, String Theloai, String Tacgia, String Tinhtrang, int Soluong) {
        this.Masach = Masach;
        this.Tensach = Tensach;
        this.Theloai = Theloai;
        this.Tacgia = Tacgia;
        this.Tinhtrang = Tinhtrang;
        this.Soluong = Soluong;
    }

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String Tensach) {
        this.Tensach = Tensach;
    }

    public String getTheloai() {
        return Theloai;
    }

    public void setTheloai(String Theloai) {
        this.Theloai = Theloai;
    }

    public String getTacgia() {
        return Tacgia;
    }

    public void setTacgia(String Tacgia) {
        this.Tacgia = Tacgia;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }
    
}
