
public class ForTest4 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for (i = 1; ; i++) {
			sum += i;

			if (sum > 100) {
				break;
			}
			
			
		}
		//System.out.println("i : "+i + ", sum : "+sum);
		System.out.println(String.format("sum:%d,i:%d",sum,i));
		
		
		//반복문 동작 순서 생각하기 i 값은 반복문 진행으로 인해 +1이 더 되므로 -1해주기		
	}
	

}
