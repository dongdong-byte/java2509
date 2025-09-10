package ch05.sec09;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("for문을 이용해서 배열을 늘리는건 너무 복잡하다.");
System.out.println(" arraycopy()매소드를 사용하면 배열 복사를 더 간단히 할수 있다.");
System.out.println("arraycopy(원본배열, 원본배열 복사 시작 인덱스,새배열, 새배열 붙여 넣기 시작 인덱스,복사항목수)");
//길이 3인 배열
String[] oldStrArray = {"Java", "array","Copy"};
//길이가 5인 배열 따로 생성
String[] newStrArray = new String[5];
//배열 항목 복사
System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
//배열 항목 출력
for(int i = 0 ; i<newStrArray.length;i++) {
	System.out.println(newStrArray[i] + ", ");
}
	
	}

}
