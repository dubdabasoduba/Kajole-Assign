package Assign;

import java.applet.Applet;
import java.awt.*;

public class Assign2Applet extends Applet {
	public void paint (Graphics g) {
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
}
