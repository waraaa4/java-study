package array.quiz;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {
		
		// 7번.
		// System.arraycopy 메소드를 사용하여 배열을 복사하세요.
		
		// 원번배열: {'a', 'b', 'c', 'd', 'e'}
		// 새배열: {'d', 'e'}
		
		char[] arr = new char[] {'a', 'b', 'c', 'd', 'e'};
		char[] arrNew = new char[2];
		
		System.arraycopy(arr, 3, arrNew, 0, 2);
		System.out.println(Arrays.toString(arrNew));

	}

}
