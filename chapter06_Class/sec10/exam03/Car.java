package sec10.exam03;

public class Car {
//    인스턴트 필드 선언
int speed;
//    인스턴트 메소드 선언
void run(){
    System.out.println(speed + "으로 달립니다.");
}
    static void  simulate(){
//        객체 생성
        Car mycar =new Car();
//인스턴스 맴버 사용
        mycar.speed=200;
        mycar.run();
    }
    public static void main(String[] args) {
//        정적 메소드 호출
        simulate();
//        객체 생성
        Car mycar =new Car();
        mycar.speed = 70;
        mycar.run();
    }
}
