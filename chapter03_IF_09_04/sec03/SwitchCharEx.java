package ch04.sec03;

public class SwitchCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("switch문에는 정수타입(byte, char, short,int ,long)과 문자열 타입(string )변수를 사용할수 있다.");
System.out.println(" 실수타입의 변수  double, float는 올수가 없다.");
System.out.println("char타입 변수를 이용해서 영어 대소문자 에 관계없이 똑같이 처리하는 예제");
System.out.println("----------------------");
char grade = 'B';
switch (grade) {
case 'A' : 
case 'a' : 
	System.out.println("우수 회원입니다.");
	break;
case 'B' : 
case 'b' : 
	System.out.println("일반 회원입니다.");
	break;
	default:
		System.out.println("손님입니다.");
}
System.out.println("----------------------");
System.out.println("case 'A' 하고case a를 나란히 두어서 A,a둘중 하나에 해당이 되면 식이 발동한다");
	}

}
