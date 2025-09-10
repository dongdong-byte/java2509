package ch06.sec07.exam04;

public class Car {
//	필드 선언
String company = "현대 자동차";
String model;
String color;
int maxspeed;

//생성자 선언
//1번생성자
Car () {}
//2번 생성자
Car(String model){
	this.model = model;
	
}
//3번 생성자
Car(String model, String color){
	this.model=model;
	this.color=color;
}
//4번 생성자
Car(String model,String color,int maxspeed){
	this.model=model;
	this.color=color;
	this.maxspeed=maxspeed;
}

}
