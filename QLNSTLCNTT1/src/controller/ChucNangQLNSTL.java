
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.HanhChinh;
import model.NhanVien;
import model.TiepThi;
import model.TruongPhong;

public class ChucNangQLNSTL {
    ArrayList<NhanVien> dsnv = new ArrayList<>();
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ban nhap NVHC (1), NVTT (2) hay TP(3): ");
        int chon = Integer.parseInt(sc.nextLine());
        
        if (chon < 1 || chon > 3) {
            System.out.println("Ban chon sai");
        } else {
            System.out.print("Nhap ma nhan vien: ");
            String maNV = sc.nextLine();
            
            System.out.print("Nhap ten nhan vien: ");
            String tenNV = sc.nextLine();
            
            System.out.print("Nhap luong nhan vien: ");
            double luong = Double.parseDouble(sc.nextLine());
            
            if (chon == 1) {
                dsnv.add(new HanhChinh(maNV, tenNV, luong));
            } else if (chon == 2) {
                System.out.print("Nhap soanh so: ");
                double doanhSo = Double.parseDouble(sc.nextLine());
                
                dsnv.add(new TiepThi(doanhSo, maNV, tenNV, luong));
            } else {
                System.out.print("Nhap trach nhiem: ");
                double trachNhiem = Double.parseDouble(sc.nextLine());
                
                dsnv.add(new TruongPhong(trachNhiem, maNV, tenNV, luong));
            }
        }
    }
    
    public void xuat() {
        for (NhanVien nhanVien : dsnv) {
            nhanVien.xuat();
        }
    }
    
    public NhanVien timNV(String maNV) {
        NhanVien nv = null;
        
        
        
        return nv;
    }
    
    public void xoaNV(String maNV) {
        
    }
    
    public void suaTTNV(String maNV) {
        
    }
    
    public void sapXepHT() {
        
    }
    
    public void sapXepTN() {
        
    }
    
    public void timNVKhoangLuong(double minL, double maxL) {
        
    }
    
    public void top5TN() {
        
    }
}
