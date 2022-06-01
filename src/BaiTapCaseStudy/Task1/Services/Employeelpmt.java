package BaiTapCaseStudy.Task1.Services;

import BaiTapCaseStudy.Task1.Models.Employee;
import BaiTapCaseStudy.Task1.Untils.ReadAndWriteFileTask1;
import CaseStudy.Untils.ReadAndWriteFile2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employeelpmt implements Service {
    final String path = "J:\\CG\\CodegymX\\module2\\src\\BaiTapCaseStudy\\Task1\\DaTa\\Employee.csv";
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> listLine = ReadAndWriteFileTask1.ReadFile(path);
        List<Employee> employeeList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String name = item[1];
            String dateOfBirth = item[2];
            String gender = item[3];
            int id = Integer.parseInt(item[4]);
            int phoneNumber = Integer.parseInt(item[5]);
            String email = item[6];
            String level = item[7];
            String address = item[8];
            double salary = Double.parseDouble(item[9]);

            Employee employee = new Employee(code, name, dateOfBirth, gender,
                    id, phoneNumber, email, level, address, salary);
            employeeList.add(employee);
        }
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        List<String[]> listLine = ReadAndWriteFileTask1.ReadFile(path);
        List<Employee> employeeList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String name = item[1];
            String dateOfBirth = item[2];
            String gender = item[3];
            int id = Integer.parseInt(item[4]);
            int phoneNumber = Integer.parseInt(item[5]);
            String email = item[6];
            String level = item[7];
            String address = item[8];
            double salary = Double.parseDouble(item[9]);

            Employee employee = new Employee(code, name, dateOfBirth, gender,
                    id, phoneNumber, email, level, address, salary);
            employeeList.add(employee);
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

        System.out.println("Nhap email");
        String email = scanner.nextLine();

        System.out.println("Nhap level");
        String level = scanner.nextLine();

        System.out.println("Nhap address");
        String address = scanner.nextLine();

        System.out.println("Nhap salary");
        double salary = Double.parseDouble(scanner.nextLine());

        employeeList.add(new Employee(code, name, dateOfBirth, gender,
                id, phoneNumber, email, level, address, salary));
        String str = "";
        for (Employee employee : employeeList) {
            String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", employee.getCode(), employee.getName(),
                    employee.getDateOfBirth(), employee.getGender(), employee.getId(),
                    employee.getPhoneNumber(), employee.getEmail(), employee.getLevel(),
                    employee.getAddress(), employee.getSalary());
            str += line + "\n";
        }
        ReadAndWriteFile2.WriteFile(path, str);
        System.out.println("thanh cong");
    }

    @Override
    public void update() {
        List<String[]> listLine = ReadAndWriteFileTask1.ReadFile(path);
        List<Employee> employeeList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String name = item[1];
            String dateOfBirth = item[2];
            String gender = item[3];
            int id = Integer.parseInt(item[4]);
            int phoneNumber = Integer.parseInt(item[5]);
            String email = item[6];
            String level = item[7];
            String address = item[8];
            double salary = Double.parseDouble(item[9]);


            Employee employee = new Employee(code, name, dateOfBirth, gender,
                    id, phoneNumber, email, level, address, salary);
            employeeList.add(employee);


            System.out.println("Nhap ten de tim khach hang");
            int input = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < employeeList.size(); i++) {
                if (input == employeeList.get(i).getId()) {

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

                    System.out.println("Nhap level");
                    String level1 = scanner.nextLine();

                    System.out.println("Nhap address");
                    String address1 = scanner.nextLine();

                    System.out.println("Nhap salary");
                    double salary1 = Double.parseDouble(scanner.nextLine());

                    employeeList.get(i).setCode(code1);
                    employeeList.get(i).setName(name1);
                    employeeList.get(i).setDateOfBirth(dateOfBirth1);
                    employeeList.get(i).setGender(gender1);
                    employeeList.get(i).setId(id1);
                    employeeList.get(i).setPhoneNumber(phoneNumber1);
                    employeeList.get(i).setEmail(email1);
                    employeeList.get(i).setLevel(level1);
                    employeeList.get(i).setAddress(address1);
                    employeeList.get(i).setSalary(salary1);


                    String str1 = "";
                    for (Employee employee1 : employeeList) {
                        String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", employee1.getCode(), employee1.getName(),
                                employee1.getDateOfBirth(), employee1.getGender(), employee1.getId(),
                                employee1.getPhoneNumber(), employee1.getEmail(), employee1.getLevel(),
                                employee1.getAddress(), employee1.getSalary());
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
