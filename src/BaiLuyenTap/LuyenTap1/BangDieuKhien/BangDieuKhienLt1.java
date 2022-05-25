package BaiLuyenTap.LuyenTap1.BangDieuKhien;

import BaiLuyenTap.LuyenTap1.Service.ThietLapTinhNangArray;
import BaiLuyenTap.LuyenTap1.Service.ThietLapTinhNangArrayList;
import BaiLuyenTap.LuyenTap1.Service.ThietLapTinhNangLinkedList;

import java.util.Scanner;

public class BangDieuKhienLt1 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        ThietLapTinhNangArray thietLapTinhNangArray = new ThietLapTinhNangArray();
        ThietLapTinhNangArrayList thietLapTinhNangArrayList = new ThietLapTinhNangArrayList();
        ThietLapTinhNangLinkedList thietLapTinhNangLinkedList = new ThietLapTinhNangLinkedList();
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
                    "8. update array\n" +
                    "9. them moi arraylist\n" +
                    "10. xoa arraylist\n" +
                    "11. update arraylist\n" +
                    "12. them moi linkedlist\n" +
                    "13. xoa linkedlist\n" +
                    "14. update linkedlist\n" +
                    "15. ket thuc");
            System.out.println("nhap chuc nang muon chon");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    thietLapTinhNangArray.display();
                    break;
                case 2:
                    thietLapTinhNangArrayList.display();
                    break;
                case 3:
                    thietLapTinhNangLinkedList.display();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    thietLapTinhNangArray.add();
                    break;
                case 7:
                    thietLapTinhNangArray.delete();
                    break;
                case 8:
                    thietLapTinhNangArray.update();
                    break;
                case 9:
                    thietLapTinhNangArrayList.add();
                    break;
                case 10:
                    thietLapTinhNangArrayList.delete();
                    break;
                case 11:
                    thietLapTinhNangArrayList.update();
                    break;
                case 12:
                    thietLapTinhNangLinkedList.add();
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                default:
                    System.out.println("Bạn nhập sai mời bạn nhập lại");
            }
        } while (true);

    }
}
