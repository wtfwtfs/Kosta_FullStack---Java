import emp.Employee;
import emp.IBusinessTrip;
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
	//영업직과 계약직만 출장 등록이 가능하다.
	//영업직은 하루당 20만원 급여에 포함한다.
	//계약직은 시간당 24시간 추가 근무로 포함시킨다 만원을 급여에 포함한다.
	
	public void regBusinesTrip(IBusinessTrip emp, int day){
		emp.goBusinessTrip(day);
	}		

	public static void main(String[] args) {
		
		Company com = new Company();
		Permanent per1 = new Permanent("101","홍길동",1800000);
		Sales sal1 = new Sales("102","김길동",1000000,500000);
		PartTime pt1 = new PartTime("103", "하길동", 160, 10000);
		
		com.addEmployee(per1);
		com.addEmployee(sal1);
		com.addEmployee(pt1);
		
//		com.regBusinesTrip(per1, 2); //error
		com.regBusinesTrip(sal1, 2);
		com.regBusinesTrip(pt1, 2);
		
		com.allEmployeeInfo();
		
		System.out.println("전직원 총 급여액:"+com.getAllTotalPay());
	}
}
//사번:101,이름:홍길동,급여:1800000
//사번:102,이름:김길동,급여:1500000
//사번:103,이름:하길동,급여:1600000
//전직원 총 급여액:4900000
