package ShapeApp;

import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Shape {
	
	public Rectangle(int upperX, int upperY, int height, int width, Color color) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.height = height;
		this.width = width;
		this.shapeColor = color;
	}
	public void drawShape(Graphics form, int upperXNew, int upperYNew) {
		form.fillRect(upperXNew, upperYNew, width, height);
	}
	public int compareTo(Shape s){
		return (this.width*this.height) - (s.getWidth() * s.getHeight());
	}
}
