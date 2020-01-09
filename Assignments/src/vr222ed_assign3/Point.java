package vr222ed_assign3;

public class Point {

	int x;
	int y;
	
	Point() {}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + " , " + this.y + ")"; 
	}
	
	public boolean isEqualTo(Point y) {
		if (this.x == y.x && this.y == y.y) {return true;}
		else return false;
		
	}
	
	public int distanceTo(Point y) {
		return (int) Math.sqrt(Math.pow((this.x-y.x), 2) + Math.pow((this.y-y.y), 2));

	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void moveToXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
