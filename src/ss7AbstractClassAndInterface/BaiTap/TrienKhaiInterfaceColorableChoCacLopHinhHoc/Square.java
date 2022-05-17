package ss7AbstractClassAndInterface.BaiTap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class Square extends Shape implements Colorable {
    public int side;

    public Square(){

    }

    public Square(int side) {
        this.side = side;
    }

    public Square(String color, boolean filled, int side) {
        super(color, filled);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Lớp Square tô màu cả bốn mặt");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
