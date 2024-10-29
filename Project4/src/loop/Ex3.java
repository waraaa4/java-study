package loop;

public class Ex3 {

	public static void main(String[] args) {
		
		// 숫자 1부터 10까지 합 구하기
//		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
//		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

		// 1. 반복문에 필요한 변수 -> 합계와 숫자
		// 2. 조건문(반복횟수) -> 10번				
		// 3. 반복하고 싶은 코드 -> sum에 숫자를 더하는 동작
		int sum = 0;
		int num = 1;
		while (num <= 10) {
			sum = sum + num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
	}

}
