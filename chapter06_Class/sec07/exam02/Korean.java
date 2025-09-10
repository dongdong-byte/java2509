package ch06.sec07.exam02;

public class Korean {
//필드 선언
//	객체마다 동일한 값을 가지고 있다면 필드선언시 초기 값을 대입하는것이 좋고, 객체마다 다른값을 가져야한다면 초기값을 초기화 시켜야한다.
//	자바는 데이터를 삭제 할수가 없다. 그래서 일일이 바꾸어야한다.
//	ssn->주민등록 번호
	String nation = "대한민국";
	String name;
	String ssn;
//	생성자 선언
//	생성자의 매개값은 new연산자로 생성자를 호출할때 주어진다.
//	n,s가 참조하는 객체는 주어진 매개 값으로 , name과 ssn필드 가 초기화 된다
	public Korean(String n , String s) {
		name = n ;
		ssn = s ;
	}
}
