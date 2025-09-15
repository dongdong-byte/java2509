package ch07.sec03Ex02;

public class SmartPhone  extends Phone{
    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("Smartphone(string model,String color) 생성자 실행되는것임");
    }
}
