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



public class ShapePanel extends JPanel implements ActionListener{
	int count = 1;
	private JLabel label;
	private JFrame frame;
	
	public ShapePanel() {
		frame = new JFrame("Display a rectangle");
		label = new JLabel("number of clicks: 0");
		JButton button = new JButton("Click Me");
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		this.add(button);
		this.add(label);
		frame.setSize(360, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(131, 21, 1));//
		g2d.fillRect(250, 195, 90, 60);//
	} 
	
	public static void main(String[] args) {
		new ShapePanel();
			
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}
	
	
}
