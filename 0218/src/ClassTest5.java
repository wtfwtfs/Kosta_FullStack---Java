class Data{
	int x;
	
}
public class ClassTest5 {

	static void increament(int value) {
		value++;
	} //지역변수에 d.x 값을 복사 해서 준것, 함수가 종료되면 없어지기에 d.x는 1000으로 출력
	
	static void increament(Data d) {
		d.x++;
	}
	
	void increament1(Data d) {
		d.x++;
	} //static 이 없을 경우 main이 static 이기때문에 이 함수를 쓰기 위해선 ClassTest5를 생성하고 난후 사용 할 수 있다.
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x=1000;
		
		increament(d.x);
		System.out.println(d.x);
		//지역변수를 쓴것이 아니라 data d를 통해 원본을 직접 건드린것.
		increament(d);
		System.out.println(d.x);
	}

}
//static 과 instance;;