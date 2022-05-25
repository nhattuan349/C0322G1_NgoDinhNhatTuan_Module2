package BaiLuyenTap.LuyenTap1.DanhSachNhanVien;

public abstract class ThongTinChungL1 {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public ThongTinChungL1() {
    }

    public ThongTinChungL1(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract double getTongLuong();
    @Override
    public String toString() {
        return "ThongTinChungL1{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
