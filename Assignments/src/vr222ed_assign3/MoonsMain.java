package vr222ed_assign3;

public class MoonsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet mars = new Planet("Mars", 4, 2, 1.66, 1.382);
		Moon Phobos = new Moon("Phobos", 22.533);
		Moon Deimos = new Moon("Deimos", 12.4);
		mars.addMoon(Phobos);
		mars.addMoon(Deimos);
		System.out.printf("The moons of %s are : ", mars.getName());
		mars.getMoons();
		
	}

}
