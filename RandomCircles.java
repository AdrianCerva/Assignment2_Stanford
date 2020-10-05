/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;

public class RandomCircles extends GraphicsProgram {
	
	private static final int TOTAL_CIRCLES = 10;
	RandomGenerator ran = new RandomGenerator();
	
	public void run() {
		for (int i = 0; i < TOTAL_CIRCLES; i++) {
			Color rColor = ran.nextColor();
			double r = ran.nextDouble(10,200);
			double x = ran.nextDouble(0, getWidth() - r);
			double y = ran.nextDouble(0, getHeight() - r);
			GOval circles = new GOval(x, y, r, r);
			circles.setFilled(true);
			circles.setFillColor(rColor);
			add(circles);
		}
	}
}
