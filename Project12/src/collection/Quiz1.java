package collection;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		// 1번
		// Character타입의 Arraylist 생성하세요
		// 문자 3개를 추가하세요 ('A','B','C')
		// 리스트의 요소를 하나씩 출력하세요
		// 리스트에서 두번째 문자 B를 삭제하세요
		// 리스트의 크기를 출력하세요
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	
		}
		
		list.remove(1);
		
		System.out.println(list.size());
		
	}

}
