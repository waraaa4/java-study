package main;

public class Quiz1 {

	public static void main(String[] args) {

		Sc sc = new Sc();
		int num1 = sc.s = 90;
		int num2 = sc.e = 70;
		int num3 = sc.k = 100;
		int sum = num1 + num2 + num3; 
		double sum2 = sum / 3.0;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum2);
		
	}

}

class Sc {
	int s;
	int e;
	int k;
}