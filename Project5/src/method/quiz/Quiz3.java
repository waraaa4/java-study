package method.quiz;

public class Quiz3 {

	// 3번. 두 수를 비교하는 함수 만들고 호출하세요.
	// 둘 중에 더 큰 수를 구하고 반환하세요
	public static int num(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}
		
	}
	
	public static void main(String[] args) {
		int result = num(10,5);
		System.out.println(result);
	}

}
