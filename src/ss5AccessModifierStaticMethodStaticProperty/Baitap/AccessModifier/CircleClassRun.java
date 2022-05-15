package ss5AccessModifierStaticMethodStaticProperty.Baitap.AccessModifier;

public class CircleClassRun {
    private double radius = 1.0;
    private String color = "color";

    public CircleClassRun() {
    }

    public CircleClassRun(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
