package item;

public class SCV extends Unit implements IRepairable {

	public SCV() {
		super(80);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("터벅터벅 걸어서 움직인다.");
	}
	
	@Override
	public void fix() {
		setHitPoint(MAX_HP);
	}
	
	public void repair(IRepairable unit) {
		unit.fix();
	}

}
