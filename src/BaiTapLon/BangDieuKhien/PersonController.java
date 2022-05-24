package BaiTapLon.BangDieuKhien;

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
        PersonArrayList personArrayList =new PersonArrayList();
        PersonLinkedList personLinkedList =new PersonLinkedList();
        PersonMap personMap =new PersonMap();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---Bang dieu khien-----\n" +
                    "1. Hien thi danh sach nhan vien theo Array\n" +
                    "2. Hien thi danh sach nhan vien theo ArrayList\n" +
                    "3. Hien thi danh sach nhan vien theo ArrayLinkedList\n" +
                    "4. Hien thi danh sach nhan vien theo Map\n" +
                    "5. Sap xep luong nhan vien\n" +
                    "6. Ket thuc chuong trinh");
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
                    System.out.println("ket thuc chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("ban nhap sai moi ban nhap lai");
            }
        } while (true);
    }
}
