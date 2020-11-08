package edu.school;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event_GUI {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 200, 500, 500);
		window.setLayout(null);
		
		JLabel lblMonday = new JLabel("Mon");
		lblMonday.setBounds(10, 10, 80, 30);
		window.add(lblMonday);
		
		JLabel tuesday = new JLabel("Tue");
		tuesday.setBounds(120, 10, 80, 30);
		window.add(tuesday);
		
		window.setVisible(true);
		
	}

}
