
public class WhileTest {

	public static void main(String[] args) {
		int cnt=5;
		int i=0;
		while(i<cnt) {
			int j=0;
			while(j<cnt-i-1) {
				System.out.print(" ");
				j++;
			}
			j=0;
			while(j<2*i+1) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println();
		
////////////////////////////////////////////////////////////
// 뒤집기
		i=cnt-1;
		while(i>=0) {
			int j=0;
			while(j<cnt-i-1){
				System.out.print(" ");
				j++;			
			}
			j=0;
			while(j<2*i+1) {
				System.out.print
				("*");
				j++;
			}
			i--;
			System.out.println();
		}
	}

}
