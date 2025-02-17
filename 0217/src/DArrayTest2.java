
public class DArrayTest2 {

	public static void main(String[] args) {
		int[][] darr1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int[][] darr2 = new int[darr1.length + 1][darr1[0].length + 1];

		for (int i = 0; i < darr1.length; i++) {
			for (int j = 0; j < darr1[i].length; j++) {
				darr2[i][j] = darr1[i][j];
				darr2[i][4] += darr1[i][j];
				darr2[3][j] += darr1[i][j];
				darr2[3][4] += darr1[i][j];
			}

		}
		for (int i = 0; i < darr2.length; i++) {
			for (int j = 0; j < darr2[i].length; j++) {
				System.out.print(String.format("%2d ", darr2[i][j]));
			}
			System.out.println();
		}

	}

}
