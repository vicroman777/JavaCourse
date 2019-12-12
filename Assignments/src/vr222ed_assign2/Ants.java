package vr222ed_assign2;

import java.util.Arrays;
import java.util.Random;


public class Ants {

	static Random r = new Random();
	
	
	public static boolean checkState(boolean[][] board) {
		for (int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if (board[i][j]==false) {
					return false;}
				}	
			}
	return true;
	}
	
	public static boolean checkMove(ant ant, boolean[][] board) {
		if (ant.x >= board.length || ant.y >= board[0].length ||  ant.x < 0 || ant.y < 0) {
			return false;
		}
		return true;
	}
	
	public static void attemptMove(ant ant, boolean[][] board) {
		int tempx = ant.x;
		int tempy = ant.y;
		ant.move();
		//System.out.println(ant.x);
		if (!checkMove(ant, board)) {
			ant.x = tempx;
			ant.y = tempy;
			//System.out.println(!checkMove(ant,board));
		}
		else {board[ant.x][ant.y] = true; ant.counter++;}
	}

	public static void setTrue(boolean[][] board, int x, int y) {
		board[x][y] = true;
	}
	

	public static double average(int arr[], int n) {
		int sum = 0;
		for (int i=0; i<n; i++) { sum += arr[i];}
		return sum/n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[10];
		for (int i = 0; i<10; i++) {
			boolean[][] board = new boolean[8][8];
			boolean done = false;
			ant ant = new ant(r.nextInt(9), r.nextInt(9));
			while (!done) {
				//System.out.println(board[ant.x][ant.y]);
				if (checkState(board)) {done = true;}
				attemptMove(ant, board);
			}
			scores[i] = ant.counter;
			System.out.printf("Number of steps in simulation %d: %d\n", i+1, ant.counter);
		}
	System.out.println("The average is: " + average(scores, 10));
	}
		

	}

class ant {
	int x;
	int y;
	int counter;
	
	
	ant(int x, int y) {
		this.x=x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public void move() {
		Random n = new Random();
		int r = n.nextInt(4);
		switch (r) {
		//up
		case 0:
		this.y = y+1; break;
		//down
		case 1:
		this.y = y-1; break;
		//right
		case 2:
		this.x = x+1;  break;
		//left
		case 3:
		this.x = x-1; break;
		}
	
	}
	}
