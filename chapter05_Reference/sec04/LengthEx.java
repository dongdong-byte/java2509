package ch05.sec04;

public class LengthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("9506241230123 은 13자리 주민등록번호가 맞는가?");
String ssn = "9506241230123";
int length = ssn.length();

if(length == 13) {
	System.out.println("주민등록번호 자릿수가 맞습니다.");
}else {
	System.out.println("주민등록번호 자릿수가 틀립니다.");
}
System.out.println("length변수에는 ssn.length()의 결과가저장이 된다. 즉 ssn에서 입력한 글자수가 그대로 들어간다.");
System.out.println("ssn=9506241230123으로 선언 햇으므로  글자수가 13개 이므로 length에는 13이 저장이 된다.");
System.out.println("ssn이 13자리 숫자가 맞는지 확인해보라고 했으므로 if조건식에 length == 13 이란 조건식을 넣은거임");
	}

}
