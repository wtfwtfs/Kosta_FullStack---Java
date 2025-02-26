public class ExceptionTest6 {

	static void method() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		try {
			method();
		}catch(Exception e) {
			e.printStackTrace(); //예외가 발생했을 때의 정보를 모두 볼 수 있다.
		}
		System.out.println("프로그램 종료");
	}

}
