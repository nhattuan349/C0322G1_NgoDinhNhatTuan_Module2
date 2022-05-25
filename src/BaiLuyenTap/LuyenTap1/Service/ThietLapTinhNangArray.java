package BaiLuyenTap.LuyenTap1.Service;

import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienCongNhatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienQuanLyLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienSanXuatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1;
import BaiTapLon.DanhSachNhanVien.NhanVienCongNhat;
import BaiTapLon.DanhSachNhanVien.NhanVienQuanLy;
import BaiTapLon.DanhSachNhanVien.NhanVienSanXuat;


import java.util.Scanner;

public class ThietLapTinhNangArray implements TaoTinhNang {
    Scanner scanner = new Scanner(System.in);
    public static ThongTinChungL1[] array = new ThongTinChungL1[1000];
    public static int count = 0;

    static {
        array[0] = new NhanVienCongNhatLt1("A", "01/01/1999", "123 SonLA", 5);
        array[1] = new NhanVienQuanLyLt1("B", "01/02/1998", "321 Cao Bang", 6,3.4 );
        array[2] = new NhanVienSanXuatLt1("C", "01/03/1997", "456 Dien Bien", 7);
        count = 3;
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
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : array) {
                            if (list != null) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhan vien cong nhat gom co:");
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : array) {
                            if (list instanceof NhanVienCongNhatLt1) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhan vien quan ly gom co:");
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : array) {
                            if (list instanceof NhanVienQuanLyLt1) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhan vien san xuat gom co:");
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : array) {
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
                for (ThongTinChungL1 list : array) {
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
                        array[count]=person;
                        count++;
                        System.out.println("Thêm mới Nhan vien quan ly thành công...");
                        break;
                    }
                }
                break;
            case 2:
                for (ThongTinChungL1 list : array) {
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
                        array[count]=person;
                        count++;
                        System.out.println("Thêm mới Nhan vien thành công...");
                        break;
                    }
                }
                break;
            case 3:
                for (ThongTinChungL1 list : array) {
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
                    if (array[i] instanceof NhanVienQuanLyLt1 && array[i].getHoTen().equals(name)) {
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
                    if (array[i] instanceof NhanVienCongNhatLt1 && array[i].getHoTen().equals(name1)) {
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
                    if (array[i] instanceof NhanVienSanXuatLt1 && array[i].getHoTen().equals(name2)) {
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
                    if (array[i] instanceof NhanVienQuanLyLt1 && array[i].getHoTen().equals(name)) {
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
                        array[i].setHoTen(nameql);
                        array[i].setNgaySinh(ngaySinh);
                        array[i].setDiaChi(diaChi);
                        ((NhanVienQuanLyLt1) array[i]).setLuongCoBan(luongCoBan);
                        ((NhanVienQuanLyLt1) array[i]).setHeSoLuong(luongCoBan);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên Nhân viên Công nhật muốn sửa: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienCongNhatLt1 && array[i].getHoTen().equals(name2)) {
                        System.out.print("Nhập tên: ");
                        String namecnh = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ngày công: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        array[i].setHoTen(namecnh);
                        array[i].setNgaySinh(ngaySinh);
                        array[i].setDiaChi(diaChi);
                        ((NhanVienCongNhatLt1) array[i]).setSoNgayCong(soNgayCong);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 3:
                System.out.print("Nhập tên Nhân viên Sản xuất muốn sửa: ");
                String name3= scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienSanXuatLt1 && array[i].getHoTen().equals(name3)) {
                        System.out.print("Nhập tên: ");
                        String namesx = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        array[i].setHoTen(namesx);
                        array[i].setNgaySinh(ngaySinh);
                        array[i].setDiaChi(diaChi);
                        ((NhanVienSanXuatLt1) array[i]).setSoSanPham(soSanPham);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 4:
                break;
        }
    }
}
