package BaiTapLon.Service;

import BaiTapLon.DanhSachNhanVien.NhanVienCongNhat;
import BaiTapLon.DanhSachNhanVien.NhanVienQuanLy;
import BaiTapLon.DanhSachNhanVien.NhanVienSanXuat;
import BaiTapLon.DanhSachNhanVien.Person;

import java.util.Scanner;

public class PersonArray implements ServiceAll {
    Scanner scanner = new Scanner(System.in);
    public static Person[] array = new Person[1000];
    public static int count = 0;//them suu xoa

    static {
        array[0] = new NhanVienCongNhat("A", "01/01/1999", "SonLa", 12);
        array[1] = new NhanVienQuanLy("B", "01/02/1998", "CaoBang", 12000000, 3.4);
        array[2] = new NhanVienSanXuat("C", "01/03/1997", "LangSon", 5);
        count=3;
    }

    @Override
    public void display() {
        do {
            System.out.println("---- Quan ly nhan vien cong ty bang danh sach Array\n" +
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
                        for (Person list : array) {
                            if (list != null) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhan vien cong nhat gom co:");
                        for (Person list : array) {
                            if (list instanceof NhanVienCongNhat) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhan vien quan ly gom co:");
                        for (Person list : array) {
                            if (list instanceof NhanVienQuanLy) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhan vien san xuat gom co:");
                        for (Person list : array) {
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
                for (Person list : array) {
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
                        array[count]=person;
                        count++;
                        System.out.println("Thêm mới Nhan vien quan ly thành công...");
                        break;
                    }
                }
                break;
            case 2:
                for (Person list : array) {
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
                        array[count]=person;
                        count++;
                        System.out.println("Thêm mới Nhan vien thành công...");
                        break;
                    }
                }
                break;
            case 3:
                for (Person list : array) {
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
                        array[count]=person;
                        count++;
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
        System.out.println("Danh sách Nhân viên muốn sửa: \n" +
                "1.Nhân viên quản lý \n" +
                "2.Nhân viên công nhật \n" +
                "3.Nhân viên sản xuất \n" +
                "4.Thoát");
        System.out.println("Chọn kiểu nhân viên muốn sửa: ");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.print("Nhập tên Nhân viên Quản lý muốn sửa: ");
                String name = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienQuanLy && array[i].getFullName().equals(name)) {
                            System.out.print("Nhập tên: ");
                            String nameql = scanner.nextLine();
                            System.out.print("Nhập Ngày sinh: ");
                            String ngaySinh = scanner.nextLine();
                            System.out.print("Nhập Địa chỉ: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Luong Co Ban: ");
                            double luongCoBan = Double.parseDouble(scanner.nextLine());
                            System.out.print("He So Luong: ");
                            double heSoLuong = Double.parseDouble(scanner.nextLine());
                            array[i].setFullName(nameql);
                            array[i].setNgaySinh(ngaySinh);
                            array[i].setDiaChi(diaChi);
                            ((NhanVienQuanLy) array[i]).setLuongCoBan(luongCoBan);
                            ((NhanVienQuanLy) array[i]).setHeSoLuong(luongCoBan);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên Nhân viên Công nhật muốn sửa: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienCongNhat && array[i].getFullName().equals(name2)) {
                        System.out.print("Nhập tên: ");
                        String namecnh = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ngày công: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        array[i].setFullName(namecnh);
                        array[i].setNgaySinh(ngaySinh);
                        array[i].setDiaChi(diaChi);
                        ((NhanVienCongNhat) array[i]).setSoNgayCong(soNgayCong);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 3:
                System.out.print("Nhập tên Nhân viên Sản xuất muốn sửa: ");
                String name3= scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienSanXuat && array[i].getFullName().equals(name3)) {
                        System.out.print("Nhập tên: ");
                        String namesx = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        array[i].setFullName(namesx);
                        array[i].setNgaySinh(ngaySinh);
                        array[i].setDiaChi(diaChi);
                        ((NhanVienSanXuat) array[i]).setSoSanPham(soSanPham);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 4:
                break;
        }
    }


    @Override
    public void delete() {
        int last = array.length - 1;
        System.out.println("Danh sách Nhân viên muốn xoá: \n" +
                "1.Nhân viên quản lý \n" +
                "2.Nhân viên công nhật \n" +
                "3.Nhân viên sản xuất \n" +
                "4.Thoát");
        System.out.println("Chọn kiểu nhân viên muốn xoá: ");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.print("Nhập tên Nhân viên Quản lý muốn xoá: ");
                String name = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienQuanLy && array[i].getFullName().equals(name)) {
                        for (int j = i; j < array.length -1; j++) {
                            array[j] = array[j + 1];
                        }
                        array[last] = null;
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên Nhân viên Công nhật muốn xoá: ");
                String name1 = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienCongNhat && array[i].getFullName().equals(name1)) {
                        for (int j = i; j < array.length - 1 ; j++) {
                            array[j] = array[j + 1];
                        }
                        array[last] = null;
                    }
                }
            case 3:
                System.out.print("Nhập tên Nhân viên Sản xuất muốn xoá: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienSanXuat && array[i].getFullName().equals(name2)) {
                        for (int j = i; j < array.length - 1 ; j++) {
                            array[j] = array[j + 1];
                        }
                        array[last] = null;
                    }
                }
            case 4:
                break;
        }
    }
}
