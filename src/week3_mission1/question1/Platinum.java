package week3_mission1.question1;

public class Platinum extends Member {

    public Platinum(String customerName, int shoppingPrice, int stayHour) {
        super(customerName, shoppingPrice, stayHour);
        customerGrade = "PLATINUM";
        discountRatio = 0.05;
        bonusRatio = 0.05;
        parkingFee = stayHour * 1000;
    }
}
