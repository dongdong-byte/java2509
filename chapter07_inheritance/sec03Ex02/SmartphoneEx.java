package ch07.sec03Ex02;


public class SmartphoneEx {
    public static void main(String[] args) {
        //        smartphone객체 생성
        SmartPhone smartPhone = new SmartPhone("갤럭시","은색");
        // phone으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + smartPhone.model);
        System.out.println("색상 : " + smartPhone.color);
    }
}
