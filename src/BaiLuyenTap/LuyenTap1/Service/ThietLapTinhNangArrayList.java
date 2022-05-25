package BaiLuyenTap.LuyenTap1.Service;

import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienCongNhatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienQuanLyLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienSanXuatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThietLapTinhNangArrayList implements TaoTinhNang {
    Scanner scanner = new Scanner(System.in);
    static List<BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1> arraylist = new ArrayList<>();

    static {
        arraylist.add(new NhanVienCongNhatLt1("A","01/01/2000","123 Son La",5));
        arraylist.add(new NhanVienQuanLyLt1("B","02/02/1999","456 Ha Tinh",12000000,3.4));
        arraylist.add(new NhanVienSanXuatLt1("B","02/02/1999","456 Ha Tinh",10));
    }
    @Override
    public void display() {
        do {
            System.out.println("---- Quan ly nhan vien cong ty bang danh sach ArrayList\n" +
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
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : arraylist) {
                            if (list != null) {
                                System.out.println(list);
                            }
                        }

                        break;
                    case 2:
                        System.out.println("Nhan vien cong nhat gom co:");
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : arraylist) {
                            if (list instanceof NhanVienCongNhatLt1
                            ) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhan vien quan ly gom co:");
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : arraylist) {
                            if (list instanceof NhanVienQuanLyLt1) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhan vien san xuat gom co:");
                        for (BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1 list : arraylist) {
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
        }while (true);
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
                for (ThongTinChungL1 list : arraylist) {
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
                        arraylist.add(person);
                        System.out.println("Thêm mới Nhan vien quan ly thành công...");
                        break;
                    }
                }
                break;
            case 2:
                for (ThongTinChungL1 list : arraylist) {
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
                        arraylist.add(person);
                        System.out.println("Thêm mới Nhan vien thành công...");
                        break;
                    }
                }
                break;
            case 3:
                for (ThongTinChungL1 list : arraylist) {
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
                        arraylist.add(person);
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
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienQuanLyLt1 && arraylist.get(i).getHoTen().equals(name)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên Nhân viên công nhật muốn xoá: ");
                String name1 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienCongNhatLt1 && arraylist.get(i).getHoTen().equals(name1)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
                break;
            case 3:
                System.out.print("Nhập tên Nhân viên Sản xuất muốn xoá: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienSanXuatLt1 && arraylist.get(i).getHoTen().equals(name2)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
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
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienQuanLyLt1 && arraylist.get(i).getHoTen().equals(name)) {
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
                        arraylist.get(i).setHoTen(nameql);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienQuanLyLt1) arraylist.get(i)).setLuongCoBan(luongCoBan);
                        ((NhanVienQuanLyLt1) arraylist.get(i)).setHeSoLuong(luongCoBan);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên Nhân viên Công nhật muốn sửa: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienCongNhatLt1 && arraylist.get(i).getHoTen().equals(name2)) {
                        System.out.print("Nhập tên: ");
                        String namecnh = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ngày công: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        arraylist.get(i).setHoTen(namecnh);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienCongNhatLt1) arraylist.get(i)).setSoNgayCong(soNgayCong);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 3:
                System.out.print("Nhập tên Nhân viên Sản xuất muốn sửa: ");
                String name3= scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienSanXuatLt1 && arraylist.get(i).getHoTen().equals(name3)) {
                        System.out.print("Nhập tên: ");
                        String namesx = scanner.nextLine();
                        System.out.print("Nhập Ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập Địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        arraylist.get(i).setHoTen(namesx);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienSanXuatLt1) arraylist.get(i)).setSoSanPham(soSanPham);
                        System.out.println("cập nhật thành công");
                    }
                }
                break;
            case 4:
                break;
        }
    }
}
