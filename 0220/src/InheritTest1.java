class Point {
	int x;
	int y;

	Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String info() {
		return String.format("(%d,%d)", x, y);
	}
}

class Shape {
	String color;

	Shape() {
		color = "white";

	};

	Shape(String color) {
		this.color = color;
	}
	
	draw(){
		
	}
}

class Triangle extends Shape {
	Point a;
	Point b;
	Point c;

	Triangle() {
		a = new Point();
		b = new Point();
		c = new Point();
	}

	Triangle(String color, int x1, int y1, int x2, int y2, int x3, int y3) {
		super(color);
		a = new Point(x1, y1);
		b = new Point(x2, y2);
		c = new Point(x3, y3);
	}

	Triangle(String color, Point ta, Point tb, Point tc) {
		super(color);
		a = ta;
		b = tb;
		c = tc;
	}

	void draw() {
		System.out.println(String.format("[삼각형:색-%s, 점1-%s, 점2-%s, 점3-%s]", color, a.info(), b.info(), c.info()));
	}
}

class Rectangle extends Shape {
	Point center;
	int a;
	int b;

	Rectangle() {
		center = new Point();
	}

	Rectangle(String color, int cx, int cy, int a, int b) {
		super(color);
		center = new Point(cx, cy);
		this.a = a;
		this.b = b;
	}

	Rectangle(String color, Point rc, int a, int b) {
		super(color);
		center = rc;
		this.a = a;
		this.b = b;
	}

	void draw() {
		System.out.println(String.format("[사각형: 색-%s, 점=%s, 가로=%d, 세로=%d]", color, center.info(), a, b));
	}
}

class Circle extends Shape {
	Point center;
	int radius;

	Circle() {
		center = new Point();
	}

	Circle(String color, int cx, int cy, int radius) {
		// this.color=color;
		// super.color=color;
		super(color);
		center = new Point(cx, cy);
		this.radius = radius;
	}

	Circle(String color, Point cp, int radius) {
		super(color);
		center = cp;
		this.radius = radius;
	}

	void draw() {
		System.out.println(String.format("[원:색-%s, 중심점-%s, 반지름-%d]", color, center.info(), radius));
	}

}

public class InheritTest1 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		Circle c2 = new Circle("red", 3, 5, 10);
		Circle c3 = new Circle("Ornage", new Point(7, 2), 20);
//		c1.draw();
//		c2.draw();
//		c3.draw();

		System.out.println();

		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("blue", 2, 3, 4, 5, 6, 7);
		Triangle t3 = new Triangle("sky", new Point(5, 5), new Point(13, 23), new Point(21, 55));
//		t1.draw();
//		t2.draw();
//		t3.draw();

		System.out.println();

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle("green", 5, 5, 20, 10);
		Rectangle r3 = new Rectangle("kaki", new Point(14, 15), 30, 15);
//		r1.draw();
//		r2.draw();
//		r3.draw();

		Shape[] shapes = new Shape[9];

		shapes[0] = c1;
		shapes[1] = c2;
		shapes[2] = c3;
		shapes[3] = t1;
		shapes[4] = t2;
		shapes[5] = t3;
		shapes[6] = r1;
		shapes[7] = r2;
		shapes[8] = r3;

		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
			
			
//			if (shapes[i] instanceof Circle) {
//				((Circle) shapes[i]).draw();
//			} else if (shapes[i] instanceof Triangle) {
//				((Triangle) shapes[i]).draw();
//			} else if (shapes[i] instanceof Rectangle) {
//				((Rectangle) shapes[i]).draw();
//			}

		}

	}

}
//[원:색-white,중심점-(0,0),반지름-0]
//[원:색-red ,중심점-(3,5),반지름-10]
//[삼각형:색-white,점1-(0,0),점2-(0,0),점3-(0,00);
//[삼각형:색-blue,점1-(2,3),점2-(4,5),점3-(6,7);
//[삼각형:색-sky,점1-(5,5),점2-(13,23),점3-(21,55);
//[사각형:색-white,]
//[사각형:색-white,]
//[사각형:색-white,]