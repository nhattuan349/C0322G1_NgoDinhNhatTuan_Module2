package ss4Lopvadoituongtrongjava.Thuchanh.LopHinhChuNhat;

import java.util.Scanner;

public class ClassRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height: ");
        double height = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle: \n" + rectangle.displayRectangle());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }


}