package loop;

public class Ex10 {

	public static void main(String[] args) {
		
		// 중첩반복문을 사용하여 구구단 만들기
		for(int dan = 2; dan <= 9; dan++) { // 2~9단
			for(int times = 1; times <= 9; times++) { // 곱하는수 1~9
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
		

	}

}
