package edu.pragmatic.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Demo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hello swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500, 300, 300, 300);
		frame.setLayout(null);
		
		JButton button = new JButton("OK");
		//frame.getContentPane().add(button);
		button.setBounds(210, 200, 60, 60);
		button.getModel().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");
				
			}
			
		});
		frame.add(button);
		
		frame.setVisible(true);
	}
	
}
