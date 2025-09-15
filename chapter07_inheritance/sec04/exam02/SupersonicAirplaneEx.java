package ch07.sec04.exam02;

public class SupersonicAirplaneEx {
    public static void main(String[] args) {
        SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
        supersonicAirplane.takeoff();
        supersonicAirplane.fly();
        supersonicAirplane.flymode = SupersonicAirplane.SUPERSONIC;
        supersonicAirplane.fly();
        supersonicAirplane.flymode = supersonicAirplane.NORMAL;
        supersonicAirplane.fly();
        supersonicAirplane.land();
    }
}
