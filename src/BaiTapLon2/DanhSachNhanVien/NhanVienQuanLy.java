package BaiTapLon2.DanhSachNhanVien;

public class NhanVienQuanLy extends Person {
    private double luongCoBan;
    private double heSoLuong;

    public NhanVienQuanLy() {
    }

    @Override
    public double getTongLuong() {
        return luongCoBan*heSoLuong;
    }

    public NhanVienQuanLy(double luongCoBan, double heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NhanVienQuanLy(String fullName, String ngaySinh, String diaChi, double luongCoBan, double heSoLuong) {
        super(fullName, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "Ho ten quan ly:" + getFullName() +
                " Ngay sinh: " + getNgaySinh() +
                " Dia chi: " + getDiaChi() +
                " Luong co ban: " + luongCoBan +
                " He so luong: " + heSoLuong+
                "Tong luong la"+getTongLuong();
    }
}
