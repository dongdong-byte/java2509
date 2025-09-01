package ch02.sec06;

public class TextBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 ="" + 
		"{\n"+
		"\t\"id\":\"winter\",\n"+
		"\t\"name\":\"눈송이\",\n"+
		 "}";
//	텍스트 블록(""" ... """):
//시작 """ 다음 줄부터 본문이 시작됩니다. 시작 라인에 문자를 넣지 마십시오.
 
//닫는"""는 내용의 최소 들여쓰기와 같은 열(column)에 위치해야 합니다.
String str2 = """ 
		
		{ 
		"id": "winter", "name": "눈송이" 
		} 
		
		""";

	System.out.println(str1);
	System.out.println("----------------");
	System.out.println(str2);
	System.out.println("-------------------");
	String str ="""
			나는 자바를 
			학습합니다.
			나는 자바 고수가 될겁니다.
			""";
	System.out.println(str);
	}


}
