package loop.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 6번. for문을 사용해 1부터 100까지 더하세요.
		// 단 중간에, 합이 500이 넘어가면 중단합니다.
		// for문이 종료되기전 num과 sum의 값을 출력하세요.
		// break를 사용할것
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
			if(sum >= 500) {
				System.out.println("i:" + i + " sum:" + sum);
				break;
			}
		}
		

	}

}
