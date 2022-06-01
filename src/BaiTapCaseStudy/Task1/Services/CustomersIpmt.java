package BaiTapCaseStudy.Task1.Services;

import BaiTapCaseStudy.Task1.Models.Customers;
import BaiTapCaseStudy.Task1.Untils.ReadAndWriteFileTask1;
import CaseStudy.Models.Cutomers;
import CaseStudy.Untils.ReadAndWriteFile2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomersIpmt implements Service {
    final String path = "J:\\CG\\CodegymX\\module2\\src\\BaiTapCaseStudy\\Task1\\DaTa\\Customer.csv";
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> listLine = ReadAndWriteFileTask1.ReadFile(path);
        List<Customers> customersList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String name = item[1];
            String dateOfBirth = item[2];
            String gender = item[3];
            int id = Integer.parseInt(item[4]);
            int phoneNumber = Integer.parseInt(item[5]);
            String email = item[6];
            String typeGuest = item[7];
            String address = item[8];

            Customers customers = new Customers(code, name, dateOfBirth, gender,
                    id, phoneNumber, email, typeGuest, address);
            customersList.add(customers);
        }
        for (Customers item : customersList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        List<String[]> listLine = ReadAndWriteFileTask1.ReadFile(path);
        List<Customers> customersList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String name = item[1];
            String dateOfBirth = item[2];
            String gender = item[3];
            int id = Integer.parseInt(item[4]);
            int phoneNumber = Integer.parseInt(item[5]);
            String email = item[6];
            String typeGuest = item[7];
            String address = item[8];

            Customers customers = new Customers(code, name, dateOfBirth, gender,
                    id, phoneNumber, email, typeGuest, address);
            customersList.add(customers);
        }
        System.out.println("Nhap code");
        int code = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap name");
        String name = scanner.nextLine();

        System.out.println("Nhap dateOfBirth");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhap gender");
        String gender = scanner.nextLine();

        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap phoneNumber");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap emailr");
        String email = scanner.nextLine();

        System.out.println("Nhap typeGuest");
        String typeGuest = scanner.nextLine();

        System.out.println("Nhap address");
        String address = scanner.nextLine();
    }

    @Override
    public void update() {
        List<String[]> listLine = ReadAndWriteFileTask1.ReadFile(path);
        List<Customers> customersList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String name = item[1];
            String dateOfBirth = item[2];
            String gender = item[3];
            int id = Integer.parseInt(item[4]);
            int phoneNumber = Integer.parseInt(item[5]);
            String email = item[6];
            String typeGuest = item[7];
            String address = item[8];

            Customers customers = new Customers(code, name, dateOfBirth, gender,
                    id, phoneNumber, email, typeGuest, address);
            customersList.add(customers);

            System.out.println("Nhap ten de tim khach hang");
            String input = scanner.nextLine();
            for (int i = 0; i < customersList.size(); i++) {
                if (input == customersList.get(i).getName()) {
                    System.out.println("Nhap code");
                    int code1 = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhap name");
                    String name1 = scanner.nextLine();

                    System.out.println("Nhap dateOfBirth");
                    String dateOfBirth1 = scanner.nextLine();

                    System.out.println("Nhap gender");
                    String gender1 = scanner.nextLine();

                    System.out.println("Nhap id");
                    int id1 = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhap phoneNumber");
                    int phoneNumber1 = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhap email");
                    String email1 = scanner.nextLine();

                    System.out.println("Nhap typeGuest");
                    String typeGuest1 = scanner.nextLine();

                    System.out.println("Nhap address");
                    String address1 = scanner.nextLine();

                    customersList.get(i).setCode(code1);
                    customersList.get(i).setName(name1);
                    customersList.get(i).setDateOfBirth(dateOfBirth1);
                    customersList.get(i).setGender(gender1);
                    customersList.get(i).setId(id1);
                    customersList.get(i).setPhoneNumber(phoneNumber1);
                    customersList.get(i).setEmail(email1);
                    customersList.get(i).setTypeGuest(typeGuest1);
                    customersList.get(i).setAddress(address1);


                    String str1 = "";
                    for (Customers customers1 : customersList) {
                        String line = String.format("%s,%s,%s,%s", customers1.getCode(), customers1.getName(),
                                customers1.getDateOfBirth(), customers1.getGender(), customers1.getId(),
                                customers1.getPhoneNumber(), customers1.getEmail(), customers1.getTypeGuest(),
                                customers1.getAddress());
                        str1 += line + "\n";
                    }
                    ReadAndWriteFileTask1.WriteFile(path, str1);
                    System.out.println("cap nhat thanh cong");
                }
            }
        }
    }

    @Override
    public void delete() {

    }

}