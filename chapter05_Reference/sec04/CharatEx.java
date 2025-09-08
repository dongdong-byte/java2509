package ch05.sec04;

public class CharatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("주민등록번호에서 성별에 해당하는 7번재 문자를 읽고 남자 또는 여자인지를 출력하자");
String ssn = "9506241230123";
char sex = ssn.charAt(6);
switch (sex) {
	case '1' :
	case '3' :
	System.out.println("남자입니다.");

break;

	case '2' :
	case'4' :
		System.out.println("여자입니다.");

}
System.out.println("배열은 0에서부터 시작한다 따라서 7번재 숫자라고 하지만 실제 문자열 입력할때는 6을 친다.");

	}

}
