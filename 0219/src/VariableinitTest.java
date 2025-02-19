class Car{
	int door=4;
	Car(){
		door=6;
		System.out.println("생성자:" + door);
	}
	{
		door=5;
		System.out.println("초기화블럭:"+door);
	}
	//초기화 블럭 이 먼저 실행된다.
}
//static 변수
class Card{
	static int width = 30;
	//초기화는 보통 생성자에서 하지는 않음
	static {
		width=50;
	}
	//처음에 0이 었다가 30이었다가 50이 된다.\
}
class Rand{
	static int[] nums = new int[10];
	static {
		for(int i=0; i<nums.length;i++) {
			nums[i] = (int)(Math.random()*100)+1;
		}
	}
}

public class VariableinitTest {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.door);
		
		Rand rand = new Rand();
		for(int i=0; i<Rand.nums.length;i++) {
			System.out.print(Rand.nums[i]+",");
		}	
		//위아래 둘다 가능;
		System.out.println();
		
		for(int i=0; i<rand.nums.length;i++) {
			System.out.print(Rand.nums[i]+",");
		}
	}

}
