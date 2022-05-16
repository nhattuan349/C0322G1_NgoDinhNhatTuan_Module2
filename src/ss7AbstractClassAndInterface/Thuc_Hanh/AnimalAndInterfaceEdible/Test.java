package ss7AbstractClassAndInterface.Thuc_Hanh.AnimalAndInterfaceEdible;

public class Test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        for (Animal a: animal) {
            System.out.println(a.makeSound());
            if (a instanceof Chicken){
                System.out.println(((Chicken) a).howtoEat());
            }
        }

    }
}

