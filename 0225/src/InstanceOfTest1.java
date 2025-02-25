class Parent{}
class Child extends Parent{}

public class InstanceOfTest1 {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();
		Parent p2 = new Parent();
		
		System.out.println(c instanceof Child);      //true
		System.out.println(c instanceof Parent);     //true 자식은 부모타입의 객체이기도 하다
		
		System.out.println(p instanceof Child);		 //true
		System.out.println(p instanceof Parent);	 //true
		
		System.out.println(p2 instanceof Child);     //false
		System.out.println(p2 instanceof Parent);    //true
		
		
	}

}
