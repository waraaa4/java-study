package conditional;

public class Ex2 {

	public static void main(String[] args) {
		
		// 나이가 8살 이상이면 '학교에다닙니다', 그렇지 않으면 '학교에다니지않습니다'
		
		int age = 10; // 나이
		
		if (age >= 8) { // 조건
			System.out.println("학교에다닙니다");
		} else {
			System.out.println("학교에다니지않습니다");
		}

	}

}
