class Person{
	int age;
	String name;
	//Person(){} //기본 생성자(Default constructor)가 기본으로 있어 객체 생성 가능, 생성자를 하나라도 추가하면 기본 생성자는 생기지 않는다. like 아래 Person
	Person(){ 
		System.out.println("Person constructor");
	}
	//new 연산자에 의해 자동 호출된다. person() 앞에 private가 붙으면 불가;
	
	Person(int tage, String tname){
		age = tage;
		name = tname;
	}
	
	Person(String tname){
		name = tname;
	}
}
public class ConstructorTest1 {

	public static void main(String[] args) {
		Person p = new Person(); // 기본 생성자가 없으면 이 코드가 안됨(객체 생성x)
		
		//new 연사자가 하는 3가지일
		//1. 클래스의 인스턴스 생성
		//2. 생성자 호출
		//3. 생성한 인스턴스를 클래스 타입으로 변환하여 주소 반환
		
		Person p2 = new Person(20, "홍길동");
		//아래의 Person으로 호출 -> 생성자 사용
		
		
	}

}
