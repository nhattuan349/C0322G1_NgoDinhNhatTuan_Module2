package ss2VongLapJava.thuchanh.ThietKeMenuUongDung;

import java.util.Scanner; // import thu vien

public class DrawingMenu {// tao class
    public static void main(String[] args) {// tao ham main
        int choice = 1; // gán biến choice có kiểu dữ liệu int
        Scanner input = new Scanner(System.in);// Khởi tạo đối tượng, có input là biến của đối tượng
        while (choice != 0) {// Khi biến choice kiểu dữ liệu int khác 0
            System.out.println("Menu");// Hiện thị tiêu đề
            System.out.println("1. Draw the triangle");// Hiện thị tiêu đề
            System.out.println("2. Draw the square");// Hiện thị tiêu đề
            System.out.println("3. Draw the rectangle");// Hiện thị tiêu đề
            System.out.println("0. Exit");// Hiện thị tiêu đề
            System.out.println("Enter your choice: ");// Hiện thị tiêu đề
            choice = input.nextInt();// Cho người dùng nhập vào
            switch (choice) {//
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;//kết thúc
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;//kết thúc
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;//kết thúc
                case 0:
                    System.exit(0);//dừng chương trình ngay lập tức
                default:
                    System.out.println("No choice!");
            }// kết thức vòng lặp switch case
        }//kết thúc vòng lặp while
    }//kết thúc hàm main
}//kết thúc class
