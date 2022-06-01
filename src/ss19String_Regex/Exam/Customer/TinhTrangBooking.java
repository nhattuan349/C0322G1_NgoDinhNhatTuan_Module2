package ss19String_Regex.Exam.Customer;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TinhTrangBooking {
    public static void main(String[] args) {
        String regexCrawlNews = "Yes";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập tinh trang booking---\n --- Cu phap:Yes or No");
            String test = scanner.nextLine();
            boolean checkRegex = Pattern.matches(regexCrawlNews, test);
            if (checkRegex) {
                System.out.println("ket qua: da booking" + "\n" + test);
            } else System.out.println("ket qua: chua booking" + "\n" + test);
        } while (true);
    }
}
