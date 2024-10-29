package typecasting.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 부모타입 변수 = 자식 인스턴스 생성
		Parents pc = new Child("한국", "고", "길동");
		
		
		Child child = new Child("한국", "고", "길동");
		
	}

}

class Parents {
	String nationality;
	String lastName;
	
	public Parents(String nationality, String lastName) {
		this.nationality = nationality;
		this.lastName = lastName;
	}
}

class Child extends Parents {
	String firstName;
	
	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}
}




