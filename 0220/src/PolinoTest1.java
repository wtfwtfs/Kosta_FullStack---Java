class Parent{
	int x;
	void method1() {}	
}
class Child extends Parent{
	int y;
	void method2() {}
}

public class PolinoTest1 {
	public static void main(String[] args) {
		Parent[] pers = new Parent[5];
		int n=0;
		pers[n++] = new Parent();
		pers[n++] = new Child();
		pers[n++] = new Child();
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent p2 = new Child(); //upcasting
	//	Parent p3 = c1; //upcasting -자식 객체를 부모 래퍼런스에 담을 수도 있다.
		
		p1.x=10;
		p1.method1();
		
		c1.y=20;
		c1.y=30;
		c1.method1();
		c1.method2();
		
		//upcasting한 객체는 자식은 new 했어도 타입이 부모이기 때문에 부모의 기능만 사용할 수 있다.
		p2.x=100;
		p2.method1(); //타입이 parent이기에 자식으로는 접근이 안되고 parent에 있는것만 접근 할 수 있다.
		
		//자식의 기능을 사용하고 싶으면 자식객체로 다시 downcasting 한다.
		Child c2 = (Child)p2; //downcasting
		c2.y=200;
		c2.method2();
		
		
	}
}
