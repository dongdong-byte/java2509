package ch04.sec08;

public class ContinueEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("continue구문은 break구문하고는 다르게 반복문을 종료하지 않고 계속 수행한다.");
for(int i =1; i<=10; i++) {
	if(i%2 !=0) {
		continue;
	}
	System.out.println(i + " ");
}
System.out.println("if(i%2 !=0) continue 는 2로 나눈 나머지 값이 0이아닐경우 -> 홀수일 경우를 뜻한다.");
	}

}
