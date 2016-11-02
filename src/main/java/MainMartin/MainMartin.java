package MainMartin;
import OtherClasses.*;

public class MainMartin {

	public static void main(String[] args) {
		
		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		System.out.println("ABS: "+advancedCalculator.myABS(-200));
		System.out.println("PI: "+advancedCalculator.myPI());
		System.out.println("MIN: "+advancedCalculator.myMIN(20,10));
		System.out.println("MAX: "+advancedCalculator.myMAX(88,44));
		System.out.println("ROUND: "+advancedCalculator.myROUND(94.5));
		System.out.println("FLOOR: "+advancedCalculator.myFLOOR(14.99));
	}

}
