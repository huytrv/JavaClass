package week5;

public class Rectangle extends Shape{
	protected double width = 1.0, length = 1.0;
	public Rectangle() {
		setWidth(1.0);
		setLength(1.0);
	}
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
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
		return ("Rectangle:\nWidth: "+ getWidth() + "\nLength: " + getLength());
	}
}
