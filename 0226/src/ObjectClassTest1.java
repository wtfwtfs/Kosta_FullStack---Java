class Person {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		Person p = (Person) obj;
		return age == p.age && name.equals(p.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
}

public class ObjectClassTest1 {

	public static void main(String[] args) {
		Person p1 = new Person(20, "홍기롱");
		Person p2 = new Person(20, "홍길동");

		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(new Object().toString());
	}
	
}
