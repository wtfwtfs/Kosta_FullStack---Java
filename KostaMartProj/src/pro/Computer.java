package pro;

public class Computer extends Product {
	public Computer() {
		price = 300;
		bonusPoint =30;
	}
	
	@Override
	public String toString() {
		return "컴퓨터";
	}
	
}
