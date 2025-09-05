package ch04.sec05;

public class Sum1To100Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while문은 switch문하고 다르게 조건식이 true일 경우에만 실행을 하고 계속 반복을 한다.");
		System.out.println("조건문이 false일때는 while문을 종료한다.");
		System.out.println("while(1.조건식){2.실행문}");
		System.out.println("================================================");
int sum =0 ;
int i = 1;
while(i<=100) {
	sum+= i ;
	i++;
}
System.out.println("1~100 의 합은 " + sum+" 이다.");
	}

}
