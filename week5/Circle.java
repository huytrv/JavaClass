package week5;

public class Circle extends Shape{
	final double PI = 3.14;
	protected double radius = 1.0;
	public Circle() {
		setRadius(1.0);
	}
	public Circle(double radius) {
		setRadius(radius);
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * radius*radius;
	}
	public double getPerimeter() {
		return 2 * PI * radius;
	}
	public String toString() {
		return ("Circle: \nRadius: " + getRadius()); 
	}
}
