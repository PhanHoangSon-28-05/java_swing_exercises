
package model;

public class HanhChinh extends NhanVien {

    public HanhChinh() {
    }

    public HanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
    }
    
    
    public void xuat() {
        super.xuat();
    }
    

    @Override
    public double getTN() {
        return luong;
    }
    
    
}
