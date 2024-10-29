package array.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 8번.
		// 학생(Student)을 정의하는 클래스를 만드세요.
		// 속성: 학번, 이름
		// 학번과 이름을 초기화하는 생성자
		// 학생의 정보를 출력하는 메소드
		
		// 3개 크기의 Student형 배열을 생성하고, 3명의 학생정보를 저장하세요.
		// 그리고 배열에 저장된 모든 학생의 정보를 출력하세요.
		
		Student[] st = new Student[3];
		
		st[0] = new Student(1, "이름1");
		st[1] = new Student(2, "이름2");
		st[2] = new Student(3, "이름3");
		
		for(int i=0; i<3; i++) {
			st[i].showStudent();
		}

	}

}

class Student {
	int number; 
	String name;
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public void showStudent() {
		System.out.println(number + " " + name);
	}
}

