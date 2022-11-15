package week3_mission1;

public class CustomerTest {

    public static void main(String[] args) {

        Red customer1 = new Red("James", 0, 2);
        Red customer2 = new Red("Tomas", 0, 2);
        Platinum customer3 = new Platinum("Edward", 0, 2);
        Platinum customer4 = new Platinum("Percy", 0, 2);
        Diamond customer5 = new Diamond("Elizabet", 0, 2);


        System.out.println(customer1.showCustomerInfo(10000));
        System.out.println(customer2.showCustomerInfo(30000));
        System.out.println(customer3.showCustomerInfo(10000));
        System.out.println(customer4.showCustomerInfo(30000));
        System.out.println(customer5.showCustomerInfo(30000));

    }
}
