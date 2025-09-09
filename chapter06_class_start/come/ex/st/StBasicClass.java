package come.ex.st;

public class StBasicClass{
	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
			/*
			 * Student st1 = new Student() ;
			 * 
			 * String Str =null; int num = 0; System.out.println(st1);
			 * System.out.println(Str); System.out.println(num);
			 */
			
			  // Ex2 sutdent2 st2 = new sutdent2(); st2.name = "김철수"; st2.age = 20;
				/*
				 * st2.sutdentId="20250701";
				 * 
				 * System.out.println(st2.name); System.out.println(st2.age);
				 * System.out.println(st2.sutdentId);
				 */
			
			/*
			 * // Ex3 매서드 sutdent3 st3 = new sutdent3(); st3.study(); st3.introduce();
			 */
			/*
			 * // Ex4 sutdent4 st4 = new sutdent4();
			 */
			/*
			 * // Ex5 sutdent5 st5 ; st5 = new sutdent5("김동현");
			 */
	/*//		Ex6 종합
			
			sutdent6 st6;
			st6 = new sutdent6();
			
			sutdent6 st6_a = new sutdent6();
			sutdent6 st6_b = new sutdent6("김동현" , "20250909");
			sutdent6 st6_c = new sutdent6("김영남",29,"20250703");
			st6_b.study();
			st6_c.introduce();
			System.out.println("----------");
			st6_c.study();
			st6_b.introduce();
		}*/
//			ex7 getter와 setter
			Student7 st7 = new  Student7();
			System.out.println(st7.toString());
			System.out.println("----------");
			st7.setName("김가빈");
			st7.age=26;
			st7.setStudentId("20250705");
			
		System.out.println(st7.toString());
}
}
