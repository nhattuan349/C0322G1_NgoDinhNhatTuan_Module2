package ss19String_Regex.Exam.Customer;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Tuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập Tuoi ---\n --- Cu phap:(Phải lớn hơn 18 và nhỏ hơn 100 tuổi))");
           int test = Integer.parseInt(scanner.nextLine());
            if (test>18 && test<100) {
                System.out.println("ket qua: Khớp" + "\n" + test);
            } else System.out.println("ket qua: Không khớp, mời nhập lại");
        } while (true);
    }
}