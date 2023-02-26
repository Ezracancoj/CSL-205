package edu.monmouth.shape;

public class Circle implements shape{
	private int radius;
	public Circle(int radius) {
		setRadius(radius);
		
	}
	
	public int getRadius() {
		return 0;
	}
	
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
	void setRadius(int radius) {
		this.radius = radius;
	}

}
