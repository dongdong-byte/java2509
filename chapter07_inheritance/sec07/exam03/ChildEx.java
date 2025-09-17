package ch07.sec07.exam03;

public class ChildEx {
    public static void main(String[] args) {
//        객체 생성및 자동 타입변환
        Parent parent = new Child();
//         Parent 타입으로 필드하고 메소드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//        강제 타입 변환
        Child child = (Child) parent;
//        Child 타입으로 필도와 메소드 사용
        Child.field2 = "data3";
        child.method3();


    }
}
