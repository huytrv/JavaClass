package week6;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class Diagram extends JPanel{
	
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
	        	  Rectangle rectangle = new Rectangle(200, 80);
		  	      Circle circle = new Circle(100);
		  	      Square square = new Square(100);
		  	      Triangle triangle = new Triangle(250, 150, 100, 100, 180, 50);
		  	      layer.add(rectangle);
		  	      layer.add(circle);
		  	      layer.add(rectangle);
		  	      layer.add(square);
		  	      layer.add(triangle);
		  	      layer.add(triangle);
		  	      layer.add(circle);
		  	      layer.add(square);
		  	      layer.delSameShape();
		  	      layer.setvisible(true);
		  	      JFrame f = new JFrame();
			      f.setSize(600, 400);
		  	      f.setLayout(new GridLayout(2, 2));
		  	      for(int i=0; i<layer.getsize(); i++) {
		  	    	 System.out.print(layer.get(i));
		  	    	  f.getContentPane().add(layer.get(i));
		  	      }
			      f.setVisible(layer.isvisible());
	         }
	      });
	   }
}