package main;

public class Ex3 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			arr[5] = 5; // 예외가 발생할 가능성이 있는 코드
			
		// 에러가 발생됬을 때 에러 객체를 매개변수로 받음
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // 예외가 발생하면 처리할 코드 작성
		}

		// 에러가 나도 마지막 문장이 실행됨
		System.out.println("프로그램이 정상적으로 종료 되었습니다");
		
	}

}
