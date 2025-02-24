package item;

public class Tank extends Unit implements IRepairable {

	public Tank() {
		super(150);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("바퀴로 굴러서 이동하고 있다.");
	}

	@Override
	public String toString() {
		return "Tank";
	}

	public void changeMode() {
		System.out.println("정박해 대량의 포를 발포한다.");
	}

	@Override
	public void fix() {
		setHitPoint(MAX_HP);
	}
}
