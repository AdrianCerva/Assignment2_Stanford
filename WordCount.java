/*
 * File: wordCount.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the WordCount.
 */

import java.lang.*;
import acm.program.*;
import java.io.*;
import java.util.Scanner;

public class WordCount extends ConsoleProgram {
	
	int words = 0;
	int countLines = 0;
	int charCount = 0;
	
	public void run() {
	
	try {
		File myObj = new File("lear.txt");
		println("File: " + myObj);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			if(myReader.hasNextLine() == true) {
				countLines++;
			}
			
			
			String data; 
			 data = myReader.nextLine();
			  words += getWords(data);
			  charCount += (data.length());
			  
			
		}
		println("Lines = " + countLines);
		println("Words = " + words);
		println("Chars = " + charCount);
		
		
		myReader.close();
	}catch (Exception e) {
		println("An error occurred.");
		e.printStackTrace();
	}
   }
	
	
	public static int getWords(String data) {
		String str[] = data.split((" "));
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			if(str[i].length() > 0 ) {
				count++;
			}
		}
		return count;
	}
}
	
	

	





		
		
	
	
	


