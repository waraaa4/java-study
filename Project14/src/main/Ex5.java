package main;

public class Ex5 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		try {
			arr[5] = 5; // ArrayIndexOutOfBoundsException 에러 발생
		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		// Exception형 매개변수를 사용하면, 모든 에러를 처리할 수 있다
		// Exception e = new ArrayIndexOutOfBoundsException()
		} catch (Exception e) { 
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상적으로 종료 되었습니다");
		
	}

}
