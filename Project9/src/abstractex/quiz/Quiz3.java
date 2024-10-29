package abstractex.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.sleep();
		human.move();
		human.readBook();
		
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunting();
		
	}

}

// 동물 클래스
abstract class Animal {
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다");
	}
	public abstract void move();
	
}

// 사람 클래스
class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
	
}

// 호랑이 클래스
class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
	
}



