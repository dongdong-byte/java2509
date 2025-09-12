package Interface;

import inheritance.Animal;

public class Bird extends Animal implements Flyable,Walkable {

    double ddd;

    public Bird(String name, int age, double ddd) {
        super(name,age );
        this.ddd =ddd;
    }

    @Override
    public void fly() {

    }

    @Override
    public void walk() {

    }


}
