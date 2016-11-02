package MainViktor;

import OtherClasses.*;

public class MainViktor {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.add(10.0, 5.0));
		System.out.println(bc.subtract(10.0, 5.0));
		System.out.println(bc.multiply(10.0, 5.0));
		System.out.println(bc.divide(10.0, 5.0));
		System.out.println(bc.divide(10.0, 0.0));
	}

}
