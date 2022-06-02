package BaiTapCaseStudy.Task1.Untils;

import java.util.Scanner;

public class CustomerGuestType {
    public static String typeGuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập loại khách....\n" +
                "1.Diamond \n" +
                "2. Platinnium \n" +
                "3. Gold \n" +
                "4. Sliver \n" +
                "5. Member \n" );
        do {
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= 1 && num <= 5) {
                switch (num) {
                    case 1:
                        return "diamond";
                    case 2:
                        return "platinium";
                    case 3:
                        return "gold";
                    case 4:
                        return "sliver";
                    case 5:
                        return "member";
                }
                break;
            }else {
                System.out.println("Nhập sai, nhập lại (nhập từ 1--5)");
            }
        }while (true);
        return "";
    }
}
