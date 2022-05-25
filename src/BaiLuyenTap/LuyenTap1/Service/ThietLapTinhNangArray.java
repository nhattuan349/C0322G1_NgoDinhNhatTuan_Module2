package BaiLuyenTap.LuyenTap1.Service;

import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienCongNhatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienQuanLyLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.NhanVienSanXuatLt1;
import BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1;

import java.util.Scanner;

public class ThietLapTinhNangArray implements TaoTinhNang {
    Scanner scanner = new Scanner(System.in);
    public static BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1[] array = new BaiLuyenTap.LuyenTap1.DanhSachNhanVien.ThongTinChungL1[1000];
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
                        for (ThongTinChungL1 list : array) {
                            if (list != null) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhan vien cong nhat gom co:");
                        for (ThongTinChungL1 list : array) {
                            if (list instanceof NhanVienCongNhatLt1) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhan vien quan ly gom co:");
                        for (ThongTinChungL1 list : array) {
                            if (list instanceof NhanVienQuanLyLt1) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhan vien san xuat gom co:");
                        for (ThongTinChungL1 list : array) {
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
}
