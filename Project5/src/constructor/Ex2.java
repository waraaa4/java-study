package constructor;

// 테스트 클래스
public class Ex2 {

	public static void main(String[] args) {
		
		// 첫번째 생성자 사용
		Person person1 = new Person();
		person1.name = "둘리";
		person1.weight = 80;
		person1.height = 180;
		
		// 두번째 생성자 사용
		Person person2 = new Person("또치");
		person2.weight = 50;
		person2.height = 160;
		
		// 세번째 생성자 사용
		Person person3 = new Person("도우너", 170, 60);

	}

}

// 사람을 정의하는 클래스
class Person {
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	
	// 함수이름이 같아도 매개변수가 다르면 오버로딩이 되어서 만들어진다
	
	// 디폴트 생성자: 객체만 생성
	public Person() {
		
	}
	
	// 이름을 받아서 초기화하는 생성자
	public Person(String nm) {
		name = nm;
	}
	
	// 이름, 키, 몸무게를 받아서 초기화하는 생성자
	public Person(String nm, int he, int we) {
		name = nm;
		height = he;
		weight = we;
	}
}
