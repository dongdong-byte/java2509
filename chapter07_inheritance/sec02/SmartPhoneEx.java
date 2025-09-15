package ch07.sec02;

public class SmartPhoneEx {
    public static void main(String[] args) {
//        smartphone객체 생성
        SmartPhone smartPhone = new SmartPhone("갤럭시","은색");
// phone으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + smartPhone.model);
        System.out.println("색상 : " + smartPhone.color);
//        smartphone으로부터 상속받은 필드 읽기
        System.out.println("와이파이상태 : " + smartPhone.wifi);
//        phone 으로부터 상속받은 메소드 호출
        smartPhone.bell();
        smartPhone.sendVoice("여보세요");
        smartPhone.receiveVoice("안녕하세요 저는 김동현입니다.");
        smartPhone.sendVoice("아~~네 반갑습니다.");
        smartPhone.hangup();
//        smartphone의 메소드 호출
        smartPhone.setWifi(true);
        smartPhone.internet();

    }
}
