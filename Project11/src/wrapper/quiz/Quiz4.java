package wrapper.quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		// Scanner 클래스의 nextLine 메소드를 사용하여 정수 두개를 입력받으세요.
		// 그리고 두 수를 더한 결과를 출력하세요
		// ex) 10, 5 => 15
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
		
		System.out.println(sum);
	}

}
