class Variables{
	int iv;
	static int sv;
	void method() {
		int lv=0;
		System.out.println(lv);
	}
}
public class VariableTest1 {

	public static void main(String[] args) {
		Variables.sv =10;  //class 변수는 클래스 명을 통해 접근 - 객체들이 공유해야 하는것 
		
		Variables v1 = new Variables(); 
		System.out.println(v1.sv); // class 변수는 참조 변수로도 접근 가능하다
		
		Variables v2 = new Variables();
		System.out.println(v2.sv);
//		v.iv = 20; // instance 변수는 참조변수 v를 통해 접근
//		
//		v.method();

	}

}
// 클래스 변수와 인스턴스 변수
//이해하기 쉬운 예제 : 카드 class변수- 카드의 폭,높이 -> 모든 카드의 크기가 같아야함, 크기를 모두 공유, 명시적으로 초기화;
//			  	  	 instance변수 -> 무늬, 숫자 -> 무늬 4가지, 숫자 1~10,j,q,k 가 필요 하기 때문에