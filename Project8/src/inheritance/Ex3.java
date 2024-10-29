package inheritance;

public class Ex3 {

	public static void main(String[] args) {

		// 일반회원 생성
		Customer customer = new Customer();
		customer.customerName = "둘리";
		customer.calcPrice(10000);
		customer.showInfo();

		// vip회원 생성
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치"; // 
		vip.calcPrice(10000); //
		vip.showInfo();

	}

}

// 일반회원 클래스
class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 이름
	double bonusPoint; // 보너스 포인트
	double bounsRatio; // 적립률

	// 고정값은 생성자에서 초기화
	public Customer() {
		customerGrade = "SILVER";
		bounsRatio = 0.01;
	}

	// 보너스 포인트 적립하고, 지불 가격을 계산하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bounsRatio); // 보너스 포인트 계산
		System.out.println(customerName + "님이" + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}
}

// VIP회원 클래스
class VIPCustomer extends Customer {
	double saleRatio;

	// 고정값은 생성자에서 초기화
	public VIPCustomer() {
		customerGrade = "VIP";
		bounsRatio = 0.05;
		saleRatio = 0.1;
	}
}
