package ch04.sec04;

public class FloatCounterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("초기화식에서 부동 소숫점을 사용하는 float는 사용하면 안되는게 float같은 부동소숫점 방식이 0.1을 정확히 표현하지 못하기 때문이다.");
for(float x =0.1f; x<=1.0f; x+=0.1f) {
	System.out.println(x);
}
	}

}
