package ch05.sec04;

public class ReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장에서 특정 문자열만 다른걸로 대체하고 싶다고 하면 replace()함수를 하요하면된다.");
		System.out.println("함수식 : replace(원래 문장에서 바꾸고 싶은단어, 바꿀단어)");
		System.out.println("자바->JAVA로 바꾸는 코드임");
		System.out.println("==============================");
String oldstr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
String newstr = oldstr.replace("자바", "JAVA");
System.out.println(oldstr);
System.out.println(newstr);
	}

}
