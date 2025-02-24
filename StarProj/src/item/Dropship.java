package item;

public class Dropship extends Unit implements IRepairable {
	
	public Dropship() {
		super(100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("날아서 이동하고 있다.");
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
	
	public void load() {
		System.out.println("짐을 싣다");
	}
	
	public void unload() {
		System.out.println("짐을 내리다.");
	}
	
	@Override
	public void fix() {
		setHitPoint(MAX_HP);
	}

}
