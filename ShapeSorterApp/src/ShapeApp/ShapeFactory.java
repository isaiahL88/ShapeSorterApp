package ShapeApp;

import java.awt.Color;

public class ShapeFactory {
	public static Shape getShapeInstance(String shape, int upperX, int upperY, int height, int width, Color color) {
		Shape newShape;
		if(shape.equals("Rectangle")) {
			newShape = new Rectangle(upperX, upperY, height, width, color);
			return newShape;
		}else if(shape.equals("Square") && height == width){
			return new Square(upperX, upperY, height, width, color);
		}else if(shape.equals("Circle") && height == width) {
			return new Circle(upperX, upperY, height, width, color);
		}else {
			return null;
		}
	}
}
