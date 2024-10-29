package main;

public class Quiz6 {

	public static void main(String[] args) {

		Bpen bpen = new Bpen(2, 100);
		System.out.println("펜의 굵기: " + bpen.bold);
		System.out.println("남은양: " + bpen.num + "%");
		System.out.println("볼펜의 색: " + bpen.color);
		
		System.out.println();
		
		Mpen mpen = new Mpen(3, 80);
		System.out.println("펜의 굵기: " + mpen.bold);
		System.out.println("남은양: " + mpen.num + "%");
		System.out.println("볼펜의 색: " + mpen.brand);
	}

}

class Pen {
	
	int bold;
	int num; // 남은양
	
	public Pen(int bold, int num) {
		super();
		this.bold = bold;
		this.num = num;
	}
	
}

class Bpen extends Pen {

	String color = "파랑색";
	
	public Bpen(int bold, int num) {
		super(bold, num);
		
	}
	
}

class Mpen extends Pen {
	
	String brand = "몽블랑";

	public Mpen(int bold, int num) {
		super(bold, num);
		
	}
	
	
}

