package CaseStudy.Services;

import CaseStudy.Models.Cutomers;
import CaseStudy.Models.Employee;
import CaseStudy.Untils.ReadAndWriteFile2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerIpml implements Service {
    final String path = "J:\\CG\\CodegymX\\module2\\src\\CaseStudy\\Data\\customer.csv";
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> listLine = ReadAndWriteFile2.ReadFile(path);
        List<Cutomers> cutomersList = new ArrayList<>();

        for (String[] item : listLine) {
            String name = item[0];
            String address = item[1];
            String gender = item[2];
            String guestType = item[3];

            Cutomers cutomers = new Cutomers(name, address, gender, guestType);
            cutomersList.add(cutomers);
        }
        for (Cutomers item : cutomersList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        List<String[]> listLine = ReadAndWriteFile2.ReadFile(path);
        List<Cutomers> cutomersList = new ArrayList<>();

        for (String[] item : listLine) {
            String name = item[0];
            String address = item[1];
            String gender = item[2];
            String guestType = item[3];

            Cutomers cutomers = new Cutomers(name, address, gender, guestType);
            cutomersList.add(cutomers);
        }

        System.out.println("Nhap name");
        String name = scanner.nextLine();

        System.out.println("Nhap address");
        String address = scanner.nextLine();

        System.out.println("Nhap gender");
        String gender = scanner.nextLine();

        System.out.println("Nhap guestType");
        String guestType = scanner.nextLine();

        cutomersList.add(new Cutomers(name, address, gender, guestType));
        String str = "";

        for (Cutomers cutomers : cutomersList) {
            String line = String.format("%s,%s,%s,%s", cutomers.getName(), cutomers.getAddress(),
                    cutomers.getGender(), cutomers.getGuestType());
            str += line + "\n";
        }
        ReadAndWriteFile2.WriteFile(path, str);
        System.out.println("thanh cong");

    }

    @Override
    public void update() {
        List<String[]> listLine = ReadAndWriteFile2.ReadFile(path);
        List<Cutomers> cutomersList = new ArrayList<>();

        for (String[] item : listLine) {
            String name = item[0];
            String address = item[1];
            String gender = item[2];
            String guestType = item[3];

            Cutomers cutomers = new Cutomers(name, address, gender, guestType);
            cutomersList.add(cutomers);

            System.out.println("Nhap ten de tim khach hang");
            String input = scanner.nextLine();
            for (int i = 0; i < cutomersList.size(); i++) {
                if (input == cutomersList.get(i).getName()) {
                    System.out.println("Nhap name");
                    String name1 = scanner.nextLine();

                    System.out.println("Nhap address");
                    String address1 = scanner.nextLine();

                    System.out.println("Nhap gender");
                    String gender1 = scanner.nextLine();

                    System.out.println("Nhap guestType");
                    String guestType1 = scanner.nextLine();

                    cutomersList.get(i).setName(name1);
                    cutomersList.get(i).setAddress(address1);
                    cutomersList.get(i).setGender(gender1);
                    cutomersList.get(i).setGuestType(guestType1);

                    String str1 = "";
                    for (Cutomers cutomers1 : cutomersList) {
                        String line = String.format("%s,%s,%s,%s", cutomers1.getName(), cutomers1.getAddress(),
                                cutomers1.getGender(), cutomers1.getGuestType());
                        str1 += line + "\n";
                    }
                    ReadAndWriteFile2.WriteFile(path, str1);
                    System.out.println("cap nhat thanh cong");
                }
            }
        }
    }
}
