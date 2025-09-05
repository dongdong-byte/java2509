package ch04.sec03;

public class SwitchNoBreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("case끝에 있는 break는 다음 case 를 실행하지 않고 switch문을 빠져 나가기 위해 필요하다.");
System.out.println("만약 break 가 없다면, 다음 case 가 연달아서 실행되는데 이때는 case 값과 상관없이 실행된다.");
System.out.println("----------------------");
int time =((int)Math.random()*4) +8;
System.out.println("[현재 시간 :" + time + "시]");
switch(time) {
case 8:
	System.out.println("출근합니다.");
case 9 : 
	System.out.println("회의를 합니다.");
case 10:
	System.out.println("업무를 봅니다.");
	default :
	System.out.println(" 외근을 나갑니다.");
}
System.out.println("----------------------");
System.out.println("default는 뒤에 : 를 붙여야한다.");
}
	

}
