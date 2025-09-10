package ch05.sec10;

public class AdvancedForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("배열 항목 반복을 위해 향상된 for문");
System.out.println("카운터 변수하고 증감식을 사용하지 않고, 항목 개수만큼 반복한후 자동으로 for문을 빠져 나간다.");
System.out.println("for(2.타입 변수->score : 1. 배열->scores){3.실행문;}");
//배열 변수 선언과 배열 생성
int[] scores = {95,71,84,93,87};
//배열 항목 전체의 합을 구하기
int sum = 0 ;
//5개의 항목이 한번씩 score이란 {scores는 원소들의 모음 집합(배열)이다 .}변수에 저장이 되고 sum에 누적됨(반복횟수:5)
for(int score : scores) {
	sum += score;
}
	System.out.println("점수 총합 = " + sum);
	double avg = (double) sum / scores.length;
	System.out.println("평균 = "+ avg);
	
	}

}
