package fr.fms.entities;

import java.awt.Graphics;

//import java.awt.Point;


public abstract class Shape {
	private Point center;
	
	public Shape(int x, int y) {
		this.center = new Point(x, y);
	}
	
	public Shape(Point center){
		this.center = new Point(center.getX(), center.getY());
	}
	
	public double area() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Shape [center = " + center + "]";
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void drawShape(Graphics g) {
		
	}

}
