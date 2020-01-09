package vr222ed_assign4;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stats {
	public static void main(String[] args) throws IOException 
	   {
	
		 String fname =args[0];
		Path path = Paths.get(fname);
		System.out.println(path);
		long lineCount = Files.lines(path).count();
		long emptyLines = Files.lines(path).filter(l -> l.isBlank()).count();
		long textLines = Files.lines(path).filter(l -> !l.isBlank()).count();
		long allwords = Files.lines(Paths.get(fname)).flatMap(line -> Arrays.stream(line.trim().split(" ")))
			    .filter(word -> word.chars().anyMatch(x -> Character.isAlphabetic(x)))
			    .count();
		long allwordst = Files.lines(Paths.get(fname)).flatMap(line -> Arrays.stream(line.trim().split(" ")))
			    .filter(word -> word.chars().anyMatch(x -> !Character.isDigit(x)))
			    .count();

		long numberLines = Files.lines(path).filter(l ->  l.chars().anyMatch(x -> Character.isDigit(x)) && l.length()<10).count();
		System.out.println("Number of total lines: " + lineCount); 
		System.out.println("Number of empty lines: " + emptyLines); 
		System.out.println("Number of lines with text: " + textLines); 
		System.out.println("Number of lines with page numbers: " + numberLines); 
		}
		
		
	   }

