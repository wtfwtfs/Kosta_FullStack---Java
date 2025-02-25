// 싱글톤 singleton
class MyArray {
	private int[] arr = new int[100];
	private int cnt;
	private static MyArray myArray;  //line 4 in t.src

	private MyArray() {
	}

	public static MyArray getMyArrayRef() {
		if (myArray == null) {
			myArray = new MyArray();
		}
		return myArray;
	}
	
	public void setData(int data, int idx) {
		arr[idx] = data;
	}
	
	public int getData(int idx) {
		return arr[idx];
	}
	
}

public class SingleTonEx {

	public static void main(String[] args) {
		MyArray ma1 = MyArray.getMyArrayRef();
		MyArray ma2 = MyArray.getMyArrayRef();  //하나의 객체를 같이 쓰는것과 같음

		ma1.setData(100, 10);
		System.out.println(ma2.getData(10)); //ma1에 data 100을 10번째 idx에 넣었는데 ma2를 출력해도 같은 값이 나온다 //
		//싱글톤을 이용했기에 객체를 하나만 만들어서 계속 쓴다.
	}

}
