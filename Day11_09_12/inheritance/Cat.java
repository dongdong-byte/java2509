package inheritance;

public class Cat extends Animal {
    boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor=isIndoor;
    }

    public void climbs() {
        System.out.println("점프 점프");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("실내묘"+ (isIndoor ? "예" : "아니요."));
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(this.name +  "는 야옹이라고 소리를 냅니다.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name+"가 츄르를 먹는다.");
    }
}
