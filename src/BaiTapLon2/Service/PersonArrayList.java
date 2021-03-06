package BaiTapLon2.Service;

import BaiTapLon.DanhSachNhanVien.NhanVienCongNhat;
import BaiTapLon.DanhSachNhanVien.NhanVienQuanLy;
import BaiTapLon.DanhSachNhanVien.NhanVienSanXuat;
import BaiTapLon.DanhSachNhanVien.Person;

import java.util.*;

public class PersonArrayList implements ServiceAll{
    Scanner scanner =new Scanner(System.in);
    static List<Person> arraylist =new ArrayList<>();


    public void sapXep() {
        Collections.sort(arraylist, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getTongLuong()- o2.getTongLuong());
            }
        });
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
                        for (Person list : arraylist) {
                            if (list != null) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhan vien cong nhat gom co:");
                        for (Person list : arraylist) {
                            if (list instanceof NhanVienCongNhat) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhan vien quan ly gom co:");
                        for (Person list : arraylist) {
                            if (list instanceof NhanVienQuanLy) {
                                System.out.println(list);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhan vien san xuat gom co:");
                        for (Person list : arraylist) {
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
                for (Person list : arraylist) {
                    if (list instanceof NhanVienQuanLy) {
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
                        Person person =new NhanVienQuanLy(name,ngaySinh,diaChi,luongCoBan,heSoLuong) ;
                        arraylist.add(person);
                        System.out.println("Th??m m???i Nhan vien quan ly th??nh c??ng...");
                        break;
                    }
                }
                break;
            case 2:
                for (Person list : arraylist) {
                    if (list instanceof NhanVienSanXuat) {
                        System.out.print("Nh???p t??n: ");
                        String name = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        Person person =new NhanVienSanXuat(name,ngaySinh,diaChi,soSanPham) ;
                        arraylist.add(person);
                        System.out.println("Th??m m???i Nhan vien th??nh c??ng...");
                        break;
                    }
                }
                break;
            case 3:
                for (Person list : arraylist) {
                    if (list instanceof NhanVienCongNhat) {
                        System.out.print("Nh???p t??n: ");
                        String name = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ngay Cong: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        Person person =new NhanVienCongNhat(name,ngaySinh,diaChi,soNgayCong) ;
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
                    if (arraylist.get(i) instanceof NhanVienQuanLy && arraylist.get(i).getFullName().equals(name)) {
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
                        arraylist.get(i).setFullName(nameql);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienQuanLy) arraylist.get(i)).setLuongCoBan(luongCoBan);
                        ((NhanVienQuanLy) arraylist.get(i)).setHeSoLuong(luongCoBan);
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 2:
                System.out.print("Nh???p t??n Nh??n vi??n C??ng nh???t mu???n s???a: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienCongNhat && arraylist.get(i).getFullName().equals(name2)) {
                        System.out.print("Nh???p t??n: ");
                        String namecnh = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So Ng??y c??ng: ");
                        double soNgayCong = Double.parseDouble(scanner.nextLine());
                        arraylist.get(i).setFullName(namecnh);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienCongNhat) arraylist.get(i)).setSoNgayCong(soNgayCong);
                        System.out.println("c???p nh???t th??nh c??ng");
                    }
                }
                break;
            case 3:
                System.out.print("Nh???p t??n Nh??n vi??n S???n xu???t mu???n s???a: ");
                String name3= scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienSanXuat && arraylist.get(i).getFullName().equals(name3)) {
                        System.out.print("Nh???p t??n: ");
                        String namesx = scanner.nextLine();
                        System.out.print("Nh???p Ng??y sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nh???p ?????a ch???: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("So San Pham: ");
                        int soSanPham = Integer.parseInt(scanner.nextLine());
                        arraylist.get(i).setFullName(namesx);
                        arraylist.get(i).setNgaySinh(ngaySinh);
                        arraylist.get(i).setDiaChi(diaChi);
                        ((NhanVienSanXuat) arraylist.get(i)).setSoSanPham(soSanPham);
                        System.out.println("c???p nh???t th??nh c??ng");
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
                    if (arraylist.get(i) instanceof NhanVienQuanLy && arraylist.get(i).getFullName().equals(name)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
                break;
            case 2:
                System.out.print("Nh???p t??n Nh??n vi??n c??ng nh???t mu???n xo??: ");
                String name1 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienCongNhat && arraylist.get(i).getFullName().equals(name1)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
                break;
            case 3:
                System.out.print("Nh???p t??n Nh??n vi??n S???n xu???t mu???n xo??: ");
                String name2 = scanner.nextLine();
                for (int i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i) instanceof NhanVienSanXuat && arraylist.get(i).getFullName().equals(name2)) {
                        arraylist.remove(arraylist.get(i));
                    }
                }
                break;
        }
    }
}
