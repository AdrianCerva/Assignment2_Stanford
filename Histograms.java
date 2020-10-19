/*
 * File: Histogram.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the Histogram.
 */

import java.io.File;
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

import acm.program.*;

public class Histograms extends ConsoleProgram {
	

	
	String stars1 = " ", stars2 = " ", stars3 = " ", stars4 = " ", stars5 = " ", 
		   stars6 = " ", stars7 = " ", stars8 = " ", stars9 = " ", stars10 = " ";
	public void run() {
		
		try {
			File myObj = new File("MidtermScores.txt");
			
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				int number = Integer.parseInt(data);
				
				if(10 < number && number < 19) {
					 stars1 += "* ";
				}
				if(20 < number && number < 29) {
					 stars2 += "* ";
				}
				if(30 < number && number < 39) {
					 stars3 += "* ";
				}
				if(40 < number && number < 49) {
					 stars4 += "* ";
				}
				if(50 < number && number < 59) {
					 stars5 += "* ";
				}
				if(60 < number && number < 69) {
					 stars6 += "* ";
				}
				if(70 < number && number < 79) {
					 stars7 += "* ";
				}
				if(80 < number && number < 89) {
					 stars8 += "* ";
				}
				if(90 < number && number < 99) {
					 stars9 += "* ";
				}
				if(number == 100) {
					 stars10 += "* ";
				}
			}
			println("00-09:\n" +  "10-19:" + stars1 + "\n20-29:" + stars2 + "\n30-39:" + stars3 + 
					"\n40-49:" + stars4 + "\n50-59:" + stars5 +"\n60-69:" + stars6 +
			         "\n70-79:" + stars7 + "\n80-89:" + stars8 + "\n90-99:" + stars9 +
			          "\n"
			          + "  100:" + stars10);
		 
			   myReader.close();
		}catch (Exception e) {
			println("An error occurred.");
			e.printStackTrace();
		}
	
		
	}
		
			
}
	
	





		
		
	
	
	


