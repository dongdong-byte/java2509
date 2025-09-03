package ch03.sec08;

public class BitlogicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		이진수 값을 비교하는것임
		System.out.println("45 & 25 =" +(45 & 25));
		System.out.println("45 | 25 =" +(45 | 25));
		System.out.println("45 ^ 25 =" +(45 ^ 25));
		System.out.println("~45  =" +~45 );
		
		System.out.println("-------------");
		
//		정수 10의 2진수 값
		System.out.println("------정수 10의 2진수 값----------");
		int num =10;
		int num2 = 11;
		System.out.println(Integer.toBinaryString(num) + "="+Integer.toBinaryString(num2));
		
		
//		2진수 1010,1011에 대한 10진수 값
		System.out.println("-----2진수 1010,1011에 대한 10진수 값---------");
		byte[]dat= {0b1010,0b1011};
		for(byte b : dat) {
//			int로 출력하면 자동으로 변환됨
			int val =b;
			System.out.println(val);
		}
		
		System.out.println("-------------");
		
		byte receiveData = -120;
		
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);

		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
			
	}

}
