package BaiTapLon2.BangDieuKhien;

import BaiTapLon.Service.PersonArray;
import BaiTapLon.Service.PersonArrayList;
import BaiTapLon.Service.PersonLinkedList;
import BaiTapLon.Service.PersonMap;

import java.util.Scanner;

public class PersonController {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        PersonArray personArray = new PersonArray();
        PersonArrayList personArrayList = new PersonArrayList();
        PersonLinkedList personLinkedList = new PersonLinkedList();
        PersonMap personMap = new PersonMap();

        do {
            try{
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
                        personArray.display();
                        break;
                    case 2:
                        personArrayList.display();
                        break;
                    case 3:
                        personLinkedList.display();
                        break;
                    case 4:
                        personMap.display();
                        break;
                    case 5:
                        personArrayList.sapXep();
                        personLinkedList.sapXep();
                        System.out.println("dx sap xep thanh cong");
                        display();
                        break;
                    case 6:
                        personArray.add();
                        break;
                    case 7:
                        personArray.delete();
                        break;
                    case 8:
                        personArray.update();
                        break;
                    case 9:
                        personArrayList.add();
                        break;
                    case 10:
                        personArrayList.delete();
                        break;
                    case 11:
                        personArrayList.update();
                        break;
                    case 12:
                        personLinkedList.add();
                        break;
                    case 13:
                        personLinkedList.delete();
                        break;
                    case 14:
                        personLinkedList.update();
                        break;
                    case 15:
                        System.out.println("ket thuc chuong trinh");
                        System.exit(0);
                    default:
                        System.out.println("ban nhap sai moi ban nhap lai");
                }
            }catch (Exception e) {
                //e.printStackTrace();
                System.err.println("Loi nhap sai dinh danh, cu phap: nhap so, Moi nhap lai");
            }
        } while (true);
    }
}
