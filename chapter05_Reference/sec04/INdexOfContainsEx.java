package ch05.sec04;

public class INdexOfContainsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열에서 특정 문자열의 위치를 찾고자 할때는 indexOf()메소드를 사용한다.");
		System.out.println("indexOf()는 0부터 시작이 되고, 위치를 숫자로 변환해서 위치에 대향하는 단어가 있는지 if구문으로 확인할수 있다.");
		System.out.println("이때 if구문은 숫자로 조건식을 구성하면된다.");
		System.out.println("만약 단순히 단어가 있는지만 확인하고 싶을때는 contains()함수를 사용하면 된다.");
		
		System.out.println("================================================");
		System.out.println("자바 프로그래밍 단어를 사용해서 위치 값을 확인하고 '자바'라는 단어가 나오도록 2가지 코드를 짜봐라");
String subject = "자바 프로그래밍";
int location = subject.indexOf("프로그래밍");
System.out.println(location);
String substring = subject.substring(location);
System.out.println(substring);

location = subject.indexOf("자바");
if(location != -1) {
	System.out.println("자바와 관련된 책이군요.");
}else {
	System.out.println("자바와 관련없는 책이군요.");
}

boolean result = subject.contains("자바");
if(result) {
	System.out.println("자바와 관련된 책이군요.");
}else {
	System.out.println("자바와 관련없는 책이군요.");
}
	}

}
