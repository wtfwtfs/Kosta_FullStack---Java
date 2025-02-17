
public class ForTest1 {

	public static void main(String[] args) {
		int i,sum = 0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.println(String.format("i:%d,sum:%d",i, sum));
		}

		System.out.println(String.format("i:%d", i));
	}

}
