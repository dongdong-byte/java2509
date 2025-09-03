package ch02.sec07;

public class PromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		연산할때 값이 빠지지 않게 변환해준다
//		자동변환은 누수가 생기지않게 변환해준다
byte byteValue = 10;
int intValue = byteValue;
System.out.println("intValue: " + intValue);

char charvalue = '가';
intValue =charvalue;
System.out.println("'가'의 유니코드 " +intValue );

 intValue =50;
long longvalue = intValue;
System.out.println("longvalue: "+longvalue);

longvalue = 100;
float floatvalue = longvalue;
System.out.println("floatvalue: " + floatvalue);

floatvalue =100.5F;
double doubleValue =floatvalue;
System.out.println("doubleValue: " +doubleValue);




	}

}
