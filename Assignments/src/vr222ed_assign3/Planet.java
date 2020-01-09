package vr222ed_assign3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Planet {

	private String name = "Unknown planet";
	private int positionFromSun = 0;
	private int noOfMoons = 0;
	private double aphelion = 0;
	private double perihelion = 0;
	
	//added the arraylist attribute to hold the moonz
	private ArrayList<Moon> moons = new ArrayList<Moon>();
	
	Planet() {	
	}
	
	Planet(String name, int positionFromSun, int noOfMoons, double aphelion, double perihelion) {
		this.name = name;
		checkName();
		this.positionFromSun = positionFromSun;
		checkPosition();
		this.noOfMoons = noOfMoons;
		checkMoons();
		this.aphelion = aphelion;
		checkAphelion();
		this.perihelion = perihelion;
		checkPerihelion();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		checkName();
	}

	public int getPositionFromSun() {
		return positionFromSun;
	}

	public void setPositionFromSun(int positionFromSun) {
		this.positionFromSun = positionFromSun;
		checkPosition();
	}

	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
		checkMoons();
	}

	public double getAphelion() {
		return aphelion;
	}

	public void setAphelion(double aphelion) {
		this.aphelion = aphelion;
		checkAphelion();
	}

	public double getPerihelion() {
		return perihelion;
	}

	public void setPerihelion(double perihelion) {
		this.perihelion = perihelion;
		checkPerihelion();
	}

	public void checkName() {
		if (this.name.isEmpty()) {
			this.name = "Unknown planet";
		}
	}
	
	public void checkPosition() {
		if (this.positionFromSun>9 || this.positionFromSun <0) {
			this.positionFromSun = 0;
		}
	}
	
	public void checkMoons() {
		if (this.noOfMoons<0 || this.noOfMoons > 100) {
			this.noOfMoons = 0;
		}
	}

	public void checkAphelion() {
		if (this.aphelion >50 || this.aphelion<0) {
			this.aphelion = 0;
		}
	}
	
	public void checkPerihelion() {
		if (this.perihelion > 30 || this.perihelion<0) {
			this.perihelion = 0;
		}
	}

	public void addMoon(Moon x) {
		this.moons.add(x);
	}
	public void getMoons() {
		moons.forEach((a)->System.out.print(a.getName() + " "));;
	}
}
