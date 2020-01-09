package vr222ed_assign3;

public class Moon {

	private String name;
	private double diameter;
	
	Moon() {
	}
	
	Moon(String name, double diameter) {
		this.name = name;
		this.diameter = diameter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public void checkDiameter() {
		if (this.diameter<0) {
			this.diameter = 0;
		}
	}
	public  void checkName() {
		if (this.name.isEmpty()) {
			this.name = "Unknown moon";
		}
	}
	
}
