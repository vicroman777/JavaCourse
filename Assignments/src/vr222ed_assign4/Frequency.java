package vr222ed_assign4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Frequency {


	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		String word = "";
		String max = "";
		String secondmaxw = "";
		int count = 0;
		int maxcount = 0;
		int secondmax = 0;
		int ctcount = 0;
		int azcount = 0;
		int neccount= 0;

		try {
			FileReader r = new FileReader("C:\\Users\\Death\\Documents\\GitHub\\JavaCourse\\Assignments\\dickz.txt");
			BufferedReader br = new BufferedReader(r);    

			while (((word =  br.readLine()) != null)) {
				
				String string[] = word.toLowerCase().trim().split("\\s+|(?=\\p{Punct})|(?<=\\p{Punct})");  
				System.out.println(Arrays.toString(string));
				for (String s: string) {
					words.add(s);
				}
			}

			for (int i = 0; i<words.size(); i++) {
				count = 1;
				if(words.get(i).equalsIgnoreCase("Cthulhu")) {ctcount++;}
				if(words.get(i).equalsIgnoreCase("Azathoth")) {azcount++;}
				if(words.get(i).equalsIgnoreCase("Necronomicon")) {neccount++;}
				for (int j=i+1; j<words.size(); j++) {
					if(words.get(i).equals(words.get(j))) {count++;}
				


			}
				if(count>maxcount) {
					secondmax = count;
					maxcount = count;
					max = words.get(i);
			}
				else if (count>secondmax && count != maxcount) {
					secondmax = count;
					secondmaxw = words.get(i);
				}
		System.out.println(words.get(i));
			}
			System.out.println(maxcount);
			 System.out.println(Arrays.toString(words.toArray()));
			 System.out.println("Most repeated word: " + max);    
			 System.out.println("Second most repeated word: " + secondmaxw );
			 System.out.println("Occurence ctu" + ctcount);
			 System.out.println(azcount);
			 System.out.println(neccount);

		        br.close();    


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
