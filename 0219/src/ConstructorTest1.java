class Person {
	int age;
	String name;

	Person() {
//		age = 1;
//		name = "none";
		this(1,"none"); //-> 쓰기 위해선 맨 앞에 와야 한다.
//		System.out.println();
	}

	Person(int age) {
//		age = tage;
//		name = "none";
		this(age,"none");
	}
 
	Person(String name) {
//		age = 1;
//		name = tname;
		this(1,name);
	}

	Person(int tage, String tname) {//(int age, String name) 
		age = tage;
		name = tname; 
		//this.age=age;
		//this.name =name;
	}

	void info() {
		System.out.println(String.format("이름:%s, 나이:%d", name, age)); //this가 자동 생성되어 p1,p2,p3,p4 각 개체의 나이 이름을 알아서 대입 할 수 있는 것이다.
	}
}

public class ConstructorTest1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(10);
		Person p3 = new Person("hong");
		Person p4 = new Person(20, "park");

		p1.info();
		p2.info();
		p3.info();
		p4.info();
	}
//인스턴스 변수는 자동으로 초기화가 되지만 지역변수는 초기화가 되지 않기에 반드시 초기화를 하고 사용!, 초기화 하지 않을경우 컴파일 에러
//인스턴스 변수는 클래스에서 초기화 가능하지만 사실은 0으로 초기화가 되었다가 지정한 것으로 다시 초기화 된다(확인은 불가). 객체가 생성될때 초기화 되는것!(일종의 정보?-> 명시적 초기화)
}
