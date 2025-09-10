package ch06.sec07.exam05;



public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1번 생성자 호출
		Car car1 = new Car("자가용");
		System.out.println("car1.company: " + car1.company);
		System.out.println("car1.model: " + car1.model);
		System.out.println();
		//2번 생성자 호출
		Car car2 = new Car("제네시스","은색");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color);
		System.out.println();

		//3번 생성자 호출
		Car car3 = new Car("소나타","파란색",250) ;
		System.out.println("car3.company:"+ car3.company);
		System.out.println("car3.model:" + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxspeed : " + car3.maxspeed);
			
// 생성자 오버로딩이 많아질수록 중복 코드가 발생할수가 있다. 이때 공통코드를 한생성자에 집중적으로 작성하고
//		나머지 생성자는 this(...)구조를 이용해서 공통코드가 가지고 있는 생성자를 호출하는 방법으로 개선할수 있다.
//		this(매개값1, 매개값2,변수)이런구조로 간다
	}

}
