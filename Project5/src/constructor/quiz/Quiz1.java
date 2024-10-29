package constructor.quiz;

public class Quiz1 {
	
	// 1번. 책(Book)을 정의하는 클래스를 만드세요.
	// 속성: 제목, 가격, 출판사, 페이지수
	// 생성자: 디폴트 생성자, 모든 멤버변수를 입력받는 생성자
	
	// 모든 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
	// (스프링부트, 30000, 한빛출판사, 200)
	// (자바프로그래밍, 10000, 금빛출판사, 300)

	public static void main(String[] args) {
		
		// 객체 생성 후 초기화
		Book book1 = new Book();
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.company = "한빛출판사";
		book1.page = 200;
		
		// 객체 생성과 동시에 초기화
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);

	}

}

class Book {
	String title;
	int price;
	String company;
	int page;
	
	public Book() {
		super();
	}

	public Book(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
}
