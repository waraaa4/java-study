package main;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 1번.
	
		// Calc 타입 변수를 선언하고 Calculator형 인스턴스를 대입하세요.
		// 원래 클래스 타입으로 다운캐스팅 하고 showInfo() 메소드를 호출하세요
		// 앞에서 만든 클래스를 활용해주세요!
		
		Calc calc = new Calculator();
		
		// calc 변수가 가리키는 객체의 타입이 Calculator 라면..
		if(calc instanceof Calculator) {
			// Calculator형으로 다운캐스팅한다!
			Calculator calculator = (Calculator) calc;
			calculator.showInfo();
		}

	}

}
