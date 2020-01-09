package vr222ed_assign3;

import java.util.Random;

public class Hero {

	Random r = new Random();

	String name;
	int xp = 20;
	weapon Weapon = new weapon("fists", 0);
	int atkdice=3;
	int defdice=4;
	weapon starter = new weapon("fists", 0);

	Hero() {}
	
	Hero(String name) {this.name = name;}
	
	protected int attemptDamage() {
		int attackSum=0;
		if (!Weapon.equals(starter)) {
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
	
	protected int defend() {
		int defendSum = 0;
		for (int i =0; i <defdice; i++) {
			defendSum = defendSum + r.nextInt(7);
		}
		return defendSum;
	}
	protected String getName() {
		return name;
	}
	protected int getXp() {
		return xp;
	}

	protected void setXp(int xp) {
		this.xp = xp;
	}

	protected weapon getWeapon() {
		return Weapon;
	}

	protected void setWeapon(weapon weapon) {
		Weapon = weapon;
	}
	
	
	
}
