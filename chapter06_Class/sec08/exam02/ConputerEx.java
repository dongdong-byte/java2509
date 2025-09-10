package ch06.sec08.exam02;

public class ConputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//computer 객체 생성
		Computer myCom = new Computer();
//		합산결과를 리턴받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : "+ result1);
//		sum()메소드를 호출시 매개값 1,2,3,4,5를 제공하고 
//		합산결과를 리턴받아 result2 변수에 대입
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2:" + result2);
		
//		sum()메소드를 호출시 배열을 제공하고 
//		합산 결과를 리턴받아 result3변수에 대입
int [] values = {1,2,3,4,5};
int result3 = myCom.sum(values);
System.out.println("result3:" + result3);

// sum()메소드를 호출시 배열을 제공하고 
//합산 결과를 리턴받아 result4 변수에 대입
//result4 변수는 result3을 압축한것이다. 
//result3 변수에서myCom.sum(values)에서 values를 new int[]{}배열로 치환해서 식을 간편하게 만들었다.
int result4 = myCom.sum(new int [] {1,2,3,4,5});
System.out.println("result4:" + result4);
	
	}

}
