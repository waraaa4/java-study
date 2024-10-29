package arraylist.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 2번.
		// 논리형(Boolean)의 리스트를 생성하세요.
		// 값 3개를 추가하세요 (true, true, false)
		// 반복문을 사용하여 리스트의 모든 요소를 출력하세요.
		// 리스트의 첫번째 요소와 마지막 요소를 출력하세요
		
		// 논리형(Boolean)의 리스트를 생성하세요.
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		// 값 3개를 추가하세요 (true, true, false)
		list.add(true);
		list.add(true);
		list.add(false);

		// 반복문을 사용하여 리스트의 모든 요소를 출력하세요.
		for(Boolean b : list) {
			System.out.println(b);
		}
		
		// 리스트의 첫번째 요소와 마지막 요소를 출력하세요
		boolean bo1 = list.get(0);
		int lastIndex = list.size() - 1;
		boolean bo2 = list.get(lastIndex);
		System.out.println(bo1);
		System.out.println(bo2);
	}

}
