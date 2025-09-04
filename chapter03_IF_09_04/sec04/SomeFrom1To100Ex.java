package ch04.sec04;

public class SomeFrom1To100Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum변수는 for 에서 돌아가기 때문에 for  바깥에서 선언한것이다.");
		System.out.println("i변수는 for바깥에 syso에서도 사용해서 for  바깥에서 선언한것이다. ");
		System.out.println("----------------------");
int sum =0;
int i ;
for (i=1; i<=100; i++) {
	sum += i;
}
System.out.println("1~" + (i-1) + "합 : " +sum);
	}

}
