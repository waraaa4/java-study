package method.quiz;

public class Quiz7 {

	// 7번. 세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요.
	public static void hap(int num) {
		int sum = 0; //합계		
		//1의 자리
		sum = sum + (num%10);
		System.out.println("1의자리" + sum);
		//10의자리
		num = num/10;
		System.out.println("10의자리" + num);
		System.out.println("10의자리" + num%10);
		sum = sum + (num%10);
		//100의자리
		num = num/10;
		sum = sum + num;
		System.out.println("100의자리" + num);
		System.out.println("100의자리" + sum);

		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		hap(932);

	}

}
