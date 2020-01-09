package vr222ed_assign3;

import java.util.Random;

public class weapon {
	Random r = new Random();
	String name = " ";
	int power = 0;
	
	weapon() {generate();}
	
	weapon(String name, int power) {
		this.name = name;
		this.power = power;
	}
	protected void generate() {
		 String[] Start = {"The mace ", "The axe ", "The staff "};
		 String[] end = {"of doom", "of fire", "of wind", "of death", "of sparkles"};
		 this.name = Start[r.nextInt(Start.length)] + end[r.nextInt(end.length)]; 
		 this.power = r.nextInt(6);
	}
	
	public int rollAttack() {
		int attackSum = 0;
		for (int i = 0; i<power; i++) {
			attackSum = attackSum + r.nextInt(6);
		}
		return attackSum;
	}
	
	public int rollmonsterAttack() {
		int attackSum = 0;
		for (int i = 0; i<power; i++) {
			attackSum = attackSum + r.nextInt(6);
		}
		return attackSum;
	}
	
}
