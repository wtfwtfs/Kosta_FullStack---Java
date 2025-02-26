public class ExceptionTest4 {

	static void method() throws Exception{
		
		throw new Exception("Method에서 method 예외 발생시킴");
//		throw new RuntimeException("Method에서 RuntimeException 예외 발생시킴");
	}
	
	static void method2() throws Exception{
		throw new Exception("Method에서 method 예외 발생시킴");
	}
	
	static void method3() throws Exception {
		subMethod();
	}
	
	static void subMethod() throws Exception {
		throw new Exception("subMethod에서 method 예외 발생 시킴");
	}
	
	public static void main(String[] args) throws Exception {
// throws로 예외를 위임 할 수 있지만 무조건 하긴 해야한다. 
//이 경우 method 예외를 main으로 위임하지만 main도 다시 넘기기에 프로그램이 사망에 이른다.		
		method();
// 		throw new Exception("Exception 예외 발생시킴"); //컴파일 에러
		throw new RuntimeException("RuntimeException 예외 발생시킴"); //에러x


		
	}

}
//RuntimeException(NullPointException)은 컴파일에러가 안나지만 예외처리를 해야한다.
//throws로 예외들을 넘겨 한번에 처리 할 수 있다.