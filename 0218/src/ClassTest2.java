//클래스 내 모든 메소드는 클래스 멤버 변수를 공유한다
class TV {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
// 출력문도 함수로 만들어 사용
	void state() {
		System.out.println(String.format("power:%s, channel:%d", power ? "on" : "off", channel));
	}

}

// 여기까진 클래스 정의
public class ClassTest2 {

	public static void main(String[] args) {
//클래스 생성 하기
		TV tv = new TV();

		tv.power();

		tv.channel = 11;
		tv.channelUp();
		tv.state();
		
//		tv.channelDown();
//		tv.power();
//		tv.state();
		
//		Tv tv2 =new TV();
		TV tv2 = tv;
		tv2.state();
		tv2.channelDown();
				
		tv.state();
		tv2.state();
		
//배열과 똑같이 적용된다.
	}

}
