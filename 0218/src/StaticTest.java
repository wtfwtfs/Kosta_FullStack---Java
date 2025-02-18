class Test {
	int iv;
	static int sv;

	void method() {
		iv = 10;
		sv = 100;
		method2();
		// instance method에서는 static 변수, instance 변수 모두 사용할수 있다.
		// 또한 static method, instance method 모두 호출 가능하다
	}
	void method2() {}

	static void smethod() {
//		iv = 20;
		sv = 200;
//		method2();
		smethod2();
		// static method에서는 instance 변수, instance method 사용할 수 있다.
	}
	
	static void smethod2() {

	}
}

public class StaticTest {

	public static void main(String[] args) {
		//static 변수나 method는 클래스명을 붙여 호출한다.
		Test.sv = 5;
		Test.smethod();
		
		Test t = new Test();// instance 변수나 method는 객체 생성 후 참조변수를 통해 접근한다.
		t.iv=7;
		t.method();
	}

}
