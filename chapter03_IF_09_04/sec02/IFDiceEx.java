package ch04.sec02;

public class IFDiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("주사위를 굴려서 나올수 있는 1,2,3,4,5,6중에서 하나의 수를 뽑아서 출력하는 코드를 작성해보자.");
System.out.println("Math.random()함수를 사용하면 0.0에서 부터 1.0까지의 랜덤한 함수를 출력할수가 있다.");
System.out.println("----------------------");
int  n1 =(int) (Math.random()*6) +1;
if(n1 == 1 ) {
	System.out.println(" 1번이 나왔습니다.");
}else if (n1 ==2) {
	System.out.println(" 2번이 나왔습니다.");
}else if (n1 == 3) {
	System.out.println(" 3번이 나왔습니다.");
}else if (n1 == 4 ) {
	System.out.println(" 4번이 나왔습니다.");
}else if (n1 == 5 ) {
	System.out.println(" 5번이 나왔습니다.");
}else {
	System.out.println(" 6번이 나왔습니다.");
}

System.out.println("----------------------");
System.out.println("1.math.random()함수는 0.0~1.0이란  double 타입의 난수에 범위만 인식한다. 문제는 우리가 확인하고자하는 주사위 숫자는 정수즉 int계열 이란거고");
System.out.println("따라서 math.random함수를 캐스팅 기호를 넣어서 변수를 강제로 변환해야한다. ->(int) (Math.random() ");
System.out.println("----------------------");
System.out.println("2.math.random함수는 0.0~1.0인데 문제는 주사위에 숫자는 6까지 있다는 것이다.");
System.out.println("그래서 math.random함수에 6을 곱하면 된다 0.0*6~1.0*6->0.0~6.0");
System.out.println("----------------------");
System.out.println("3.math.random함수는 0~1.0 인데 주사위에는 0이 없다는것이다.");
System.out.println("그래서 math.random함수에 1을 더하면 된다 0.0+1<math.random<6.0+1->1.0<math.random<7.0");



	}

}
