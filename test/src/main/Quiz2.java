package main;

public class Quiz2 {

	public static void main(String[] args) {

		int num = 3;

		if (num > 2 && num < 6) {
		    System.out.println(num + "월은 봄입니다");
		} else if (num > 5 && num < 9) {
			System.out.println(num + "월은 여름입니다");
		} else if (num > 8 && num < 12) {
			System.out.println(num + "월은 가을입니다");
		} else if (num == 12 || num < 3) {
			System.out.println(num + "월은 겨울입니다");
		} else {
			System.out.println(num + "월은 잘못된 값입니다.");
		}

	}

}

