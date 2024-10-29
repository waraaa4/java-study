package main;

public class Quiz3 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		for(int i=1; i<=100; i++) {
			if(sum < 300) {
				sum = sum + i;
				num = i;
			}
		}
		System.out.println("i: " + num + ", sum: " + sum);
		
	}

}
