package ch05.sec04;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String strval1= "홍길동";
String strval2= "홍길동";


if(strval1 == strval2) {
	System.out.println("strval1하고 strval2는 참조가 같음");
}else {
	System.out.println("strval1하고 strval2는 참조가 다름");
}
System.out.println("=========================");
if(strval1.equals(strval2)) {
	
	System.out.println("strval1하고 strval2는 문자열이 같음");
}

String strval3 = new String("홍길동");
String strval4 = new String("홍길동");

if(strval3 == strval4) {
	System.out.println("strval3하고 strval4는 참조가 같음");
}else {
	System.out.println("strval3하고 strval4는 참조가 다름");
}

if(strval3.equals(strval4)) {
	System.out.println("strval3하고 strval4는 문자열이 같음");
}


	}

}
