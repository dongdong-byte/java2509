package ch05.sec07;

public class MultidimensionArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//각 반의 학생수가 3명으로 동일할경우 정수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
//		배열 항목 초기값 출력
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[ " + i + "][" + k + "]: " + mathScores[i][k]);

			}

		}
		System.out.println();
//		배열 항목 값 변경
		mathScores[0][0]=80;
		mathScores[0][1]=83;
		mathScores[0][2]=85;
		mathScores[1][0]=86;
		mathScores[1][1]=90;
		mathScores[1][2]=92;
//		전체 학생 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0 ;
		for(int i = 0 ; i<mathScores.length; i++) {
			totalStudent += mathScores[i].length;
//			해당 반의 학생 수 만큼 반복
			for(int k =0; k < mathScores[i].length; k++) {
//				학생 점수 합산
				totalMathSum += mathScores[i][k];
			}
			

			
		}
		
		
		

	}

}
