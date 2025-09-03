package ch03.sec06;

public class CompareOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=10;
int num2=10;
boolean result1=(num1 == num2);
boolean result2=(num1 != num2);
boolean result3=(num1 <= num2);
System.out.println("result1= " + result1);
System.out.println("result2= " + result2);
System.out.println("result3= " + result3);

char ch1= 'A';
char ch2='B';

boolean result4 = (ch1<ch2);
System.out.println("result4= " + result4);

int num3 = 1;
double num4=1.0;
boolean result5=( num3 == num4);

System.out.println("result5= " + result5);

//여기는 비교대상이 명확하지 않아서 자바가 비교를 못해준다 -> 개발자가 명확하게 타입을 일치 시켜야함
//데이터는 값보다는 타입을 먼저본다 그래서 타입을 먼저 맞춰주어야한다. -> 값이 작을때는 자동으로 맞춰주지만 클때는 인식을 못한다.
float num5=0.1f;
double num6 =0.1;
boolean result6=(num5 == num6);
//타입을 맞춰서 비교해라
boolean result7=(num5 == (float)num6);
System.out.println("result6= " + result6);
System.out.println("result7= " + result7);
//자바의 함수 java하고 자바하고 같으니?
String str1="자바";
String str2="java";
//equals한 함수를 사용해서 srt1 str2가 같은지 비교
boolean result8=(str1.equals(str2));
//!를 사용해서 반전한다.
boolean result9=(! str1.equals(str2));
System.out.println("result8= " + result8);
System.out.println("result9= " + result9);

	}

}
