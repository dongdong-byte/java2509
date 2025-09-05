package ch04.sec02;

public class IFNestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("81~100중에서 하나의 점수를 뽑아서 95점이면 A+ ,90점이면 A,85점이면 B+,80점이면 B 가 나오게 작성");
System.out.println("----------------------");
int score =(int ) (Math.random()*20)+81;
String grade;
if(score>=90) {
	if(score>=95) {
		grade = "A+";
	}else {
		grade = "A";
	}
}
else if(score>=81) {
	if(score>=85) {
		grade = "B+";
	}else {
		grade = "B";
	}
System.out.println("당신의 학점은"  + grade+ "입니다.");
}
System.out.println("----------------------");
System.out.println("중첩 if문을 사용해서 세부적으로 학점을 구분할수 가 있다.");
System.out.println("String grade; 처럼 if 구문에서 사용할거면  if  바깥에서 선언하는게 맞다.");
	}
	
}
