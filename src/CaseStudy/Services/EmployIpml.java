package CaseStudy.Services;

import CaseStudy.Models.Employee;
import CaseStudy.Untils.ReadAndWriteFile2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployIpml implements Service {
    final String path = "J:\\CG\\CodegymX\\module2\\src\\CaseStudy\\Data\\employFile.csv";
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> listLine = ReadAndWriteFile2.ReadFile(path);
        List<Employee> employeeList = new ArrayList<>();
        for (String[] item : listLine) {
            String name = item[0];
            String address = item[1];
            String gender = item[2];
            String chucvu = item[3];
            Employee employee = new Employee(name, address, gender, chucvu);

            employeeList.add(employee);
        }
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        List<String[]> listLine = ReadAndWriteFile2.ReadFile(path);
        List<Employee> employeeList = new ArrayList<>();

        for (String[] item : listLine) {
            String name = item[0];
            String address = item[1];
            String gender = item[2];
            String chucvu = item[3];

            Employee employee = new Employee(name, address, gender, chucvu);
            employeeList.add(employee);
        }
        System.out.println("Nhap name");
        String name = scanner.nextLine();

        System.out.println("Nhap address");
        String address = scanner.nextLine();

        System.out.println("Nhap gender");
        String gender = scanner.nextLine();

        System.out.println("Nhap chucvu");
        String chucvu = scanner.nextLine();

        employeeList.add(new Employee(name, address, gender, chucvu));
        String str = "";

        for (Employee employee : employeeList) {
            String line = String.format("%s,%s,%s,%s", employee.getName(), employee.getAddress(),
                    employee.getGender(), employee.getChucvu());
            str += line + "\n";
        }
        ReadAndWriteFile2.WriteFile(path, str);
        System.out.println("thanh cong");
    }

    @Override
    public void update() {
        List<String[]> listLine = ReadAndWriteFile2.ReadFile(path);
        List<Employee> employeeList = new ArrayList<>();

        for (String[] item : listLine) {
            String name = item[0];
            String address = item[1];
            String gender = item[2];
            String chucvu = item[3];

            Employee employee = new Employee(name, address, gender, chucvu);
            employeeList.add(employee);

            System.out.println("Nhap ten de tim nhan vien");
            String input = scanner.nextLine();

            for (int i = 0; i < employeeList.size(); i++) {
                if (input == employeeList.get(i).getName()) {
                    System.out.println("Nhap name");
                    String name1 = scanner.nextLine();

                    System.out.println("Nhap address");
                    String address1 = scanner.nextLine();

                    System.out.println("Nhap gender");
                    String gender1 = scanner.nextLine();

                    System.out.println("Nhap chucvu");
                    String chucvu1 = scanner.nextLine();

                    employeeList.get(i).setName(name1);
                    employeeList.get(i).setAddress(address1);
                    employeeList.get(i).setGender(gender1);
                    employeeList.get(i).setChucvu(chucvu1);

                    String str1 = "";
                    for (Employee employee1 : employeeList) {
                        String line = String.format("%s,%s,%s,%s", employee1.getName(), employee1.getAddress(),
                                employee1.getGender(), employee1.getChucvu());
                        str1 += line + "\n";
                    }
                    ReadAndWriteFile2.WriteFile(path, str1);
                    System.out.println("cap nhat thanh cong");
                }
            }
        }
    }
}

