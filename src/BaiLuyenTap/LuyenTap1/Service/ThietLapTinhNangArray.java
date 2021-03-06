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

        System.out.println("Ch???n ki???u Nh??n vi??n mu???n th??m\n" +
                "1.Nh??n vi??n quan l?? \n" +
                "2.Nh??n vi??n c??ng nh???t \n" +
                "3.Nh??n vi??n s???n xu???t \n" +
                "4.Tho??t");

        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                for (ThongTinChungL1 list : array) {
                    if (list instanceof NhanVienQuanLyLt1) {
                        System.out.print("Nh???p t??n: ");
                        String name = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");

                        String diaChi = scanner.nextLine();
                        System.out.print("Luong Co Ban: ");
                        double luongCoBan = Double.parseDouble(scanner.nextLine());
                        System.out.print("He So Luong: ");
                        double heSoLuong = Double.parseDouble(scanner.nextLine());
                        ThongTinChungL1 person =new NhanVienQuanLyLt1(name,ngaySinh,diaChi,luongCoBan,heSoLuong) ;
                        array[count]=person;
                        count++;
                        System.out.println("Th??m m???i Nhan vien quan ly th??nh c??ng...");
                        break;
                    }
                }
                break;
            case 2:
                for (ThongTinChungL1 list : array) {
                    if (list instanceof NhanVienSanXuatLt1) {
                        System.out.print("Nh???p t??n: ");
                        String name = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        ThongTinChungL1 person =new NhanVienSanXuatLt1(name,ngaySinh,diaChi,soSanPham) ;
                        array[count]=person;
                        count++;
                        System.out.println("Th??m m???i Nhan vien th??nh c??ng...");
                        break;
                    }
                }
                break;
            case 3:
                for (ThongTinChungL1 list : array) {
                    if (list instanceof NhanVienCongNhatLt1) {
                        System.out.print("Nh???p t??n: ");
                        String name = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ngay Cong: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        ThongTinChungL1 person =new NhanVienCongNhatLt1(name,ngaySinh,diaChi,soNgayCong) ;
                        array[count]=person;
                        count++;
                        System.out.println("Th??m m???i Nhan vien th??nh c??ng...");
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
        System.out.println("Danh s??ch Nh??n vi??n mu???n xo??: \n" +
                "1.Nh??n vi??n qu???n l?? \n" +
                "2.Nh??n vi??n c??ng nh???t \n" +
                "3.Nh??n vi??n s???n xu???t \n" +
                "4.Tho??t");
        System.out.println("Ch???n ki???u nh??n vi??n mu???n xo??: ");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.print("Nh???p t??n Nh??n vi??n Qu???n l?? mu???n xo??: ");
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
                System.out.print("Nh???p t??n Nh??n vi??n C??ng nh???t mu???n xo??: ");
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
                System.out.print("Nh???p t??n Nh??n vi??n S???n xu???t mu???n xo??: ");
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
        System.out.println("Danh s??ch Nh??n vi??n mu???n s???a: \n" +
                "1.Nh??n vi??n qu???n l?? \n" +
                "2.Nh??n vi??n c??ng nh???t \n" +
                "3.Nh??n vi??n s???n xu???t \n" +
                "4.Tho??t");
        System.out.println("Ch???n ki???u nh??n vi??n mu???n s???a: ");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.print("Nh???p t??n Nh??n vi??n Qu???n l?? mu???n s???a: ");
                String name = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienQuanLyLt1 && array[i].getHoTen().equals(name)) {
                        System.out.print("Nh???p t??n: ");
                        String nameql = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
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
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 2:
                System.out.print("Nh???p t??n Nh??n vi??n C??ng nh???t mu???n s???a: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienCongNhatLt1 && array[i].getHoTen().equals(name2)) {
                        System.out.print("Nh???p t??n: ");
                        String namecnh = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ng??y c??ng: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        array[i].setHoTen(namecnh);
                        array[i].setNgaySinh(ngaySinh);
                        array[i].setDiaChi(diaChi);
                        ((NhanVienCongNhatLt1) array[i]).setSoNgayCong(soNgayCong);
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 3:
                System.out.print("Nh???p t??n Nh??n vi??n S???n xu???t mu???n s???a: ");
                String name3= scanner.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] instanceof NhanVienSanXuatLt1 && array[i].getHoTen().equals(name3)) {
                        System.out.print("Nh???p t??n: ");
                        String namesx = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        array[i].setHoTen(namesx);
                        array[i].setNgaySinh(ngaySinh);
                        array[i].setDiaChi(diaChi);
                        ((NhanVienSanXuatLt1) array[i]).setSoSanPham(soSanPham);
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 4:
                break;
        }
    }
}
