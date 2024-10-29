package loop.quiz;

public class Quiz4 {

	public static void main(String[] args) {

		// 4번 1부터 100까지의 수 중에서 2의 배수만 출력하세요.
		// 2 4 6 8 10.... 98 100
		
		// 반복횟수: 100번
		// 반복코드: 숫자가 2의 백수 인지 확인하고, 출력하기
		// 변수 i의 용도는 여러가지..
		// 1. 조건문에 사용됨
		// 2. 2의 배수를 찾는데 사용됨

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		

	}

}
