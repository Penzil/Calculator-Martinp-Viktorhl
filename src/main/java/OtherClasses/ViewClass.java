/**
 * auther: Martin Palman
 * auther: Viktor Hamnholm Lofgren
 * version: 1.0
 */
package OtherClasses;

/**
 * here i import
 */
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViewClass implements ActionListener {
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
	/**
	 * 
	 * Getters och Setters
	 */
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
	/**
	 *here we give names to the buttons
	 */
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
		Calculator.getContentPane().setBackground(new Color(95, 158, 160));

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
/**
 * here we dicide where all the buttons are in the Calculator window
 */
		lblFirstNumber.setBounds(10, 30, 96, 14);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		lblResult.setBounds(10, 86, 223, 14);

		btnAdd.setBounds(10, 139, 47, 23);
		btnSubtract.setBounds(67, 139, 48, 23);
		btnMultiply.setBounds(125, 139, 47, 23);
		btnDivide.setBounds(182, 139, 37, 23);

		btnAbs.setBounds(10, 175, 66, 23);
		btnPi.setBounds(88, 175, 47, 23);
		btnMin.setBounds(147, 175, 61, 23);
		btnMax.setBounds(182, 211, 61, 23);
		btnRound.setBounds(95, 211, 77, 23);
		btnFloor.setBounds(10, 211, 77, 23);
		Calculator.setVisible(true);
	}

	/**
	 * here we make the buttons visible
	 * 
	 *
	 */
	public void addComponentsToFrame() {
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
/**
 * here i make so my buttons can be touchable
 */
	public void addActionListeners() {
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnAbs.addActionListener(this);
		btnPi.addActionListener(this);
		btnMin.addActionListener(this);
		btnMax.addActionListener(this);
		btnRound.addActionListener(this);
		btnFloor.addActionListener(this);

	}

	/**
	 *
	 *here i connect my methods with buttons
	 **/
	public double firstValue() {
		double firstNumber = 0.0;
		firstNumber = Double.valueOf(txfFirstNumber.getText());
		return firstNumber;
	}

	public double secondValue() {
		double secondNumber = 0.0;
		secondNumber = Double.valueOf(txfSecondNumber.getText());
		return secondNumber;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			double result = basicCalculator.add(firstValue(), secondValue());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnSubtract) {
			double result = basicCalculator.subtract(firstValue(), secondValue());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnMultiply) {
			double result = basicCalculator.multiply(firstValue(), secondValue());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnDivide) {
			double result = basicCalculator.divide(firstValue(), secondValue());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnAbs) {
			double result = advancedCalculator.myABS(firstValue());
			lblResult.setText("Result: " + result);
		}
		
		if (e.getSource() == btnPi) {
			double result = advancedCalculator.myPI();
			lblResult.setText("Result: " + result);
		}
		
		if (e.getSource() == btnMin) {
			double result = advancedCalculator.myMIN(firstValue(), secondValue());
			lblResult.setText("Result: " + result);
		}
		
		if (e.getSource() == btnMax) {
			double result = advancedCalculator.myMAX(firstValue(), secondValue());
			lblResult.setText("Result: " + result);
		}
		
		if (e.getSource() == btnRound) {
			double result = advancedCalculator.myROUND(firstValue());
			lblResult.setText("Result: " + result);
		}
		
		if (e.getSource() == btnFloor) {
			double result = advancedCalculator.myFLOOR(firstValue());
			lblResult.setText("Result: " + result);
		}
}
}