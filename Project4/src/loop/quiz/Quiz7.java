package loop.quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		// 7번. 구구단을 3단부터 7단까지만 출력하세요
		
		for(int dan = 3; dan <= 7; dan++) {
			for(int times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}

	}

}
