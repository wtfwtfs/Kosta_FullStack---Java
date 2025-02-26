package acc;

import exc.BankException;
import exc.ERR_CODE;

public class Account {
	String id;
	String name;
	int balance;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account() {}
	public Account(String id, String name, int money) {
		this.id=id;
		this.name=name;
		balance=money;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", id,name,balance);
	}
	
	public boolean deposit(int money) throws BankException {
		if(money<=0) throw new BankException("입금오류",ERR_CODE.DEPOSIT_ERR);
		balance += money;
		return true;
	}
	
	public boolean withdraw(int money) throws BankException {
		if(balance<money) {
			throw new BankException("출금오류",ERR_CODE.WITHDRAW_ERR);
		}
		balance -= money;
		return true;
	}
}
