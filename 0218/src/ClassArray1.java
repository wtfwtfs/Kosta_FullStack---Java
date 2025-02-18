class Time{
	int hour;
	int minute;
	int second;
}


public class ClassArray1 {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.hour =9;
		t1.minute=50;
		t1.second=30;
//클래스 배열
		Time[] times = new Time[3];
		times[0] = new Time(); //클래스 배열은 각 배열의 요소에 객체를 생성한 후 사용해야 한다.
		times[0].hour =9;
		times[0].minute = 52;
		times[0].second =20;
	}

}
