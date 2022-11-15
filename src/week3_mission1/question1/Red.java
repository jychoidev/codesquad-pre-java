package week3_mission1.question1;

public class Red extends Member {

    public Red(String customerName, int shoppingPrice, int stayHour) {
        super(customerName, shoppingPrice, stayHour); // 상위클래스 접근
        customerGrade = "RED"; // RED 등급: 할인률 적용 없음, 1% 포인트 적립, 주차요금 시간당 3000원
        discountRatio = 0;
        bonusRatio = 0.01;
        parkingFee = stayHour * 3000;
    }
}
