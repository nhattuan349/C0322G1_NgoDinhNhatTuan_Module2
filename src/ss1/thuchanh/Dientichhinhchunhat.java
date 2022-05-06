package ss1.thuchanh;

import java.util.Scanner;

public class Dientichhinhchunhat {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner =new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Enter width(Nhập chiều dài): ");
        width = scanner.nextFloat();

        System.out.println("Enter height(Nhiều chiều rộng): ");
        height = scanner.nextFloat();
        float area = width*height;

        System.out.println("Area is: "+ area);
    }
}
