package BaiLuyenTap.LuyenTap1.DanhSachNhanVien;

public class NhanVienCongNhatLt1 extends ThongTinChungL1 {
    private double soNgayCong;

    public NhanVienCongNhatLt1() {
    }

    @Override
    public double getTongLuong() {
        return soNgayCong * 120000;
    }

    public NhanVienCongNhatLt1(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }


    public NhanVienCongNhatLt1(String hoTen, String ngaySinh, String diaChi, double soNgayCong) {
        super(hoTen, ngaySinh, diaChi);
        this.soNgayCong = soNgayCong;


    }

    public double getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }


    @Override
    public String toString() {
        return  " Họ tên Công Nhật: " + getHoTen() +
                " Ngày sinh: " + getNgaySinh() +
                " Địa chỉ: " + getNgaySinh() +
                " SoNgayCong: " + soNgayCong +
                " Tổng lương là: " + getTongLuong();
    }
}
