package ss2VongLapJava.thuchanh.TimUocChungLonNhat;

import java.util.Scanner;// import thu viên

public class GreatestCommonDivisor {// tao class
    public static void main(String[] args) {//tao ham main
        int a;// gán biên kiểu dữ liệu chưa gán giá tri
        int b;// gán biên kiểu dữ liệu chưa gán giá tri
        Scanner input = new Scanner(System.in);// Khỏi tao dôi tương, có input là biến
        System.out.println("Enter number a");// Hiển thị tiêu đề
        a = Integer.parseInt(input.nextLine());// Cho người dùng nhập vào
        System.out.println("Enter number b");// hiển thị tiêu đề
        b = Integer.parseInt(input.nextLine());// Cho người dùng nhập vào
        a = Math.abs(a);// Tính giá tuyệt đối với kiểu dữ liệu int
        b = Math.abs(b);// Tính giá tuyệt đối với kiểu dữ liệu int
        if (a == 0 || b == 0) { // Điều kiện không có ước chung
            System.out.println("Không có ước chung lớn nhất :");
        }
        while (a != b) {// Công thức tim ước chung lớn nhất
            if (a > b)
                a = a - b;
            else b = b - a;
        }
        System.out.println("ước chung lớn nhất :" + a);
    }//Kết thúc hàm main
}//Kết thúc class
