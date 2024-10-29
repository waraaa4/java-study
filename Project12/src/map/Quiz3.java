package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {

		// 3번 
		// String형 키, float형 value를 가지는 HashMap 객체를 생성하세요
		// 다음과 같이 데이터 3개를 추가하세요 {"국어", 80.0}, {"수학", 90.0}, {"영어", 100.0}
		// map에 저장된 과목명만 출력하세요
		// map에 저장된 점수만 출력하세요
		
		HashMap<String, Float> map = new HashMap<String, Float>();
		
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		Set<String> keyset = map.keySet();
		for(String key : keyset) {
			System.out.println(key);
		}
		
		Collection<Float> values = map.values();
		for(float value : values) {
			System.out.println(value);
		}
		
	}

}
