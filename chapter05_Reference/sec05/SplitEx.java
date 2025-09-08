package ch05.sec05;

public class SplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String board = "1,자바 학습, 참조 타입 String을 학습합니다. , 홍길동";
//문자열 분리
String[] tokens = board.split(",");
//인덱스별로 읽기

System.out.println("번호 " + tokens[0]);
System.out.println("제목 " + tokens[1]);
System.out.println("내용 " + tokens[2]);
System.out.println("성명 " + tokens[3]);
System.out.println();
//for문을 이용한 읽기

for(int i = 0 ; i <tokens.length; i++) {
	System.out.println(tokens[i]);
	
}
System.out.println("split(',')같은경우에는 공백-콤마-공백 에서만 매칭이 된다 즉 띄어쓰지 마라");
	}

}
