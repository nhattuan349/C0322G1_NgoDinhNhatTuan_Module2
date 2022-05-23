package BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList;

public class NhanVienQuanLy extends Person {
    private double LuongCoban;
    private double HeSoLuong;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(double luongCoban, double heSoLuong) {
        LuongCoban = luongCoban;
        HeSoLuong = heSoLuong;
    }

    public NhanVienQuanLy(String hoTen, String ngaySinh, String diaChi, double luongCoban, double heSoLuong) {
        super(hoTen, ngaySinh, diaChi);
        LuongCoban = luongCoban;
        HeSoLuong = heSoLuong;
    }

    public double getLuongCoban() {
        return LuongCoban;
    }

    public void setLuongCoban(double luongCoban) {
        LuongCoban = luongCoban;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        HeSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy{" +
                "LuongCoban=" + LuongCoban +
                ", HeSoLuong=" + HeSoLuong +
                '}';
    }
}
