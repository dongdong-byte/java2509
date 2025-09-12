package Interface;

import inheritance.Animal;

public class Duck extends Animal implements Swimable {

    public Duck(String name, int age) {
//        super(); 생략이 가능하다.
        super(name, age);


    }

    @Override
    public void swim() {

    }
}
