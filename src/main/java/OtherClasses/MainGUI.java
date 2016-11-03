package OtherClasses;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;

import OtherClasses.*;

import javax.swing.JButton;
import static java.lang.Math.*;
import java.awt.Font;
import javax.swing.SwingConstants;
public class MainGUI {

	
	//public class MainGUI extends JFrame implements ActionListener{
	
	private JTextField textField;
	private AdvancedCalculator advancedCalculator = new AdvancedCalculator();
	private BasicCalculator basicCalculator = new BasicCalculator();
	Scanner scanner = new Scanner(System.in);
	
	double firstNumber = 0.0;
	double secondNumber = 0.0;
	double result = 0.0;
	String operations = "";
	String answer = "";
	
	
	
	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.Calculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private JFrame Calculator;
	JButton number0 = new JButton("0");
	JButton number1 = new JButton("1");
	JButton number2 = new JButton("2");
	JButton number3 = new JButton("3");
	JButton number4 = new JButton("4");
	JButton number5 = new JButton("5");
	JButton number6 = new JButton("6");
	JButton number7 = new JButton("7");
	JButton number8 = new JButton("8");
	JButton number9 = new JButton("9");
	
	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnMulty = new JButton("*");
	JButton btnDiv = new JButton("/");

	JButton btnAbs = new JButton("ABS");
	JButton btnPi = new JButton("PI");
	JButton btnMin = new JButton("MIN");
	JButton btnMax = new JButton("MAX");
	JButton btnRound = new JButton("ROUND");
	JButton btnFloor = new JButton("FLOOR");
	
	JButton btnDot = new JButton(".");
	JButton btnResult = new JButton("=");
	JButton btnPlusMinus = new JButton("+/-");
	JButton btnProcent = new JButton("%");
	JButton btnC = new JButton("C");
	
