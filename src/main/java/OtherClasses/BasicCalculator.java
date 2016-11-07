/**
 * auther: Martin Palman
 * auther: Viktor Hamnholm Lofgren
 * version: 1.0
 */
package OtherClasses;

/**
 * here i import
 */
import javax.swing.JOptionPane;

import Interface.InterfaceBasic;

/**
 * Here is when my attribute add gets the funktion of add and plus two values
 * together and subtract minus two values m.m
 */
public class BasicCalculator implements InterfaceBasic {
	public double add(double Number1, double Number2) {
		return Number1 + Number2;
	}

	public double subtract(double Number1, double Number2) {
		return Number1 - Number2;
	}

	public double multiply(double Number1, double Number2) {
		return Number1 * Number2;
	}

	public double divide(double Number1, double Number2) {

		Double result = Number1 / Number2;
		if (Double.isInfinite(result)) {
			JOptionPane.showMessageDialog(null, "Divided by zero", "Error", JOptionPane.ERROR_MESSAGE);
			return -999999.9999;
		}
		return result;
	}

}
