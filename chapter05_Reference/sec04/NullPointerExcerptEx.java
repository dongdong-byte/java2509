package ch05.sec04;

public class NullPointerExcerptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] intarray = null;
intarray[0] = 10;

String str = null;
System.out.println("총 문자수" + str.length());
	}

}
