import pac.Point;

public class ObjectClassTest3 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Point p1 = new Point(10,20);
		Point p2 = (Point)p1.clone();
		System.out.println(p2);
	}

}
