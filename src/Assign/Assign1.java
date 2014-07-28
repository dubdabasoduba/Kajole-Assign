/**
 * Program to promt user and draw a rectangle with user specification
 */
package Assign;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

class MyCanvas extends JComponent {

	public void paint(Graphics g) {
		Scanner user_input = new Scanner(System.in);
		int firstvalue, secondvalue;
		System.out.print("Please Enter Your first value");
		firstvalue = Integer.parseInt(user_input.next());

		System.out.print("Please enter your second value");
		secondvalue = Integer.parseInt(user_input.next());

		g.drawRect(10, 10, firstvalue, secondvalue);
	}
}

public class Assign1 extends JComponent {
	public static void main(String[] a) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 500, 500);
		window.getContentPane().add(new MyCanvas());
		window.setVisible(true);
	}
}
