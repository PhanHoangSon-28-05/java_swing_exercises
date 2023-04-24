package model;

public abstract class NhanVien {

    protected String maNV;
    protected String hoTen;
    protected double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public abstract double getTN();

    public double getThueTN() {
        if (this.getTN() < 9000000) {
            return 0;
        } else if (this.getTN() < 15000000) {
            return 0 + (this.getTN() - 9000000) * 0.1;
        } else {
            return 0 + 6000000 * 0.1 + (this.getTN() - 15000000) * 0.12;
        }
    }

    public void xuat() {
        System.out.printf("MaNV: %s, Hoten: %s, Luong: %.0f, "
                + "Thu nhap: %.0f, ThueTN: %.0f",
                this.getMaNV(), this.getHoTen(), this.getLuong(),
                this.getTN(), this.getThueTN());
    }
}
