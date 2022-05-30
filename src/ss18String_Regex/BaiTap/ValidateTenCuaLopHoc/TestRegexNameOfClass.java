package ss18String_Regex.BaiTap.ValidateTenCuaLopHoc;

import java.util.regex.Pattern;

public class TestRegexNameOfClass {
    public static void main(String[] args) {
        String phoneNumberRegex = "^(.)[0-9]{2}-(0)[0-9]{9}$";

        String str = "+84-0899607659";
        boolean check1 = Pattern.matches(phoneNumberRegex, str);
        if (check1) {
            System.out.println("Sđt: " + str + " --Hợp lệ");
        } else System.out.println("Sđt: " + str + " --Không hợp lệ");

        String str1 = "+84-95355535";
        boolean check2 = Pattern.matches(phoneNumberRegex, str1);
        if (check2) {
            System.out.println("Sđt: " + str1 + " --Hợp lệ");
        } else System.out.println("Sđt: " + str1 + " --Không hợp lệ");
    }
}
