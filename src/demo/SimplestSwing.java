package demo;

import java.awt.Component;
import java.awt.Container;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimplestSwing {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Simplest Swing");
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
//		frame.setBounds(50, 50, 200, 200);
		
		Container contentPane = frame.getContentPane();
		
		JButton closeButton = new JButton("Close");
		JButton helpButton = new JButton("Help");
		
		contentPane.add(closeButton);
//		contentPane.add(helpButton);
		
//		frame.setSize(300, 200);
//		
//		frame.setLocationRelativeTo(null);
		
		frame.pack();
		
		frame.setVisible(true);
		
		Component[] comps = contentPane.getComponents();
		System.out.println("Content Pane has " + comps.length + " components.");
		
		Point point = new Point(20, 40);
		
		double x = point.getX();
		double y = point.getY();
		System.out.println(x + "..." + y);
	}
}
