package ch05.sec06;

public class MultidemensionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("타입[][] 변수 = {{값1,값2...},{값1,값2,값3.....}");
int[] [] scores={
		{80,90,96},
		{76,88}
		
};
System.out.println("length는 배열의 길이를 의미한다.");
System.out.println("scores[0].length는 0번째 배열의 길이를 의미하므로 3이다.");
System.out.println("평균 : 총합/(인원수=배열의 길이-> 점수에입력한 인원수가 배열의 길이이다)");
//배열의 길이
System.out.println("1차원 배열 길이 (반의 수): " +scores.length);
System.out.println("2차원 배열 길이 (첫번째 반의 학생수): " +scores[0].length);
System.out.println("2차원 배열 길이 (두번째 반의 학생수): " +scores[1].length);
// 첫번째 반의 세번째 학생의 점수 읽기
System.out.println("scores[0][2] : "+scores[0][2]);
//두번째 반의 두번째 학생의 점수 읽기
System.out.println("scores[1][1] : "+scores[1][1]);
//첫번째 반의 평균 점수 구하기
int class1Sum = 0;
for(int i =0; i<scores[0].length; i++) {
	class1Sum += scores[0][i];
	
}
double class1Avg =(double )class1Sum/scores[0].length;
System.out.println("첫 번째 반의 평균 점수 : " +class1Avg );
//두번째 반 평균 점수 구하기
int class2Sum = 0;
for(int i =0; i<scores[1].length; i++) {
	class2Sum  += scores[1][i];
}
double class2Avg =(double) class2Sum / scores[1].length;
System.out.println("두 번째 반의 평균 점수 : " +class2Avg );

//전체 학생에 평균을 구하기
int totalStudent =0;
int totalSum = 0 ;
//반의 수 만큼 반복
for(int i =0; i<scores.length; i++) {
//	반의 수 만큼 반복
	totalStudent += scores[i].length;
//	해당반의 학생수 만큼 반복
	for (int k =0; k<scores[i].length; k++) {
//		학생 점수 합산
		totalSum += scores[i][k];
	}
}
double totalAvg=(double)totalSum/totalStudent;
System.out.println("전체 반의 평균 점수 : " +totalAvg );

	}

}
