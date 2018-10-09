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
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public void setLength(double length){
		super.setLength(length);
		this.side = length;
	}
	@Override
	public void setWidth(double width){
		super.setWidth(width);
		this.side = width;
	}
	public double getArea() {
		return side * side;
	}
	public double getPerimeter() {
		return 4 * side;
	}
	public String toString() {
		return ("Square:\nside: "+ getSide());
	}
}
