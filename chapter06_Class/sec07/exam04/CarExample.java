package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("서로 다른 초기화 요구가 있는경우(아래 예제 처럼 다양한 차종, 색깔이 필요한경우) 생성자 오버로딩을 통해 매개 변수 구성을 달리한 여러 생성자를 제공하면 객체의 필드 값을 간편하게 초기화 할수가있다. ");
System.out.println("이는 중복 코드를 감소 시키고, 코드의 가독성을 향상할수가 잇다");
//		1번 생성자 호출
		
Car car1 = new Car();
System.out.println("car1.company: " + car1.company);
System.out.println();
//2번 생성자 호출

Car car2 = new Car("자가용");
System.out.println("car2.company: " + car2.company);
System.out.println("car2.model: " + car2.model);
System.out.println();
//3번 생성자 호출
Car car3 = new Car("제네시스","은색");
System.out.println("car3.company: " + car3.company);
System.out.println("car3.model: " + car3.model);
System.out.println("car3.color: " + car3.color);
System.out.println();

//4번 생성자 호출
Car car4 = new Car("소나타","파란색",250) ;
System.out.println("car4.company:"+ car4.company);
System.out.println("car4.model:" + car4.model);
System.out.println("car4.color: " + car4.color);
System.out.println("car4.:maxspeed" + car4.maxspeed);
	

System.out.println(" 1번 생성자 :자바에서 생성자를 호출할때는 클래스 이름을 사용해야 하므로 new +클래스 이름()이렇게 나와야한다.");
System.out.println("ㅅ");
	}

}
