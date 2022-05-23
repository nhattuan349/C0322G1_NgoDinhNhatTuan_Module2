package BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList;

public class NhanVienSanXuat extends Person {
    private int SoSanPham;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(int soSanPham) {
        SoSanPham = soSanPham;
    }

    public NhanVienSanXuat(String hoTen, String ngaySinh, String diaChi, int soSanPham) {
        super(hoTen, ngaySinh, diaChi);
        SoSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return SoSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        SoSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "NhanVienSanXuat{" +
                "SoSanPham=" + SoSanPham +
                '}';
    }
}
