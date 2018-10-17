package week6;

public class Implement {
	public static void main(String[] a) {
		Diagram diagram = new Diagram();
		Layer layer = new Layer();
		diagram.add(layer);
		Triangle triangle = new Triangle(3, 4, 5);
		Square square = new Square(5);
		Circle circle = new Circle(6);
		Rectangle rectangle = new Rectangle(8, 5);
		layer.add(triangle);
		layer.add(square);
		layer.add(circle);
		layer.add(rectangle);
		layer.delTriangle();
		diagram.deleteCircle();
		for (int i=0; i<layer.size(); i++) {
			System.out.print(layer.get(i).toString());
		}
	}
}
