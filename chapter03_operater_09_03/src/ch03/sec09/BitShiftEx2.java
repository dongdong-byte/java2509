package ch03.sec09;

public class BitShiftEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 772를 4바이트(32비트)로 표현할때 : 00000000 00000000 00000011 00000100
int value = 772;

// 우측으로 3byte(24bit)이동하고 끝 1바이트 만 읽음 : [00000000]
byte byte1 =(byte) (value >>>24);
int int1 = byte1 & 255;
System.out.println("첫번째 바이트 부호가 없는 값" + int1);

//우측으로 2byte(24bit)이동하고 끝 1바이트 만 읽음 : [00000000]
byte byte2 =(byte) (value >>>16);
int int2 = Byte.toUnsignedInt(byte2);
System.out.println("두번째 바이트 부호가 없는 값" + int2);

//우측으로 1byte(8bit)이동하고 끝 1바이트 만 읽음 : [00000011]
byte byte3 =(byte) (value >>>8);
int int3 = byte3 & 255;
System.out.println("세번째 바이트 부호가 없는 값" + int3);

// 끝 1바이트 만 읽음 : [00000100]
byte byte4 =(byte) value;
int int4 = Byte.toUnsignedInt(byte4);
System.out.println("네번째 바이트 부호가 없는 값" + int4);



	}

}
