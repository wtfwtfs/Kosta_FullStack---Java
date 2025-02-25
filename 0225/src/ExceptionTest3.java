
public class ExceptionTest3 {
	static void method() throws Exception{
//		try {
			throw new Exception("내가 생성한 예외");
//			}catch(Exception e) {
//				System.out.println("내가 스스로 처리함");
//			}
	}
	public static void main(String[] args)  {
		try{
			method();
		}catch(Exception e) {
			System.out.println("Main에서 처리함");
		}
	}
}
