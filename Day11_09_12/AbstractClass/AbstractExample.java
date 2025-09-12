package AbstractClass;

public class AbstractExample {
    public AbstractExample() {
        //    도형 만들기 :circle , x,y ,원(r) , 사각형 (w,h)
        Circle circle = new Circle("red", 10.0, 10.0, 5);
        Retangle retangle = new Retangle("blue", 30.0, 10.0, 8, 5);
        System.out.println(circle.getShape1());


    }


}
