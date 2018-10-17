package week6;

import java.awt.*;

class Circle extends Shape{
	protected double radius;
	protected final double PI = 3.14;
	public void paintComponent(Graphics g) {
		  g.drawOval(80, 80, 100, 100);
	}
	public Circle() {
		setRadius(1.0);
	}
	public Circle(double radius) {
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
		return ("Circle: \nRadius: " + getRadius() + "\n\n"); 
	}}