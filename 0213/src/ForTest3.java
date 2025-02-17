//1~100사이의 값 중 3의 배수를 제외한 나머지 값의 합 구하기
public class ForTest3 {

	public static void main(String[] args) {
		int sum =0;
		for(int i =1;i<=100;i++) {
			if(i%3!=0) {
				sum += i; 
				System.out.print(i);
				System.out.println(" "+sum);
			}
		}
		System.out.println("3의 배수를 제외한 나머지 값의 합 : "+sum);
	}

}
