package ss2VongLapJava.baitap.HienThiCacSoNguyenToNhoHon100;

import java.util.Scanner; //import thu vien

public class DisplayPrimeLessThan100 {// tao class
    public static void main(String[] args) {// tao ham main
        System.out.println("Nhap vao so nguyen to ban muon in ra:");//Hien thi tieu đe
        Scanner input = new Scanner(System.in);// Khoi tao doi tương, input la bien cua doi tuong
        int numbers = Integer.parseInt(input.nextLine());// Gán biến numbes có kiểu dữ liệu int, cho người dùng nhập vào
        int count = 0;// tạo biến đếm có kieu du lieu là int
        int n = 2;// tao biến có kiêu dữ liệu là int
        System.out.print(numbers + " số nguyên tố đầu tiên là: ");// Hiển thị tiêu đề
        while (count < numbers) {// công thức tạo Số nguyên tó nhỏ hơn 100
            boolean check = true;// Dung biến boolean để tạo biến cờ
            for (int i = 2; i < n ; i++) {
                if (n % i == 0) {
                    check = false;
                    break;// kết thúc
                }
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }//Kết thúc vòng lặp while
    }//Kết thúc hàm main
}//Kết thúc class