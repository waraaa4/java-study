package method.quiz;

public class Quiz2 {

	// 2번. 합을 구하는 함수를 만들고 호출하세요.
	// 두 수를 입력받아 n1부터 n2까지의 합을 반환하세요
	
	public static int num(int n1, int n2) {
		int result = 0;
		for(int i=n1; i<=n2; i++) {
			result = result + i;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(num(5,10));
	}

}
