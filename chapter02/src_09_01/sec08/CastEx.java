package ch02.sec08;

public class CastEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		개발자가 강제로 변환하는것
//강제 타입 ㅣ변환후 10이 그대로 유지
		int var1 =10;
byte var2 =(byte) var1;
System.out.println(var2);

//강제 타입 변환후에 300이 그대로 유지
long var3 = 300;
int var4 =(int) var3;
System.out.println(var4);

//'A'가 출력
// 65란 값을 넣었는데 A를 뽑고 싶어
int var5 = 65;
char var6 =(char) var5;
System.out.println(var6);

//3이 출력
double var7 = 3.14;
int var8 =(int) var7;
System.out.println(var8);

	}

}
