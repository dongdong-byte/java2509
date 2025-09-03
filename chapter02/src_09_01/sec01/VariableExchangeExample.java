package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int X = 3 ;
int Y = 5;
System.out.println("X: " + X + ", Y:" +Y);
//대입연산자를 통해서 x하고y값을 바꾸어주고있다.
int temp = X;
X=Y;
Y=temp;
//syso 누르고 스페이스+ctrl 동시에 누르기
System.out.println("-------------------");
System.out.println("X: " + X + ", Y:"+Y );


		
	}

}
