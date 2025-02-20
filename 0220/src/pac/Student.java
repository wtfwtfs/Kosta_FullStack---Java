package pac;

public class Student {
	String num;
	String major;
	

	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public Student() {}
	
	public Student(String num, String major) {
		this.num =num;
		this.major=major;
	}
}
