package main;

public class Ex1 {

	public static void main(String[] args) {
		
		// 인터페이스는 객체를 생성할 수 없음
		// Calc calc = new Calc();
		
		Calculator calculator = new Calculator();
		
		// int타입의 리턴값이 있기 때문에 변수에 담아야한다
		int result = calculator.add(10, 5);
		System.out.println(result); // 테스트
		
		// 바로 호출해서 확인할 수도 있다
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.times(10, 5));
		System.out.println(calculator.divide(10, 8));

	}

}

// 계산기의 구현 클래스
// 인터페이스를 상속 받을때는 implements
class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}
	
}







