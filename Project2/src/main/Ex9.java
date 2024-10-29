package main;

public class Ex9 {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 10.0f;
		double d = f;
		System.out.println(d);
		
		// 정수형과 실수형
		int iNum = 1;
		float fNum = iNum;
		System.out.println(fNum);
		
		// 연산 중에 자동형변환이 되는 경우
		// 컴퓨터가 더하기 연산을 수행할 때, 두 항을 같은 자료형으로 변환함
		// 이때 iNum이 float형으로 자동으로 형변환딤
		System.out.println(iNum + fNum);

	}

}
