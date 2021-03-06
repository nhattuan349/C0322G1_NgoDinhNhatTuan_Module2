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
        System.out.println("Ch???n ki???u Nh??n vi??n mu???n th??m\n" +
                "1.Nh??n vi??n quan l?? \n" +
                "2.Nh??n vi??n c??ng nh???t \n" +
                "3.Nh??n vi??n s???n xu???t \n" +
                "4.Tho??t");

        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                for (ThongTinChungL1 list : arraylist) {
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
                        arraylist.add(person);
                        System.out.println("Th??m m???i Nhan vien quan ly th??nh c??ng...");
                        break;
                    }
                }
                break;
            case 2:
                for (ThongTinChungL1 list : arraylist) {
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
                        arraylist.add(person);
                        System.out.println("Th??m m???i Nhan vien th??nh c??ng...");
                        break;
                    }
                }
                break;
            case 3:
                for (ThongTinChungL1 list : arraylist) {
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
                        arraylist.add(person);
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
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienQuanLyLt1 && arraylist.get(i).getHoTen().equals(name)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
                break;
            case 2:
                System.out.print("Nh???p t??n Nh??n vi??n c??ng nh???t mu???n xo??: ");
                String name1 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienCongNhatLt1 && arraylist.get(i).getHoTen().equals(name1)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
                break;
            case 3:
                System.out.print("Nh???p t??n Nh??n vi??n S???n xu???t mu???n xo??: ");
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
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienQuanLyLt1 && arraylist.get(i).getHoTen().equals(name)) {
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
                        arraylist.get(i).setHoTen(nameql);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienQuanLyLt1) arraylist.get(i)).setLuongCoBan(luongCoBan);
                        ((NhanVienQuanLyLt1) arraylist.get(i)).setHeSoLuong(luongCoBan);
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 2:
                System.out.print("Nh???p t??n Nh??n vi??n C??ng nh???t mu???n s???a: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienCongNhatLt1 && arraylist.get(i).getHoTen().equals(name2)) {
                        System.out.print("Nh???p t??n: ");
                        String namecnh = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ng??y c??ng: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        arraylist.get(i).setHoTen(namecnh);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienCongNhatLt1) arraylist.get(i)).setSoNgayCong(soNgayCong);
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 3:
                System.out.print("Nh???p t??n Nh??n vi??n S???n xu???t mu???n s???a: ");
                String name3= scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienSanXuatLt1 && arraylist.get(i).getHoTen().equals(name3)) {
                        System.out.print("Nh???p t??n: ");
                        String namesx = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        arraylist.get(i).setHoTen(namesx);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienSanXuatLt1) arraylist.get(i)).setSoSanPham(soSanPham);
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 4:
                break;
        }
    }
}
