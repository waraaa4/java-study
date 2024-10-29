package array.quiz;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 4번.
		// 5개 크기의 정수형 배열을 생성하세요
		
		// 반복문을 사용하여 숫자 1~10 중에서 짝수만 배열에 저장하세요.
		
		// [2, 4, 6, 8, 10]
		
		int[] arr = new int[5];
		int num = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				arr[num] = i;
				num++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
