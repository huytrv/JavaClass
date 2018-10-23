package week6;

import java.awt.*;

@SuppressWarnings("serial")
class Rectangle extends Shape{
	protected int width, length;
    // draw the rectangle
	@Override
	protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      g.setColor(Color.RED);
	      g.drawRect(50, 50, getwidth(), getlength());
	      //String s = String.valueOf(getArea()) + "m2";
	      //g.drawString(s, 120, 90);
	}
	public Rectangle(int width, int length) {
		setwidth(width);
		setlength(length);
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length = length;
	}
	@Override
	public double getArea() {
		return width * length;
	}
	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}
	@Override
	public String toString() {
		return ("Rectangle:\nWidth: "+ getwidth() + "\nLength: " + getlength() + "\n\n");
	}
}