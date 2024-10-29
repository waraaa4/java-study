package polymorphism.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		// 방법1
//		Customer customer1 = new Customer("둘리");
//		Customer customer2 = new VIPCustomer("또치");
//		Customer customer3 = new GOLDCustomer("고길동");
//		
//		list.add(customer1);
//		list.add(customer2);
//		list.add(customer3);
		
		// 방법2
		list.add(new Customer("둘리"));
		list.add(new VIPCustomer("또치"));
		list.add(new GOLDCustomer("고길동"));

		for(Customer customer : list) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
		
	}

}

//일반회원 클래스
class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 이름
	double bonusPoint; // 보너스 포인트
	double bounsRatio; // 적립률

	// 고정값은 생성자에서 초기화
	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bounsRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
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

//VIP회원 클래스
class VIPCustomer extends Customer {
	double saleRatio; // 할인률

	// 고정값은 생성자에서 초기화
	public VIPCustomer(String customerName) {
		super(customerName); // 생략 가능
		customerGrade = "VIP";
		bounsRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}

	// 재정의 규칙: 선언부 그대로, 구현부만 변경
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bounsRatio);
		int salePrice = price - (int)(price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}
}

class GOLDCustomer extends Customer {
	double saleRatio; // 할인률
	
	public GOLDCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bounsRatio = 0.02; // 2퍼센트 적립
		saleRatio = 0.1; // 10퍼센트 할인
	}
	
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bounsRatio);
		int salePrice = price - (int)(price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}
	
}






