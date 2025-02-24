//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
//다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
//가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
//어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

class Unit{
	int x, y;
	public void stop() {}
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable{}

class Fighter extends Unit implements Fightable{
	@Override
	public void move(int x, int y) {}
	
	@Override
	public void attack(Unit u) {}
}
public class InterfaceTest1 {

	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		f1.stop();
		f1.move(0, 0);
		f1.attack(null);

		Unit f2 = new Fighter();
		Movable f3 = new Fighter();
		Fightable f4 = new Fighter();
		Attackable f5 = new Fighter();
		Object f6 = new Fighter();
		
		f2.stop();
//		f2.move(0,0);
//		f2.attack(null); f2는 Unit 타입으로 stop만 사용가능
		
//		f3.stop();
		f3.move(0, 0);
//		f3.attack(null);  f3는 Movable 타입으로 move만 사용가능
		
//		f4.stop();  f4는 Fightabvle 타입으로 move와 attack 사용가능
		f4.move(0, 0);
		f4.attack(null); 
		
//		f5.stop();  
//		f5.move();  f5는  Attackable 타입으로 attack만 사용가능
		f5.attack(null);
		
//		f6.stop();
//		f6.move();
//		f6.attack(null); object는 모든 클래스의 부모 클래스이지만 stop, move, attack 모든 함수가 없기에 셋다 사용 불가
		

		
	}

}
//결과
// 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,