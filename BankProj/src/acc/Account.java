package acc;
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
		return String.format("°èÁÂ¹øÈ£:%s,ÀÌ¸§:%s,ÀÜ¾×:%d", id,name,balance);
	}
	
	public boolean deposit(int money) {
		if(money<=0) return false;
		balance += money;
		return true;
	}
	
	public boolean withdraw(int money) {
		if(balance<money) {
			return false;
		}
		balance -= money;
		return true;
	}
}
