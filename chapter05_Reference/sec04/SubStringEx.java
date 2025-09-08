package ch05.sec04;

public class SubStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("substring()함수는 특정위치 문자열을 자를때 사용하는 함수이다.");
		System.out.println("substring(0,6)은 0번부터 6번째에 앞까지 자른다는것임 즉 6번째에 자르니까 6번째 문자열이 안나옴");
		System.out.println("substring(7) 7번째부터 끝까지 자르는것이다.");
		System.out.println("숫자 880815-1234567을 자르는 코드임");
		System.out.println("==============================");
String ssn = "880815-1234567";

String firstNum = ssn.substring(0,6);
System.out.println(firstNum);

String secondNum = ssn.substring(7);
System.out.println(secondNum);

	}

}
