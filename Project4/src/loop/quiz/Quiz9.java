package loop.quiz;

public class Quiz9 {

	public static void main(String[] args) {
		
		// 9번. 중첩반복문을 사용해서 직사각형을 그려보세요.
		for(int i = 1; i <=3; i++) { // 3줄
			for(int j = 1; j <= 5; j++) { // * 5개 
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}

	}

}
