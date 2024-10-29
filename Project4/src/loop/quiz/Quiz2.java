package loop.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 2번. 11부터 20까지 합을 구하고 출력하세요
		
		int num = 11;
		int sum = 0;
		while (num <= 20) {
			sum = sum + num;
			num++;
		}
		System.out.println("11부터 20까지 합은 " + sum + "입니다.");

	}

}
