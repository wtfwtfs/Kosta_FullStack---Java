
public class ArrayTest2 {
	public static void arrayPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1;
//		arr2[0] = 10;
//		for(int i=0; i<arr1.length;i++) {
//			System.out.print(arr1[i]+",");
		
		int[] arr3 = new int[arr1.length];for(
		int i = 0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		arr3[0] =10;
		arrayPrint(arr1);
		arrayPrint(arr3);
		
		int[] arr4 = new int[arr1.length];
		System.arraycopy(arr1,  0, arr4, 0, arr1.length);
		arr4[1] =20;
		arrayPrint(arr1);
		arrayPrint(arr4);
		
		int[] arr5 = arr1.clone();
		arr5[0]=100;
		arrayPrint(arr1);
		arrayPrint(arr5);
	}
	

}
