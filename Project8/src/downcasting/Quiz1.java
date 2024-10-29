package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		// 1번.
		
		// 리스트를 하나 생성하세요
		// 리스트에 사람, 호랑이, 독수리를 하나씩 추가하세요
		
		// 반복문으로 리스트에 저장된 요소를 하나씩 꺼내서,
		// 사람이라면 readBook() 메소드를 호출하세요
		// 호랑이라면 hunting() 메소드를 호출하세요
		// 독수리라면 flying() 메소드를 호출하세요
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for(Animal animal : list) {
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
		}
		
		// end
	}

}
