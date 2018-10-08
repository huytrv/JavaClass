package week5;

public class Square extends Rectangle{
	protected double side;
	public Square() {
		setSide(1.0);
	}
	public Square(double side) {
		setSide(side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
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
		return ("Square:\nside: "+ getSide());
	}
}
