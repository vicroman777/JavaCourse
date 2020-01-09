package vr222ed_assign3;

import java.util.ArrayList;
import java.util.Random;

public class Monster {
	int xp;
	int atkdice=3;
	int defdice=4;
	weapon Weapon = new weapon("fists" , 2 );
	String name;
	Random r = new Random();

	public void generateName() {
		 String[] Start = {"Hur", "Qor", "Par", "Lot", "Epstein"};
		 String[] middle = {"gar", "tad", "san", "tor", "Didnt"};
		 String[] end = {", the great", ", the small", ", the quick", ", the wise", "Killhimself"};
		 this.name = Start[r.nextInt(Start.length)] + middle[r.nextInt(middle.length)] + end[r.nextInt(end.length)]; 
	}
	
	public void present() {
		System.out.println("Graah! My name is " + name + " and I will end you!");
	}
	
	Monster() {
		generateName();
		this.xp = 50;
	}
	
	protected int attemptDefense() {
		int defenseSum=0;
		for (int i =0; i< defdice; i++) {
		defenseSum = r.nextInt(4);	
		}
		return defenseSum=0;
	}
	

	protected int attemptDamage() {
		int attackSum=0;
		if (Weapon != null) {
			return Weapon.rollAttack();
		}
		else {
			return r.nextInt(5);
		}
	}
	protected int inflictDamage() {
		int attackSum=0;
		if (Weapon != null) {
			return Weapon.rollAttack();
		}
		else {
			return r.nextInt(5);
		}
	}
	
	
}
