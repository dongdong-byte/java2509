package ch04.sec06;


import java.util.Scanner;
public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("while문은 옆에 있는 조건식을 보고 참이면 실행 거짓이면 빠져 나온다.");
System.out.println("하지만 블록 내부를 먼저 실행하고 실행결과에따라 반복 실행을 할지 결정하는 경우가 있다.");
System.out.println("do-while문은 이런 경우에 적합하다.");
System.out.println("do{1.일단 실행할식}while(2.1번 식에 따라 세울 조건); 2번식이 false이면 do-while문은 종료한다.");
System.out.println("================================================");

System.out.println("메세지를 입력하세요.");
System.out.println("프로그램을 종료하려면 ''q'를 입력하세요");
Scanner scanner = new Scanner(System.in);
String inputString;

do {
	System.out.println(">");
	inputString = scanner.nextLine();
	System.out.println("출력 결과 : " + inputString);
	}while(!inputString.equals("q"));
System.out.println();
System.out.println("프로그램종료");
System.out.println("================================================");
System.out.println("문자열을 비교하는 문법은  equals 또는 equalsIgnoreCase 등을 사용해야 합니다.");
	}

}
