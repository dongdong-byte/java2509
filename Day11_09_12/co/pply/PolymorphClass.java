package co.pply;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;

import java.util.concurrent.Callable;

public class PolymorphClass {

    public  PolymorphClass (){
    //   다양성 배열
    Animal[] animals = {
            new Cat("바둑이", 5, false),
            new Dog("나비", 4, "골든리트리버"),
            new Dog("체리", 2, "진돗개"),
            new Cat("까망이", 6, true)
    };
        System.out.println("-----동물들의 소리-----");
      animals[0].makeSound();
      animals[1].makeSound();
      animals[2].makeSound();
      animals[3].makeSound();
        System.out.println("-------");

        for(Animal animal : animals){
            animal.makeSound();

        }
        System.out.println("------동물들의 행동-----");
        for(Animal animal : animals){
            
            if(animal instanceof Dog){
//                개발자가 직접 dog라는 클래스를 사용해서 캐스팅했다.
                Dog dog =(Dog) animal;
                dog.wagTail();
            }else if(animal instanceof Cat) {
               Cat cat = (Cat) animal;
               cat.climbs();



            }
        };
//    다양성 매서드 호출
        playWithAnimal(new Dog("루피",1,"비글"));
        playWithAnimal(new Cat("츄츄",2,true));

    }

   public void playWithAnimal(Animal animal){
        System.out.println("------나의 아기들과 놀아주기-----------");
        animal.makeSound();
        animal.eat();
        System.out.println("--------나의 아기들에 행동---------");
        if(animal instanceof Dog){
            ((Dog) animal).wagTail();
        }else if(animal instanceof Cat){
            ((Cat) animal).climbs();
        }

    }
    }



