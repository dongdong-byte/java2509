package ch05.sec09;

public class ArrayByForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자바는 한번 데이터를 지정하면 고정이 되어서 이를 수정하려면 아래처럼 for문을 이용해서 반복 횟수를 늘려서 늘리면된다.");
		System.out.println("이때 새로 생성된 값은 아직 값이 정해지지않아서 0이란 값을 가진다.");
//길이 3인 배열
int [] oldIntArray = {1,2,3};
//길이 5인 배열을 새로 생성
int [] newIntArray=new int[5];
//배열 항목 복사 
for(int i =0 ; i<oldIntArray.length; i++) {
	newIntArray[i] = oldIntArray[i];
}
//배열 항목 출력
for(int i=0; i<newIntArray.length; i++) {
	System.out.println(newIntArray[i] + " , ");
}
	}

}
