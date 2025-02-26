package emp;

public abstract class Employee {
	String num;
	String name;
	
	public Employee() {}
	public Employee(String num, String name) {
		this.num=num;
		this.name=name;
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
	
	public String toString() {
		return String.format("사번%s,이름:%s,급여:%d", getNum(),getName(),getPay());
	}
}