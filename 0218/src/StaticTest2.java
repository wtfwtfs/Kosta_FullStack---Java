
public class StaticTest2 {
	int x;
	static int y;
	
	
	public static void main(String[] args) {
		int t=100;
		for(int i=0;i<10;i++) {
			//i : 지역변수
		}
		//System.out.println(i); 불가
		method(t);
		
		System.out.println("===================");
		
		StaticTest2 st2 = new StaticTest2();
		st2.x=100;
		
		int x = 100;
		y=200;
		
		System.out.println(x);
	}
	
	void method2() {
		System.out.println(x);
		System.out.println(y);
	}
	
	static void method(int t) {
	//	n=10;  //사용 불가 선언을 main에서 선언 했기에(지역변수); 
		int n;
		n =10; 
		System.out.println(n);
		//지역변수는 반드시 초기화 하고 사용해야한다.
	}

}
