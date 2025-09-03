package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//문자 저장
			char c1 ='A';
	//유니코드 직접 저장
	char c2 =65;
	//문자 저장
	char c3 ='가';
	//유니코드 직접 저장
//	문자 '가'의 코드값 컴퓨터는 '가'가 아니라 44032로 인식을한다
	char c4 =44032;

	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	}

}
