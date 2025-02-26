package emp;

public abstract class Employee {
	String num;
	String name;
	int hour;
	
	public Employee() {
	}

	public Employee(String num, String name) {
		this.num = num;
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract public int getPay();
	//클래스 중에 하나라도 abstract 클래스가 있을경우 전체 클래스도 abstract class, 객체생성 불가

	public String toString() {
		return String.format("사번%s,이름:%s,급여:%d", getNum(), getName(), getPay());
	}
	
}