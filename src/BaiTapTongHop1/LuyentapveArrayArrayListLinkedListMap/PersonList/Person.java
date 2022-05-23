package BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList;

public class Person {
    private String HoTen;
    private String NgaySinh;
    private String DiaChi;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi) {
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "HoTen='" + HoTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
}
