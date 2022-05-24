package BaiTapLon.DanhSachNhanVien;

public class NhanVienCongNhat extends Person{
    private double soNgayCong;

    public NhanVienCongNhat() {
    }

    @Override
    public double getTongLuong() {
        return soNgayCong*120000;
    }

    public NhanVienCongNhat(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public NhanVienCongNhat(String fullName, String ngaySinh, String diaChi, double soNgayCong) {
        super(fullName, ngaySinh, diaChi);
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
        return "Nhan vien cong nhat co ten la: "+ getFullName()+
                " Ngay sinh: "+getNgaySinh()+
                " Dia chi: "+getDiaChi()+
                " So ngay cong: "+soNgayCong+
                "Tong luong la"+getTongLuong();
    }
}
