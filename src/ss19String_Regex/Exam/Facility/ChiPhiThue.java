package ss19String_Regex.Exam.Facility;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChiPhiThue {
    public static void main(String[] args) {
        String regexCrawlNews = "^[0-9]*[0-9]";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập ---\n --- Cu phap:Chi phí thuê (Phải là số nguyên dương)");
            String test = scanner.nextLine();
            boolean checkRegex = Pattern.matches(regexCrawlNews, test);
            if (checkRegex) {
                System.out.println("ket qua: Khớp" + "\n" + test);
            } else System.out.println("ket qua: Không khớp, mời nhập lại");
        } while (true);
    }
}
