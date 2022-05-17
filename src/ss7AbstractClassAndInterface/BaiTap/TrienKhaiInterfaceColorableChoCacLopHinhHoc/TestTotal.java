package ss7AbstractClassAndInterface.BaiTap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class TestTotal {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[3];
        shapeList[0] = new Circle(5,"vang",false);
        shapeList[1] = new Rectangle(5,6,"Xanh lá",true);
        shapeList[2] = new Square("Đỏ",true,5);
        for (int i = 0; i <shapeList.length ; i++) {
            System.out.println("Area= "+shapeList[i].getArea());
            if (shapeList[i] instanceof Square){
                ((Square) shapeList[i]).howToColor();
            }
        }
    }
}

