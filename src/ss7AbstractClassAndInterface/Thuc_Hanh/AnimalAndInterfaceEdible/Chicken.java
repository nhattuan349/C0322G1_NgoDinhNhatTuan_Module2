package ss7AbstractClassAndInterface.Thuc_Hanh.AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Gà keo O O O";
    }

    @Override
    public String howtoEat() {
        return "Mổ thoc";
    }
}
