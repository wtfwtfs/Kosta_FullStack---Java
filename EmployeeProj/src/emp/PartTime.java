package emp;

public class PartTime extends Employee implements IBusinessTrip {
	int time;
	int payPerTime;

	public PartTime() {
	}

	public PartTime(String num, String name, int time, int payPerTime) {
		super(num, name);
		this.time = time;
		this.payPerTime = payPerTime;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}

	@Override
	public int getPay() {
		return getTime() * getPayPerTime();
	}
	
	@Override
	public void goBusinessTrip(int day) {
		time += day*24;
	}

}
