package vr222ed_assign3;

public class StonePlanets {

	public static void print(Planet[] x) {
		for (Planet temp:x) { 
		
			System.out.printf("Planet %s has aphelion %.2f AU, perihelion %.2f AU and %d moons ", temp.getName(), temp.getAphelion(), temp.getPerihelion(), temp.getNoOfMoons());
			if (temp.getNoOfMoons()>0) {
				System.out.println();
				temp.getMoons();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet[] arr = new Planet[4];
		arr[0] = new Planet("Mercury", 1, 0, 0.47, 0.31); 
		arr[1] = new Planet("Venus", 2, 0, 0.72, 0.72);
		arr[2] = new Planet("Earth", 3, 1, 1.0, 0.99);
		arr[3] = new Planet("Mars", 4, 2, 1.666, 1.382);
		Moon moon = new Moon("The moon", 3474.2);
		Moon moontwo = new Moon("Phobos", 22.533);
		Moon moonthree = new Moon("Deimos", 12.4);
		arr[2].addMoon(moon);
		arr[3].addMoon(moontwo);
		arr[3].addMoon(moonthree);
		print(arr);
	}

}
