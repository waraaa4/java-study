package main;

public class Quiz8 {

	public static void main(String[] args) {

		Calc calc = new Calculator();
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 5));
		System.out.println(calc.divide(10, 5));
		
		System.out.println();
		
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));

	}

}

interface Calc {
	final int ERROR = -9999;

	public abstract int add(int num1, int num2);

	public abstract int substract(int num1, int num2);

	public abstract int times(int num1, int num2);

	public abstract int divide(int num1, int num2);
}

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
		if(num1 <= 0 || num2 <= 0) {
			return ERROR;
		}
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num1 < num2) {
			return ERROR;
		}
		return num1 / num2;
	}

}