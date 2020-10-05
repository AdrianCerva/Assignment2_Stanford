/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import java.lang.*;

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	
	private int	valueA = 0;
	private int valueB = 0;
	
	public void run() {
		
	println("Enter values to computer Pythagorean theorem.");
	println();
	valueA = readInt(" a: " );
	println(); 
	valueB = readInt(" b: " );
	
	
	int numA = valueA * valueA;
	int numB = valueB * valueB;
	
	int x = numA + numB;
	double y = Math.sqrt(x);

	println(); 
	println(" c = " + y);
	
	}
	
	
}
