package emp;

public class Permanent extends Employee {
	int salary;

	public Permanent() {
	}

	public Permanent(String num, String name, int salary) {
		super(num, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int getPay() {
		return getSalary();
	}

}
