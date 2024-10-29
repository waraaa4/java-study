package reference;

//  부서(Department)을 정의하는 클래스를 만드세요.
//  속성: 부서장, 수석연구원, 책임연구원
//
//  직원(Employee)을 정의하는 클래스를 만드세요.
//  속성: 이름, 나이, 월급, 근속년수
//
//  부서 객체를 생성하고, 부서원들을 추가하세요.

public class Quiz2 {

	public static void main(String[] args) {	
		//직원 3명 생성
		Employee employee1 = new Employee("둘리",50,5000000,20);
		Employee employee2 = new Employee("또치",40,4000000,10);
		Employee employee3 = new Employee("도우너",30,3000000,3);
		//부서생성하고 부서원 추가
		Department department = new Department(employee1, employee2, employee3);
	}
}

// 직원 클래스
class Employee{
	String name; //이름
	int age; //나이
	int salary; //월급
	int year; //근속년수
	
	public Employee(String name, int age, int salary, int year) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.year = year;
	}

}
// 부서 클래스
class Department{
	Employee head; //부서장
	Employee senior; //수석연구원
	Employee junior; //책임연구원
	
	public Department(Employee head, Employee senior, Employee junior) {
		this.head = head;
		this.senior = senior;
		this.junior = junior;
	}

}
