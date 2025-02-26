
public class ExceptionTest5 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
			System.out.println(0/0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		}catch(ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		}catch(NullPointerException e) {
//			System.out.println("NullPointException");
//		}catch(Exception e) {
//			System.out.println("나머지 예외처리");
//		}

	}

}
//최종 부모 예외처리인 Exception은 제일 마지막에 써준다. 다만 한번에 다 처리해버리고 싶다면 써도 된다.