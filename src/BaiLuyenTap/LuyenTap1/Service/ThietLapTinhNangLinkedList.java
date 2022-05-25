package BaiLuyenTap.LuyenTap1.Service;

import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienCongNhatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienQuanLyLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienSanXuatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1;



//import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ThietLapTinhNangLinkedList implements TaoTinhNang {
    Scanner scanner = new Scanner(System.in);
    static List<ThongTinChungL1> linkedlist =new LinkedList<>();

    static {
        linkedlist.add(new NhanVienCongNhatLt1("A","12/12/2000","95 Hung Yen",12));
        linkedlist.add(new NhanVienSanXuatLt1("B","06/06/1999","129 Ly Thai Tổ",5));
        linkedlist.add(new NhanVienQuanLyLt1("C","09/09/2003","55 Hùng Vương",12000000,3.4));
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
                        for (ThongTinChungL1 list : linkedlist) {
                            if (list != null) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhan vien cong nhat gom co:");
                        for (ThongTinChungL1 list : linkedlist) {
                            if (list instanceof NhanVienCongNhatLt1) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhan vien quan ly gom co:");
                        for (ThongTinChungL1 list : linkedlist) {
                            if (list instanceof NhanVienQuanLyLt1) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhan vien san xuat gom co:");
                        for (ThongTinChungL1 list : linkedlist) {
                            if (list instanceof NhanVienSanXuatLt1) {
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
                for (ThongTinChungL1 list : linkedlist) {
                    if (list instanceof NhanVienQuanLyLt1) {
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
                        ThongTinChungL1 person =new NhanVienQuanLyLt1(name,ngaySinh,diaChi,luongCoBan,heSoLuong) ;
                        linkedlist.add(person);
                        System.out.println("Thêm mới Nhan vien quan ly thành công...");
                        break;
                    }
                }
                break;
            case 2:
                for (ThongTinChungL1 list : linkedlist) {
                    if (list instanceof NhanVienSanXuatLt1) {
                        System.out.print("Nhập tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        ThongTinChungL1 person =new NhanVienSanXuatLt1(name,ngaySinh,diaChi,soSanPham) ;
                        linkedlist.add(person);
                        System.out.println("Thêm mới Nhan vien thành công...");
                        break;
                    }
                }
                break;
            case 3:
                for (ThongTinChungL1 list : linkedlist) {
                    if (list instanceof NhanVienCongNhatLt1) {
                        System.out.print("Nhập tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ngay Cong: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        ThongTinChungL1 person =new NhanVienCongNhatLt1(name,ngaySinh,diaChi,soNgayCong) ;
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
    public void delete() {

    }

    @Override
    public void update() {

    }
}
