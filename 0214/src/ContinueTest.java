//1부터 100까지 수의 합을 구하되 2의 배수이면서 7의 배수인 값은 합에서 제외
public class ContinueTest {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 7 == 0)
				continue;
			{
				sum += i;
			}
			
		}
		System.out.println(sum);

	}

}
