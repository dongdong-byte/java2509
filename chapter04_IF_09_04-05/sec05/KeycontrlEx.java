package ch04.sec05;
import java.util.Scanner;
public class KeycontrlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while문 조건식에 true를 적용하면 while문이 무한 반복을 한다. ");
System.out.println("이때 while문을 빠져나가기 위한 코드가 필요한다");
System.out.println("키보드에서 1,2를 입력했을때 속도를 증가, 감소 시키고, 3을 입력하면 종료하는 while문을 만들기");
System.out.println("================================================");

Scanner scanner= new Scanner(System.in);
boolean run =true;
int speed = 0;
while(run ) {
	
	System.out.println("-------------");
	System.out.println("1.증속 || 2. 감속 || 3.중지");
	System.out.println("-------------");
	System.out.println("선택: " );
	
	String strNum= scanner.nextLine();
	if(strNum.equals("1")) {
		speed++;
		System.out.println("현재 속도 = " +speed);
		
	}else if (strNum.equals("2")) {
		speed++;
		System.out.println("현재 속도 = " +speed);
	}
	else if (strNum.equals("3")) {
		run= false;
		System.out.println("프로그램 종료");
	}
}

System.out.println("run이란 변수를 true로 선언해서 while이 무한 반복할 할뻔했으나, 마지막에 run이란 변수를 false로 선언해서 무한반복을 빠져 나온다.");
System.out.println("scanner변수는 별로 안쓴다. 여기서만 그런게 있다고 알기.");	
	
	}

}
