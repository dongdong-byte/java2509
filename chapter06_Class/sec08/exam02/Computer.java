package ch06.sec08.exam02;

public class Computer {
//가변 길이 매개변수를 갖는 메소드 선언
	int sum(int ... values) {
//		sum변수 선언
		int sum = 0;
//		value는 배열타입의변수를 사용
		for(int i =0 ; i<values.length; i++) {
			sum += values[i];
			
		}
//		합산 결과를 리턴
		return sum;
		
	}
}
