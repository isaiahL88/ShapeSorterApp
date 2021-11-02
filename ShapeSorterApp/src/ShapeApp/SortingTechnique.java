package ShapeApp;

import java.util.List;
import java.util.ArrayList;

public class SortingTechnique {
	public static List<Shape> sortShapes(List<Shape> shapes){
		ArrayList<Shape> s1 = new ArrayList<Shape>();
		ArrayList<Shape> s2 = new ArrayList<Shape>();
		ArrayList<Shape> s3 = new ArrayList<Shape>();
		ArrayList<Shape> newShapes = new ArrayList<Shape>();
		
		if(shapes.size() <= 1) {
			return shapes;
		}
		
		int pivot = shapes.size() / 2;
		Shape pShape = shapes.get(pivot);
		for(Shape s: shapes) {
			if(s.compareTo(pShape) > 0) {
				s3.add(s);
			} else if(s.compareTo(pShape) < 0) {
				s1.add(s);
			} else {
				s2.add(s);
			}
		}
		
		for(Shape s: sortShapes(s1)) {
			newShapes.add(s);
		}
		for(Shape s: s2) {
			newShapes.add(s);
		}
		for(Shape s: sortShapes(s3)) {
			newShapes.add(s);
		}
		
		return newShapes;
	}
}
