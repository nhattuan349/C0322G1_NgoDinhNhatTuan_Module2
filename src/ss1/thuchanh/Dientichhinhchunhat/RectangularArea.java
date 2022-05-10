package ss1.thuchanh.Dientichhinhchunhat;

import java.util.Scanner; //import thu vien

public class RectangularArea { //tao class
    public static void main(String[] args) { //tao ham main
        float width; // khai bao bien khong gan gia tri
        float height;// khai bao bien khong gan gia tri

        Scanner scanner =new Scanner(System.in);//Khai báo đối tượng Scanner, scanner là bien doi tuong

        System.out.println("Enter width(Nhập chiều dài): ");// Hien ra man hinh
        width = scanner.nextFloat(); //

        System.out.println("Enter height(Nhiều chiều rộng): ");
        height = scanner.nextFloat();
        float area = width*height;

        System.out.println("Area is: "+ area);
    }
}
