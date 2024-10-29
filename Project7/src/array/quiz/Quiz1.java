package array.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 1번.
		// 5개 크기의 문자형 배열을 생성하세요
		
		// 값의 목록을 다음과 같이 초기화하세요.
		// {'a', 'b', 'c', 'd', 'e'}
		
		// 배열의 모든 요소를 출력하세요
		char[] cha = new char[5];
		cha[0] = 'a';
		cha[1] = 'b';
		cha[2] = 'c';
		cha[3] = 'd';
		cha[4] = 'e';
		
		for(int i=0; i<cha.length; i++) {
			System.out.println(cha[i]);
		}

	}

}
