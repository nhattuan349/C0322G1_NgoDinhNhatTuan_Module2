package BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.Service;

import BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList.NhanVienCongNhat;
import BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList.NhanVienQuanLy;
import BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList.NhanVienSanXuat;
import BaiTapTongHop1.LuyentapveArrayArrayListLinkedListMap.PersonList.Person;
import arrList.Student;
import arrList.Teacher;

import java.util.Scanner;

public class PersonImplement implements Service {

    public static Person[] arrList = new Person[1000];
    static Scanner scanner = new Scanner(System.in);

    static {
        arrList[0] = new NhanVienCongNhat("A", "01011997", "Lao Cai", 5);
        arrList[1] = new NhanVienQuanLy("B", "01021996", "Gia Lai", 5, 3.43);
        arrList[2] = new NhanVienSanXuat("Đức", "01031995", "Kon Tum", 10);
    }


    @Override
    public void display() {
        System.out.println("----Quản lý Person----\n" +
                "1.Hiển thị danh sách NhanVienCongNhat \n" +
                "2.Hiển thị danh sách NhanVienQuanLy \n" +
                "3.Hiển thị danh sách NhanVienSanxuat \n");
        System.out.println("Nhập vào ví trí danh sách muốn hiển thị");
        int input = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case 1:
                for (Person list : arrList) {
                    if (list != null) {
                        System.out.println(list);
                    }
                }
                break;
            case 2:
                for (Person list : arrList) {
                    if (list instanceof NhanVienCongNhat) {
                        System.out.println(list);
                    }
                }
                break;
            case 3:
                for (Person list : arrList) {
                    if (list instanceof NhanVienQuanLy) {
                        System.out.println(list);
                    }
                }
                break;
            case 4:
                for (Person list : arrList) {
                    if (list instanceof NhanVienSanXuat) {
                        System.out.println(list);
                    }
                }
                break;
        }
    }
}

