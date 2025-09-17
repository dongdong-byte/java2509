package ch07.sec10.exam02;

public class Dog extends  Animal {
//    필드 선언
    String breed;


    @Override
    public String toString() {
        return ("이름 :" + name + "나이 :" + age + "품종 :"  + breed);
    }

    public Dog(String name, int age, String breed) {
        super(name,age);
        this.breed = breed;
    }

    @Override
    public void Sound() {
        System.out.println("멍멍");
    }
}
