package ch03.sec05;

public class InfinityNancheckEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x =5;
double y = 0.0;
double z = x/y;
//잘못된 코드
//double z =x%y;
//System.out.println(z+2);

// 올바른 코드 예외 처리 : 값이 잘못나올경우가 나올수 있으니까 미리 예외 처리를 해주어야한다 
//isNaN 연
if(Double.isInfinite(z) ||  Double.isNaN(z)){
	System.out.println("값 산출불과");
	
}else {
	System.out.println(z+2);
}
	}

}
