package week6;

public class Triangle extends Shape{
	protected double a, b, c;
	public Triangle() {};
	public Triangle(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	public Triangle( boolean fill, String color, String font, boolean isFilled, double a, double b, double c) {
		super(fill, color, font, isFilled);
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
	public double Perimeter() {
		return a+b+c;
	}
	public String toString() {
		return ("Triangle: " + "a=" + getA() + ", b=" + getB() + ", c=" + getC());
	}
}
