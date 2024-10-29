package main;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * <바이트 단위 스트림>
 * 배열을 사용해서 파일에 쓰기
 * */
public class Ex07 {

	public static void main(String[] args) throws IOException {

		// 파일에 바이트 배열 출력하기
		try {
			FileOutputStream fos = new FileOutputStream("output2.txt");
			byte[] arr = { 65, 66, 67 };

			// 배열의 모든 데이터 출력
			fos.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
