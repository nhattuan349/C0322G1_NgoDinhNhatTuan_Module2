package ss19String_Regex.BaiTap.ValidateSoDienThoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestRegexNumberPhone {
    public static void main(String[] args) {
        String testClassName = "^(C|P|A)[0-9]{4}(G|H|I|K|L|M)[0-9]{1}$";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập Tên của lớp học --- Ví dụ: C0322G1");
            String className1 = scanner.nextLine();

            boolean check1 = Pattern.matches(testClassName, className1);
            if (check1) {
                System.out.println("className :" + className1 + "" + " --> Khớp");
            } else System.out.println("className :" + className1 + "" + " --không khớp");
        }while (true);
    }
}