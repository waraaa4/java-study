package main;

public class Ex6 {

	public static void main(String[] args) {
		
		boolean result1 = (5 > 0) && (10 > 0); // true && true
		boolean result2 = (5 > 0) && (10 < 0); // true && false
		boolean result3 = (5 > 0) || (10 > 0); // true || true
		boolean result4 = (5 > 0) || (10 < 0); // true || false
		boolean result5 = !(5 > 0); // !(true)
		
		System.out.println(result5);
		
	}

}
