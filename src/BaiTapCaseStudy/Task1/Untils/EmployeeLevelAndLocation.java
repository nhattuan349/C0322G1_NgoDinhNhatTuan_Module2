package BaiTapCaseStudy.Task1.Untils;

import java.util.Scanner;

public class EmployeeLevelAndLocation {
    static Scanner scanner = new Scanner(System.in);

    public static String level() {
        System.out.println("Nhập trình độ: \n" +
                "1. Trung cấp \n" +
                "2 cao đẳng \n" +
                "3. Đại học \n" +
                "4. Sau đại học" );

        do {
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "Trung cấp";
                case "2":
                    return "Cao đẳng";
                case "3":
                    return "Đại học";
                case "4":
                    return "Sau Đại học";
                default:
                    System.out.println("Nhập sai, Nhập lại");
            }
        } while (true);
    }

    public static String address() {
        System.out.println("Nhập chức vụ: \n"+
                "1.Lễ tân \n"+
                "2.Phục vụ \n"+
                "3.Chuyên viên \n"+
                "4.Giám sát \n"+
                "5.Quản lý \n"+
                "6.Giám đốc \n");
        do {
            String input = scanner.nextLine();

            switch (input) {
                case "1": return "Lễ tân";
                case "2": return "Phục vụ";
                case "3": return "Chuyên viên ";
                case "4": return "Giám sát";
                case "5": return "Quản lý";
                case "6": return "Giám đốc";
                default:
                    System.out.println("Nhập sai, Nhập lại");
            }
        }while (true);
    }
}
