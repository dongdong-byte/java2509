package ch05.sec12;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Calender를 이용해서 오늘이 요일을 얻는 예제 이다.");
		System.out.println("요일은 1-7까지의 숫자 이므로 코드 가독성을 위대 열거 상수로 변환해서 Week 변수에 대잆하고 사용하는 방법을 보여준다.");
// 열거 타입 변수 선언
		Week  today = null;
	
//	캘린더 얻기
	
	Calendar cal = Calendar.getInstance();
//	오늘의 요일을 얻기(1-7)
	int week =cal.get(Calendar.DAY_OF_WEEK);
//	DAY_OF_WEEK: calender 클래스에 정의된 상수 키임
//	cal.get(): 메서드에 전달하여 요일 필드 값을 가져오겠다는뜻입니다.
//	즉 cal.get(Calendar.DAY_OF_WEEK) 는 현재 날짜의 요일을 숫자로 변환한다는뜻
//	숫자를 열거 상수로 변환해서 변수에 대입
switch(week) {
case 1 : today = Week.SUNDAY;
case 2 : today =Week.MONDAY;
case 3 :  today = Week.TUESDAY;
case 4 :  today = Week.WEDENSDAY;
case 5 :  today = Week.THURSDAY;
case 6 :  today = Week.FRIDAY;
case 7 :  today = Week.SATURADY;
//switch(week)의 week 는 스위치에 넘기는 값 피연산자이다
//위에 int week를 했음
//case1은 int week가 1일때 를 의미하는 정수 리터럴
//case 1 : today = Week.SUNDAY; 여기서 Week는 열거형(enum)타입 이름이고 "sunday"는 그 열거형의 상수이다.


}
//열거 타입 변수를 사용
if(today == Week.SUNDAY) {
	System.out.println("일요일에는 축구를 합니다.");
}else {
	System.out.println("열심히 자바를 공부합니다.");
}
	
	}
}
