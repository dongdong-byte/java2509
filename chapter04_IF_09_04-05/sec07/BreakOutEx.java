package ch04.sec07;

public class BreakOutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("반복문이 중첩되어 있을경우,break문은 가장 가까운 반복문만 중단시킨다.");
System.out.println("중첩된 반복문에서 바깥쪽 반복문까지 종료 시키고 싶다면 바깥쪽 반복문 이름(레이블)을 붙이고 break 이름 ; 을 사용하면 된다.");
System.out.println("밑의 예제는 바깥쪽 for문은 a~z까지 반복을 하고 중첩된 for문은 A~Z까지 반복을한다.");
System.out.println(" 중첩된 for문에서 lower변수가 g를 가지게 되면 for문이 종료되도록 Outter란 라벨을 붙인다.");
System.out.println("================================================");

Outter: for(char upper='A'; upper<='Z';upper++) {
	for(char lower='a'; lower<='z'; lower++) {
		System.out.println(upper + "-" + lower);
		System.out.println("아스키 코드 lower값" + (int)lower);
		System.out.println("아스키 코드 upper값" + (int)upper);
		if(lower == 'g') {
			break Outter;
		}
	}
}
	System.out.println(" 결과: 프로그램 실행 종료");
	System.out.println("================================================");
System.out.println("char함수를 사용해서 upper,lower함수를 정의하고 ++증감연산자를 사용해서 문자가 다음번으로 돌아가도록 설정했다.");
	System.out.println("if문을 사용해서 lower함수가 g가 나올때 종료하도록 break를 사용했다.");
	}
	

}
