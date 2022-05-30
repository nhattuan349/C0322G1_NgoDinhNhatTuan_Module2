package ss19String_Regex.BaiTap.ValidateSoDienThoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestRegexNumberPhone {
    public static void main(String[] args) {
        String phoneNumberRegex = "^(.)[0-9]{2}-(0)[0-9]{9}$";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Mời nhập số điện thoại ---- Ví dụ: +84-0899607659");
            String str = scanner.nextLine();

            boolean check = Pattern.matches(phoneNumberRegex, str);
            if (check) {
                System.out.println("sdt: " + str + " -->Khớp");
            } else System.out.println("sdt: " + str + "Không khớpKhớp");
        } while (true);
    }
}