package ch08.sec04;

public class Telvision implements RemoteControl{
//    필드
    private int volume;
    //    turnon추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("tv를 켭니다.");
    }
    //    turnoff 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("tv를 끕니다.");

    }
//    setvolume 추상 메소드 오버라이딩
//인터 페이스 상수를 사용해서 volume 값을 제한
//    volume>10->max , volume<0->min , 그외값을 volume값으로 출력
    @Override
    public void setVolume(int Volume) {
        if(volume>RemoteControl.MAX_VOLUME){
        this.volume=RemoteControl.MAX_VOLUME;
    }else  if (volume<RemoteControl.MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }else{
        this.volume=Volume;}
        System.out.println("현제 tv볼륨 : " + Volume);
    }





}
