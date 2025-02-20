class Base{
	int x;
	void method1() {
		System.out.println("Base method1");
	}
	
	void method2() {
		System.out.println("Base method2");
	}
	
}

class Derived extends Base{
	int y;
	void method1() {
		//method1 //스택 오버플로우 계속 재귀호출
		method2(); //부모꺼지만 내꺼처럼 안붙여도 되지만 같은 이름일 경우에는 부모꺼를 지정해서 사용
		super.method1();
		System.out.println("Derived method1");
	}
	
	void method3() {
		System.out.println("Derived method3");
		System.out.println(x);
		System.out.println(y);
	}
}
public class OverridingTest {

	public static void main(String[] args) {
		
		Derived d1 =new Derived();
		d1.method1();
		d1.method2();
		d1.method3();
	}

}
