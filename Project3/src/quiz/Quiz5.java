package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 1.본인의 나이가 40세 이하라면 true를 출력하세요
		// 2.본인의 나이가 40세가 맞다면 true를 출력하세요
		// 3.본인의 나이가 40세가 아니라면 true를 출력하세요
		
		int age = 37;
		
		boolean result1 = (age <= 40);
		boolean result2 = (age == 40);
		boolean result3 = (age != 40);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
