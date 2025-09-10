package ch05.sec11;

public class MainStringArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Sum 실행 입력 값이 2개가 아닐경우 입력값이 부족함을 알리고 강제로 종료한다. 그리고 2개의 결과 값이 입력 되었을때만 덧셈의 결과를 출력한다.");

if(args.length != 2) {
	System.out.println("프로그램 입력 값 부족");
//	프로그램 강제 종료
	System.exit(0);
	
}
//첫번째, 두번째 데이터 얻기
String StrNum1 = args[0];
String StrNum2 = args[1];
//문자열을 정수로 변환
int num1 = Integer.parseInt(StrNum1);
int num2 = Integer.parseInt(StrNum2);
int result = num1+num2;
System.out.println(num1 + " + " + num2 + " = " + result);
	System.out.println("===============");
	System.out.println("이클립스에서 바로 실행하면'프로그램 입력값이 부족'으로 출력이 된다 실행시 입력 값을 주지 않아서이다.");
	System.out.println("이클립스 run -> run configurations -> arugments에서 10, 20 이란 숫자를 입력하고 run을 누른다.");
	
	}
	
}
