package item;

public abstract class Unit {
	int x;
	int y;
	int hitPoint;
	
	final int MAX_HP;
	public Unit(int hitPoint) {
		MAX_HP=hitPoint;
	} //모든 객체가 동일한 상수값을 가지게 하려면 static final;
	
	public int getX() {
		return x;
	}

	public int getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}

	public int getMAX_HP() {
		return MAX_HP;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void stop() {
		System.out.println(String.format("%가 (%d,%d)에 멈추다", toString(), x,y));
	}

	abstract public void move();
}
