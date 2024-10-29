package hiding;

public class Quiz1 {

	// 문제1.
	// 책(Book)을 정의하는 클래스를 만드세요.
	// 속성: 제목, 가격, 출판사, 페이지수 *private
	// 기능: 각 멤버변수의 getter와 setter
	
	// Book 클래스를 사용하여 다음 정보를 가지는 두 개의 인스턴스를 생성하세요
	// 이때, 책의정보는 setter를 사용해서 변경하세요.
	// (자바프로그래밍, 20000, 한빛컴퍼니, 300)
	// (스프링, 15000, 한빛컴퍼니, 500)
	// 모든 인스턴스의 정보를 출력하세요
	// 이때, 책의 정보는 getter를 사용해서 출력하세요
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("자바프로그래밍");
		book.setPrice(20000);
		book.setCompany("한빛컴퍼니");
		book.setPage(300);
		
		System.out.println(book.getTitle() + 
				book.getPrice() + 
				book.getCompany() + 
				book.getPage());

	}

}

class Book {
	private String title;
	private int price;
	private String company;
	private int page;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}

