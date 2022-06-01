package BaiTapLon2.DanhSachNhanVien;

public abstract class Person {
    private String fullName;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String fullName, String ngaySinh, String diaChi) {
        this.fullName = fullName;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
