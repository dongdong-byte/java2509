package ch05.sec06;

public class ArrayLengthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//배열 변수 선언과 배열 대입
		int[] score = { 80 , 90 , 96 };
//		배열 항목의 총합 구하기
		int sum = 0;
		for(int i =0; i<score.length ; i++ ) {
			
			sum += score[i];
		}
		System.out.println("총합 : " +sum);
//		 배열 항목의 평균 구하기
		double avg =(double) sum / score.length;
		System.out.println("평균 : " + avg);
		
	}

}
