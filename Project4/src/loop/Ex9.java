package loop;

public class Ex9 {

	public static void main(String[] args) {
		
		// 1부터 20까지 더하다가, 합이 100이 넘어가면 반복문을 중단하기
		int sum = 0; // 합계
		int i;
		
		// break는 특정조건에서 빠져나와야할 때 사용할 것
		for(i = 1; i <= 20; i++) { // 1~20
			sum = sum + i;
			System.out.println("i: " + i + " , sum: " + sum);
			
			if(sum >= 100) { // 합이 100을 넘으면 for문 종료
				break;
			}
		}
		
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
	}

}
