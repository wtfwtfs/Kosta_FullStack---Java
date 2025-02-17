import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input;

		do {
			System.out.print("종료하시려면 x를 입력하세요 : ");
			input = sc.nextLine();
		}while(input.charAt(0)!='x' && input.charAt(0)!='X');
		
		System.out.println(input);
		
		sc.close();

	}

}
