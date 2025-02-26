package pac;

public class Point implements Cloneable{
	int x,y;
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	@Override
	public Object clone() {
		Object obj = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}return obj;

	}
}
