import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;

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
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	
	void selMakeAccount() {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		if(sel==1) makeAccount();
		else if(sel==2) makeSpecialAccount();
	}
	
	void makeAccount() {
		System.out.println("[일반계좌개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		Account acc = new Account(id,name,money);
		accs[cnt++] = acc;		
	}
	
	void makeSpecialAccount() {
		System.out.println("[특수계좌개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP,Gold,Silver,Normal):");
		String grade =sc.nextLine();
		Account acc = new SpecialAccount(id,name,money,grade);
		accs[cnt++] = acc;		
	}

	Account searchAccById(String id) {
		Account acc = null;
		for(int i=0; i<cnt; i++) {
			if(accs[i].getId().equals(id)) {
				acc = accs[i];
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
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}
	
	void withdraw() {
		System.out.println("[출금]");
		System.out.print("계좌번호");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.print("출금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}
	
	void accInfo() {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.println(acc);
	}
	
	void transfer() {
		System.out.println("[계좌이체]");
		System.out.print("보내는 계좌번호:");
		String sid = sc.nextLine();
		Account sacc = searchAccById(sid);
		if(sacc==null) {
			System.out.println("보내는 계좌번호가 틀립니다.");
			return;
		}
		System.out.print("받는 계좌번호:");
		String rid = sc.nextLine();
		Account racc = searchAccById(rid);
		if(racc==null) {
			System.out.println("받는 계좌번호가 틀립니다.");
			return;
		}
		System.out.print("이체금액:");
		int money = Integer.parseInt(sc.nextLine());
		if(!sacc.withdraw(money)) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		racc.deposit(money);		
	}
	
	void allAccInfo() {
		System.out.println("[전체계좌조회]");
		for(int i=0; i<cnt; i++) {
			System.out.println(accs[i]);
		}
	}
}
