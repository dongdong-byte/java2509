package ch07.sec11;

public non-sealed class Worker  extends Person{

    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}
