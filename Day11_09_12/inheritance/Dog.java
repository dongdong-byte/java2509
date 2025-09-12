package inheritance;

public class Dog extends Animal {
    String breeds;
    public Dog(String name, int age, String breeds) {
        super(name,age);
        this.breeds =breeds;
    }


    public void wagTail() {
        System.out.println("꼬리를 흔든다.");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(this.name + "는 멍멍 소리를 냅니다.");
    }



    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + "가 고기를 먹는다.");
    }


}
