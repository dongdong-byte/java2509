package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정밀도 확인
//		소숫점이 있는 숫자는 float 을 사용한다.
//		숫자가 나무커서 float으로 감당이 안되면 double을 사용한다.
float var1 = 0.1234567890123456789f;
double var2 = 0.1234567890123456789;

System.out.println("var1: " +var1 );
System.out.println("var2: " +var2);
System.out.println("===============");

//10의 거듭제곱 리터럴

double var3 = 3e6;
float var4 =3e6F;
double var5 = 2e-3;
System.out.println("var3: " +var3);
System.out.println("var4: " +var4);
System.out.println("var5: " +var5);
	}

}
