class Calculator1 {
	static int add(int x, int y) {
		return x + y;
	}

	static int sub(int x, int y) {
		return x - y;
	}

	static int mul(int x, int y) {
		return x * y;
	}

	static int div(int x, int y) {
		return y == 0 ? 0 : x / y;
	}
}

class Calculator2 {
	int x, y;

	int add() {
		return x + y;
	}

	int sub() {
		return x - y;
	}

	int mul() {
		return x * y;
	}

	int div() {
		return y == 0 ? 0 : x / y;
	}
}

public class ClassTest3 {

	public static void main(String[] args) {
//		Calculator1 calc1 = new Calculator1();
		System.out.println(Calculator1.add(20, 10));
		System.out.println(Calculator1.sub(20, 10));
		System.out.println(Calculator1.mul(20, 10));
		System.out.println(Calculator1.div(20, 10));
		System.out.println("==============================");
	///////////////////////////////////////////////////
		
		Calculator2 calc2 = new Calculator2();
		calc2.x = 20;
		calc2.y = 10;
		System.out.println(calc2.add());
		System.out.println(calc2.sub());
		System.out.println(calc2.mul());
		System.out.println(calc2.div());
		
//결과는 같다
		
	}

}
