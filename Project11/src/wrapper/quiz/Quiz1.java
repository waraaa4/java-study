package wrapper.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		// 1번.
		// 문자열 "10"을 byte, short, int, long 으로 변환하세요
		// 문자열 "10.0" 을 float, double 로 변환하세요
		
		// 또는 valueOf함수 사용하기
		Integer iNum1 = Integer.valueOf("10");
		
		byte bNum = Byte.parseByte("10");
		short sNum = Short.parseShort("10");
		int iNum = Integer.parseInt("10");
		long lNum = Long.parseLong("10");
		
		float fNum = Float.parseFloat("10.0");
		double dNum = Double.parseDouble("10.0");
		
	}

}
