package map;

import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) {

		// 1번
		// 문자타입 key, 문자열타입 value를 가지는 HashMap을 생성하세요
		// 다음과 같이 데이터 3개를 추가하세요
		// {'a', "사과"}, {'b', "바나나"}, {'c', "코코넛"}
		// 키값이 b인 요소의 값을 조회하세요
		// 바나나를 블루베리로 변경하세요
		// 사과를 삭제하세요

		HashMap<Character, String> map = new HashMap<Character, String>();

		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");

		System.out.println(map.get('b'));

		map.replace('b', "블루베리");

		map.remove('a');

		System.out.println(map);
		
		// 추가설명
		// 특정키값이 존재하는지 확인하기
		if (map.containsKey('b')) {
			System.out.println("map에 b라는 키가 있습니다");
		} else {
			System.out.println("map에 b라는 키가 없습니다");
		}

	}

}
