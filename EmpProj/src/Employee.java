public class Employee {
	final static int YEAR =2015;
	static int empNum = 1;
	String num;
	String name;
	int pay;

	public Employee(String name, int pay) {
		num = ""+YEAR+empNum++;
		this.name=name;
		this.pay=pay;
		
	}
	
	Employee(String num, String name, int pay) {
		this.num = num;
		this.name = name;
		this.pay = pay;
	}

	String info() {  
		return String.format("사번:%s, 이름:%s, 급여:%d", num, name, pay);
	}

	void setPay(int pay) {
		this.pay+=pay;
	}
	void setBonus(int money) {
		pay+=money;
	}
	public static void main(String[] args) {
		Employee[] emps = new Employee[100];
		int cnt = 0;

		emps[cnt++] = new Employee("1001", "홍길동", 100000);
		emps[cnt++] = new Employee("1002", "김길동", 200000);
		emps[cnt++] = new Employee("1003", "박길동", 300000);
		//생성자 사용해야함;;

		for (int i = 0; i < cnt; i++) {
			System.out.println((emps[i].info()));
		}
	}

}
//출력결과
// 사번:1001, 이름:홍길동, 급여:100000
// 사번:1002, 이름:김길동, 급여:200000
// 사번:1003, 이름:박길동, 급여:300000
