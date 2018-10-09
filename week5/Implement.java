//package week5;

public class Implement {
	public static void main(String[] args) {
		Shape shape = new Shape("green", true);
		Circle circle = new Circle(5.25);
		Rectangle rectangle = new Rectangle(5.8, 6.2);
		Square square = new Square(5);
		//square.setLength(6);
		System.out.print(shape.toString()+ "\n\n");
		System.out.printf(circle.toString() + "\nArea: " + (double)Math.round(circle.getArea() * 100)/100 + "\nPerimeter: " + (double)Math.round(circle.getPerimeter() * 100)/100 + "\n\n");
		System.out.printf(rectangle.toString() + "\nArea: " + (double)Math.round(rectangle.getArea() * 100)/100 + "\nPerimeter: " + (double)Math.round(rectangle.getPerimeter() * 100)/100 + "\n\n");
		System.out.printf(square.toString() + "\nArea: " + (double)Math.round(square.getArea() * 100)/100 + "\nPerimeter: " + (double)Math.round(square.getPerimeter() * 100)/100);
	}
	
}
