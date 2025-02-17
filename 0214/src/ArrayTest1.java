
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] arr = new int [5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
//		arr[5]=60;
	
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] arr2 = new int[] {10,20,30,40,50};
		int[] arr3 = {10,20,30,40,50};
// 메모리 영역은 둘이 같다. 선언과 동시에 초기화
		
		int[] arr4;
		arr4 = new int[] {10,20,30,40,50};
		
		int[] arr5;

		//arr5 = {10,20,30,40,50}; --> 불가능, new가 있어야 초기화 가능
		int[] arr6 = arr2;
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]+",");
		}
		System.out.println();
		
		for(int i=0;i<arr6.length;i++) {
			System.out.print(arr6[i]+",");
		}
		System.out.println( );
		
		arr2[0] =100;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]+",");
		}
		System.out.println();
		
		for(int i=0; i<arr6.length; i++) {
			System.out.println(arr6[i]+",");
		}
		
	}

}
