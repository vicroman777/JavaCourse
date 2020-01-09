package vr222ed_assign3;

public class MoonMain {

	public static void print(Moon x) {
		System.out.printf("Largest moon in the solar system is %s which is %.0f km in diameter", x.getName(), x.getDiameter());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moon moon = new Moon("Ganymede",5262);
		print(moon);
	}

}
