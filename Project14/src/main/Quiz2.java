package main;

public class Quiz2 {

	public static void main(String[] args) {

		String s = null; // 참조변수를 선언만 하고 생성은 안함!
		
		try {
			System.out.println(s.length()); // 빈객체를 참조하여 에러남
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료됩니다");
		
	}

}
