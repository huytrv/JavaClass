package week6;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class Diagram extends JPanel{
	protected static Layer squareLayer = new Layer();
	protected static Layer triangleLayer = new Layer();
	protected static Layer circleLayer = new Layer();
	protected static Layer rectangleLayer = new Layer();
	private static final long serialVersionUID = 1L;
	private ArrayList<Layer> layerList = new ArrayList<Layer>();
	public void add(Layer layer) {
		layerList.add(layer);
	}
	public Layer get(int i) {
		return layerList.get(i);
	}
	public void deleteCircle() {
		for(int i=0; i<layerList.size(); i++) {
			layerList.get(i).delCircle();
		}
	}
	public static void main(String[] args) {
	      SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	  Diagram diagram = new Diagram();	       
	        	  Layer layer = new Layer();
	        	  diagram.add(layer);
	        	  JFrame f = new JFrame();
	        	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	  f.setLayout(new GridLayout(3, 2));
	        	  Rectangle rectangle = new Rectangle(200, 80);
	        	  Rectangle rectangle2 = new Rectangle(100, 80);
		  	      Circle circle = new Circle(100);
		  	      Square square = new Square(100);
		  	      Triangle triangle = new Triangle(250, 150, 100, 100, 180, 50);
		  	      Hexagon hexagon = new Hexagon();
		  	      layer.add(rectangle);
		  	      layer.add(circle);
		  	      layer.add(rectangle2);
		  	      layer.add(square);
		  	      layer.add(triangle);
		  	      layer.add(triangle);
		  	      layer.add(square);
		  	      layer.add(hexagon);
		  	      //xoa ca hinh giong nhau
		  	      layer.delSameShape();
		  	      //chuyen tung loai hinh ve vao tung doi tuong layer
		  	      layer.shapeByLayer();
		  	      layer.setvisible(true);    
			      f.setSize(800, 600);
			      //vi du ve chuyen tung loai shape vao layer
		  	      for(int i=0; i<circleLayer.getsize(); i++) {
		  	    	    //System.out.print(layer.get(i));
		  	    		System.out.print(circleLayer.get(i));		  	    		 
		  	      }
			  	  for(int i=0; i<rectangleLayer.getsize(); i++) {
		  	    	   //System.out.print(layer.get(i));
		  	    	   System.out.print(rectangleLayer.get(i));		  	    		 
			  	  }
			  	  //them cac doi tuong hinh vao so do
		  	      for(int i=0; i<layer.getsize(); i++) {
		  	    	  f.getContentPane().add(layer.get(i)); 
		  	      }
			      f.setVisible(layer.isvisible());
	         }
	      });
	   }

}