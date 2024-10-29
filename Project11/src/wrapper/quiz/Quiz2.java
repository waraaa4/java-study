package wrapper.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// 2번.
		// 정수 10을 문자열 변수에 저장하세요
		// 실수 1.123을 문자열 변수에 저장하세요
		// 문자 c를 문자열 변수에 저장하세요.
		// boolean타입의 true 값을 문자열 변수에 저장하세요.
		
		// 1. 레퍼클래스의 toString 사용하기
		String str1 = Integer.toString(10);	
		String str2 = Double.toString(1.123);
		String str3 = Character.toString('c');
		String str4 = Boolean.toString(true);
		
		// 2. String 클래스의 valueOf 사용하기
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(1.123);
		String str7 = String.valueOf('c');
		String str8 = String.valueOf(true);

	}

}
