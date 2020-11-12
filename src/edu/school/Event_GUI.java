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
		lblTuesday.setBounds(100, 10, 80, 30);
		window.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wed");
		lblWednesday.setBounds(190, 10, 80, 30);
		window.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thu");
		lblThursday.setBounds(280, 10, 80, 30);
		window.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Fri");
		lblFriday.setBounds(370, 10, 80, 30);
		window.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Sat");
		lblSaturday.setBounds(460, 10, 80, 30);
		window.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sun");
		lblSunday.setBounds(550, 10, 80, 30);
		window.add(lblSunday);
		
		JPanel[] days = new JPanel[31];
		int lengthX = 0;
		int lengthY = 0;
		int counterWeekends = 5;
		
		for(int i = 0; i<days.length; i++) {
			days[i] = new JPanel();
			if(i%7 == 0) {
				lengthX = 0;
				lengthY += 50;
			}
			else {
				lengthX += 90;
			}
			days[i].setBounds(lengthX, lengthY, 80, 30);
			if(i == counterWeekends) {
				days[i].setBackground(Color.red);
				counterWeekends += 1;
				if(counterWeekends%7 == 0) {
					counterWeekends += 5;
				}
			}
			else {
				days[i].setBackground(Color.gray);
			}
			window.add(days[i]);
		}
		
		window.setVisible(true);
		
	}

}
