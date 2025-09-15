package ch07.sec05.exam02;

public class SportCar extends Car{
    @Override
    public void speedUp() {
        speed +=10;
    }
//    오버 라이딩 불가능

//'stop()'은(는) 'ch07.sec05.exam02.Car'에서 'stop()'을(를) 재정의할 수 없습니다. 재정의된 메서드는 final입니다
//    @Override
//    public void  stop() {
//        speed =0 ;
//        System.out.println("스포츠카를 멈춤");
//    }
}
