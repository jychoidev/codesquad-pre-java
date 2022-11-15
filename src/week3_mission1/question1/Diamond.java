package week3_mission1.question1;

public class Diamond extends Member {

    private int agentID; // 전문 상담원 (다이아몬드 only)

    public Diamond(String customerName, int shoppingPrice, int stayHour) {
        super(customerName, shoppingPrice, stayHour);
        customerGrade = "DIAMOND";
        discountRatio = 0.1;
        bonusRatio = 0.1;
        parkingFee = 0;
    }
}
