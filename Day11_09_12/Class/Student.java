package Class;

public class Student {

    private String name;

    int age;

    private String studentId;


    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    //전체 필드를 사용자에게 입력받는 생성자 constructer
public Student(String name, int age , String studentId) {
this.name = name;
this.age = age;
this.studentId = studentId;
}
//필수 입력 필드를 사용자에게 입력 받는 생성자 constr
public Student(String name, String studentId) {
this.name =name;
this.studentId =studentId;
}

    public void introduce() {
        System.out.println(this.name+ "을 소개합니다");
    }

    public void study() {
        System.out.println(this.studentId+"번이 공부합니다.");

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
