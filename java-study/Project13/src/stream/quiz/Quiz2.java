package stream.quiz;

import java.util.Arrays;
import java.util.stream.Stream;

// 다음과 같이 리스트를 생성하세요
// [file1.txt, file2.pdf, file3.txt, file4.img, file5.txt, file6.img]
// 1.파일 목록 중에서 txt 파일만 찾으세요
// 결과: file1.txt file3.txt file5.txt
// 2.확장자별로 파일의 개수를 구하세요
// txt파일의 개수: 3
// pdf파일의 개수: 1
// img파일의 개수: 2
// 3. 파일의 확장자만 추출하여 출력하세요
// (hint! (.)점은 문자기호로 (\\.)으로 표현합니다 )
// 결과: txt pdf img

public class Quiz2 {

	// filter 함수의 인자는 Predicate
	// Predicate 인터페이스를 람다식 함수로 구현하기
	// 1.추상메소드 구현한다 2.람다식함수로 바꾼다
//	boolean test(S s) {
//		return s.endsWith(".txt");
//	}

	public static void main(String[] args) {

		// 파일 목록 생성
		String[] arr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };

		// 1.파일 목록 중에서 txt 파일만 찾으세요
		// 결과: file1.txt file3.txt file5.txt
		Stream<String> stream = Arrays.stream(arr);		
		stream
				.filter(s -> s.endsWith(".txt")) //문자열이 .txt로 끝나는지 확인
				.forEach(s -> System.out.print(s + " "));

		// 2.확장자별로 파일의 개수를 구하세요
		// txt파일의 개수: 3
		// pdf파일의 개수: 1
		// img파일의 개수: 2
		Stream<String> stream2 = Arrays.stream(arr);
		long txtCount = stream2
								.filter(s -> s.endsWith(".txt"))
								.count();

		Stream<String> stream3 = Arrays.stream(arr);
		long pdfCount = stream3
								.filter(s -> s.endsWith(".pdf"))
								.count();

		Stream<String> stream4 = Arrays.stream(arr);
		long imgCount = stream4
								.filter(s -> s.endsWith(".img"))
								.count();

		System.out.println("txt파일의 개수: " + txtCount);
		System.out.println("pdf파일의 개수: " + pdfCount);
		System.out.println("img파일의 개수: " + imgCount);

		// 3. 파일의 확장자만 추출하여 출력하세요 (hint! (.)점은 문자기호로 (\\.)으로 표현합니다 )
		// 결과: txt pdf img
		Stream<String> stream5 = Arrays.stream(arr);
		stream5
				.map(s -> {
					// .을 구분자를 사용하여 문자열을 자름. (점은 특수기호로 표현해야함)
					String[] strArr = s.split("\\."); 
					return strArr[1];
				})
				.distinct()
				.forEach(s -> System.out.print(s + " "));

	}

}
