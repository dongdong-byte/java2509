package Class;

public class BasicClass {
//    클래스 사용해보기
    public BasicClass(){
// new 키워드 : 객체 obj생성
//        Student st1 = new Student ();
//        Student st2 = new Student ();
////        필드값 생성
//        st1.name = "김철수";
//        st1.age = 20;
//        st1.studentId = "20250715";
//        st2.name="이영희";
//        st2.age=24;
//        st2.studentId="20250716";
//        객체 생성과 초기화 init
        Student st1 = new Student("김철수", 20 , "20250715");
        Student st2 = new Student("이영희",  "20250716");
//setName(String name)->잘못입력시 수정
        st1.setName("김갑수");
//    getName
//        use1
//        System.out.println("~~~~~"+st1.getName());
//use2
        String myName = st1.getName();
        System.out.println( "내이름:" + myName);


//        함수 (클래스안에 있느함수)->매서드호출
        st1.introduce();
        st1.study();
        System.out.println(st1.toString());

        st2.introduce();
        st2.study();
        System.out.println(st2.toString());

    }
}
