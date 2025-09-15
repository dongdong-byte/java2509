package ch06.sec13.exam03.package1;

public class B {
//    method를 호출한다.
    public void method() {
//        a 객체 생성
        A a = new A();
//        필드값변경
        a.field1 = 2;
        a.field2 = 2;
//        field3이 private속성을 가져서 A 클래스 내에서만 사용이 가능하다->B같은 다른 클래스에서는 사용이 안된다
//a.field3 =1;
//        메소드 호출
        a.method1();
        a.method2();
//       method3이 private속성을 가져서 A 클래스 내에서만 사용이 가능하다->B같은 다른 클래스에서는 사용이 안된다
//        a.method3();


    }
}
