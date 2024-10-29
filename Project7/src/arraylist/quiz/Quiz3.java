package arraylist.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 3번
		// 문자열형(String) 리스트를 생성하세요.
		// 문자열 5개를 추가하세요 ("AA", "BB", "CC", "DD", "EE")
		// 반복문을 사용하여 리스트의 요소를 출력하세요.
		// 리스트에 저장된 모든 문자열을 삭제하세요
		
		// 문자열형(String) 리스트를 생성하세요.
		ArrayList<String> list = new ArrayList<String>();
		
		// 문자열 5개를 추가하세요 ("AA", "BB", "CC", "DD", "EE")
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		// 반복문을 사용하여 리스트의 요소를 출력하세요.
		for(String str : list) {
			System.out.println(str);
		}
		
		// 리스트에 저장된 모든 문자열을 삭제하세요
		int num = 4;
		int listNum = list.size();
		for(int i=0; i<listNum; i++) {
			list.remove(num);
			num--;
		}
		System.out.println(list.size());
		
	}

}
