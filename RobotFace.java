/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;



public class RobotFace extends GraphicsProgram {
	
	static final int MOUTH = 50;
	static final int MOUTH_HEIGHT = 300;
	static final int MOUTH_WIDTH = 10;
	static final int EYE_RADIUS = 100;
	static final int HEAD = 300;
	static final int HEAD_HEIGHT = 100;
	static final int HEAD_WIDTH = 50;
	public void run() {
		
		rectCenter(HEAD, Color.GRAY);
		circleLEFT(EYE_RADIUS, Color.YELLOW);
		circleRIGHT(EYE_RADIUS, Color.YELLOW);
		rectMouth(MOUTH, Color.WHITE);
		
		
		
	}
	
	public void rectCenter(double rad, Color color) {
		double x = (getWidth() / 2) - rad;
		double y = (getHeight() / 2) - rad;
		GRect rect = new GRect(x + HEAD_WIDTH, y + HEAD_HEIGHT, rad * 2, rad * 2);
		rect.setFilled(true);
		rect.setColor(color);
		add(rect);
	}
	
	public void rectMouth(double rad, Color color) {
		double x = (getWidth() / 2) - rad;
		double y = (getHeight() / 2) - rad;
		GRect rect = new GRect(x + MOUTH_WIDTH, y + MOUTH_HEIGHT, rad * 6, rad * 2);
		rect.setFilled(true);
		rect.setColor(color);
		add(rect);
	}
	
	public void circleLEFT(double rad, Color color) {
		double x = (getWidth() / 2) - rad;
		double y = (getHeight() / 2) - rad;
		GOval circle = new GOval(x + 200, y, rad * 2, rad * 2);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	
	
	public void circleRIGHT(double rad, Color color) {
		double x = (getWidth() / 2) - rad;
		double y = (getHeight() / 2) - rad;
		GOval circle = new GOval(x - 120, y, rad * 2, rad * 2);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	

}
