package main;

public class Ex2 {

	public static void main(String[] args) {
		
		// 디버그 모드 단축키 
		// f6 한줄씩 실행
		// f8 다음 브레이크까지 스킵
		
//		int x = 100;
//		int y = x++;
//		int z = x--;
//		
//		System.out.println(x); // 100
//		System.out.println(y); // 100
//		System.out.println(z); // 101
		
		int x = 100;
		int y = ++x;
		int z = --x;
		
		System.out.println(x); // 100
		System.out.println(y); // 101
		System.out.println(z); // 100

	}

}
