package week6;

import java.awt.*;

class Square extends Shape{
	public void paintComponent(Graphics g) {
		  g.drawRect(80, 50, 100, 100);
	  }
	protected double side;
	public Square() {
		setSide(1.0);
	}
	public Square(double side) {
		setSide(side);
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea() {
		return side * side;
	}
	public double getPerimeter() {
		return 2 * side;
	}
	public String toString() {
		return ("Square:\nside: "+ getSide() + "\n\n");
	}
}