package abstractex.quiz;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for(Animal animal : list) {
			animal.sleep();
			animal.move();
			if(animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
		}

	}

}
