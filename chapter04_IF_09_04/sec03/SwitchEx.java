package ch04.sec03;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주사위를 굴려서 나올수 있는 1,2,3,4,5,6중에서 하나의 수를 뽑아서 출력하는 코드를 작성해보자.");
		System.out.println("Math.random()함수를 사용하면 0.0에서 부터 1.0까지의 랜덤한 함수를 출력할수가 있다.");
		System.out.println("----------------------");
		System.out.println("if는 조건식에 참과 거짓으로 흐름을 이어갔지만 switch 는 변수값이 일치하냐 아니냐로 흐름을 이어간다.");
		System.out.println("switch(변수){case 값1: ,값1에 부합할때 발동하는식 , break; case 값2: ,값13 부합할때 발동하는식 , break; default;}");
		System.out.println("break를 만나면 switch 식을 빠져 나온다. ,,, default는 위에 조건에 전부다 부합하지 않을때 무조건 진행하는식이다. 필요하다.");
		System.out.println("----------------------");
		int  n1 =(int) (Math.random()*6) +1;
		switch(n1 ) {
		case 1 :
		System.out.println(" 1번이 나왔습니다.");
		break;
		case 2 :
			System.out.println(" 2번이 나왔습니다.");
			break;
		case 3:
			System.out.println(" 3번이 나왔습니다.");
		break;
		case 4:
			System.out.println(" 4번이 나왔습니다.");
		case 5:
			System.out.println(" 5번이 나왔습니다.");
			break;
		case 6:
			System.out.println(" 6번이 나왔습니다.");
			break;
		}
	}

}
