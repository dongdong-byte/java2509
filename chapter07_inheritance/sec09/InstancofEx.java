package ch07.sec09;

public class InstancofEx {
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();


//    person이 참조하는 객체가 student 타입일경우
        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();

        }
    }
    public static void main(String[] args) {
//Person 객첼르 매게값으로 제공하고 personinfo 메소드 호출
    Person p1 = new Person("홍길동");
    personInfo(p1);
        System.out.println();
//        studnet 객체를 매게 값으로 제공하고 person info() 메소드 호출
        Person p2 = new Student("김길동",10);
        personInfo(p2);


    }
}
