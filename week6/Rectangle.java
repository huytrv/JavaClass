package week6;

import java.awt.*;

class Rectangle extends Shape{
	protected double width, length;
	public void paintComponent(Graphics g) {
		  g.drawRect(50, 50, 200, 100);
	  }
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width * length;
	}
	public double getPerimeter() {
		return 2 * (width + length);
	}
	public String toString() {
		return ("Rectangle:\nWidth: "+ getWidth() + "\nLength: " + getLength() + "\n\n");
	}
}