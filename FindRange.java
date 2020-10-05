/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */
//import java.util.*;

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	public void run() {
		
	
        println("This program finds the largest and smallest numbers.");
        value = readInt("?" );
        
        smallest = value;
        largest = value;
        
        if (value == SENTINEL) {
        	println("There are no values entered.");
        	
        }else
        while(value != SENTINEL) {
        	
        rangeEqn(value);
        value = readInt("?" );
        }
		printResult();
	}
	
	private void rangeEqn(int value) {
		if(value <= smallest) {
			smallest = value;
		}else if(value >= largest) {
			largest = value;
		}
	}
	
	private void printResult() {
		println("smallest: " + smallest);
		println("largest: " + largest);
		
	}
	
	private int smallest = 0;
	private int largest = 0;
	private int value = 0;
	
	private static final int SENTINEL = 0;
	
	
}

