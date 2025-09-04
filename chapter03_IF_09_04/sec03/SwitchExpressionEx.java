package ch04.sec03;

public class SwitchExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("자바 12버젼 이후에는 switch 문에서 expression (표현문)을 사용할수 있다. 즉 화살표하고 중괄호를 사용해서 가독성이 좋아진다.");
		System.out.println("----------------------");
		char grade = 'B';
		switch (grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");}
			
		case 'B' , 'b' ->{ 
			System.out.println("일반 회원입니다.");}
		
			default ->{
				System.out.println("손님입니다.");}
		}
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다.");
		case 'B' , 'b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다.");
		}
		System.out.println("----------------------");
		 System.out.println("case 'A', 'a' -> { 식} 이렇게 발동해도 된다 , 하지만 이럴 경우에는 default값을 꼭넣어야한다.");
	}

	}
