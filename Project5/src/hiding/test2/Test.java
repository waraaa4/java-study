package hiding.test2;

import hiding.test1.A;

public class Test {

	public static void main(String[] args) {
		
		A a = new A(); // 외부 패키지에서 사용가능 (import 해야함)
		// B b = new B(); // 외부 패키지에서 사용불가
	}

}
