package OtherClasses;
import static java.lang.Math.*;
import Interface.*;
public class AdvancedCalculator implements InterfaceAdvanced{
	
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

