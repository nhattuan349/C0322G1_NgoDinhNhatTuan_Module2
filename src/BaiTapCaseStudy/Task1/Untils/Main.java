package BaiTapCaseStudy.Task1.Untils;

import BaiTapCaseStudy.Task1.Services.Impl.Employeelpmt;
import CaseStudy.Services.CustomerIpml;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        do {
            System.out.println("----Menu----\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");

            System.out.println("Nhap de cho chuc nang");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    EmployeeManagement();
                    System.out.println("Employee Management");
                    break;
                case "2":
                    CustomerManagement();
                    System.out.println("Customer Management");
                    break;
                case "3":
                    System.out.println("Facility Management");
                    break;
                case "4":
                    System.out.println("Booking Management");
                    break;
                case "5":
                    System.out.println("Promotion Management");
                    break;
                case "6":
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.err.println("CHUC NANG K CO");
            }
        } while (true);
    }

    public static void EmployeeManagement() {
        Employeelpmt employIpml = new Employeelpmt();
        do {
            System.out.println("1.Display list employees \n" +
                    "2.Add new employee \n" +
                    "3.Edit employee\n" +
                    "4.Return main menu");

            System.out.println("Moi ban nhap chuc nang");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Display list employees ");
                    employIpml.display();
                    EmployeeManagement();
                    break;
                case "2":
                    System.out.println("Add new employee");
                    employIpml.add();
                    EmployeeManagement();
                    break;
                case "3":
                    System.out.println("Edit employee");
                    employIpml.update();
                    EmployeeManagement();
                    break;
                case "4":
                    System.out.println("Return main menu");
                    displayMainMenu();
                    return;
                default:
                    System.err.println("Nhap sai, nhap lai");
            }
        } while (true);
    }

    public static void CustomerManagement() {
        CustomerIpml customerIpml = new CustomerIpml();
        do {
            System.out.println("1. Display list customers \n" +
                            "2.Add new customer \n" +
                            "3.Edit customer \n" +
                            "4.Return main menu");

            System.out.println("Moi ban nhap chuc nang");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Display list customers");
                    customerIpml.display();
                    CustomerManagement();
                    break;
                case "2":
                    System.out.println("Add new customer");
                    customerIpml.add();
                    CustomerManagement();
                    break;
                case "3":
                    System.out.println("Edit customer");
                    customerIpml.update();
                    CustomerManagement();
                    break;
                case "4":
                    System.out.println("Return main menu");
                    displayMainMenu();
                    return;
                default:
                    System.err.println("Nhap sai, nhap lai");
            }
        } while (true);
    }
}


