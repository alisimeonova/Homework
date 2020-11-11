package edu.school;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Event_GUI {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 200, 700, 700);
		window.setLayout(null);
		
		JLabel lblMonday = new JLabel("Mon");
		lblMonday.setBounds(10, 10, 80, 30);
		window.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tue");
		lblTuesday.setBounds(120, 10, 80, 30);
		window.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wed");
		lblWednesday.setBounds(230, 10, 80, 30);
		window.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thu");
		lblThursday.setBounds(340, 10, 80, 30);
		window.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Fri");
		lblFriday.setBounds(450, 10, 80, 30);
		window.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Sat");
		lblSaturday.setBounds(560, 10, 80, 30);
		window.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sun");
		lblSunday.setBounds(670, 10, 80, 30);
		window.add(lblSunday);
		
		JPanel[] days = new JPanel[31];
		
		for(int i = 0; i<days.length; i++) {
			days[i] = new JPanel();
			int lengthX = 100;
			int lengthY = 40;
			days[i].setBounds(lengthX, lengthY, 80, 30);
			if(lengthX >= 670) {
				lengthX = 0;
				lengthY += 50;
			}
			if(lengthX < 560) {
				days[i].setBackground(Color.gray);
			}
			else {
				days[i].setBackground(Color.red);
			}
			window.add(days[i]);
		}
		
		window.setVisible(true);
		
	}

}
