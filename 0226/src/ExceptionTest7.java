
public class ExceptionTest7 {
static void method() throws Exception {
	try {
		throw new Exception("예외 발생");
	}catch(Exception e) {
		System.out.println("1차 예외 처리");
		throw e;
		//		throw new Exception("2차 예외 필요"); 따로 생성시켜 예외 발생한것임
	}
}
	
	public static void main(String[] args) {
		try {
			method();
			
		}catch(Exception e) {
			System.out.println("2차 예외 처리");
		}

	}

}
