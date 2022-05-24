package Nhap.LopvaDoiTuong;

public class ClassObjects {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom","Green");

        System.out.println("Cat's name: "+tom.getName());
        System.out.println("Cat's age: "+tom.getAge());
        System.out.println("Cat's age: "+tom.getColor());
        tom.move();

    }
}

