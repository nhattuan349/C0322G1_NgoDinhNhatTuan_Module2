package ss5AccessModifierStaticMethodStaticProperty.Baitap.AccessModifier;

public class CircleModel {
    public static void main(String[] args) {
        CircleClassRun circle1 =new  CircleClassRun(3.0, "green");
        System.out.println("Hình tròn có bán kính: " + circle1.getRadius() + " và diện tích: " + circle1.getArea());
        System.out.println("Màu Sắc hình tròn: " + circle1.getColor());
    }
}
