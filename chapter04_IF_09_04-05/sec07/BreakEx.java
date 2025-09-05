package ch04.sec07;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("break문은 if 하고 같이 사용 되면 for하고 while 문을 종료시키는 역할을한다.");
System.out.println("break는 일종의 출구 라고 생각하면 된다. break가 없다는건 출구가 없고 입구만 있는 건물이라고 생각하면 된다.");
System.out.println("while문을 이용해서 주사위 번호중 하나를 반복적으로 뽑다가 6 이나오면 중단하는 코드작성하자");
System.out.println("================================================");

while(true) {
	int num = (int)(Math.random()*6)+1;
	System.out.println(num);
	if(num==6) {
		break;
	}
	
}
System.out.println("프로그램을 종료합니다.");
System.out.println("==============");
System.out.println("while 조건문을 true라고 선언해서 break문 이라는 출구가 필요했다,");
	}
	
}
