package week3_mission1.question2;

public class Latte extends Decorator {

    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Milk");
    }
}
