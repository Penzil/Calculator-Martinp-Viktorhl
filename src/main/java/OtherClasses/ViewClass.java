package OtherClasses;


import java.awt.EventQueue;
import OtherClasses.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViewClass implements ActionListener{
	private JFrame Calculator;
	private JTextField txfFirstNumber;
	private JTextField txfSecondNumber;
	private BasicCalculator basicCalculator = new BasicCalculator();
	private AdvancedCalculator advancedCalculator = new AdvancedCalculator();
	private JLabel lblResult = new JLabel("Result:");
	
	private JLabel lblFirstNumber = new JLabel("first number");
	private JLabel lblSecondNumber = new JLabel("second number:");
	
	private double firstNumber = 0.0;
	private double secondNumber = 0.0;
	
	
	
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



	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private JButton btnAbs = new JButton("ABS");
	private JButton btnPi = new JButton("PI");
	private JButton btnMin = new JButton("MIN");
	private JButton btnMax = new JButton("MAX");
	private JButton btnRound = new JButton("ROUND");
	private JButton btnFloor = new JButton("FLOOR");

	
	/**
	 * Create the application.
	 */
	public ViewClass() {
		createAndShowGUI();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void createAndShowGUI() {
		Calculator = new JFrame();
		Calculator.setBackground(new Color(255, 255, 204));
		Calculator.getContentPane().setBackground(new Color(72, 209, 204));

		Calculator.setTitle("Calculator");
		Calculator.setBounds(100, 100, 306, 294);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculator.getContentPane().setLayout(null);
		
		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 108, 20);
		Calculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);
		
		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 108, 20);
		Calculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);	
		
		lblFirstNumber.setBounds(10, 30, 96, 14);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		lblResult.setBounds(10, 86, 223, 14);
		

		btnAdd.setBounds(10, 139, 47, 23);
		btnSubtract.setBounds(67, 139, 48, 23);	
		btnMultiply.setBounds(125, 139, 47, 23);	
		btnDivide.setBounds(182, 139, 37, 23);	
		
		btnAbs.setBounds(10, 175, 55, 23);
		btnPi.setBounds(77, 175, 47, 23);
		btnMin.setBounds(135, 175, 61, 23);
		btnMax.setBounds(182, 211, 61, 23);
		btnRound.setBounds(95, 211, 77, 23);
		btnFloor.setBounds(10, 211, 77, 23);
		Calculator.setVisible(true);
	}
	
	/**
	 * Addind components to frame.
	 * @param none
	 * @return none
	 */
	public void addComponentsToFrame(){
		Calculator.getContentPane().add(lblFirstNumber);
		Calculator.getContentPane().add(lblSecondNumber);
		Calculator.getContentPane().add(lblResult);
		Calculator.getContentPane().add(btnAdd);
		Calculator.getContentPane().add(btnSubtract);
		Calculator.getContentPane().add(btnMultiply);
		Calculator.getContentPane().add(btnDivide);
		Calculator.getContentPane().add(btnAbs);
		Calculator.getContentPane().add(btnPi);
		Calculator.getContentPane().add(btnMin);
		Calculator.getContentPane().add(btnMax);
		Calculator.getContentPane().add(btnRound);
		Calculator.getContentPane().add(btnFloor);
	}
		
	
	public void addActionListeners(){
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
	}

	
	/**
	 *
	 * get value from text field
	 * 
	 * @return firstNUmber - Number that is written in the textfield
	 **/
	public double firstValue(){		
		double firstNumber = 0.0;						
		firstNumber = Double.valueOf(txfFirstNumber.getText());		
		return firstNumber;		
	}
	
	public double secondValue(){		
		double secondNumber = 0.0;						
		secondNumber = Double.valueOf(txfSecondNumber.getText());		
		return secondNumber;		
	}	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd){
			double result = basicCalculator.add(firstValue(), secondValue());
			lblResult.setText("Result: "+result);
		}		
		
		if (e.getSource() == btnSubtract){
			double result = basicCalculator.subtract(firstValue(), secondValue());
			lblResult.setText("Result: "+result);
		}
		
		if (e.getSource() == btnMultiply){
			double result = basicCalculator.multiply(firstValue(), secondValue());
			lblResult.setText("Result: "+result);
		}
		
		if (e.getSource() == btnDivide){
			double result = basicCalculator.divide(firstValue(), secondValue());
			lblResult.setText("Result: "+result);		
		}	

		if (e.getSource() == btnAbs){

			setFirstNumber(Double.parseDouble(txfFirstNumber.getText()));

			lblResult.setText(Double.toString((advancedCalculator.myABS(getFirstNumber()))));

				if(Double.toString(getSecondNumber()) != ""){

					txfSecondNumber.setText("Only first input is used in Sqrt operation");

		}
		if (e.getSource() == btnMin){

			setFirstNumber(Double.parseDouble(txfFirstNumber.getText()));

			lblResult.setText(Double.toString((advancedCalculator.myMIN(getFirstNumber(), getSecondNumber()))));

				if(Double.toString(getSecondNumber()) != ""){

					txfSecondNumber.setText("Only first input is used in Sqrt operation");

				}

	}
	}	
	}	
}
