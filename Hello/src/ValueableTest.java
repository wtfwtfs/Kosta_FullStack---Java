
public class ValueableTest {

	public static void main(String[] args) {
		String name = "유동기";//이름
		int age = 27;//나이
		double height = 177.3;//키
		
		System.out.println("이름:" + name + ", 나이:"+ age + ", 키:"+ height);
		System.out.println(String.format("이름:%s, 나이:%d, 키:%.1f", name,age,height));
	}

}
