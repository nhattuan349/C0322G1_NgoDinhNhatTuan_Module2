package ss19String_Regex.Exam.Customer;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Id {
    public static void main(String[] args) {
        String regexCrawlNews = "^(CUS)-[0-9]{4}-[A-Z]$";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập ---\n --- Cu phap: CUS-XXXX(la 4 so nguyen duong-?(là một chu cai viet hoa)");
            String test = scanner.nextLine();
            String asd="CUS-";
            System.out.println("?(la chu cai viet hoa)");
            String asd1=scanner.nextLine();
            String testTotal = asd.concat(test.concat("-"+asd1));
            boolean checkRegex = Pattern.matches(regexCrawlNews, testTotal);
            if (checkRegex) {
                System.out.println("ket qua: Khớp"+"\n"+testTotal);
            } else System.out.println("ket qua: Không khớp, mời nhập lại");
        } while (true);
    }
}