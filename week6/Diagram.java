package week6;

import java.util.ArrayList;

public class Diagram {
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
}