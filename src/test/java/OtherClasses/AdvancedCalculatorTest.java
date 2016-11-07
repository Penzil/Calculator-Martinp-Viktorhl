package OtherClasses;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator ac = new AdvancedCalculator();
	private final static Logger log = Logger.getLogger(BasicCalculatorTest.class.getName());
	Random random = new Random();
	double Number1 = 0.0;
	double Number2 = 0.0;
	
	@Test
	public void testMyAbs() {
		//assertEquals(10.0, ac.myABS(-10.0),0);
		//assertEquals(10.0, ac.myABS(+10.0),0);
		for (double d = 0; d < 5; d++) {

			Number1 = random.nextDouble() * 10 - 5;
			//Number2 = random.nextDouble() * 10 - 5;

			log.info("testting testMyAbs: " + Number1 + " " );
			assertEquals(Number1, ac.myABS(-Number1),0);
			//assertEquals((ac.MyABS(Number1)), Math.abs(Number2), 0);
		}
		
	}
	@Test
	public void testMyPI() {
		assertEquals(3.14159, ac.myPI(),0.00001);
	}
	@Test
	public void testMyMIN() {
		//assertEquals(10.0, ac.myMIN(10.0, 20.0),0);
		for (double d = 0; d < 5; d++) {

			Number1 = random.nextDouble() * 10 - 5;
			Number2 = random.nextDouble() * 10 - 5;

			log.info("testting testMyMin: " + Number1 + " " + Number2);
			assertEquals(10.0, ac.myMIN(10.0, 20.0),0);
		}
		
	}
	@Test
	public void testMyMAX() {
		//assertEquals(20.0, ac.myMAX(10.0, 20.0),0);
		
		for (double d = 0; d < 5; d++) {

			Number1 = random.nextDouble() * 10 - 5;
			Number2 = random.nextDouble() * 10 - 5;

			log.info("testting testMyMax: " + Number1 + " " + Number2);
			assertEquals(20.0, ac.myMAX(10.0, 20.0),0);
		}
	}
	@Test
	public void testMyRound() {
		assertEquals(3.0, ac.myROUND(3.4),0);
		assertEquals(4.0, ac.myROUND(3.5),0);
	}
	@Test
	public void testMyFloor() {
		assertEquals(3.0, ac.myFLOOR(3.91),0);
		
	}

}
