package exc;

public class BankException extends Exception {
	private ERR_CODE errCode;
	
	public BankException(String msg, ERR_CODE errCode) {
		super(msg);
		this.errCode=errCode;
	}
	
	@Override
	public String toString() {
		String message= "["+getMessage()+"]";
		switch(errCode) {
		case ACCID_ERR: message+="계좌번호가 틀립니다"; break;
		case DOUBLEID_ERR: message+="계좌번호가 중복됩니다"; break;
		case DEPOSIT_ERR: message+="입금액을 확인하세요"; break;
		case WITHDRAW_ERR: message+="잔액이 부족합니다"; break;
		case MENU_ERR: message+="선택한 메뉴가 바르지 않습니다"; break;
		}
		return message;
	}
}