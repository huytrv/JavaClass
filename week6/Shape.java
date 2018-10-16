package week6;

public class Shape extends Layer{
	protected boolean isFilled;
	public Shape() {};
	public Shape(boolean fill, String color, String font, boolean isFilled) {
		super(fill, color, font);
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
}
