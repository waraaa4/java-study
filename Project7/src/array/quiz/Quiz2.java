package array.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 2번.
		// 10개 크기의 정수형 배열을 생성하고, 다음과 같이 초기화하세요
		// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		
		// 첫번째 요소와 마지막 요소를 출력하세요
		// 단, 값의 목록이 바뀌었을때도 첫번째 요소와 마지막 요소가 출력되어야 합니다
		
		// 예시) {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} -> 1과 10
		
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(num[0]);
		
		int last = num.length - 1;
		System.out.println(num[last]);

	}

}
