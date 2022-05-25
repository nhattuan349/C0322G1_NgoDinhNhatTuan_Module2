package BaiLuyenTap.LuyenTap1.DanhSachNhanVien;

public class NhanVienQuanLyLt1 extends ThongTinChungL1 {
    private double luongCoBan;
    private double heSoLuong;

    public NhanVienQuanLyLt1() {
    }

    @Override
    public double getTongLuong() {
        return luongCoBan*heSoLuong;
    }

    public NhanVienQuanLyLt1(double luongCoBan, double heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NhanVienQuanLyLt1(String hoTen, String ngaySinh, String diaChi, double luongCoBan, double heSoLuong) {
        super(hoTen, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "Họ tên: " + getHoTen() +
                "Ngày sinh: " + getNgaySinh() +
                "Địa chỉ: " + getNgaySinh() +
                "Lương Cơ Bản:" + luongCoBan +
                "Hệ Số Lương=" + heSoLuong +
                "Tổng lương là: "+ getTongLuong();
    }
}
