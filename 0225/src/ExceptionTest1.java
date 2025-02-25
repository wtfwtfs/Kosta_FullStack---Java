public class ExceptionTest1 {
	
	static void method2() {
//		try {
//			String str = null;
//			System.out.println(str.toString());
//		}catch(NullPointerException e) {
//			System.out.println("예외처리함");
//		}
		try {
		String str = null;
		System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println("예외처리1");
			throw e;
		}
	}
	static void method1() {
		method2();
	}
	public static void main(String[] args) {
		try {
			method1();
		}catch(NullPointerException e) {
			System.out.println("예외처리2");
		}
		System.out.println("종료");
		
		
	}

}
