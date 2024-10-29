package collection;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		// 3번
		// 책 번호와 제목을 멤버로 가지는 Book클래스를 만드세요
		// Book 타입의 리스트를 생성하세요
		// 리스트에 책 3권 추가하세요
		// 리스트에 저장된 모든 책의 정보를 출력하세요
		// 리스트의 모든 요소를 삭제하세요

		ArrayList<Book> list = new ArrayList<Book>();

		Book book1 = new Book(1, "책1");
		list.add(book1);
		list.add(new Book(2, "책2"));
		list.add(new Book(3, "책3"));

		// 리스트 요소 하나씩 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 일반 for문 사용
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.print(book);
		}

		// 람다식 for문 사용
//		for (Book book : list) { // (배열에서 꺼낸 값을 저장할 변수 : 배열)
//			System.out.print(book);
//		}
		
		// 리스트 삭제
		list.clear();

		// 앞에서부터 삭제
		//X
// 		list.remove(0);
//		list.remove(1);
//		list.remove(2);

		//O
//		list.remove(0); //중간에 있던 요소가 삭제하면 배열은 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다
//		list.remove(0);
//		list.remove(0);

		// 뒤에서부터 삭제
//		list.remove(2);
//		list.remove(1);
//		list.remove(0);
		
		System.out.println();
		System.out.println("모든 요소 삭제: " + list);

	}

}

class Book {
	int no;
	String title;

	public Book(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + "]";
	}

}
