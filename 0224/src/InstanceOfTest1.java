class Parent {
	@Override
	public String toString() {
		return "Parent";
	}
}

class Child extends Parent {
	@Override
	public String toString() {
		return "Child";
	}
}

public class InstanceOfTest1 {

	public static void main(String[] args) {

		Parent[] arr = new Parent[10];
		int cnt = 0;

		arr[cnt++] = new Parent();
		arr[cnt++] = new Child();
		arr[cnt++] = new Parent();
		arr[cnt++] = new Child();

		for (int i = 0; i < cnt; i++) {
			if (arr[i] instanceof Child == false) { // 거르기 가능
				// if(!(arr[i] instanceof Child)) {
				System.out.println(arr[i]);
			}
		}

		System.out.println();

		for (int i = 0; i < cnt; i++) {
			if (arr[i] instanceof Parent) {
				System.out.println(arr[i]);
			} // 부모를 불러도 자식과 같이 나온다.
		}
	}

}
