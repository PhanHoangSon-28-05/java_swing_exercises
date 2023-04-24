/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class BangDiem {
    private int ma;
    private String MaSinhVien;
    private float Java,SQL,PhanTichHeThong,Ios,Php;

    public BangDiem() {
    }

    public BangDiem(int ma, String MaSinhVien, float Java, float SQL, float PhanTichHeThong, float Ios, float Php) {
        this.ma = ma;
        this.MaSinhVien = MaSinhVien;
        this.Java = Java;
        this.SQL = SQL;
        this.PhanTichHeThong = PhanTichHeThong;
        this.Ios = Ios;
        this.Php = Php;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public float getJava() {
        return Java;
    }

    public void setJava(float Java) {
        this.Java = Java;
    }

    public float getSQL() {
        return SQL;
    }

    public void setSQL(float SQL) {
        this.SQL = SQL;
    }

    public float getPhanTichHeThong() {
        return PhanTichHeThong;
    }

    public void setPhanTichHeThong(float PhanTichHeThong) {
        this.PhanTichHeThong = PhanTichHeThong;
    }

    public float getIos() {
        return Ios;
    }

    public void setIos(float Ios) {
        this.Ios = Ios;
    }

    public float getPhp() {
        return Php;
    }

    public void setPhp(float Php) {
        this.Php = Php;
    }
    
    
}
