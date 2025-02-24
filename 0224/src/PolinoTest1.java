class Person extends Object {
	int age;
	String name;

	@Override
	public String toString() { // overriding
		return String.format("이름:%s, 나이:%d", name, age);
	}
}

public class PolinoTest1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 27;
		p.name = " hong";

		System.out.println(p.toString()); 
		
		Object p2 = new Person(); //upcasting
//		p2.age=30;
//		p2.name="pong"; ->object에 age, name이 없기떄문에 오류;
		System.out.println(p2.toString());  // 다형성 -위의 오버라이딩을 하지 않을 경우 new를 했어도 결과가 다름
	}
}
