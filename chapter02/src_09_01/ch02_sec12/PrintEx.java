package ch02_sec12;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value =123;
System.out.printf("상품의 가격은 : %d원\n",value);
System.out.printf("상품의 가격은 : %6d원\n",value);
System.out.printf("상품의 가격은 : %-6d원\n",value);
System.out.printf("상품의 가격은 : %06d원\n",value);


double area = 3.14159 *10 *10;
System.out.printf("반지름이 %d인 원의 넓이는 :%10.2f\n",10,area);

String name ="홍길동";
String job ="도적";
System.out.printf("%6d | %-10s  | %10s\n",name,job);

	}

}
