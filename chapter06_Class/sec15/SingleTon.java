package ch06.sec15;

public class SingleTon {
//    private 접근 권한을 가지고 있는 정적 필드 선언과 초기화
    private static SingleTon singleTon = new SingleTon();
//    private 접근 권한을 가지는 생성자 선언
    private  SingleTon() {

    }
//    public  접근권한을 가지는 정적 메소드 선언
    public static SingleTon getInstance(){
        return singleTon;

    }

}
