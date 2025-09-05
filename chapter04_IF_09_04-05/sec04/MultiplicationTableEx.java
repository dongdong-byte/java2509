package ch04.sec04;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println("중첩 for문 : for 문은 다른 for 문을 내포할수가 있음 ");
		System.out.println("이경우 바깥 for문이 한번 실행될때마다 중첩된 for 문은 지정횟수만큼 반복하고 다시 바깥  for문으로 돌아온다.");
		System.out.println("구구단이 중첩 for 문에 좋은 예시이다");
for (int m=2 ; m<=9; m++) {
	System.out.println("***" + m + "단*** " );
	for(int n=1; n<=9; n++) {
		System.out.println(m + "X" + n + "="+(m*n));
	}
	
	
}
	}

}
