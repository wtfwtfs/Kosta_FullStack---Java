import pro.Audio;
import pro.Computer;
import pro.Product;
import pro.TV;

public class Buyer {

	int money =1000;
	int bonusPoint=0;
	
	Product[] cart = new Product[100];  //구매한 상품을 담을 배열
	int cnt;
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bounusPoint) {
		this.bonusPoint = bounusPoint;
	}

	void buy(Product p) {
		if(money<p.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		cart[cnt++] = p;
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
	}

	void buyInfo() {
		int sum=0;
		System.out.print("구입목록 :");
		for(int i =0; i<cnt; i++) {
			System.out.print(cart[i]+", ");
			sum+= cart[i].getPrice();
		}
		System.out.println();
		System.out.println("구입금액 :" + sum + "원");
		System.out.println("보너스 포인트 : "+getBonusPoint());
		System.out.println("잔액 : " + getMoney());
	}
	
	public static void main(String[] args) {
		Buyer b= new Buyer();
		Product p1 = new TV();
		Product p2 = new Computer();
		Product p3 = new Audio();
		Product p4 = new Computer();
		
		b.buy(p1);
		b.buy(p2);
		b.buy(p3);
		b.buy(p4);
		
		b.buyInfo();
	}

}
// TV의 가격 : 500, 50
// Computer : 300, 30
// Audio : 200, 20

// 출력결과
//잔액이 부족합니다.
//구입목록 : TV, Computer, Audio
//구입금액 : 1000원
//보너스 포인트 : 100
//잔액 : 0원


// buy 할때 마다 cart에 물품이 추가 되고 구매하기, 보너스 포인트 
// 마지막 p4는 잔액 부족으로 불가한 상품