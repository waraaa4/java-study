package method;

public class Ex4 {

	// 입력받은 숫자 만큼 안녕하세요를 출력하는 함수 선언
	public static void printHello(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	public static void main(String[] args) {
		printHello(3); // 함수 호출
	}

}
