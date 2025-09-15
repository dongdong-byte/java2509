package ch07.sec04.exam01;

public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        Computer computer = new Computer();
        System.out.println("원의 면적 : " + calculator.areaCircle(r) );
        System.out.println();
        System.out.println("원의 면적 : " + computer.areaCircle(r) );

    }
}
