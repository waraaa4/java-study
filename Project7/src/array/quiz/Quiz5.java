package array.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 5번.
		// 5개 크기의 정수형 배열을 생성하고, 다음과 같이 초기화하세요.
		// {5, 20, 100, 30, 77}
		
		// 배열에서 가장 큰값을 찾으세요
		// 답: 100
		
		int[] arr = new int[] { 5, 20, 100, 30, 77 };

		int max = arr[0];

		for (int i=1; i<5; i++) {
			if (arr[i] > max) { 
				max = arr[i]; 
			}
		}

		System.out.println(max);
		

	}

}
