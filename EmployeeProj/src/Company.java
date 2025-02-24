import emp.Employee;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class Company {
	Employee[] emps = new Employee[100];
	int cnt;
	
	void addEmployee(Employee emp) {
		emps[cnt++] = emp;
	}
	
	void allEmployeeInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(emps[i]);
		}
	}
	
	int getAllTotalPay() {
		int total=0;
		for(int i=0; i<cnt; i++) {
			total += emps[i].getPay();
		}
		return total;
	}

	public static void main(String[] args) {
		Company com = new Company();
		com.addEmployee(new Permanent("101","홍길동",1800000));
		com.addEmployee(new Sales("102","김길동",1000000,500000));
		com.addEmployee(new PartTime("103","하길동",160,10000));
		com.allEmployeeInfo();
		System.out.println("전직원 총 급여액:"+com.getAllTotalPay());
	}
}
//사번:101,이름:홍길동,급여:1800000
//사번:102,이름:김길동,급여:1500000
//사번:103,이름:하길동,급여:1600000
//전직원 총 급여액:4900000
