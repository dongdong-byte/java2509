package ch04.sec02;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("조건문에는 if,switch문이 있고.");
		System.out.println("반복문에는 for, while, do-while 문이 있다");
		System.out.println("----------------------");
		
		
int score = 93;
if(score>=90) {
	
	System.out.println("점수는 90 점보다 더 큽니다.");
	System.out.println("등급은 'A'등급입니다.");
}
if(score<90) {
	System.out.println("점수는 90 점보다 더 작 습니다.");
	System.out.println("등급은 'B'등급입니다.");
}
System.out.println("----------------------");

System.out.println("if->if(조건문){조건이 true 일때 실행하는식}->만약 false면 괄호 밑에 있는 식을 실행한다.");
System.out.println("'등급은 'B'등급입니다.'이 문은 if문하고는 상관이 없는 실행문이다.");
 System.out.println("if에서는 가급적이면 중괄호 {}를 사용해야한다.");
 System.out.println("이식에 문제점은 if 구문을 2번 따로 실행해서 가독성이 떨어진다는것이다. 식이 여려개가 있으면 이렇게 난잡하게 하면 안된다.");


	}

}
