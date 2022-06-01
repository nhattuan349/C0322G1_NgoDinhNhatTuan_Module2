package ss19String_Regex.Exam.Customer;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Name {
    public static void main(String[] args) {
        String regexCrawlNews = "^[A-Z][a-zA-z]*[a-zA-z]$";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập ---\n --- Cu phap:(Chữ cái đầu viết Hoa)");
            String test = scanner.nextLine();
            boolean checkRegex = Pattern.matches(regexCrawlNews, test);
            if (checkRegex) {
                System.out.println("ket qua: Khớp" + "\n" + test);
            } else System.out.println("ket qua: Không khớp, mời nhập lại");
        } while (true);
    }
}
