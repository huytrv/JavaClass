package week6;

import java.awt.*;

@SuppressWarnings("serial")
public class Triangle extends Shape{

	public void paintComponent(Graphics g) {
		  int xPoly[] = {getAx(), getBx(), getCx()};
	      int yPoly[] = {getAy(), getBy(), getCy()};

	      Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
	      g.setColor(Color.GRAY);
		  g.drawPolygon(poly);
	  }
	protected int ax, ay, bx, by, cx, cy;
	public Triangle() {};
	public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
		setAx(ax);
		setAy(ay);
		setBx(bx);
		setBx(by);
		setCx(cx);
		setCy(cy);
	}

	public int getAx() {
		return ax;
	}
	public void setAx(int ax) {
		this.ax = ax;
	}
	public int getAy() {
		return ay;
	}
	public void setAy(int ay) {
		this.ay = ay;
	}
	public int getBx() {
		return bx;
	}
	public void setBx(int bx) {
		this.bx = bx;
	}
	public int getBy() {
		return by;
	}
	public void setBy(int by) {
		this.by = by;
	}
	public int getCx() {
		return cx;
	}
	public void setCx(int cx) {
		this.cx = cx;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int cy) {
		this.cy = cy;
	}
	public double getEdge1() {
		return Math.sqrt(Math.pow((bx - ax ), 2) + Math.pow((by - ay ), 2));
	}
	public double getEdge2() {
		return Math.sqrt(Math.pow((bx - cx ), 2) + Math.pow((by - cy ), 2));
	}
	public double getEdge3() {
		return Math.sqrt(Math.pow((cx - ax ), 2) + Math.pow((cy - ay ), 2));
	}
	public String toString() {
		return ("Triangle: " + "ax=" + getAx() + ", ay=" + getAy() + ", bx=" + getBx() + ", by=" + getBy() + ", cx=" + getCx() + ", cy=" + getCy() +"\n\n");
	}
	public double getArea() {
		return 0;
	}
	public double getPerimeter() {
		return 0;
	}

}