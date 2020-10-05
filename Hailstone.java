/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

import java.util.Scanner;

public class Hailstone extends ConsoleProgram {
	int took = 0;
	public void run() {
		print("Enter a number: ");
		int n = readInt();
		
		
		while (n != 1 && n != 0) {
			if (n % 2 == 0) {
			println();    
		    print( n + " is even so I take half: ");
		    n = n / 2;
		    println(n);
	      
	      }else {
	    	println();
	        print( n + " is odd, so I make 3n + 1: ");
	        n = n * 3 + 1;
		    println(n);
	      }	
			took++;
		}
		
		if(n == 0) {
			println("invalid input");
		}else {
			println();
			println("The process took " + took +" to reach 1");
		}
	}
	
	
	
/*	private static final int SENTINEL = 0;
	int userNumber = 0;
	 int oddNumber = 0;
     int evenNumber = 0;
	
     int count = 0;
	public void run() {


	  
      print("Enter a number: "); 
      userNumber = readInt();
     
      if (userNumber % 2 == 1) {
             oddNumber = userNumber * 3 + 1; 
             
      println( userNumber + " is odd, so I make 3n + 1: " + oddNumber );
      }else {
    	     evenNumber = userNumber / 2;
      println( userNumber + " is even so I take half: " + evenNumber);
      }	
      
      if (userNumber )
      while(userNumber % 2 == 1) {
    	  oddNumber = userNumber * 3 + 1;
    	  total1 = oddNumber;
    	  println( userNumber + " is odd, so I make 3n + 1: " + oddNumber );
    	  evenNumber = userNumber / 2;
    	  println( userNumber + " is even so I take half: " + evenNumber);
    	  
    	  count++;
      }
    	println("The process took" + count + "to reach 1");  
     }
	*/
	  
}


