package quiz;

public class Quiz6 {

	public static void main(String[] args) {

		// 1. 7이 홀수가 맞는지 확인하고, 결과를 출력하세요
		// 2. 10이 짝수가 맞는지 확인하고, 결과를 출력해보세요
		
		int x = 7;
		int y = 10;
		
		boolean result1 = (x % 2) == 1;
		boolean result2 = (y % 2) == 0;
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
