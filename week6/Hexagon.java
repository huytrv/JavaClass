package week6;

import java.awt.*;


public class Hexagon extends Shape{

	private static final long serialVersionUID = 1L;

	public Hexagon(){
        setPreferredSize(new Dimension(200, 200));
    }

    public void paintComponent(Graphics g){
        Polygon p = new Polygon();
        for (int i = 0; i < 6; i++)
            p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 6)), (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 6)));        
        g.drawPolygon(p);    
    }

	public double getArea() {	
		return 0;
	}

	public double getPerimeter() {
		return 0;
	}

	public String toString() {
		return "Hexagon\n\n";
	}

}