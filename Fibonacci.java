/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import java.lang.*;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 10000;
	
	public void run() {
		int term = 0;
		int term2 = 1;
		println(" this program lists the Fibonacci sequence ");
		
		while ( term < MAX_TERM_VALUE ) {
		  println(term);
		  int term3 = term + term2;
		  term = term2;
		  term2 = term3;
		}
		
	
		
	}
}

/*int term = 0;
		
println(" this program lists the Fibonacci sequence ");
println(0);
println(1);


while (term < 100) {
	
	
	    term (term - 1) + (term -2)


			println(term);*/
		
	
	
	


