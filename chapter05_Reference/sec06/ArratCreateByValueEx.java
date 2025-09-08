package ch05.sec06;

public class ArratCreateByValueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("배열-> 타입[] 변수 = {값0,값1,값2....}");
String[] season = {"spring","Summer","Fall","Winter"};
//배열의 항목 값 읽기
System.out.println("season[0]"+season[0]);
System.out.println("season[1]"+season[1]);
System.out.println("season[2]"+season[2]);
System.out.println("season[3]"+season[3]);
//인덱스 1번 항목의 값 변경
season[1] = "여름";
System.out.println("season[1]"+season[1]);
System.out.println();

//배열 변수 선언과 배열 생성

int[] scores = {83,90,87};
//총합과 평균 구하기
int sum =0;
for(int i=0; i<3;i++) {
	sum += scores[i];
}
System.out.println("총합 : " + sum);
double avg =(double) sum / 3;
System.out.println("평균 : " +avg);
	System.out.println("=============");
	System.out.println("총합을 구할때 for 문을 사용해서 += 증감 연산자를 사용해서 i=1+i=2+i=3을 유도한다.");
	}

}
