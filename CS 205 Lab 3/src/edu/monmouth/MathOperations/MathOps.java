package edu.monmouth.MathOperations;
public class MathOps {
	
	public double triangleArea(double height, double base) {
		double area = (height* base)/2;
		return area;
		
	}
	public double circleArea(double rad) {
		double area = Math.PI*rad*rad;
		return area;
		
	}
	
	public double circleCircumference(double rad) {
		double circumference = 2*Math.PI*rad;
		return circumference;
		
	}
	
	public String powersOfTwo() {
		StringBuilder powersOfTwo = new StringBuilder();
		final int LASTPOWER = 20;
		int value = 2;
		for(int power =  0; power <= LASTPOWER; power++) {
			powersOfTwo.append("\n"+Math.pow(value,power));
		}
		return powersOfTwo.toString();
	}



}
