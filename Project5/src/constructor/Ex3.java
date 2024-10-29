package constructor;

public class Ex3 {

}

// 게시무을 정의하는 클래스
class Board {
	int no;
	String title;
	String content;
	String writer;
	
	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public Board(int no) {
		super();
		this.no = no;
	}

	public Board(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}

	public Board() {
		super();
	}
	
	
}
