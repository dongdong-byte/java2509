package ch08.sec02;

public class RemoteConTrolExample {
    public static void main(String[] args) {
        RemoteControlEx rc;
        rc = new Television();
        rc.turnON();

        rc =new Audio();

                rc.turnON();
    }
}
