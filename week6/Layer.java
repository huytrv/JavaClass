package week6;

import java.util.*;

@SuppressWarnings("serial")
public class Layer extends Diagram{
	protected boolean visible;
	//them visible
	public boolean isvisible() {
		return visible;
	}
	public void setvisible(boolean visible) {
		this.visible = visible;
	}

	protected ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	public void add(Shape shape) {
		shapeList.add(shape);
	}
	public Shape get(int i) {
		return shapeList.get(i);
	}
	public int getsize() {
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
	//xoa cac hinh giong nhau
	public void delSameShape() {
		for(int i=0; i<shapeList.size(); i++) {		
				if (shapeList.get(i) instanceof Circle) {
					Circle circle1 = (Circle) shapeList.get(i);
					for(int j=i+1; j<shapeList.size(); j++) {						
						if(shapeList.get(j) instanceof Circle) {
							Circle circle2 = (Circle) shapeList.get(j);
							if (circle1.getRadius() == circle2.getRadius()){
								shapeList.remove(j);
							}
						}
					}
				}	
				if (shapeList.get(i) instanceof Triangle) {
					Triangle triangle1 = (Triangle) shapeList.get(i);
					for(int j=i+1; j<shapeList.size(); j++) {						
						if(shapeList.get(j) instanceof Triangle) {
							Triangle triangle2 = (Triangle) shapeList.get(j);
							if (triangle1.getEdge1() == triangle2.getEdge1() && triangle1.getEdge2() == triangle2.getEdge2() && triangle1.getEdge3() == triangle2.getEdge3()){
								shapeList.remove(j);
							}
						}
					}
				}		
				if (shapeList.get(i) instanceof Rectangle) {
					Rectangle rectangle1 = (Rectangle) shapeList.get(i);
					for(int j=i+1; j<shapeList.size(); j++) {						
						if(shapeList.get(j) instanceof Rectangle) {
							Rectangle rectangle2 = (Rectangle) shapeList.get(j);
							if (rectangle1.getwidth() == rectangle2.getwidth() && rectangle1.getlength() == rectangle2.getlength()){
								shapeList.remove(j);
							}
						}
					}
				}		
				if (shapeList.get(i) instanceof Square) {
					Square square1 = (Square) shapeList.get(i);
					for(int j=i+1; j<shapeList.size(); j++) {						
						if(shapeList.get(j) instanceof Square) {
							Square square2 = (Square) shapeList.get(j);
							if (square1.getSide() == square2.getSide()){
								shapeList.remove(j);
							}
						}
					}
				}		
		}
	}
    //chuyen tung loai hinh ve vao tung doi tuong layer
	public void shapeByLayer() {
		
		for(int i=0; i<shapeList.size(); i++) {
			if(shapeList.get(i) instanceof Square) {
				squareLayer.add(shapeList.get(i));
			}
		}
		for(int i=0; i<shapeList.size(); i++) {
			if(shapeList.get(i) instanceof Circle) {
				circleLayer.add(shapeList.get(i));
			}
		}
		for(int i=0; i<shapeList.size(); i++) {
			if(shapeList.get(i) instanceof Rectangle) {
				rectangleLayer.add(shapeList.get(i));
			}
		}
		for(int i=0; i<shapeList.size(); i++) {
			if(shapeList.get(i) instanceof Triangle) {
				triangleLayer.add(shapeList.get(i));
			}
		}
	}
}
