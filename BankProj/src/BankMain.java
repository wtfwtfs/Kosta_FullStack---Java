public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Loop : while(true) {
			int sel = bank.selectMenu();
			
			switch(sel) {
			case 0: break Loop;
			case 1: bank.selMakeAccount(); break;
			case 2: bank.deposit(); break;
			case 3: bank.withdraw(); break;
			case 4: bank.accInfo(); break;
			case 5: bank.allAccInfo(); break;
			case 6: bank.transfer(); break;
			}
		}
	}
}