package abstractex;

/*
 * 추상클래스 만들고 상속받기
 * */
public class Ex1 {

	public static void main(String[] args) {

		// Computer computer = new Computer(); //에러남. 추상클래스는 인스턴스 생성 못함 
		DeskTop desktop = new DeskTop();
		NoteBook notebook = new NoteBook();

		desktop.turnOn();
		desktop.turnOff();
		desktop.display();
		desktop.typing();

		notebook.turnOn();
		notebook.turnOff();
		notebook.display();
		notebook.typing();
	}
}

//컴퓨터 클래스
abstract class Computer { // 추상클래스로 지정
	// 공통기능은 일반메소드로 선언
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	// 컴퓨터마다 화면을 표시하는 방법이 다르니까 추상메소드로 선언
	public abstract void display(); // 바디없음

	// 컴퓨터마다 타이핑을 하는 방법이 다르니까 추상메소드로 선언
	public abstract void typing();
}

//데스크톱 클래스
class DeskTop extends Computer { // 컴퓨터클래스 상속받기. 구현되지 않은 메소드가 있으면 에러남

	@Override
	public void display() { // 물려받은 추상메소드 구현
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() { // 물려받은 추상메소드 구현
		System.out.println("DeskTop Typing()");
	}

}

//노트북 클래스
class NoteBook extends Computer { // 컴퓨터클래스 상속받기

	@Override
	public void display() { // 물려받은 추상메소드 구현
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() { // 물려받은 추상메소드 구현
		System.out.println("NoteBook Typing()");
	}

}
