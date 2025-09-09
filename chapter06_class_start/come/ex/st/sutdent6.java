package come.ex.st;

public class sutdent6 {
//	클래스 내에서 공통적으로 사용되는 값을 저장
	String name;
	int age =20;
	String studentId;
	
//	클래스가 처음 오브젝트로 생성될때, 어떻게 생성 될 것인가?
	
//기본생성자 커스터 마이징
	public sutdent6() {
		System.out.println(name+age+studentId);
		System.out.println("기본_학생이 생성되었습니다.");
	}
	
	
//매개 변수가 있는 생성자(필수 입력사항이 생길때 사용)
	
	public sutdent6(String argname, String argstringId) {
	this.name= argname; 
	this.studentId = argstringId;
	
//		System.out.println(stringId+"-"+name+"학생이 생성되었습니다.");	
		System.out.println(this.studentId+"-"+this.name+"학생이 생성되었습니다.");	
	}
	
	
	
//	모든 필드를 다 적용해 줄것이냐.
	
	public sutdent6(String argname, int argAge, String argStudentId) {
		this.name =argname;
		this.age=argAge;
		this.studentId=argStudentId;
		// TODO Auto-generated constructor stub
//		System.out.println(studentId+"-"+name+"-"+"학생이 생성되었습니다."+"-"+age);
		System.out.println(this.studentId+"-"+this.name+"-"+"학생이 생성되었습니다."+"-"+this.age);	
	
	}
//---------클래스를 통한 오브젝트를 생성 했을때 ,,, 액션		


	public void study() {
	
		System.out.println("^^"+this.name+"님이 공부를 합니다.");
	}


	public void introduce() {
		// TODO Auto-generated method stub
		System.out.println("^^"+this.name + "학생을 소개합니다");
	}
	
	

	

}
