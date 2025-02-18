import java.util.Scanner;

public class Bank {
	Account[] accs = new Account[100];
	int cnt;
	Scanner sc = new Scanner(System.in);

	int selectMenu() {
		System.out.println("[코스타 은행]");
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌조회");
		System.out.println("5.전체계좌조회");
		System.out.println("6.계좌이체");
		System.out.println("0.종료");
		System.out.print(" 선택>> ");
		int sel =  Integer.parseInt(sc.nextLine());
		System.out.println();
		return sel;
		

	}

	void makeAccount() {
		System.out.println("[계좌개설]");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		Account acc = new Account(id, name, money);
//		Account acc = new Account();
//		acc.id=id;
//		acc.name=name;
//		acc.balance=money;
		accs[cnt++] = acc; //0번째에 acc가 들이감
		System.out.println("계좌가 개설되었습니다.");
		System.out.println();
	}
	
	Account searchAccById(String id){
		Account acc =null;
		for(int i=0; i<cnt; i++) {
			if(accs[i].id.equals(id)) {
				acc=accs[i];
				break;
			}
		}
		return acc;
		
	}

	void deposit() {
		System.out.println("[입금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		//계좌를 accs에서 찾는다
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 없거나 틀립니다. 다시 선택하세요.");
			System.out.println();
			return;
		}
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
		//acc.balance += money;
		System.out.println("계좌 잔액:"+acc.balance+"원");
		System.out.println();		
	}

	void withdraw() {
		System.out.println("[출금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc =searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 없거나 틀립니다. 다시 선택하세요.");
			System.out.println();
			return;
		}
		System.out.print("출금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
		//acc.balance -= money;
		System.out.println("계좌 잔액:"+acc.balance+"원");
		System.out.println();
		
	}

	void accInfo() {
		System.out.println("[계좌정보]");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		Account acc =searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 없거나 틀립니다. 다시 선택하세요.");
			System.out.println();
			return;
		}
		
		System.out.println(acc.info());
	}

	void allAccInfo() {
		System.out.println("[전체계좌조회]");
		for(int i=0;i<cnt;i++) {
			System.out.println(accs[i].info());
		}
		
	}

	void transfer() {
		System.out.println("[계좌이체]");
		
		System.out.print("보내는 계좌번호:");
		String sid = sc.nextLine();
		Account sacc = searchAccById(sid);
		if(sacc==null) {
			System.out.println("보내는 계좌번호가 없거나 틀립니다. 다시 선택하세요.");
			System.out.println();
			return;
		}
		
		System.out.println("받는 계좌번호:");
		String rid = sc.nextLine();
		Account racc = searchAccById(rid);
		if(racc==null) {
			System.out.println("받는 계좌번호가 없거나 틀립니다. 다시 선택하세요.");
			System.out.println();
			return;
		}
		
		System.out.println("이체금액:");
		int money =Integer.parseInt(sc.nextLine());
		if(!sacc.withdraw(money)) {
			System.out.println("계좌 잔액이 부족합니다.");
			System.out.println();
			return;
		}
		racc.deposit(money);
		
	}
	


}
