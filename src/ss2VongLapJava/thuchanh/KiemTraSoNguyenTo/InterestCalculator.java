package ss2VongLapJava.thuchanh.KiemTraSoNguyenTo;

import java.util.Scanner; // import thu viên

public class InterestCalculator {// tao class
    public static void main(String[] args) {//tao ham main
        Scanner sc = new Scanner(System.in);// khoi tao doi tuong, input là biến của đối tượng
        System.out.println("Nhập số vào đây");//Hiển thị tiêu đề
        int number = Integer.parseInt(sc.nextLine());//Gán biến number có kiểu dữ liệu là int cho người dùng nhập vào
        if (number < 2) {//Công thức kiểm tra số nguyên tố
            System.out.println(number + " không phải số nguyên tố ");
        } else {
            int i = 2;
            boolean flag = true;
            while (i < number) {
                if (number % i == 0) {
                    flag = false;
                    break;// kết thúc
                }
                i++;
            }
            if (flag)
                System.out.println(number + " là số nguyên tố ");
            else
                System.out.println(number + " không phải số nguyên tố ");
        }//Kết thúc vòng lặp while
    }//Kết thúc hàm main
}//Kết thúc class