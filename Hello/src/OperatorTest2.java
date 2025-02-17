
public class OperatorTest2 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		//1) 3141.592
		//2) 3141
		//3) 3.141
		
//		float a = pi*1000;
//		System.out.println(a);
//		int b = (int)a;
//		System.out.println(b);
//		float c = (float)b/1000;
//		System.out.println(c);
		
//		pi = (int)(pi*1000f)/1000f;
//		System.out.println(pi);
		
		pi = Math.round(pi*1000f)/1000f;
		System.out.println(pi);
		
	}

}
