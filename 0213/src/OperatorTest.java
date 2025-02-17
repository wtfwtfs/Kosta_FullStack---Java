
public class OperatorTest {

	public static void main(String[] args) {
		int x = 100, y= 20;
		int max = x>=y? x: y;
		int min = x<=y? x: y;
		System.out.println(max);
		System.out.println(min);

		int a = 10;
		//a += 5; // a= a+5와 같다
		a*=(5+3); // a=a*(5+3)
		System.out.println(a);
		//복합 대입 연산자는 우선순위 주의, 사용에도 주의
	}

}
