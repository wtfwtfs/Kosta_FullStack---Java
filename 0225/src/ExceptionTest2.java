
public class ExceptionTest2 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 0, 5, 2 };
		int[] arr2 = { 8, 4, 4, 10 };
		int sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			try {
//				System.out.println(arr1[i] / arr2[i]);

				sum += arr2[i]/arr1[i];
			} catch (ArithmeticException e) {
//				System.out.println("예외처리1");
			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("예외처리2");
			}
		}
		System.out.println(sum);
		System.out.println("종료");
	}

}
