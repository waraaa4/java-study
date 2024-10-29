package map;

import java.util.HashMap;

public class Quiz4 {

	public static void main(String[] args) {

		// 1. 다음과 같이 학생(Student) 클래스를 만드세요.
		// 속성: 학번, 이름, 국어점수, 수학점수, 영어점수

		// 2. 학생목록을 저장하는 map 객체를 생성하세요. (키:학번, 값:학생정보)

		// 3. 다음과 같이 맵에 학생 3명을 추가하세요.
		// ( 학번: 1001, 이름: 둘리, 국어: 90, 수학: 80, 영어: 70 )
		// ( 학번: 1002, 이름: 도우너, 국어: 55, 수학: 65, 영어: 75 )
		// ( 학번: 1003, 이름: 또치, 국어: 80, 수학: 50, 영어: 50 )

		// 4. 학생별 총점과 평균점수를 구하세요.
		// ex) 둘리의 총점: 240, 평균: 80.0

		// 5. 과목별 총점과 평균점수를 구하세요.
		// ex) 국어의 총점: 225, 평균: 75.0
		
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		
		Student student1 = new Student(1001, "둘리", 90, 80, 70);
		Student student2 = new Student(1002, "도우너", 55, 65, 75);
		Student student3 = new Student(1003, "또치", 80, 50, 50);
		
		map.put(student1.studentId, student1);
		map.put(student2.studentId, student2);
		map.put(student3.studentId, student3);
		
		System.out.println(map.size());
		
		// 학생별 총점
		int sum = 0;
		for(int i=1; i<map.size()+1; i++) {
			Student student = map.get(1000 + i);
			sum = student.eng + student.kor + student.math;
			System.out.println("학생별 총점: " + sum);
			Double summ = sum / 3.0;
			System.out.println("학생별 평균: " + summ);
		}
		
		System.out.println();
		
		// 과목별 총점
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i=1; i<map.size()+1; i++) {
			Student student = map.get(1000 + i);
			sum1 = sum1 + student.kor;
			
			sum2 = sum2 + student.eng;
			
			sum3 = sum3 + student.math;
		}
		Double sum11 = sum1 / 3.0;
		Double sum22 = sum2 / 3.0;
		Double sum33 = sum3 / 3.0;
		
		System.out.println("국어 총점: " + sum1);
		System.out.println("국어 평균: " + sum11);
		
		System.out.println("영어 총점: " + sum2);
		System.out.println("영어 평균: " + sum22);
		
		System.out.println("수학 총점: " + sum3);
		System.out.println("수학 평균: " + sum33);

		
		
		
	}

}

class Student {
	
	int studentId; // 학번
	String studentName; // 이름
	int kor; // 국어점수
	int math; // 수학점수
	int eng; // 영어점수
	
	public Student(int studentId, String studentName, int kor, int math, int eng) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", kor=" + kor + ", math=" + math
				+ ", eng=" + eng + "]";
	}
	
}











