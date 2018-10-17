package week6;

import java.util.*;

public class Layer extends Diagram{
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	public void add(Shape shape) {
		shapeList.add(shape);
	}
	public Shape get(int i) {
		return shapeList.get(i);
	}
	public int size() {
		return shapeList.size();
	}
	public void delTriangle() {
		for(int i=0; i<shapeList.size(); i++) {
			Layer triangle = shapeList.get(i);
			if (triangle instanceof Triangle)
				shapeList.remove(i);
		}
	}
	public void delCircle() {
		for(int i=0; i<shapeList.size(); i++) {
			Layer circle = shapeList.get(i);
			if (circle instanceof Circle)
				shapeList.remove(i);
		}
	}
}
