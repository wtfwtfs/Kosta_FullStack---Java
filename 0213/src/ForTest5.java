
public class ForTest5 {

	public static void main(String[] args) {
//		int i=0;
//		int c=0;
//		for(i=1;i<10;i++) {
//			c=2*i;
//			//System.out.println(2+"*"+i+" = "+c);
//			System.out.println(String.format("2x%d = %2d",i,c));
//구구단
//		int i = 0;
//		int t = 0;
//		for (i = 2; i < 10; i++) {
//			for (t = 1; t < 10; t++) {
//				System.out.println(i + "*" + t + " = " + i * t);
//				System.out.println("%d*%d = ", i , t, i*t);
//			}
//			System.out.println();
// STring.format 사용 손에 익히기, 코딩하기 전에 생각좀 더 해봐라 짜슥아

//구구단
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan * i));

			}
			System.out.println();
		}

	}

}
