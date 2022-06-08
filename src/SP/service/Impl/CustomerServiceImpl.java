package SP.service.Impl;


import SP.models.preson.Customer;
import SP.service.CustomerService;
import SP.utils.ReadAndWrite;
import SP.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String REGEX_BIRTHDAY = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";

    @Override
    public void display() {
        readFile();
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }

    public String getCustomerType() {
        do {
            System.out.println("Chọn loại khách hàng");
            System.out.println("1.Diamond");
            System.out.println("2.Platinium");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinium";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("Bạn chọn lại nha!! Sai rồi");
                    getCustomerType();
            }
        } while (true);
    }
    public int getGender(){
        do{
            System.out.println("Chọn giới tính:");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("3.Giới tính thứ 3");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    System.out.println("Không có giới tính này!!");
                    getGender();
            }
        }while(true);
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
        int gender = getGender();
        System.out.println("Nhập CMND: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập SĐT: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mail: ");
        String mail = scanner.nextLine();
        String customerType = getCustomerType();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, gender, identityCard, phoneNumber, mail, customerType, address);
        customerList.add(customer);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        readFile();
        System.out.println("Nhập vị trí mình muốn sửa: ");
        String inputId = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getId().equals(inputId)) {
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                String age = scanner.nextLine();
                System.out.println("Nhập giới tính: ");
                int gender = getGender();
                System.out.println("Nhập CMND: ");
                int identityCard = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập SĐT: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập mail: ");
                String mail = scanner.nextLine();
                String customerType = getCustomerType();
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                customer.setName(name);
                customer.setAge(age);
                customer.setGender(gender);
                customer.setIdentityCard(identityCard);
                customer.setPhoneNumber(phoneNumber);
                customer.setMail(mail);
                customer.setCustomerType(customerType);
                customer.setAddress(address);
                System.out.println(customerList);
            }
        }
        writeFile();
    }

    public void readFile() {
        List<String[]> listStr = ReadAndWrite.readFile("src\\casestudy\\data\\customer.csv");
        customerList.clear();
        for (String[] item : listStr) {
            if (item.length != 1) {
                Customer customer = new Customer(item[0], item[1], item[2], Integer.parseInt(item[3]),
                        Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8]);
                customerList.add(customer);
            }
        }
    }

    public void writeFile() {
        ReadAndWrite.delete("src\\casestudy\\data\\customer.csv");
        for (Customer customer : customerList) {
            String line = customer.getInfo();
            ReadAndWrite.writeFile("src\\casestudy\\data\\customer.csv", line);
        }
    }
}
