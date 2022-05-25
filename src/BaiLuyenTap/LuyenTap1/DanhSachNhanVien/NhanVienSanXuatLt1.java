package BaiLuyenTap.LuyenTap1.DanhSachNhanVien;

public class NhanVienSanXuatLt1 extends ThongTinChungL1 {
    private int soSanPham;

    public NhanVienSanXuatLt1() {
    }

    @Override
    public double getTongLuong() {
        return soSanPham * 50000;
    }

    public NhanVienSanXuatLt1(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NhanVienSanXuatLt1(String hoTen, String ngaySinh, String diaChi, int soSanPham) {
        super(hoTen, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return " Họ tên:" + getHoTen() +
                "Ngày sinh: " + getNgaySinh() +
                "Địa chỉ: " + getNgaySinh() +
                "soSanPham=" + soSanPham +
                "Tổng lương là: "+ getTongLuong();
    }
}
