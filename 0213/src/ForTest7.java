
public class ForTest7 {

	public static void main(String[] args) {
		int i, j = 0;
		for (i = 1; i < 6; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

///////////////////////////////////////////////

		int cnt = 5;
		for (i = 0; i < cnt; i++) {
			for (j = 0; j < cnt - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

///////////////////////////////////////////////		

		for (i = 5; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
////////////////////////////////////////////////
		
		for (i = 0; i < cnt; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(j=0; j<cnt-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
// 증감 바꿔서라던지 다르게도 해봅시다. 머리좀 굴려바		
		
/////////////////////////////////////////////////
		
		for(i=0; i<cnt; i++) {
			for(j=0; j<cnt-i; j++) {
				System.out.print(" ");
			}
			for(j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
////////////////////////////////////////////////////
		                 
		for(i=cnt-1; i>=0;i--) {
			for(j=0; j<cnt-i; j++) {
				System.out.print(" ");
			}
			for(j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
// 처음에 space가 한번 들어가기 때문에 -1을 해주어야한다.	
///////////////////////////////////////////////////////
		
		for(i=0; i<cnt; i++) {
			for(j=0; j<cnt-i-1; j++) {
				System.out.print(" ");
			}
			for(j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}	
