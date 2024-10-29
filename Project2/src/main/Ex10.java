package main;

public class Ex10 {

	public static void main(String[] args) {
		
		
		// 정수형의 강제 형변환
		int i = 1000;
		byte b = (byte) i;
		System.out.println(b);
		
		// 실수형의 강제 형변환
		double d = 1.2;
		float f = (float) d;
		System.out.println(f);
		
		// 정수형과 실수형의 강제형변화
		int i2 = (int) f;
		System.out.println(i2);// 1. 소수점 밑자리를 잃음.

	}

}
