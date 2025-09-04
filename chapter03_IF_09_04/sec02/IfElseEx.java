package ch04.sec02;

public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if(조건문){조건문이 true 일때 실행하는식}else{조건문이 flase일때 실행하는식}");
		System.out.println("----------------------");

int score = 85;

if(score>=90) {
	System.out.println("점수는 90 점보다 더 큽니다.");
	System.out.println("등급은 'A'등급입니다.");
}else {
	System.out.println("점수는 90 점보다 더 작습니다.");
	System.out.println("등급은 'B'등급입니다.");
	
}
System.out.println("----------------------");

System.out.println("앞에 IfEx하고 다른점은 앞에 식은 if 구문을 별개로 2개나 썻다는것이고.");
System.out.println("이식은 else 를 사용해서 false가 나올때   else  뒤에 있는 식을 발동시켜서 가독성을 높였다는것이다.");
	}

}
