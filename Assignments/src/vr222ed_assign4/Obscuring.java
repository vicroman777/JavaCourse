package vr222ed_assign4;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Obscuring {
	public static void print() {
		System.out.println("Obscure\r\n" + 
				"=======\n"
				+ "1. Make obscure\r\n" + 
				"2. Make readable\r\n" + 
				"3. Print obscure\r\n" + 
				"4. Print readable\r\n" + 
				"0. Exit");
	}

	public static String obfuscate (String input) {
		char[] obf = input.toCharArray();
		String tostring = "";
		System.out.println(input);

		for (char c: obf) {
			System.out.println("ur mom");

			if(Character.isAlphabetic(input.charAt(c))) {
				
				if ((int) input.charAt(c) > 87 && (int) input.charAt(c) <96) { 
					// uppercase
					int diff = (int) input.charAt(c)-88;
					obf[c] = (char) (65+diff);
					tostring += Character.toString(obf[c]);
					System.out.println(Character.toString(obf[c]));
					System.out.println();
				}

				else if ((int) input.charAt(c) > 119 ) { // lowercase

					int diff = (int) input.charAt(c) -120;
					obf[c] = (char) (97+diff);
					tostring += Character.toString(obf[c]);

				}
				else {obf[c] = (char) (input.charAt(c) + 3); 		
				
				tostring += Character.toString(obf[c]);}
			}
			else {
				tostring += Character.toString(obf[c]);
			}

		}
		System.out.println(tostring);	
		
		return tostring;

	}

	public static void unobf(String input) {
		char[] obf = new char[input.length()];
		for (int i = 0; i<obf.length; i++) {
			if ((int) input.charAt(i) <68) { // uppercase
				int diff = (int) input.charAt(i)-65;
				System.out.println(diff);
				obf[i] = (char) (88+diff);
			}
			else if ((int) input.charAt(i) < 100 && (int) input.charAt(i) >95 ) { // lowercase

				int diff = (int) input.charAt(i) -97;
				obf[i] = (char) (120+diff);
			}
			else {obf[i] = (char) (input.charAt(i) - 3);}
		}
		for (int j=0; j<input.length(); j++) {
			System.out.print(obf[j]);
		}
	}


	public static void encrypt() {
		//File file = new File("ddod.txt");
		String path = "C:\\Users\\Death\\Documents\\GitHub\\JavaCourse\\Assignments\\ddod.txt";
		Path input = Path.of("C:\\lovecraft.txt");
		try{PrintWriter p = new PrintWriter("ddod.txt");

		Files.lines(input).map(line-> {return obfuscate(line);}).forEachOrdered(p::println);
		p.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encrypt();
	}

}
