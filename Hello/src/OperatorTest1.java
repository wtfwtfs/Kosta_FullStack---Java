
public class OperatorTest1 {

	public static void main(String[] args) {
		int n = 10, t=100;
		int m = ++n;
		System.out.println(n);
		System.out.println(m);
		n=10;
		int o = n++;
		System.out.println(n);
		System.out.println(o);

		System.out.println(t++);
		t=100;
		System.out.println(++t);

		//m = ++n;
		//1) n = n+1
		//2) m = n

		//m = n++;
		//1) n = n + 1
		//2) m = t
		
		byte a = 10;
		byte b = (byte)(a+10);
		System.out.println(a);
		System.out.println(b);
		
		int k = 1000000;
		int v = 1000000;
		long h = (long)k*v;
		System.out.println(h);
		
		//long z = 1000000*1000000; //오버플로우
		long z = (long)1000000*1000000;
		System.out.println(z);
		
		long c = 1000000/1000000*1000000;
		System.out.println(c);
		
		char c1 = 'a';
		int c2 = c1+1;
		System.out.println(c2);
		
		char c3 = ++c1;
		System.out.println(c3);
		
		// 1 != '1'
		int i = '9' -'0';
		System.out.println(i); //아스키 코드
		int i1 = 9-0;
		System.out.println(i1); // 숫자
		
		char ch4 = 't';
		char ch5 = (char)(ch4 - ('a' -'A'));
		System.out.println(ch5);
	
	}

}
