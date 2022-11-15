package week3_mission1.question1;

public class Member {

    protected String customerName; //고객 이름
    protected String customerGrade; //고객 등급
    protected int shoppingPrice; //쇼핑 금액
    protected double discountRatio; //할인률
    protected int bonusPoint; //적립 포인트
    protected double bonusRatio; //포인트 적립 비율
//    protected int agentID; //전문 상담원 (다이아몬드 only)
    protected int stayHour; //머문 시간
    protected int parkingFee; //주차 요금

    // 매개변수(고객 이름, 쇼핑 금액, 머문 시간) 있는 생성자
    public Member(String customerName, int shoppingPrice, int stayHour) {
        this.customerName = customerName;
        this.shoppingPrice = shoppingPrice;
        this.stayHour = stayHour;
    }

    // 금액 계산 메소드
    public int calcPrice(int shoppingPrice) {
        bonusPoint = (int)(shoppingPrice * bonusRatio); //적립 포인트
        return shoppingPrice - (int)(shoppingPrice * discountRatio); //지불 금액
    }

    // 고객정보 출력 메소드
    public String showCustomerInfo(int shoppingPrice) {
        return customerName + "님의 지불 금액은 " + calcPrice(shoppingPrice) + "원이고, 적립 포인트는 "
                + bonusPoint + "점 입니다. " + "\r\n" + "주차 요금은 " + parkingFee + "원 입니다.";
    }

}



