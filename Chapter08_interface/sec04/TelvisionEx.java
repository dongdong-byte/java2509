package ch08.sec04;

public class TelvisionEx {
    public static void main(String[] args) {
        Telvision telvision = new Telvision();
        telvision.turnOn();
        telvision.turnOff();
        telvision.setVolume(7);

        Audio telvision2 = new Audio();
        telvision2.turnOff();
        telvision2.turnOn();
        telvision2.setVolume(5);
    }
}
