package ss2VongLapJava.thuchanh.UngDungTinhTienLaiChoVay;

import java.util.Scanner;// import thu vien

public class IsPrime {// tao class
    public static void main(String[] args) {// tao ham main
        double money = 1.0;// gán biến money có kiêu dữ liệu double và gán giá trị cho biến
        int month = 1;// gán biến month có kiểu dữ liệu int và gấn giá trị cho biến
        double lai = 1.0; // gán biến lãi có kiểu dữ liệu là double
        Scanner input = new Scanner(System.in);// Khởi tạo đối tượng , biến input là biến của đối tượng
        System.out.println("nhập số money");// Hiển thị tiêu đề
        money = Double.parseDouble(input.nextLine());// cho người dung nhập vào kiểu dữ liệu double
        System.out.println("nhập số month");// Hiển thị tiêu đề
        month = Integer.parseInt(input.nextLine());// Chon người dùng nhập vào với kiểu  dữ liệ là int
        System.out.println("nhập lãi suất");// Hiển thị tiêu đề
        lai = Double.parseDouble(input.nextLine());// Cho người dùng nhập vào với kiểu dữ liệu là double
        double  totalInterest=0;// TỔNG TIỀN LÃI Gán biến có kiểu dữ liệu là double và gán giá trị cho biến
        for (int i = 0; i <month ; i++) {// công thức tính tiền lãi cho vay
            totalInterest += money * (lai/100)/12 *month;
        }// kết thuc vòng lặp for
        System.out.println("Tổng tiền lãi là : " +totalInterest + "VND");// Hiển thi kế quả
    }//Kết thúc hàm main
}//kết thức class
