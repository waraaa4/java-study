package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 변수 num을 선언하고 456를 저장하세요
		// 그리고 백의 자리 이하를 버린 값을 구하세요
		// 예시) '456' -> '400'
		//		'111' -> '100'
		
		int num = 456;
		int result = (num/100) * 100;
		
		System.out.println(result);

	}

}
