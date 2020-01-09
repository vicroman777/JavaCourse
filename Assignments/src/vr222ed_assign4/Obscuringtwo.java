package vr222ed_assign4;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Obscuringtwo {
	public static void print() {
		System.out.println("Obscure\r\n" + 
				"=======\n"
				+ "1. Make obscure\r\n" + 
				"2. Make readable\r\n" + 
				"3. Print obscure\r\n" + 
				"4. Print readable\r\n" + 
				"0. Exit");
	}

	
	public static String unobf(String input) {
		char[] word = input.toCharArray(); 
		String output = "";
		String low = "abcdefghijklmnopqrstuvwxyz";
		String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (char c: word) {
			if (Character.isAlphabetic(c)) {
				if (Character.isUpperCase(c)) {
					int let = up.indexOf(Character.toString(c))-3;
					if ((let) < 0) {
						let = (let)+26;
					}
					else {let = up.indexOf(c)-3;}
					output += Character.toString(up.charAt(let));
				}

				if (Character.isLowerCase(c)) {
					int let = low.indexOf(Character.toString(c))-3;
					if ((let) < 0) {
						let = (let-1)+26;
					}
					else {let = low.indexOf(c)-3;}
					output += Character.toString(low.charAt(let));	
					
					}
			}
			else {
				output += Character.toString(c);
				
			}
		}
		return output;
	}

	public static String obf(String input) {
		char[] word = input.toCharArray(); 
		String output = "";
		String low = "abcdefghijklmnopqrstuvwxyz";
		String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (char c: word) {
			if (Character.isAlphabetic(c)) {
				if (Character.isUpperCase(c)) {
					int let = up.indexOf(Character.toString(c))+3;
					if ((let+1) > 26) {
						let = (let+1)%26;
					}
					else {let = up.indexOf(c)+3;}
					output += Character.toString(up.charAt(let));
				}

				if (Character.isLowerCase(c)) {
					int let = low.indexOf(Character.toString(c))+3;
					if ((let+1) > 26) {
						let = (let+1)%26;
					}
					else {let = low.indexOf(c)+3;}
					output += Character.toString(low.charAt(let));	
					}
			}
			else {
				output += Character.toString(c);
			}
		}
		return output;
	}


	public static void deencryptFile(String input) {
		try {
			Path output = Paths.get("C:\\Users\\Death\\Documents\\GitHub\\JavaCourse\\Assignments\\dickz.txt");
			PrintWriter p = new PrintWriter(Files.newBufferedWriter(output));
			Files.lines(Paths.get(input)).map(line-> {return unobf(line);}).forEachOrdered(p::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static void encryptFile(String input) {
		try {
			Path output = Paths.get("C:\\Users\\Death\\Documents\\GitHub\\JavaCourse\\Assignments\\ntitties.txt");
			PrintWriter p = new PrintWriter(Files.newBufferedWriter(output));
			Files.lines(Paths.get(input)).map(line-> {return obf(line);}).forEachOrdered(p::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printFile(String filename) {
		try(Stream<String> stream = Files.lines(Paths.get(filename))) {
			stream.forEach(System.out::println);
		}
		catch (Exception e) {System.out.println(e);}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\lovecraft.txt\\";
		String path2 = "C:\\Users\\Death\\Documents\\GitHub\\JavaCourse\\Assignments\\ntitties.txt";

		encryptFile(path);
		deencryptFile(path2);
	}
}
