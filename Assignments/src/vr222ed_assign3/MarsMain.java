package vr222ed_assign3;

public class MarsMain {

	public static void printPlanet(Planet x) {
		System.out.printf("%s", x.getName());
		System.out.printf("\n\tPosition: %d", x.getPositionFromSun());
		System.out.printf("\n\tMoons: %d", x.getNoOfMoons());
		System.out.printf("\n\tAphelion: %.2f", x.getAphelion());
		System.out.printf("\n\tPerihelion: %.2f", x.getPerihelion());
	}
	
	//fix locale
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet mars = new Planet("Mars", 4, 2, 1.66, 1.382);
		printPlanet(mars);
	}

}
