public class Account {
	String id;
	String name;
	int balance;
	
	Account(String aid, String aname, int abalance){
		id = aid;
		name = aname;
		balance = abalance;
		//위의 클래스 변수와 변수명이 같아서 다르게 변수명을 선정함
	}
	//생성자로 적용
	String info() {
		return String.format("계좌번호:%s, 이름:%s 님, 잔액:%d원", id, name, balance);
	}
	
	boolean deposit(int money) {
		if(money<=0) {
			return false;
		}
		balance += money;
		return true;
	}
	
	boolean withdraw(int money) {
		if(balance<money) {
			return false;
		}
		balance -= money;
		return true;
	}
}
