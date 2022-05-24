package BaiTapLon.DanhSachNhanVien;

public class NhanVienSanXuat extends Person{
    private int soSanPham;

    public NhanVienSanXuat() {
    }

    @Override
    public double getTongLuong() {
        return soSanPham*50000;
    }

    public NhanVienSanXuat(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NhanVienSanXuat(String fullName, String ngaySinh, String diaChi, int soSanPham) {
        super(fullName, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "Ho ten nhan vien san xuat:" + getFullName() +
                " Ngay sinh: " + getNgaySinh() +
                " Dia chi: " + getDiaChi() +
                " So san pham: " + soSanPham+
                "Tong luong la"+getTongLuong();
    }
}
