class Complex {
	int real;
	int imaginary;

	Complex(int r, int i) {
		real = r;
		imaginary = i;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Complex))
			return false;
		Complex c = (Complex) obj;
		return real == c.real && imaginary == c.imaginary;
	}

	@Override
	public String toString() {
		return real + "+" + imaginary + "i";
	}

	@Override
	public int hashCode() {
		return real*2+imaginary*10;
	}
	
	
}

public class ObjectClassTest2 {

	public static void main(String[] args) {
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(1, 2);
		Complex c3 = new Complex(1, 2);
		System.out.println(c1.equals(new Person(20, "hong")));// false
		System.out.println(c1.equals(c2)); // 1+2i
		System.out.println(c1);

		String str = "홍길동";
		System.out.println(str.hashCode());
		Integer n = 200;
		System.out.println(n.hashCode());

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
	}
}
