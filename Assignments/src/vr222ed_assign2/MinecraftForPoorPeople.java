package vr222ed_assign2;

import java.util.Scanner;

public class MinecraftForPoorPeople {
	private static Scanner s = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Width of studs");
		int width = s.nextInt();
		System.out.println("Enter Height of studs");
		int height = s.nextInt();
		brick b = new brick(width, height);
		b.makeCore(b.width);
		b.makeUpper(b.width, b.counter);
		b.makeLower(b.width, b.counter);
		System.out.print(b.upper + "\n");
		for (int i=0; i<height; i++) {
			System.out.printf(b.core + "\n");
		}
		System.out.print(b.lower);
	}
	
	
	//counter counts empty spaces, add dots for total wall
	
	public static void makeBrick(int width, int height) {
		
		
		
	}
}

class brick {
	int width;
	int height;
	int counter;
	String[][] bricc;
	String upper = "";
	String core = "";
	String lower = "";
	
	static String dot = "●";
	static String LCorner = "┌";
	static String RCorner = "┐";
	static String LDCorner = "└";
	static String RDCorner = "┘";
	static String VWall = "│";
	static String HWall = "─";
	
	public brick(int width, int height) {
		this.width=width;
		this.height=height;
		}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void makeCore(int width) {
		 this.core += VWall;
		 for (int i = 0; i<width; i++) {
			 this.core += dot;	 
			 if (i<width-1) {
			 this.core += " ";
			 this.counter++;}
		 }
		 this.core += VWall;
	
	}
	
	public void makeLower(int width, int counter) {
		this.lower += LDCorner;
		for (int i = 0; i < width+counter; i++) {
			this.lower += HWall;
		}
		this.lower += RDCorner;
	}
	
	public void makeUpper(int width, int counter) {
		this.upper += LCorner;
		for (int i = 0; i < width+counter; i++) {
			this.upper += HWall;
		}
		this.upper += RCorner;
	}
	

}
	
