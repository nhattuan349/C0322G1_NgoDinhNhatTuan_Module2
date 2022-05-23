package ss2VongLapJava.baitap.HienThi20SoNguyenToDauTien;

import java.util.Scanner;
//import java.util.Scanner; //import thu vien

public class Display20FirstPrime { // tao class
    public static void main(String[] args) {
        System.out.println("Nhâp vào số nguyên tố bạn muốn in ra: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int count = 0;
        int n = 2;
        System.out.println(numbers + " Số nguyên tố đầu tiên là");
        while (count<numbers){
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if(n%2==0){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.print(n+" ");
                count++;
            }
                n++;
            }
        }
    }
//    public static void main(String[] args) {
//        System.out.println("Nhập vào số nguyên tố bạn muốn in ra: ");
//        Scanner input = new Scanner(System.in);
//        int numbers = Integer.parseInt(input.nextLine());
//        int count = 0;
//        int n = 2;
//        System.out.println(numbers + " Số nguyên đầu tiên là: ");
//        while (count < numbers) {
//            boolean check = true;
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    check = false;
//                    break;
//                }
//            }
//            if (check) {
//                System.out.print(n + " ");
//                count++;
//            }
//            n++;
//        }
//    }
//}
//    public static void main(String[] args) { // tạo ham main
//        System.out.println("Nhap vao so nguyen to ban muon in ra:");// hien thitieu đe nhap
//        Scanner input = new Scanner(System.in);//Khoi tao doi tuong, inout là bien cua dôi tượng
//        int numbers = Integer.parseInt(input.nextLine());// Tạo biến kiểu dữ liệu number cho người dùng  Nhập vào
//        int count = 0;// tạo biến đếm kiêu dữ liệu int
//        int n = 2;// tạo biến kiểu dữ liệu int
//        System.out.print(numbers + " số nguyên tố đầu tiên là: ");// Hiện tiêu đề để Nhập
//        while (count < numbers) {// Công thưc tạo số nguyên tố
//            boolean check = true;
//            for (int i = 2; i < n ; i++) {
//                if (n % i == 0) {
//                    check = false;
//                    break;// kết thúc
//                }
//            }
//            if (check) {
//                System.out.print(n + " ");
//                count++;
//            }
//            n++;
//        }// Kết thúc vòng while
//    }//Kết thúc hàm main
//}//kết thúc class