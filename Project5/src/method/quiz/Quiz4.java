package method.quiz;

public class Quiz4 {

	// 4번. 빼기 메소드를 만들고 호출하세요
	// 두 수를 입력받아 첫번째 수에서 두번째 수를 뺀 후 그 결과를 반환하세요.
	// 단, 첫번째 수가 두번째 수보다 작으면 -999를 반환하고 함수를 종료하세요.
	public static int num(int n1, int n2) {
		if(n1 >= n2) {
			int result = n1 - n2;	
			return result;
		} else {
			return -999;
		}
		
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 6;
		int result = num(num1,num2);
		System.out.println(result);

	}

}
