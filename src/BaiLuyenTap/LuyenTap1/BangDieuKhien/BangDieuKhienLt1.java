package BaiLuyenTap.LuyenTap1.BangDieuKhien;

import java.util.Scanner;

public class BangDieuKhienLt1 {
    public static void main(String[] args) {

    }

    public static void display() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---Bang dieu khien-----\n" +
                    "1. Hien thi danh sach nhan vien theo Array\n" +
                    "2. Hien thi danh sach nhan vien theo ArrayList\n" +
                    "3. Hien thi danh sach nhan vien theo ArrayLinkedList\n" +
                    "4. Hien thi danh sach nhan vien theo Map\n" +
                    "5. Sap xep luong nhan vien\n" +
                    "6. them moi array\n" +
                    "7. xoa array\n" +
                    "8. them moi arraylist\n" +
                    "9. xoa arraylist\n" +
                    "10. them moi linkedlist\n" +
                    "11. ket thuc");
            System.out.println("nhap chuc nang muon chon");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Bạn nhập sai mời bạn nhập lại");
            }
        } while (true);

    }
}
