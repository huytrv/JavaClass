package week6;

import java.awt.*;

class Triangle extends Shape{

	public void paintComponent(Graphics g) {
		  int xPoly[] = {100,180,30};
	      int yPoly[] = {100,180,180};

	      Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
		  g.drawPolygon(poly);
	  }
	protected double a, b, c;
	public Triangle() {};
	public Triangle(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getPerimeter() {
		return a+b+c;
	}
	public String toString() {
		return ("Triangle: " + "a=" + getA() + ", b=" + getB() + ", c=" + getC() + "\n\n");
	}
	public double getArea() {
		return 0;
	}

}