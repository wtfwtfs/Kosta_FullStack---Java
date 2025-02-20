class Complex{
	int real;
	int imaginary;
	
	Complex(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	
	}
	
	@Override
	public String toString() {
		return real+"+"+imaginary+"i";
	}
}

public class ObjectTest1 {
	public static void main(String[] args) {
//		Object obj = new Object();
//		System.out.println(obj.toString());
		
		Complex c1 = new Complex(3,5);
		System.out.println(c1); //3+5;
	}
}
