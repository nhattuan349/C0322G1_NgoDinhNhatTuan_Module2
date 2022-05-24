package Nhap.LopvaDoiTuong;

public class Cat {
    private String name;
    private int age;
    private float weight;
    private String color;
    private String eyesColor;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println(name + " is speaking");
    }

    public void move() {
        System.out.println(name + " is running");
    }

    public void sleep() {
        System.out.println();
    }

    public void eat() {

    }
}
