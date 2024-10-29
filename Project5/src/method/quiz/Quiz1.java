package method.quiz;

public class Quiz1 {
	
	// 사칙연산을 수행하는 함수를 만들고 호출하세요.
	// 두 숫자를 입력받아 덧셈, 뻴셈, 곱셈, 나눈셈, 나머지를 출력하세요
	public static void num(int num1, int num2) {
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}
	
	public static void main(String[] args) {
		num(3, 5);
	}

}
