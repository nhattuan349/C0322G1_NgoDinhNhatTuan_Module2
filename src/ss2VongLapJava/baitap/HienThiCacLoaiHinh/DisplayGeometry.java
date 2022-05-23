package ss2VongLapJava.baitap.HienThiCacLoaiHinh;

import java.util.Scanner;// import thu vien

public class DisplayGeometry { //tao class
    public static void main(String[] args) { // ham main
        int choice = -1; // Khai bao bien gan gia tri
        int length,width;// Khai bao bien gan gia tri
        Scanner input = new Scanner(System.in); //Khoi tao đối tượng, input la biên đôi tượng
        System.out.println("Menu:");// in ra man hinh
        System.out.println("1. Print the rectange");//in hình chữ nhật
        System.out.println("2. Print the square triangle");//in hình tam giác vuông
        System.out.println("3. Print isosceles");//in cân
        System.out.println("0. Exit");// Thoát
        choice = Integer.parseInt(input.nextLine());//gán biến và nhập giá trị số
        switch (choice) { //
            case 0:// nếu nhấn vào 0
                System.exit(0);// Dừng chương trình
            case 1:// nếu nhấn vào 1
                System.out.println("Enter length: ");// hiện tiêu đề chiều dài
                length = Integer.parseInt(input.nextLine());// nhập kiểu số đặt tên là length

                System.out.println("Enter width: ");// hiện tiêu đề chiều rộng
                width = Integer.parseInt(input.nextLine());// nhập kiểu số đặt tên là witdh

                for (int i = 0; i < length ; i++) { // cú pháp tạo hình chữ nhật
                    for (int j = 0; j < width; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;// kết thúc
            case 2:// nếu nhấn vào 2
                System.out.println("Enter length: ");//hiện tiêu đề nhập chiều rộng chiều rộng
                width = Integer.parseInt(input.nextLine()); // nhập kiểu số đặt tên la width

                for (int i = 0; i < width ; i++) {// cú pháp tạo hình tam giác vuông
                    for (int j = 0; j <= i ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i < width ; i++) {
                    for (int j = i ; j < width -1 ; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0 ; j <= i ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i < width ; i++) {
                    for (int j = 0; j < width - i ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i < width ; i++) {
                    for (int j = 0; j < i ; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < width - i ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;// kết thúc
            case 3:// nếu nhấn vào 3
                System.out.println("Enter width: ");//hiện tiêu đề nhập chiều rộng chiều rộng
                width = Integer.parseInt(input.nextLine()); // nhập kiểu số đặt tên la width
                width--; //???
                for( int i = 0; i < width; i++) {// cách tạo tam giác cân rỗng
                    for(int j = 0; j < 2 * width + 1; j++) {
                        if(j == width - i || j == width + i ) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                for(int k = 0;k < 2 * width + 1; k++) {
                    System.out.print("*");
                }
                break;//kết thúc
            default:
                System.out.println("No choose!");
        }// kết thúc switch case
    }//kết thúc hàm main
}//kết thúc hàm class