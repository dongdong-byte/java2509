package sec11.exam01;

public class KoreaEx {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567","감자바") ;
Korean k2 = new Korean("123-12-1234" , "철수");
//        필드 값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);
//        final 필드는 값을 변경 할수가 없음

        System.out.println(k2.nation);
        System.out.println(k2.ssn);
//        비 final필드는 값 변경 가능

    }
}
