public class Company {
    Employee[] emps = new Employee[100];
    int cnt = 0;

    void enter(Employee emp) {
        emps[cnt++] = emp;
    }

    void allEmpInfo() {
        for (int i = 0; i < cnt; i++) {
            System.out.println(emps[i].info());
        }
    }

    Employee searchEmp(String num) {
        for (int i = 0; i < cnt; i++) {
            if (emps[i].num.equals(num)) {
                return emps[i];
            }
        }
        return null; 
    }

    void setPay(String num, int pay) {
        Employee emp = searchEmp(num); 
        if (emp == null) {
            System.out.println("사번이 틀립니다.");
            return;
        }
        emp.setPay(pay); // 급여를 바꿈
    }

    void bonus(String num, int bonus) {
        Employee emp = searchEmp(num); 
        if (emp == null) {
            System.out.println("사번이 틀립니다.");
            return;
        }
        emp.setBonus(bonus);
    }

    public static void main(String[] args) {
        Company com = new Company();

//        com.enter(new Employee("1001", "홍길동", 100000));
//        com.enter(new Employee("1002", "김길동", 200000));
//        com.enter(new Employee("1003", "박길동", 300000));
        com.enter(new Employee("홍길동",100000));
        com.enter(new Employee("김길동",200000));
        com.enter(new Employee("박길동",300000));
        

        com.setPay("1002", 1000000); // 급여를 변경
        com.bonus("1002", 500000); // 보너스를 설정

        com.allEmpInfo(); // 모든 직원의 정보 출력
    }
}
