/**
 * auther: Martin Palman
 * auther: Viktor Hamnholm Lofgren
 * version: 1.0
 */
package OtherClasses;
/**
 * Here i import 
 */
import Interface.*;
public class AdvancedCalculator implements InterfaceAdvanced{
/**
 * Here is when my attribute myABS gets the funktion of abs and myPI gets the funktion of pi m.m 
 */
	public double myABS(double value){
		return Math.abs(value);
	}
	public double myPI(){
		return Math.PI;
	}
	public double myMIN(double value1, double value2){
		return Math.min(value1,value2);
	}
	public double myMAX(double value1, double value2){
		return Math.max(value1, value2);
	}
	public double myROUND(double value){
		return Math.round(value);
	}
	public double myFLOOR(double value){
		return Math.floor(value);
	}
	
	
	
		
	}

