//có 3 quan hệ thừa kế (is-a). Circle có thể thừa kế Shape mà không phải Rectangle vì Circle là 1 Shape, kế thừa những thuộc tính và hành vi của Shape và không với Rectangle
//có nên để PI là final

package week5;

public class Shape {
	protected String color = "red";
	protected boolean filled = true;
	public Shape() {}
	public Shape(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Shape:\nColor: " + getColor() + "\nFilled: " + isFilled() ;
	}
}
