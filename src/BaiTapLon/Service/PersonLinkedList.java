package BaiTapLon.Service;

import BaiTapLon.DanhSachNhanVien.NhanVienCongNhat;
import BaiTapLon.DanhSachNhanVien.NhanVienQuanLy;
import BaiTapLon.DanhSachNhanVien.NhanVienSanXuat;
import BaiTapLon.DanhSachNhanVien.Person;

import java.util.*;

public class PersonLinkedList implements ServiceAll {
    Scanner scanner = new Scanner(System.in);
    static List<Person> linkedlist = new LinkedList<>();

    static {
        linkedlist.add(new NhanVienCongNhat("A", "01/01/1999", "SonLa", 12));
        linkedlist.add(new NhanVienQuanLy("B", "01/02/1998", "CaoBang", 12000000, 3.4));
        linkedlist.add(new NhanVienSanXuat("B", "01/02/1998", "CaoBang", 5));
    }
    public void sapXep() {
        Collections.sort(linkedlist, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getTongLuong()- o2.getTongLuong());
            }
        });
    }
    @Override
    public void display() {
        do {
            System.out.println("---- Quan ly nhan vien cong ty bang danh sach linkedList\n" +
                    "1. Hien thi tong nhan vien \n" +
                    "2. Hien thi tong nhan vien cong nhat \n" +
                    "3. Hien thi tong nhan vien quan ly\n" +
                    "4. Hien thi tong nhan vien san xuat\n" +
                    "5. Thoat chon");
            System.out.println(" Moi ban chon chuc nang");
            int input = Integer.parseInt(scanner.nextLine());
            if (input >= 1 && input <= 5) {
                switch (input) {
                    case 1:
                        System.out.println("Nhan vien cong ty gom co");
                        for (Person list : linkedlist) {
                            if (list != null) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhan vien cong nhat gom co:");
                        for (Person list : linkedlist) {
                            if (list instanceof NhanVienCongNhat) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhan vien quan ly gom co:");
                        for (Person list : linkedlist) {
                            if (list instanceof NhanVienQuanLy) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhan vien san xuat gom co:");
                        for (Person list : linkedlist) {
                            if (list instanceof NhanVienSanXuat) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 5:
                        return;
                }
            } else {
                System.out.println("Moi ban chon lai");
            }
        } while (true);
    }
}
