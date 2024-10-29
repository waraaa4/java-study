package instance;

public class Ex1 {

	public static void main(String[] args) {
		
		// 객체 생성
		Student student = new Student();
		
		// 객체 멤버변수를 사용하여 학번 수정
		student.studentID = 1001;
		student.studentName = "둘리";
		student.grade = 2;
		student.address = "인천 연수구";
		
		System.out.println("학생의 모든 정보를 출력합니다.");
		student.showStudentInfo();
		
		System.out.println("객체의 주소:" + student);
		
	}

}
