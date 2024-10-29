package main;

public class Quiz3 {

	public static void main(String[] args) {

		Object obj = new Integer(0);
		
		try {
			String str = (String) obj; // 잘못된 타입으로 형변환됨
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다");
		
	}

}
