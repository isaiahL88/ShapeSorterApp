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
	
	public ShapePanel() {
	}
	
	private List<Shape> createShapes(){
		List<Shape> shapeList = new ArrayList<Shape>();
		
		Color myColor1 = new Color(231, 151, 44);
		Shape s1 = ShapeFactory.getShapeInstance("Rectangle", 50, 150, 44, 48, myColor1);
		shapeList.add(s1);
		
		Color myColor2 = new Color(131, 151, 44);
		Shape s2= ShapeFactory.getShapeInstance("Rectangle", 150, 150, 72, 45, myColor2);
		shapeList.add(s2);
		
		return shapeList;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		List<Shape> shapes = createShapes();
		for (Shape s: shapes) {
			g2d.setColor(s.getShapeColor());
	    	s.drawShape(g2d);
		}
	} 
	
	public static void main(String[] args) {
		ShapePanel panel = new ShapePanel();
		JFrame frame = new JFrame("Display a rectangle");
		JLabel label = new JLabel("number of clicks: 0");
		JButton button = new JButton("");
		button.addActionListener(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(label);
		frame.setSize(360, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {

	}
	
	
}
