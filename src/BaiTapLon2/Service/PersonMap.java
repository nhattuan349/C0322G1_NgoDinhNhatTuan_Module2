package BaiTapLon2.Service;

import BaiTapLon.DanhSachNhanVien.NhanVienCongNhat;
import BaiTapLon.DanhSachNhanVien.NhanVienQuanLy;
import BaiTapLon.DanhSachNhanVien.NhanVienSanXuat;
import BaiTapLon.DanhSachNhanVien.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class PersonMap implements ServiceAll {

    static Map<Integer, Person> map = new LinkedHashMap<>();

    static {
        map.put(1, new NhanVienCongNhat("A", "01/01/1999", "SonLa", 12));
        map.put(2, new NhanVienQuanLy("B", "01/02/1998", "CaoBang", 12000000, 3.4));
        map.put(3, new NhanVienSanXuat("B", "01/02/1998", "CaoBang", 5));
    }

    @Override
    public void display() {
        for (Integer item : map.keySet()) {
            System.out.println(map.get(item));
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
