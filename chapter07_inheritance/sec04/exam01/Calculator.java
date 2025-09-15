package ch07.sec04.exam01;

public class Calculator {
//    메소드 선언
    public double areaCircle(double radius){
        System.out.println("Calculator 객체의 areaCircle()실행");
//      return은 호출자에게 돌려줄값을 지정하는 구문
//        상수가 올수도있고 지금처럼 수식이 올수도 있다.
//        위식은 원의 넓이를 계산해서 그 결과값을 돌려주기 위해 식을 넣은것임
        return  3.14159 *radius * radius;
    }
}
