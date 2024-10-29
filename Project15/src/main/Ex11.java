package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {

		// 먼저 예제 프로젝트에서 a.txt 파일 복사 (용량이 2MB 정도되는 파일 준비)

		// 그냥 기반스트림으로 파일 복사하기

		// 시간 측정
		long start = 0; // 시작 시간
		long end = 0; // 끝난 시간

		// 입력 스트림 생성
		FileInputStream fis = new FileInputStream("a.txt");

		// 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("copy.txt");

		// 복사를 시작하는 시간 저장
		start = System.currentTimeMillis();

		// 한문자씩 읽어서 복사하는 중
		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			fos.write(i);
		}
		
		System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");

	}

}
