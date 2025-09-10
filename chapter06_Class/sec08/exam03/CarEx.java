package ch06.sec08.exam03;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		car 객체 생성
Car mycar = new Car();
// 리턴값이 없는 setGas()메소드 호출
mycar.setGas(5);
//isLeftGas()메소드 를 호출해서 받은 return 값이 true일경우 if블록 실행
if(mycar.isLeftGas()) {
	System.out.println("출발합니다.");
//	리턴 값이 없는 run() 메소드 호출
	mycar.run();
	
}
System.out.println("가스를 주입하세요");
	}

}
