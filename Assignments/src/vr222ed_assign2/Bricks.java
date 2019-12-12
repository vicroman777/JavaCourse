package vr222ed_assign2;

import java.util.Arrays;
import java.util.Scanner;

public class Bricks {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Width of studs");
		int width = s.nextInt();
		System.out.println("Enter Height of studs");
		int height = s.nextInt();
		while (width > 0) {
		
		bricc b = new bricc(width, height);
		b.makeBRICC(b);
		b.PRINTBRICC(b);
		System.out.println("Enter Width of studs");
		width = s.nextInt();
		System.out.println("Enter Height of studs");
		height = s.nextInt();
		}
		s.close();
		System.out.println("BYE");
		}
	}


//counter counts empty spaces, add dots for total wall

class bricc {
	int width;
	int height;
	int actualWidth;
	int actualHeight;
	String[][] bricc;

	static final String dot = "●";
	static final String LCorner = "┌";
	static final String RCorner = "┐";
	static final String LDCorner = "└";
	static final String RDCorner = "┘";
	static final String VWall = "│";
	static final String HWall = "─";

	public bricc(int width, int height) {
		this.width = width;
		this.height = height;
		// 2 is walls, width-1 is spaces between briccs
		this.actualHeight = height + 2;
		this.actualWidth = width + 2 + (width - 1);
		this.bricc = new String[actualHeight][actualWidth];
	}

	public void setWidth(int width) {
		this.width = width;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	

	public void makeCore() {
		for (int i = 1; i < this.actualHeight - 1; i++) {
			this.bricc[i][0] = VWall;
			for (int j = 1; j < this.actualWidth - 1; j++) {
				this.bricc[i][j] = dot;
				if (this.bricc[i][j - 1] == dot) {
					this.bricc[i][j] = " ";
				}
			}
			this.bricc[i][this.actualWidth - 1] = VWall;
		}
	}

	public void makeLower() {
		this.bricc[this.actualHeight - 1][0] = LDCorner;
		for (int i = 1; i < this.actualWidth; i++) {
			this.bricc[this.actualHeight - 1][i] = HWall;
		}
		this.bricc[this.actualHeight - 1][this.actualWidth - 1] = RDCorner;
	}

	public void makeUpper() {
		this.bricc[0][0] = LCorner;
		for (int i = 1; i < this.actualWidth; i++) {
			bricc[0][i] = HWall;
		}
		this.bricc[0][this.actualWidth - 1] = RCorner;
	}
	public void makeBRICC(bricc b) {
		b.makeCore();
		b.makeLower();
		b.makeUpper();
	}
	public void PRINTBRICC(bricc b) {
		for (int i = 0; i < b.actualHeight; i++) {
			for (int j = 0; j < b.actualWidth; j++) {
				System.out.print(b.bricc[i][j]);
			}
			System.out.print("\n");
		}
	}
}
