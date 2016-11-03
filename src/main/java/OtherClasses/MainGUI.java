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
public class MainGUI {

	
	
	
	private JTextField textField;
	private AdvancedCalculator advancedCalculator = new AdvancedCalculator();
	private BasicCalculator basicCalculator = new BasicCalculator();
	Scanner scanner = new Scanner(System.in);
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
	JButton btnDott = new JButton(".");
	JButton btnAbs = new JButton("ABS");
	JButton btnPi = new JButton("PI");
	JButton btnMin = new JButton("MIN");
	JButton btnMax = new JButton("MAX");
	JButton btnRound = new JButton("ROUND");
	JButton btnFloor = new JButton("FLOOR");
	
	
	ActionListener actionListener = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			buttonPressed(e);
		}
	};



	public MainGUI() {
		initialize();
		addComponentsToFrame();
		addActionListerners();
	}
	
	private void initialize() {
		Calculator = new JFrame();
		Calculator.setBackground(new Color(255, 255, 204));
		Calculator.getContentPane().setBackground(new Color(72, 209, 204));

		Calculator.setTitle("Calculator");
		Calculator.setBounds(100, 100, 485, 300);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculator.getContentPane().setLayout(null);
		
		number0.setBounds(239, 205, 90, 25);
		number1.setBounds(239, 167, 39, 25);
		number2.setBounds(290, 167, 39, 25);
		number3.setBounds(341, 167, 39, 25);
		number4.setBounds(239, 129, 39, 25);
		number5.setBounds(290, 129, 39, 25);
		number5.setBounds(290, 129, 39, 25);
		number6.setBounds(341, 129, 39, 25);
		number7.setBounds(239, 89, 39, 25);
		number8.setBounds(290, 89, 39, 25);
		number9.setBounds(341, 91, 39, 25);
		btnAdd.setBounds(392, 91, 50, 25);
		btnSub.setBounds(392, 129, 50, 25);
		btnMulty.setBounds(392, 167, 50, 25);
		btnDiv.setBounds(392, 205, 50, 25);
		btnDott.setBounds(341, 205, 39, 25);
		btnAbs.setBounds(12, 89, 97, 25);
		btnPi.setBounds(121, 89, 97, 25);
		btnMin.setBounds(12, 129, 97, 25);
		btnMax.setBounds(121, 129, 97, 25);
		btnRound.setBounds(12, 167, 97, 25);
		btnFloor.setBounds(121, 167, 97, 25);
		
		textField = new JTextField();
		textField.setBounds(12, 33, 443, 43);
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
			Calculator.getContentPane().add(btnDott);
			Calculator.getContentPane().add(btnAbs);
			Calculator.getContentPane().add(btnPi);
			Calculator.getContentPane().add(btnMin);
			Calculator.getContentPane().add(btnMax);
			Calculator.getContentPane().add(btnRound);
			Calculator.getContentPane().add(btnFloor);
			
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
				btnDott.addActionListener(actionListener);
}
		

}