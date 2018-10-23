package week6;

import java.awt.*;

@SuppressWarnings("serial")
class Circle extends Shape{
	protected int radius;
	protected final double PI = 3.14;
	public void paintComponent(Graphics g) {
		  super.paintComponent(g);
		  g.setColor(Color.BLUE);
		  g.drawOval(100, 30, getRadius(), getRadius());
		  //String s = String.valueOf(getArea() +"m2");
		  //g.drawString(s, 120, 80);
	}
	public Circle(int radius) {
		setRadius(radius);
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
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
	}

}