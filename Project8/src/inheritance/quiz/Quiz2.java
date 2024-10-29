package inheritance.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 2번.
		// 베이직티비(BasicTV)을 정의하는 클래스를 만드세요.
		// 속성: 전원상태, 채널, 볼륨
		
		// 베이직티비 클래스를 상속받는 스마트티비(SmartTV) 클래스를 만드세요
		// 속성: 아이피
		
		// 베이직티비 인스턴스를 생성하세요. (전원 상태:on, 채널:7, 볼륨:20)
		// 스마트티비 인스턴스를 생성하세요. (전원 상태:on, 채널:11, 볼륨:30,
		// 아이피:192.168.0.111)
		// 모든 인스턴스의 정보를 출력하세요
		
		BasicTV basicTV = new BasicTV();
		basicTV.onOff = true;
		basicTV.channel = 7;
		basicTV.volume = 20;
		basicTV.showInfo();
		
		SmartTV smartTV = new SmartTV();
		smartTV.onOff = true;
		smartTV.channel = 7;
		smartTV.volume = 30;
		smartTV.ip = "192.168.0.111";
		smartTV.showInfo();

	}

}

// 베이직티비
class BasicTV {
	boolean onOff;
	int channel;
	int volume;
	
	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + onOff);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	}
}

// 스마트티비
class SmartTV extends BasicTV {
	String ip;
	
	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + onOff);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("IP 주소 : " + ip);
	}
}





