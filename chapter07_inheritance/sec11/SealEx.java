package ch07.sec11;

public class SealEx {
    public static void main(String[] args) {
        Person p = new Person();
        Worker w = new Worker();
        Manger m = new Manger();
        Director d = new Director();

        p.work();
        w.work();
        m.work();
        d.work();
    }
}
