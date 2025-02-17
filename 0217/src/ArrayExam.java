
public class ArrayExam {

	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E' };
		// char[] hex = {'9', '0', 'A', 'E'}; 1001000010101110
		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };

		String result = "";
		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i] - '0'];
			} else if (hex[i] >= 'A' && hex[i] <= 'F') {
				result += binary[hex[i] - 'A' + 10];
			} else if (hex[i] >= 'a' && hex[i] <= 'f') {
				result += binary[hex[i] - 'a' + 10];
			}
		}
		System.out.println(new String(hex));
		System.out.println("binary : " + result);
		
		
		// C = 1100 - 16진수->2진수
		// 0 = 0000
		// 1 = 0001
		// 2 = 0010
		// 3 = 0011
		// 4 = 0100
		// 5 = 0101
		// 6 = 0110
		// 7 = 0111
		// 8 = 1000
		// 9 = 1001
		// 10 = 1010 ->A(16진수)
		// 11 = 1011 ->B
		// 12 = 1100 ->C
		// 13 = 1101 ->D
		// 14 = 1110 ->E
		// 15 = 1111 ->F

	}

}
// 출력결과
//1100101011111110