package week6;

import java.awt.*;

@SuppressWarnings("serial")
class Square extends Shape{
	protected int side;
	
	public void paintComponent(Graphics g) {
		  super.paintComponent(g);
		  g.setColor(Color.GREEN);
		  g.drawRect(80, 50, getSide(), getSide());
		  //String s = String.valueOf(getArea()) + "m2";
		  //g.drawString(s, 100, 100);
	}
	
	public Square(int side) {
		setSide(side);
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
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