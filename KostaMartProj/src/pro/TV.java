package pro;

public class TV extends Product {
	public TV() {
		price = 500;
		bonusPoint =50;
	}
	
	@Override
	public String toString() {
		return "텔레비젼";
	}
}
