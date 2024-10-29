package string.quiz;

import java.util.Scanner;

// Scanner 클래스의 nextLine 메소드를 사용하여 문자열을 입력받고,
// "END" 또는 "end" 가 입력되면 루프를 종료하세요.
//
// while(true)를 사용하여 무한루프를 만드세요.

public class Quiz6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("입력하세요");
			String line = scanner.nextLine();
			
			if(line.equals("END") || line.equals("end")) {
				break;
			}  
			
//			if(line.toLowerCase().equals("end")) {
//				break;
//			} 
//			
//			if(line.equalsIgnoreCase("end")) {
//				break;
//			}
		}
		
	}
}