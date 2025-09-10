package ch06.sec07.exam05;

public class Car {
//	필드 선언
String company = "현대 자동차";
String model;
String color;
int maxspeed;


//생성자 선언

//1번 생성자
Car(String model){
//	25라인 생성자 호출
	this(model , "은색", 250 );
	
}
//2번 생성자
Car(String model, String color){
//	25라인 생성자 호출
	this(model, color , 250);
}
//3번 생성자
Car(String model,String color,int maxspeed){
	this.model=model;
	this.color=color;
	this.maxspeed=maxspeed;
}
}
