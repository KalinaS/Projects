package edu.pragmatic.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentListener;

class SumatorFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1l;
	
	private JTextField firstTextField;
	private JTextField secondTextField;
	private JLabel resultLabel;
	
	public SumatorFrame(){
		createUI();
	}
	
	private void createUI(){
		setTitle("Sumator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLayout(null);
		
		firstTextField = new JTextField();
		firstTextField.setBounds(10, 10, 40, 30);
		firstTextField.getDocument().addDocumentListener(new DocumentListener());
		getContentPane().add(firstTextField);
		
		secondTextField = new JTextField();
		secondTextField.setBounds(60, 10, 40, 30);
		getContentPane().add(secondTextField);
		
		JButton calcButton = new JButton("Calc");
		calcButton.setBounds(120, 10, 60, 30);
		calcButton.addActionListener((ActionListener) this);
		add(calcButton);
		
		JLabel label = new JLabel("Result: ");
		label.setBounds(10, 80, 100, 30);
		label.setForeground(Color.red);
		label.setBackground(Color.blue);
		add(label);
		
		resultLabel = new JLabel();
		resultLabel.setBounds(10, 120, 100, 30);
		add(label);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		calculateSum();
		
	}
	
	private void calculateSum(){
		String firstText = firstTextField.getText();
		String secondText = secondTextField.getText();
		
		try{
			int a = Integer.parseInt(firstText);
			int b = Integer.parseInt(secondText);
			
			int sum = (a + b);
			
			resultLabel.setText(firstText + " + " + secondText + " = " + sum);
		} catch(NumberFormatException e){
			System.err.println("Not a number");
			resultLabel.setText("Not a number");
		}
		
	}
}
