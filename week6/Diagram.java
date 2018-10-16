package week6;

public class Diagram {
	protected boolean fill;
	protected String color;
	public Diagram() {};
	public Diagram(boolean fill, String color) {
		setFill(fill);
		setColor(color);
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void diagramDelCircle() {
		Diagram diaCircle = new Diagram();
		if (diaCircle instanceof Triangle) {
			diaCircle = null;
		}
	}
}
