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
	double NegNumber1 = 0.0;
	double NegNumber2 = 0.0;

	@Test
	public void testMyAbs() {

		for (double d = 0; d < 60; d++) {

			Number1 = random.nextDouble() * 20;
			log.info("testting testMyAbsPos: " + Number1 + " ");
			NegNumber1 =random.nextDouble() * -20;
			log.info("testting testMyAbsNeg: " + NegNumber1 + " ");
		

			assertEquals(ac.myABS(Number1), Math.abs(Number1), 0);
			assertEquals(ac.myABS(0), Math.abs(0), 0);
			assertEquals(ac.myABS(NegNumber1), Math.abs(NegNumber1), 0);
		
		}

	}

	@Test
	public void testMyPI() {
		assertEquals(3.14159, ac.myPI(), 0.00001);
	}

	@Test
	public void testMyMIN() {
	
		for (double d = 0; d < 60; d++) {

			Number1 = random.nextDouble() * 20;
			Number2 = random.nextDouble() * 20;
			log.info("testting testMyMinPos: " + Number1 + " " + Number2);

			NegNumber1 =random.nextDouble() * -20;
			NegNumber2 =random.nextDouble() * -20;
			log.info("testting testMyMinNeg: " + NegNumber1 + " " + NegNumber2);

			
			assertEquals((ac.myMIN(Number1, Number2)), Math.min(Number1, Number2), 0);
			assertEquals((ac.myMIN(0, 0)), Math.min(0, 0), 0);
			assertEquals((ac.myMIN(NegNumber1, NegNumber2)), Math.min(NegNumber1, NegNumber2), 0);

		}

	}

	@Test
	public void testMyMAX() {

		for (double d = 0; d < 60; d++) {

			Number1 = random.nextDouble() * 20;
			Number2 = random.nextDouble() * 20;
			log.info("testting testMyMaxPos: " + Number1 + " " + Number2);
			
			NegNumber1 =random.nextDouble() * -20;
			NegNumber2 =random.nextDouble() * -20;
			log.info("testting testMyMaxNeg: " + NegNumber1 + " " + NegNumber2);
			
			assertEquals(ac.myMAX(Number1, Number2), Math.max(Number1, Number2), 0);
			assertEquals(ac.myMAX(0, 0), Math.max(0, 0), 0);
			assertEquals(ac.myMAX(NegNumber1, NegNumber2), Math.max(NegNumber1, NegNumber2), 0);

		}
	}

	@Test
	public void testMyRound() {
	
		for (double d = 0; d < 60; d++) {

			Number1 = random.nextDouble() * 20;
			log.info("testting testMyRoundPos: " + Number1 + " ");

			NegNumber1 =random.nextDouble() * -20;
			log.info("testting testMyRoundNeg: " + NegNumber1 + " ");
			
			assertEquals(ac.myROUND(Number1), Math.round(Number1), 0);
			assertEquals(ac.myROUND(0), Math.round(0), 0);
			assertEquals(ac.myROUND(NegNumber1), Math.round(NegNumber1), 0);
		}
	}

	@Test
	public void testMyFloor() {

		for (double d = 0; d < 60; d++) {

			Number1 = random.nextDouble() * 20;
			log.info("testting testMyFloorPos: " + Number1 + " ");

			NegNumber1 =random.nextDouble() * -20;
			log.info("testting testMyFloorNeg: " + NegNumber1 + " ");
			
			assertEquals(ac.myFLOOR(Number1), Math.floor(Number1), 0);
			assertEquals(ac.myFLOOR(0), Math.floor(0), 0);
			assertEquals(ac.myFLOOR(NegNumber1), Math.floor(NegNumber1), 0);
		}
	}

}
