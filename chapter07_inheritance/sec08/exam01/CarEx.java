package ch07.sec07.sec08.exam01;

public class CarEx {
    public static void main(String[] args) {

//        car객체 생성
        Car car = new Car();
//        tire 객체 장착
        car.tire = new Tire();
        car.run();
//한국타이어 장착
        car.tire = new HankookTire();
        car.run();
//        금호 타이어 장착
        car.tire = new KumhoTire();
        car.run();

    }
}
