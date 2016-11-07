/**
 * auther: Martin Palman
 * auther: Viktor Hamnholm Lofgren
 * version: 1.0
 */
package OtherClasses;
/**
 * Har importerar vi 
 */
import Interface.*;
public class AdvancedCalculator implements InterfaceAdvanced{
/**
 * Har gor jag sa att min far funktionen min (att ta ut de minsta vardet) och att pi far fram pi vartet m.m 
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

