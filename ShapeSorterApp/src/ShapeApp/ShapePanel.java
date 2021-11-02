package ShapeApp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.List;
import java.util.ArrayList;

public class ShapePanel extends JPanel implements ActionListener{
	private List<Shape> shapes;
	private JButton loadShapes;
	private JButton sortShapes;
	
	public ShapePanel() {
		shapes = new ArrayList<Shape>();
		this.loadShapes = new JButton("Load Shapes");
		this.sortShapes = new JButton("Sort Shapes");
		this.loadShapes.addActionListener(this);
		this.sortShapes.addActionListener(this);
		this.add(this.loadShapes);
		this.add(this.sortShapes);
	}
	
	private List<Shape> createShapes(){
		List<Shape> shapeList = new ArrayList<Shape>();
		
		Color myColor3 = new Color(131, 121, 44);
		Shape s3= ShapeFactory.getShapeInstance("Rectangle", 150, 150, 80, 80, myColor3);
		shapeList.add(s3);
		
		Color myColor1 = new Color(231, 151, 44);
		Shape s1 = ShapeFactory.getShapeInstance("Rectangle", 50, 150, 44, 48, myColor1);
		shapeList.add(s1);
		
		Color myColor4 = new Color(30, 40, 100);
		Shape s4 = ShapeFactory.getShapeInstance("Circle", 50, 30, 50, 50, myColor4);
		shapeList.add(s4);
		
		Color myColor5 = new Color(22,8,200);
		Shape s5 = ShapeFactory.getShapeInstance("Square", 50, 50, 50, 50, myColor5);
		shapeList.add(s5);
		
		Color myColor6 = new Color(200, 3, 2);
		Shape s6 = ShapeFactory.getShapeInstance("Circle", 50, 50, 80, 80, myColor6);
		shapeList.add(s6);
		
		Color myColor2 = new Color(131, 151, 44);
		Shape s2= ShapeFactory.getShapeInstance("Rectangle", 150, 150, 72, 45, myColor2);
		shapeList.add(s2);
		
		
		return shapeList;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
				
		int x = 0;
		int y = 50;
		for (Shape s: this.shapes) {
			g2d.setColor(s.getShapeColor());
			
	    	s.drawShape(g2d, x, y);
	    	x += 20 + s.getWidth();
		}
	} 
	
	public static void main(String[] args) {
		ShapePanel panel = new ShapePanel();
		JFrame frame = new JFrame("Display a rectangle");
		JLabel label = new JLabel("number of clicks: 0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.loadShapes) {
			this.shapes = createShapes();
			repaint();
		}else if(e.getSource() == this.sortShapes) {
			this.shapes = SortingTechnique.sortShapes(this.shapes);
			repaint();
		}
	}
	
	
}
