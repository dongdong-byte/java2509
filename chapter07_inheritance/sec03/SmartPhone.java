package ch07.sec03;

public class SmartPhone extends Phone {
String model;
String color;
    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("Smartphone(string model,String color) 생성자 실행됨");

    }
}
