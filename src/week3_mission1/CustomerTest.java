package week3_mission1;

public class CustomerTest {

    public static void main(String[] args) {

        Red customer1 = new Red("James", 10000, 2);
        Red customer2 = new Red("Tomas", 30000, 2);
        Platinum customer3 = new Platinum("Edward", 10000, 2);
        Platinum customer4 = new Platinum("Percy", 30000, 2);
        Diamond customer5 = new Diamond("Elizabet", 30000, 2);


        System.out.println(customer1.showCustomerInfo());
        System.out.println(customer2.showCustomerInfo());
        System.out.println(customer3.showCustomerInfo());
        System.out.println(customer4.showCustomerInfo());
        System.out.println(customer5.showCustomerInfo());

    }
}
