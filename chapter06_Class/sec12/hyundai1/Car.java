package sec12.hyundai1;

import sec12.hankook.SnowTire;
import sec12.hankook.Tire;

public class Car {
    public static void main(String[] args) {
//        부품 필드 선언
         sec12.kumho.Tire tire1 = new sec12.kumho.Tire();
         sec12.hankook.Tire tire2 = new sec12.hankook.Tire();

        SnowTire tire3 = new SnowTire();
        Tire tire4 = new Tire();
        System.out.println("모델명 :" +tire1 );
        System.out.println(tire2);
        System.out.println(tire3);
        System.out.println(tire4);

    }
}
