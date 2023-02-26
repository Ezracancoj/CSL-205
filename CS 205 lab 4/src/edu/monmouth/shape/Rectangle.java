package edu.monmouth.shape;

public class Rectangle implements shape{
	private int length;
	private int width;
	
	@Override
	public double area() {
		return width * length;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setLength(int length) {
		this.length = length;
		
	}
	
	public void setWidth(int width) {
		this.width = width;
		
	}
	public Rectangle(int length, int width) {
		setWidth(width);
		setLength(length);
	}

}
