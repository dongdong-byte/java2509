package ch08.sec02;

public class Audio  implements RemoteControlEx{

    @Override
    public void turnON() {
        System.out.println("오디오를 킵니다.");
    }
}
