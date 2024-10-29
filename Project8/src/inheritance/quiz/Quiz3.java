package inheritance.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		Balpen balpen = new Balpen();
		balpen.width = 2;
		balpen.amount = 100;
		balpen.color = "파랑";
		
		FountainPen fountainPen = new FountainPen();
		fountainPen.width = 3; 
		fountainPen.amount = 80;
		fountainPen.brand = "몽블랑";
	}

}

//펜 클래스
class Pen {
	int width; // 펜의 굵기
	int amount; // 남은양
}

//볼펜 클래스
class Balpen extends Pen { 
	String color; // 볼팬의 색깔
}

//만년필 클래스
class FountainPen extends Pen { 
	String brand; // 만년필 브랜드
}