package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz5 {

	public static void main(String[] args) {

		// 5번
		// 정수 타입의 Hashset 생성하세요
		// set에 숫자 3개를 추가하세요
		// set의 크기를 출력하세요
		// lterator를 이용하여 set의 요소를 하나씩 출력하세요
		// 람다식 포문을 이용하여 set의 요소를 하나씩 출력하세요
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(1);
		hashset.add(2);
		hashset.add(3);
		
		System.out.println(hashset);
		System.out.println(hashset.size());
		
		// iterator
		Iterator<Integer> ir = hashset.iterator();
		while(ir.hasNext()) {
			int num = ir.next();
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		// 람다식 포문
		for(int num : hashset) {
			System.out.print(num + " ");
		}
		
		
	}

}
