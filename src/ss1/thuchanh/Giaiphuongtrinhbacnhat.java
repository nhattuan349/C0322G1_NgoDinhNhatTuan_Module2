package ss1.thuchanh;

import java.util.Scanner;

public class Giaiphuongtrinhbacnhat {

    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        System.out.println("Phương trìn bậc 1 có dang 'a*x+b=c', vui lòng nhập số");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Kết quả:x= "+answer);
        } else {
            if (b == c) {
                System.out.println("Phương trình có một nghiệm là x");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }


//    public static void main(String[] args) {
//        System.out.println("Linear Equation Resolver(Giải phương trình bậc 1)");
//        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("a: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b: ");
//        double b = scanner.nextDouble();
//
//        System.out.print("c: ");
//        double c = scanner.nextDouble();
//        if (a != 0) {
//            double answer = (c - b) / a;
//            System.out.printf("Equation pass with x = %f!\n", answer);
//        } else {
//            if (b == c) {
//                System.out.print("The solution is all x!");
//            } else {
//                System.out.print("No solution!");
//            }
//        }
//    }
    }
}
