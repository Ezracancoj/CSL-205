package edu.monmouth.shape;

public class Lab4 {

	public static void main(String[] args) {
		Circle circle = new Circle(12);
		Rectangle rectangle = new Rectangle(21, 34);
		System.out.println(circle.area());
		System.out.println(circle.getRadius());
		circle.setRadius(20);
		System.out.println(circle.area());
		System.out.println(rectangle.area());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getLength());
		rectangle.setWidth(20);
		rectangle.setLength(20);
		System.out.println(rectangle.area());

		

	}

}
