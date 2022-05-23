package BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList;

public class NhanVienCongNhat extends Person {
    private double SoNgayCong;

    public NhanVienCongNhat() {
    }

    public NhanVienCongNhat(double soNgayCong) {
        SoNgayCong = soNgayCong;
    }

    public NhanVienCongNhat(String hoTen, String ngaySinh, String diaChi, double soNgayCong) {
        super(hoTen, ngaySinh, diaChi);
        SoNgayCong = soNgayCong;
    }

    public double getSoNgayCong() {
        return SoNgayCong;
    }

    public void setSoNgayCong(double soNgayCong) {
        SoNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
        return "NhanVienCongNhat{" +
                "SoNgayCong=" + SoNgayCong +
                '}';
    }
}
