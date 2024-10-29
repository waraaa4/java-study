package reference.quiz;

public class Quiz2 {

	// 2번. 부서(Department)을 정의하는 클래스를 만드세요.
	// 속성: 부서장, 수석연구원, 책임연구원
	
	// 직원(Employee)을 정의하는 클래스를 만드세요.
	// 속성: 이름, 나이, 월급, 근속년수
	
	// 부서 객체를 생성하고, 부서원들을 추가하세요.
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("이름1", 10, 500, 5);
		Employee employee2 = new Employee("이름2", 10, 500, 5);
		Employee employee3 = new Employee("이름3", 10, 500, 5);

		Department department = new Department(employee1, employee2, employee3);
	}

}

// 직원
class Employee {
	String name;
	int age;
	int monthly;
	int years;
	
	public Employee(String name, int age, int monthly, int years) {
		super();
		this.name = name;
		this.age = age;
		this.monthly = monthly;
		this.years = years;
	}
}

// 부서
class Department {
	Employee headDepartment;
	Employee seniorResearcher;
	Employee leadResearcher;
	
	public Department(Employee headDepartment, Employee seniorResearcher, Employee leadResearcher) {
		super();
		this.headDepartment = headDepartment;
		this.seniorResearcher = seniorResearcher;
		this.leadResearcher = leadResearcher;
	}
}
