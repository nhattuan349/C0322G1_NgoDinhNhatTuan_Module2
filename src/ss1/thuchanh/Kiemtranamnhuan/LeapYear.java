package ss1.thuchanh.Kiemtranamnhuan;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập một năm: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year%400 ==0;
                if (isDivisibleBy400){
                    isLeapYear =true;
                }
            }else {
                isLeapYear=true;
            }
        }
        if (isLeapYear){
            System.out.printf("%d là năm nhuần", year);
        }else {
            System.out.printf("%d không phải là năm nhuần", year);
        }
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year;
//        System.out.println("Enter a year: ");
//        year = scanner.nextInt();
//        boolean isLeapYear = false;
//
//        boolean isDivisibleBy4 = year % 4 == 0;
//        if(isDivisibleBy4){
//            boolean isDivisibleBy100 = year % 100 == 0;
//            if(isDivisibleBy100){
//                boolean isDivisibleBy400 = year % 400 == 0;
//                if(isDivisibleBy400){
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if(isLeapYear){
//            System.out.printf("%d is a leap year", year);
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
//    }
}

