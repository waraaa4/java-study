package instance.quiz;

public class Quiz1 {
	
	// 1번. 다음과 같이 사람클래스(Person)를 정의하세요.
	// 속성: 이름, 나이, 결혼여부, 자식수
	
	// 그리고 Person 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요
	// 이름: James
	// 나이: 40세
	// 결혼여부: o
	// 자식: 3
	
	// Person 클래스와 테스트 클래스는 불리해주세요

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "James";
		person.age = 40;
		person.isMarried = true;
		person.descendent = 3;
		person.personShow();
	}

}

class Person {
	String name; 
	int age;
	boolean isMarried;
	int descendent;
	
	public void personShow() {
		System.out.println(name + " " + age + " " + isMarried + " " + descendent);
	}
}


