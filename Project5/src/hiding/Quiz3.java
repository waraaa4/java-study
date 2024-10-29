package hiding;

public class Quiz3 {
	
	// 문제3.
	// Mydate3 클래스와 setMonth 메소드를 다음과 같이 조건을 추가하세요.
	
	// 1~12월이 들어오면 값을 변경하고,
	// 그외의 값이 들어오면 "잘못된 월입니다" 메세지를 출력합니다.

	public static void main(String[] args) {
		
		MyDate3 myDate3 = new MyDate3();
		
		myDate3.setMonth(1);
		myDate3.setDay(20);
		
		System.out.println(myDate3.getMonth() + " " + myDate3.getDay());

	}

}

class MyDate3 {
	private int month; // 월
	private int day; // 일
	
	// 월을 가져오는 메소드
	public int getMonth() {
		return month;
	}
	
	// 월을 변경하는 메소드
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 월입니다");
			return;
		}
		
		this.month = month;
	}
	
	// 일을 가져오는 메소드
	public int getDay() {
		return day;
	}
	
	// 일을 변경하는 메소드
	public void setDay(int day) {
		this.day = day;
	}
}
