package week3_mission1.question2;

public class WhippedCream extends Decorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding WhippedCream");
    }
}
