package model;

public class TruongPhong extends NhanVien {

    double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getTN() {
        return this.luong + this.trachNhiem;
    }

    public void xuat() {
        super.xuat();
        System.out.printf("Trach nhiem: %.0f\n", this.getTrachNhiem());
    }

}
