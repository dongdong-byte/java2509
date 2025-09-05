package ch04.sec02;

public class IFElseIfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("if(조건식1){조건식1이 true  일때 실행}else if(조건식2){조건식1이 flase 일때 조건식2는 true일때 실행}else{조건식1이 flase 이고 조건식2도 flase일때 실행}");
System.out.println("----------------------");

int score = 75;

if(score>=90) {
	System.out.println("점수는 90 점보다 더 큽니다.");
	System.out.println("등급은 'A'등급입니다.");
}else if(score >=80){
	System.out.println("점수는 80-89 점입니다.");
	System.out.println("등급은 'B'등급입니다.");}
else if (score>=70) {
	System.out.println("점수는 70-79 점입니다.");
	System.out.println("등급은 'C'등급입니다.");
}else {
	System.out.println("점수는 70점 미만 입니다.");
	System.out.println("등급은 ' D'등급입니다.");
}
System.out.println("----------------------");
System.out.println("else if 를 사용하면 여러개의 if  구문을 한번에 사용할수가 있다.");
System.out.println("if문에 진행방향은 위에서 아래이다. 위가 true   가 안나오면 밑에 else if 식을 실행해서 조건문2를 실행하는 구조이다.");
System.out.println("모든 조건이 false 라면 else if를 또 쓸필요 없이   else 만 사용하면된다.");

	
	
	
	}

}