	ActionListener actionListener = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			buttonPressed(e);
		}
	};
	private final JTextField textField_1 = new JTextField();
	



	public MainGUI() {
		initialize();
		addComponentsToFrame();
		addActionListerners();
	}
	
	private void initialize() {
		textField_1.setBounds(174, 13, 138, 43);
		textField_1.setColumns(10);
		Calculator = new JFrame();
		Calculator.setBackground(new Color(255, 255, 204));
		Calculator.getContentPane().setBackground(new Color(72, 209, 204));

		Calculator.setTitle("Calculator");
		Calculator.setBounds(100, 100, 640, 495);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculator.getContentPane().setLayout(null);
		
		
		number0.setBounds(12, 362, 150, 75);
		btnDot.setBounds(162, 362, 75, 75);
		btnResult.setBounds(237,362,75,75);
		
		number1.setBounds(12, 287, 75, 75);
		number2.setBounds(87, 287, 75, 75);
		number3.setBounds(162, 287, 75, 75);
		btnDiv.setBounds(237, 287, 75, 75);
		
		number4.setBounds(12, 212, 75, 75);
		number5.setBounds(87, 212, 75, 75);
		number6.setBounds(162, 212, 75, 75);
		btnMulty.setBounds(237, 212, 75, 75);
		
		number7.setBounds(12, 137, 75, 75);
		number8.setBounds(87, 137, 75, 75);
		number9.setBounds(162, 137, 75, 75);
		btnSub.setBounds(237, 137, 75, 75);
		
		btnC.setBounds(12, 62, 75, 75);
		btnProcent.setBounds(87, 62, 75, 75);
		btnPlusMinus.setBounds(162, 62, 75, 75);
		btnAdd.setBounds(237, 62, 75, 75);
		
		btnAbs.setBounds(315, 62, 130, 75);
		btnPi.setBounds(480, 62, 130, 75);
		btnMin.setBounds(315, 175, 130, 75);
		btnMax.setBounds(480, 175, 130, 75);
		btnRound.setBounds(315, 287, 130, 75);
		btnFloor.setBounds(480, 287, 130, 75);
		
		
		number0.setFont(new Font("Tahoma", Font.BOLD, 25));
		number1.setFont(new Font("Tahoma", Font.BOLD, 25));
		number2.setFont(new Font("Tahoma", Font.BOLD, 25));
		number3.setFont(new Font("Tahoma", Font.BOLD, 25));
		number4.setFont(new Font("Tahoma", Font.BOLD, 25));
		number5.setFont(new Font("Tahoma", Font.BOLD, 25));
		number6.setFont(new Font("Tahoma", Font.BOLD, 25));
		number7.setFont(new Font("Tahoma", Font.BOLD, 25));
		number8.setFont(new Font("Tahoma", Font.BOLD, 25));
		number9.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMulty.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnAbs.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMax.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRound.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFloor.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnProcent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(12, 13, 138, 43);
		Calculator.getContentPane().add(textField);
		textField.setColumns(10);
	}
		public void addComponentsToFrame() {
			Calculator.getContentPane().add(number0);
			Calculator.getContentPane().add(number1);
			Calculator.getContentPane().add(number2);
			Calculator.getContentPane().add(number3);
			Calculator.getContentPane().add(number4);
			Calculator.getContentPane().add(number5);
			Calculator.getContentPane().add(number6);
			Calculator.getContentPane().add(number7);
			Calculator.getContentPane().add(number8);
			Calculator.getContentPane().add(number9);
			
			Calculator.getContentPane().add(btnAdd);
			Calculator.getContentPane().add(btnSub);
			Calculator.getContentPane().add(btnMulty);
			Calculator.getContentPane().add(btnDiv);
			
			Calculator.getContentPane().add(btnAbs);
			Calculator.getContentPane().add(btnPi);
			Calculator.getContentPane().add(btnMin);
			Calculator.getContentPane().add(btnMax);
			Calculator.getContentPane().add(btnRound);
			Calculator.getContentPane().add(btnFloor);
			
			Calculator.getContentPane().add(btnDot);
			Calculator.getContentPane().add(btnResult);
			Calculator.getContentPane().add(btnPlusMinus);
			Calculator.getContentPane().add(btnProcent);
			Calculator.getContentPane().add(btnC);
			
			Calculator.getContentPane().add(textField_1);
		}
			public void addActionListerners() {
				number0.addActionListener(actionListener);
				number1.addActionListener(actionListener);
				number2.addActionListener(actionListener);
				number3.addActionListener(actionListener);
				number4.addActionListener(actionListener);
				number5.addActionListener(actionListener);
				number6.addActionListener(actionListener);
				number7.addActionListener(actionListener);
				number8.addActionListener(actionListener);
				number9.addActionListener(actionListener);
				
				btnAdd.addActionListener(actionListener);
				btnSub.addActionListener(actionListener);
				btnMulty.addActionListener(actionListener);
				btnDiv.addActionListener(actionListener);

				btnAbs.addActionListener(actionListener);
				btnPi.addActionListener(actionListener);
				btnMin.addActionListener(actionListener);
				btnMax.addActionListener(actionListener);
				btnRound.addActionListener(actionListener);
				btnFloor.addActionListener(actionListener);
				
				btnDot.addActionListener(actionListener);
				btnResult.addActionListener(actionListener);
				btnPlusMinus.addActionListener(actionListener);
				btnProcent.addActionListener(actionListener);
				btnC.addActionListener(actionListener);
}
		public void buttonPressed(ActionEvent arg0) {
			try{	
				if (arg0.getSource() == number0){
					String EnterNumber = textField.getText()+ number0.getText();
					textField.setText(EnterNumber);
					
				}
				if (arg0.getSource() == number1){
					String EnterNumber = textField.getText()+ number1.getText();
					textField.setText(EnterNumber);
				}		
				if (arg0.getSource() == number2) {
					String EnterNumber = textField.getText()+ number2.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == number3) {
					String EnterNumber = textField.getText()+ number3.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == number4) {
					String EnterNumber = textField.getText()+ number4.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == number5) {
					String EnterNumber = textField.getText()+ number5.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == number6) {
					String EnterNumber = textField.getText()+ number6.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == number7) {
					String EnterNumber = textField.getText()+ number7.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == number8) {
					String EnterNumber = textField.getText()+ number8.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == number9) {
					String EnterNumber = textField.getText()+ number9.getText();
					textField.setText(EnterNumber);
				}	
					
				
				
				
				if (arg0.getSource() == btnResult) {
				
					
					if (arg0.getSource()==btnAdd) {
					/*firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "+";*/
					//result = firstNumber+secondNumber;
					//textField.setText(Double.toString(basicCalculator.add(firstNumber, secondNumber)));



					//textField.setText(Double.toString((basicCalculator.add(getFirstNumber(), getSecondNumber())))); 
						
						double result = basicCalculator.add(gett(), getValueFromTextField2());
						lblResult.setText("Result: "+result);	
						
				}	
				if (arg0.getSource() == btnSub) {
					/*firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "-";*/
					//basicCalculator.subtract(firstNumber, secondNumber);
					textField.setText(Double.toString((basicCalculator.subtract(getFirstNumber(), getSecondNumber())))); 
				}	
				if (arg0.getSource() == btnMulty) {
					/*firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "*";*/
					//basicCalculator.multiply(firstNumber, secondNumber);
					textField.setText(Double.toString((basicCalculator.multiply(getFirstNumber(), getSecondNumber())))); 

				}	
				if (arg0.getSource() == btnDiv) {
					/*firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "/";*/
					//basicCalculator.divide(firstNumber, secondNumber);	
					textField.setText(Double.toString((basicCalculator.divide(getFirstNumber(), getSecondNumber())))); 
				}
				
				}
				
				
				
				if (arg0.getSource() == btnAbs){
					advancedCalculator.myABS(firstNumber);
				}
				if (arg0.getSource() == btnPi){
					advancedCalculator.myABS(firstNumber);
				}
				if (arg0.getSource() == btnMin){
					advancedCalculator.myABS(firstNumber);
				}
				if (arg0.getSource() == btnMax){
					advancedCalculator.myABS(firstNumber);
				}
				if (arg0.getSource() == btnRound){
					advancedCalculator.myABS(firstNumber);
				}
				if (arg0.getSource() == btnFloor){
					advancedCalculator.myABS(firstNumber);
				}
				
				
				
				
				if (arg0.getSource() == btnDot) {
					String EnterNumber = textField.getText()+ btnDot.getText();
					textField.setText(EnterNumber);
				}
				if (arg0.getSource() == btnC){
					
					textField.setText(null);	
				}	
				if (arg0.getSource() == btnProcent) {
					/*firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "%";*/
				}	
				if (arg0.getSource() == btnPlusMinus) {
					/*double ops = Double.parseDouble(textField.getText());
					ops = ops*(-1);
					textField.setText(String.valueOf(ops));*/	
				}	
				
				if (arg0.getSource() == btnResult) {
					
				}
	
			}catch	(NumberFormatException error){
				textField.setText("Please only use numbers in the calculator");	
			
			
				
				}
				
}
}	
