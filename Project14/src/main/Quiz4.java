package main;

public class Quiz4 {

	public static void main(String[] args) {

		String str = "1.23";
		
		try {
			//parseInt(): 문자열 -> 숫자 변환
			int num = Integer.parseInt(str); //실수를 정수로 변환하려고해서 에러남
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료됩니다");
	}

}
