package emp;

public class Sales extends Permanent {
	int incentive;

	public Sales() {
	}

	public Sales(String num, String name, int salary, int incentive) {
		super(num, name, salary);
		this.incentive = incentive;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public int getPay() {
		return super.getPay() + getIncentive();
	}

}
