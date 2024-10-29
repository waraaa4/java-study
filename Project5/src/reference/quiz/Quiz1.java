package reference.quiz;

public class Quiz1 {

	// 1번. 도서관의 회원(Member)을 정의하는 클래스를 만드세요.
	// 속성: 회원번호, 이름, 대영한 책1, 책2, 책3
	
	// 책(Book)을 정의하는 클래스를 만드세요.
	// 속성: 제목, 가격, 출판사, 페이지수
	
	// 회원을 생성하고, 회원이 대여한 책 3권을 추가하세요.
	
	public static void main(String[] args) {
		
		Book book1 = new Book("책1", 100, "출판사1", 500);
		Book book2 = new Book("책2", 100, "출판사2", 500);
		Book book3 = new Book("책3", 100, "출판사3", 500);

		Member member = new Member(10, "name", book1, book2, book3);
	}

}

// 책
class Book {
	String title;
	int price;
	String company;
	int page;
	
	public Book(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}

// 회원
class Member {
	int no;
	String name;
	Book bookTitle1;
	Book bookTitle2;
	Book bookTitle3;
	
	public Member(int no, String name, Book bookTitle1, Book bookTitle2, Book bookTitle3) {
		super();
		this.no = no;
		this.name = name;
		this.bookTitle1 = bookTitle1;
		this.bookTitle2 = bookTitle2;
		this.bookTitle3 = bookTitle3;
	}
}







