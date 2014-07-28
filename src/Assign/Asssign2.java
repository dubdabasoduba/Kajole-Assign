package Assign;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Asssign2 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.drawLine(10, 10, 34, 70);
		g.drawRect(80, 10, 30, 80);
		g.drawOval(120, 10, 70, 70);
		g.drawArc(200, 10, 90, 90,40, 270);

		g.setColor(Color.blue);
		g.drawRect(80, 120, 30, 80);
		g.fillRect(80,120,30,80);
		g.drawOval(120, 120, 70, 70);
		g.fillOval(120,120,70,70);
		g.drawArc(200, 120, 90, 90,40, 270);
		g.fillArc(200,120,90,90,40,270);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("DrawRect");
		frame.setSize(1000, 700);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Container contentPane = frame.getContentPane();
		contentPane.add(new Asssign2());
		frame.show();
	}
}
