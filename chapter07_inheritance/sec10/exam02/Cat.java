package ch07.sec10.exam02;

public class Cat extends Animal {
    boolean indoor ;

    @Override
    public String toString() {
        return ("이름 :" + name + "나이 :" + age + "집고양이 :"  + indoor);
    }

    public Cat(String name, int age, boolean indoor) {
        super(name,age);
        this.indoor = indoor;
    }

    @Override
    public void Sound() {
        System.out.println("야옹");
    }
}
