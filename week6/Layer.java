package week6;

public class Layer extends Diagram{
	protected String font;
	public Layer() {};
	public Layer(boolean fill, String color, String font) {
		super(fill, color);
		setFont(font);
	}
	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	public static void layerDelTriangle() {
		Layer layer = new Layer();
		if(layer instanceof Triangle) {
			layer = null;
		}
	}
	public static void main(String[] args) {
		Triangle tri = new Triangle(3, 4, 5);
		Layer layer = new Layer();
		tri = (Triangle) layer;
		layerDelTriangle();
		System.out.print(tri.toString() + "\nPerimeter: " + tri.Perimeter());
	}
}
