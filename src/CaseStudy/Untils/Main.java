package CaseStudy.Untils;

import CaseStudy.Services.CustomerIpml;
import CaseStudy.Services.EmployIpml;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        do {
        System.out.println("----Menu----\n" +
                "1. Employee Manager\n" +
                "2. Customer Manager\n" +
                "3.Exit");

            System.out.println("Nhap de cho chuc nang");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    caseEmployee();
                    System.out.println("Employee Manager");
                    break;
                case "2":
                    caseCutomers();
                    System.out.println("Customer Manager");
                    break;
                case "3":
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.err.println("CHUC NANG K CO");
            }
        } while (true);
    }

    public static void caseEmployee() {
        EmployIpml employIpml = new EmployIpml();
        do {
        System.out.println(
                "1. Hien thi employ \n" +
                        "2. Them moi employ \n" +
                        "3.Sua employ \n" +
                        "4.Ve Menu chinh");

            System.out.println("Moi ban nhap chuc nang");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Danh sach employ gom co");
                    employIpml.display();
                    caseEmployee();
                    break;
                case "2":
                    System.out.println("Them moi employ");
                    employIpml.add();
                    caseEmployee();
                    break;
                case "3":
                    System.out.println("Sua employ");
                    employIpml.update();
                    caseEmployee();
                    break;
                case "4":
                    System.out.println("Ve Menu chinh");
                    displayMainMenu();
                    return;
                default:
                    System.err.println("Nhap sai, nhap lai");
            }
        } while (true);
    }

    public static void caseCutomers() {
        CustomerIpml customerIpml = new CustomerIpml();
        do {
        System.out.println(
                "1. Hien thi customer \n" +
                        "2. Them moi customer \n" +
                        "3.Sua customer \n" +
                        "4.Ve Menu chinh");

            System.out.println("Moi ban nhap chuc nang");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Danh sach customer gom co");
                    customerIpml.display();
                    caseCutomers();
                    break;
                case "2":
                    System.out.println("Them moi customer");
                    customerIpml.add();
                    caseCutomers();
                    break;
                case "3":
                    System.out.println("Sua customer");
                    customerIpml.update();
                    caseCutomers();
                    break;
                case "4":
                    System.out.println("Ve Menu chinh");
                    displayMainMenu();
                    return;
                default:
                    System.err.println("Nhap sai, nhap lai");
            }
        }while (true);
    }
}

