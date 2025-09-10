package ch06.sec06.exam01;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		car객체 생성
Car myCar = new Car();


//car 객체의 필드값 읽기
System.out.println("모델명: " + myCar.model );
System.out.println("브랜드 : " +myCar.brand);
System.out.println("최고 속도 : " + myCar.maxspeed + "km/h");
System.out.println("타이어 브랜드 : " + myCar.tire.Brand);
System.out.println("앞타이어 사이즈: " + myCar.tire.FrontTireSize);
System.out.println("뒷 타이어 사이즈: " +myCar.tire.BackTireSize);
	System.out.println("시동여부 : " +myCar.start);
	}

}
