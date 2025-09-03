package ch03.sec07;

public class LogicOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int chcode = 'A';
//int chcode = 'B';
//int chcode = 5;

if((65<=chcode)&(chcode<=90)) {
	System.out.println("대문자 이시군요.ㅎㅎ");
}
if((97<=chcode)&(chcode<=122)) {
	System.out.println("소문자 이시군요.ㅎㅎ");
}
if((48<=chcode)&&(chcode<=57)) {
	System.out.println("0-9숫자 이시군요.ㅎㅎ");
}
System.out.println("------------------");

int value=6;
//int value = 7;
//
if((value%2==0)| (value%3==0)) {
	System.out.println("2또는 3의 배수이시군요.ㅎㅎㅎ");
}

boolean result1 = (value%2==0) || (value%3==0);
if(!result1) {
	System.out.println("2또는 3의 배수가 아니시군요 ㅎㅎㅎ");
}
}


	}


