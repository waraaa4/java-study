package method.quiz;

public class Quiz6 {
	
	// 6번. 계산기 메소드를 만들고 호출하세요
	// 두 수와 연산자(+ - * /) 중에 하나를 입력받아
	// 연산을 수행하고 결과를 출력하세요.
	public static void num(int n1, int n2, char n3) {
		
		int result = 0;
		
		switch (n3) {
		case '+':
			result = n1 + n2;
			break;
			
		case '-':
			result = n1 - n2;
			break;
			
		case '*':
			result = n1 * n2;
			break;
		
		case '/':
			result = n1 / n2;
			break;
		}
		System.out.println("switch " + result);
		
		if(n3 == '+') {
			result = n1 + n2;
		} else if(n3 == '-') {
			result = n1 - n2;
		} else if(n3 == '*') {
			result = n1 * n2;
		} else {
			result = n1 / n2;
		}
		System.out.println("if " + result);
	}

	public static void main(String[] args) {
		 num(1, 5, '+');
		 num(1, 5, '-');
		 num(1, 5, '*');
		 num(1, 5, '/');

	}

}
