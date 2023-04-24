
package model;

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hueHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = 0.2 * this.doanhSo;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public double getTN() {
        return this.luong + this.hueHong;
    }
    
    public void xuat() {
        super.xuat();
        System.out.printf("Doanh so: %.0f, Hue hong: %.0f\n", 
                this.getDoanhSo(), this.getHueHong());
    }
}
