package week3_mission1.question2;

public abstract class Decorator extends Coffee {

    Coffee coffee;
    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
