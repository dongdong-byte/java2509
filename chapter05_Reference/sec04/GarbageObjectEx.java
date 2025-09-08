package ch05.sec04;

public class GarbageObjectEx {
	public static void main(String[] args) {
		String  hobby = "여행";
		hobby = null;
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null ; 
		System.out.println("kind2"+kind2);
		
		System.out.println("================");
		System.out.println("hobby객체를 null로 선언해서 String객체를 쓰레기로 만듦");
		System.out.println("자동차에 해당하는  String 객체는 쓰레기가 아님");
		
		
	}
}
