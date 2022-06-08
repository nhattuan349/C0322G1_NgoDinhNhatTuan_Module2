package SP.service.Impl;


import SP.models.preson.Employee;
import SP.service.EmployeeService;
import SP.utils.ReadAndWrite;
import SP.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    //private static List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String REGEX_BIRTHDAY = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";

    @Override
    public void display() {
        List<Employee> employeeList = readFile();
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    public String getLocation() {
        do {
            System.out.println("Chọn vị trí");
            System.out.println("1. Lễ tân");
            System.out.println("2. Phục vụ");
            System.out.println("3. Chuyên viên");
            System.out.println("4. Giám sát");
            System.out.println("5. Quản lý");
            System.out.println("6. Giám đốc");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Chuyên viên";
                case 4:
                    return "Giám sát";
                case 5:
                    return "Quản lý";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("Chọn lại đi!! Chọn sai rồi");
                    getLocation();
            }

        } while (true);
    }

    public String getLevel() {
        do {
            System.out.println("Chọn trình độ");
            System.out.println("1. Trung cấp");
            System.out.println("2. Cao đẳng");
            System.out.println("3. Đại học");
            System.out.println("4. Sau đại học");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Trung cấp";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "Đại học";
                case 4:
                    return "Sau đại học";
                default:
                    System.out.println("Chọn sai rồi!! Chọn lại đi");
                    getLevel();
            }

        } while (true);
    }

    @Override
    public void addNew() {
        List<Employee> employeeList = readFile();
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
        System.out.println("Nhập giới tính: ");
        int gender = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập CMND: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập SĐT: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mail: ");
        String mail = scanner.nextLine();
        String level = getLevel();
        String location = getLocation();
        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, gender, identityCard, phoneNumber, mail, level, location, salary);
        employeeList.add(employee);
        writeFile( employeeList);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
//        readFile();
//        System.out.println("Nhập vị trí mình muốn sửa: ");
//        String inputEdit = scanner.nextLine();
//        for (Employee employee :) {
//            if (employee.getId().equals(inputEdit)) {
//                System.out.println("Nhập id: ");
//                int id = Integer.parseInt(scanner.nextLine());
//                System.out.println("Nhập tên: ");
//                String name = scanner.nextLine();
//                System.out.println("Nhập tuổi: ");
//                String age = scanner.nextLine();
//                System.out.println("Nhập giới tính: ");
//                boolean gender = Boolean.parseBoolean(scanner.nextLine());
//                System.out.println("Nhập CMND: ");
//                int identityCard = Integer.parseInt(scanner.nextLine());
//                System.out.println("Nhập SĐT: ");
//                int phoneNumber = Integer.parseInt(scanner.nextLine());
//                System.out.println("Nhập mail: ");
//                String mail = scanner.nextLine();
//                String level = getLevel();
//                String location = getLocation();
//                System.out.println("Nhập lương");
//                int salary = Integer.parseInt(scanner.nextLine());
//                employee.setName(name);
//                employee.setAge(age);
//                employee.setGender(gender);
//                employee.setIdentityCard(identityCard);
//                employee.setPhoneNumber(phoneNumber);
//                employee.setMail(mail);
//                employee.setLevel(level);
//                employee.setLocation(location);
//                employee.setSalary(salary);
//                //System.out.println(employeeList);
//                writeFile();
//                return;
//            }
//        }
    }

    public List<Employee> readFile() {
        List<String[]> listStr = ReadAndWrite.readFile("src\\casestudy\\data\\employee.csv");
        //employeeList.clear();
        List<Employee> list = new ArrayList<>();
        for (String[] item : listStr) {
            if (item.length != 1) {
                Employee employee = new Employee(item[0], item[1], item[2], Integer.parseInt(item[3]), Integer.parseInt(item[4]),
                        Integer.parseInt(item[5]), item[6], item[7], item[8], Integer.parseInt(item[9]));
                list.add(employee);
            }
        }
        return list;
    }

    public void writeFile(List<Employee> list) {
        String str = "";
        for (Employee employee : list) {
//            String line = employee.getId() + "," + employee.getName() + "," + employee.getAge() + "," + employee.getGender() + "," + employee.getIdentityCard() + "," +
//                    employee.getPhoneNumber() + "," + employee.getMail() + "," + employee.getLevel() + "," + employee.getLocation() + "," + employee.getSalary();
            str += employee.getInfo() + "\n";
        }
        ReadAndWrite.writeFile("src\\casestudy\\data\\employee.csv", str);
    }
}
