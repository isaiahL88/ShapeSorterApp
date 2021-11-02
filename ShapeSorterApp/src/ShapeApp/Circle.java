package ShapeApp;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
	public Circle(int upperX, int upperY, int height, int width, Color color) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.height = height;
		this.width = width;
		this.shapeColor = color;
	}
	
	public void drawShape(Graphics form, int upperXNew, int upperYNew) {
		form.fillOval(upperXNew, upperYNew, width, height);
	}
	
	public int compareTo(Shape s){
		return (this.width*this.height) - (s.getWidth() * s.getHeight());
	}
}
