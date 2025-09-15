package ch07.sec07.exam01;

public class PromotionEs {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;
        B b1 = d;
        C c1 = e;


    }
//    static 정적 중첩클래스를 선언하는건 클래스가 바깥에 클래스에 종속되지 않고 바깥 클래스 이름만으로 접근/생성 되는경우를 말함
    static class A {
    }
    static class C extends A {
    }
    static class B extends A {
    }
     static class D extends B {
    }

     static class E extends C{
    }





}
