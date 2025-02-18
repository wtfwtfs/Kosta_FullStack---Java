class Account{
	String id;
	String name;
	int balance;
	int deposit;
	int withdraw;
	
	void info() {
		System.out.println(String.format("계좌번호:%s, 이름:%s, 잔액:%d", id, name, balance));
		
	}
	
	void deposit(int money) {
		balance += money;
	}
	void withdraw(int money) {
		balance -= money;
	}
}

public class ClassTest4 {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.id = "10001";
		acc1.name="홍길동";
		acc1.balance=100000;
		
		acc1.info();
		acc1.deposit(10000);
		acc1.info();
		acc1.withdraw(5000);
		acc1.info();

	}

}
//출력결과
//계좌번호:10001, 이름:홍길동, 잔액:100000
//계좌번호:10001, 이름:홍길동, 잔액:110000
//계좌번호:10001, 이름:홍길동, 잔액:105000
