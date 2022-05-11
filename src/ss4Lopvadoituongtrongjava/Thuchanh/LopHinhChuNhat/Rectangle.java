package ss4Lopvadoituongtrongjava.Thuchanh.LopHinhChuNhat;

public class Rectangle {
    double width, height;// trường

    public Rectangle() {// Hàm khởi tạo hai tham số
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String displayRectangle() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
