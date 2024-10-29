package main;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for(Animal animal : list) {
			if(animal instanceof Human) {
				Human human = (Human) animal;
				human.ani();
				human.move();
				human.action();
				System.out.println();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.ani();
				tiger.move();
				tiger.action();
			}
		}
		
	}

}

abstract class Animal {
	public void ani() {
		System.out.println("밤에는 잠을 잡니다");
	}

	public abstract void move();

	public abstract void action();
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}

	@Override
	public void action() {
		System.out.println("사람이 책을 읽습니다");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}

	@Override
	public void action() {
		System.out.println("호랑이가 사냥을 합니다");
	}

}