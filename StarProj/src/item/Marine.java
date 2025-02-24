package item;

public class Marine extends Unit {
	
	public Marine() {
		super(40);
	}

	@Override
	public void move() {
		System.out.println("걸어서 이동하고 있다.");
	}
	
	@Override
	public String toString() {
		return "Marine";
	}
	
	public void stimPack() {
		System.out.println("몸을 불살라 속도가 빨라진다.");
	}
	
}
