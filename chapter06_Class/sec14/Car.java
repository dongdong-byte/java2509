package ch06.sec14;

public class Car {
    //    필드 선언
    private int speed;
    private boolean stop;

    //    필드에 getter/setter선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }

    }
//    stop필드에 getter/setter 선언
    public boolean isStop(){
        return stop;
    }
    public void setStop(boolean stop){
        this.stop = stop;
//        if문에서 실행문이 한문장일경우->else가 없는경우 중괄호를 생략할수는 있다
//        다만 추천하지는 않는다.
        if(stop == true)this.speed = 0;

    }
}