/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Contraller;

import com.model.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SonHeo
 */
public class QLNhanVien {

    static Connection conn = null;
    static ArrayList<NhanVien> dsnv = new ArrayList<>();

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=demo;";
        conn = DriverManager.getConnection(url, "sa", "sa");
        if(conn != null){
           System.err.println("Thanh cong");
        }else{
            System.out.println("Khong thanh cong");
        }
      menu();
    }

    private static void menu() throws SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.err.println("1. Load danh sach");
            System.err.println("2. Tim kiem theo ma");
            System.err.println("3. Xoa theo ma");
            System.err.println("4. Cap nhap theo ma");
            System.err.println("0. Thoat");

            System.err.print("Ban chon chuc nang nao: ");
            int chon = sc.nextInt();
            System.out.println(chon);
            switch (chon) {
               
                case 1: {
                    loadDS();
                    inDS();
                    break;
                }
                case 2: {
                    timNV();
                    break;
                }
                case 3: {
                    xoaNV();
                    break;
                }
                case 4: {
                    CapNhapNV();
                    break;
                }
                case 0: {
                    return;
                }
                default:
                    System.out.println("Ban da nhao sai");
            }
        }
    }

    private static void loadDS() throws SQLException {
        dsnv.clear();
        Statement sttm = conn.createStatement();

        String s = "select * from embloy";
        ResultSet rs = sttm.executeQuery(s);

        while (rs.next()) {
            String id = rs.getString("id");
            String first = rs.getString("first");
            String last = rs.getString("last");
            int age = rs.getInt("age");

//            System.out.printf("id: %s, first: %s, last: %s, age: %d\n",
//                    id, first, last, age);

            dsnv.add(new NhanVien(id, first, last, age));
        }
        rs.close();
        sttm.close();
    }

    private static void inDS() {
        for (NhanVien nhanVien : dsnv) {
     System.out.println(nhanVien);
        }
    }

    private static void timNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id can tim: ");
        String id = sc.nextLine();
        int count = 0;

        for (NhanVien nhanVien : dsnv) {
            if (nhanVien.getId().equalsIgnoreCase(id)) {
                System.out.println("Thong tin nhan vien duoc tim thay: ");
                System.out.println(nhanVien);
                count += 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khon cos nhan vien nao tim thay");
        }
    }

    private static void xoaNV() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id can xoa: ");
        String id = sc.nextLine();
        int count = 0;

        for (NhanVien nhanVien : dsnv) {
            if (nhanVien.getId().equalsIgnoreCase(id)) {
                System.out.println("Thong tin nhan vien duoc tim thay: ");
                System.out.println(nhanVien);
                count += 1;
                dsnv.remove(nhanVien);

//                String sql = String.format("Delete from embloy where id = '%s'", id);
//                Statement sttm = conn.createStatement();
//                int r = sttm.executeUpdate(sql);
//                System.out.println("Da xoa " + r + " nhan vien");
            conn.setAutoCommit(false);
            String sql = "Delete from embloy where id = ?";
                PreparedStatement psttm = conn.prepareStatement(sql);
                psttm.setString(1, id);
                int rows = psttm.executeUpdate();
                System.err.printf("Update %d row\n", rows);
                conn.commit();
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khon cos nhan vien nao tim thay");
        }
    }

    private static void CapNhapNV() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id can cap nhap: ");
        String id = sc.nextLine();
        System.out.println("Ban muon sua bao nhieu tuoi: ");
        int age = sc.nextInt();
        int count = 0;

        for (NhanVien nhanVien : dsnv) {
            if (nhanVien.getId().equalsIgnoreCase(id)) {
                System.out.println("Thong tin nhan vien duoc tim thay: ");
                System.out.println(nhanVien);
                count += 1;

                  
//                String sql = String.format("update embloy set age = %d, where id = %s", age, id);
//                Statement sttm = conn.createStatement();
//                int r = sttm.executeUpdate(sql);
//                System.out.println("Da cap nhap tuoi " + r + " nhan vien");
            conn.setAutoCommit(false);
            String sql = "update embloy set age = ? where id = ?";
                PreparedStatement psttm = conn.prepareStatement(sql);
                psttm.setInt(1, age);
                psttm.setString(2, id);
                int rows = psttm.executeUpdate();
                System.err.printf("Update %d row\n", rows);
                conn.commit();
            
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khon cos nhan vien nao tim thay");
        }
    }
}
