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
import java.awt.event.MouseEvent;

public class DrawLines extends GraphicsProgram {	
	private GLine line;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent m){
		
		int x = m.getX();
		int y = m.getY();
		
		line = new GLine(x,y,x,y);
		add(line);
	}
	
	public void mouseDragged(MouseEvent m) {
		
		int xEnd = m.getX();
		int yEnd = m.getY();
		line.setEndPoint(xEnd, yEnd);
	}
}
