package week2_mission2;

class HyundaiFactory {
    private static int serialNum = 1000;
    private static HyundaiFactory factory = new HyundaiFactory();
    private HyundaiFactory() {} //기본생성자
    public static HyundaiFactory getFactory() {
        return factory;
    }

    public Car createCar() {
        Car car = new Car(serialNum);
        serialNum++;
        return car;
    }
}

class Car {

    public int carNum;

    public Car(int carNum) {
        this.carNum = carNum;
    }
    
    public int showCarNumber() {
        return carNum;

    }
}

public class CarTest {

    public static void main(String[] args) {

    /* 1. H자동차 공장에서 자동차를 생산합니다. 자동차가 새로 생산되면 자동차마다 새로운 번호가 부여됩니다.
          H자동차 공장은 이 세상에 하나만이 존재합니다. 생산되는 자동차들은 각 식별 번호를 가집니다.
          다음 코드가 실행될 수 있도록 자동차와 자동차 공장을 구현하세요 */
        // 첫번째 차 번호는 1000
        // 두번째 차 번호는 1001

        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();

        System.out.println("첫번째 차 번호는 " + myCar.showCarNumber());
        System.out.println("두번째 차 번호는 " + yourCar.showCarNumber());



    }

}
