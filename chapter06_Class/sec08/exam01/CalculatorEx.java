package ch06.sec08.exam01;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메소드 method는 객체가 동작할것을 미리 정하는것을 지정해주는것이다.");
		System.out.println("메소드 호출은 실행 블록을 메소드에서 정한 동작으로 실행하게끔하는것이다.");
		System.out.println("메서드는 다른 객체에서도 호출될수 있기때문에 객체간의 상호작용 방법을 정의 하는것이라고 볼수 있다.");
		System.out.println("메소드 선언 방법 -> 리턴타입 메스드명(매개변수){실행블록-> 실행 코드 작성}");
		System.out.println("리턴값이 없는 메소드는 void로 작성해야한다.");
System.out.println("다음 예제는Calculator클래스에서 선언된 poweron,poweroff,plus,divide메소드를 호출한다. ");
		// calculater 객체 생성
		Calculator myClac= new Calculator() ;
//		리턴값이 없는 poweron메소드 호출
		myClac.powerOn();
//		plus 메소드 호출시 5와 6을 매개값으로 지정하고,
//		덧셈 결과를 리턴받아 result1변수에 대입
		int result1 = myClac.plus(5,6);
		System.out.println("result1: "+result1);
		int x =10;
		int y = 4;
//		divide()메소드 호출시 변수 x하고 y의 값을 매개값으로 제공하고, 
//		나눗셈결과를 리턴받아 result2 변수에 대입
		double result2 = myClac.divide(x, y);
		System.out.println("result2: "+result2);
//		리턴 값이 없는 poweroff()메소드 호출
		myClac.powerOff();
	
	}

}
