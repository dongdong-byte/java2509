package ch07.sec10.exam02;

public class AbstractMethodEx {
    public static void main(String[] args) {
        Dog dog1 = new Dog("바둑이",5,"비글");
        Cat cat1 = new Cat("까망이", 4 ,true);

        System.out.println(dog1);
        System.out.println(cat1);
        dog1.Sound();
        cat1.Sound();
//        매개 변수의 다형성
        animalSound(new Dog("노랑이",7,"말라퓨트"));
        animalSound(new Cat("점박이",5,false));

    }
    public  static  void animalSound(Animal animal){
        animal.Sound();
    }
}
