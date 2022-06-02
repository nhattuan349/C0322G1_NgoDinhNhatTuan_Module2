package BaiTapCaseStudy.Task1.Untils;

import java.util.Scanner;

public class FacilityRentalType {
    static Scanner scanner = new Scanner(System.in);

    public static String rentalType() {
        do {
        System.out.println("Nhập kiểu thuê: \n" +
                "1. thuê theo năm: \n" +
                "2. thuê theo tháng: \n" +
                "3. thuê theo ngày: \n" +
                "4. thuê theo giờ: ");

            String input = scanner.nextLine();
                switch (input) {
                    case "1":
                        return "thuê theo năm";
                    case "2":
                        return "thuê theo tháng";
                    case "3":
                        return "thuê theo ngày";
                    case "4":
                        return "thuê theo giờ";
                    default:
                System.out.println("Nhập sai, Nhập lại 1--4" );
            }
        } while (true);
    }
}