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

    @Override
    public void add() {

        System.out.println("Chọn kiểu Nhân viên muốn thêm\n" +
                "1.Nhân viên quan lý \n" +
                "2.Nhân viên công nhật \n" +
                "3.Nhân viên sản xuất \n" +
                "4.Thoát");

        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                for (Person list : linkedlist) {
                    if (list instanceof NhanVienQuanLy) {
                        System.out.print("Nhập tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("Luong Co Ban: ");
                        double luongCoBan = Double.parseDouble(scanner.nextLine());
                        System.out.print("He So Luong: ");
                        double heSoLuong = Double.parseDouble(scanner.nextLine());
                        Person person =new NhanVienQuanLy(name,ngaySinh,diaChi,luongCoBan,heSoLuong) ;
                        linkedlist.add(person);
                        System.out.println("Thêm mới Nhan vien quan ly thành công...");
                        break;
                    }
                }
                break;
            case 2:
                for (Person list : linkedlist) {
                    if (list instanceof NhanVienSanXuat) {
                        System.out.print("Nhập tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        Person person =new NhanVienSanXuat(name,ngaySinh,diaChi,soSanPham) ;
                        linkedlist.add(person);
                        System.out.println("Thêm mới Nhan vien thành công...");
                        break;
                    }
                }
                break;
            case 3:
                for (Person list : linkedlist) {
                    if (list instanceof NhanVienCongNhat) {
                        System.out.print("Nhập tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ngay Cong: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        Person person =new NhanVienCongNhat(name,ngaySinh,diaChi,soNgayCong) ;
                        linkedlist.add(person);
                        System.out.println("Thêm mới Nhan vien thành công...");
                        break;
                    }
                }
                break;
            case 4:
                break;
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
