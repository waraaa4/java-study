package arraylist.quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 1번.
		// 문자형(Character) 리스트를 생성하세요
		// 문자 3개를 추가하세요 ('A', 'B', 'C')
		// 리스트의 모든 요소를 출력하세요.
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		// 리스트에서 요소 하나씩 꺼내기
		char ch1 = list.get(0);
		System.out.println(ch1);
		
		for(char c : list) {
			System.out.println(c);
		}
		

	}

}
