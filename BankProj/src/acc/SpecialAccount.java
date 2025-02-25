package acc;

public class SpecialAccount extends Account {
	String grade;
	public SpecialAccount(String id,String name,int money,String grade) {
		super(id,name,money);
		this.grade=grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return super.toString()+",등급:"+getGrade();
	}
	
	@Override
	public boolean deposit(int money) {
		int inmoney = money;
		switch(grade.toUpperCase()) {
		case "VIP": inmoney += (int)(inmoney*0.04); break;
		case "GOLD": inmoney += (int)(inmoney*0.03); break;
		case "SILVER": inmoney += (int)(inmoney*0.02); break;
		case "NORMAL": inmoney += (int)(inmoney*0.01); break;
		}
		return super.deposit(inmoney);
	}

//	public static void main(String[] args) {
//		Account sacc1 = new SpecialAccount("10001","홍길동",100000,"VIP");
//		Account sacc2 = new SpecialAccount("10002","김길동",200000,"Gold");
//		Account sacc3 = new SpecialAccount("10003","박길동",300000,"Silver");
//		Account sacc4 = new SpecialAccount("10004","하길동",400000,"Normal");
//		
//		System.out.println(sacc1);
//		System.out.println(sacc2);
//		System.out.println(sacc3);
//		System.out.println(sacc4);
//	}
}
//계좌번호:10001,이름:홍길동,잔액:100000,등급:VIP
//계좌번호:10002,이름:김길동,잔액:200000,등급:Gold
//계좌번호:10003,이름:박길동,잔액:300000,등급:Silver
//계좌번호:10004,이름:하길동,잔액:400000,등급:Normal


