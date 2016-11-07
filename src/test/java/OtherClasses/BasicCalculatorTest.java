package OtherClasses;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import junit.framework.TestCase;

public class BasicCalculatorTest extends TestCase {
	BasicCalculator bc = new BasicCalculator();
	private final static Logger log = Logger.getLogger(BasicCalculatorTest.class.getName());
	Random random = new Random();
	double Number1 = 0.0;
	double Number2 = 0.0;


	@Test
	public void testAdd() {
		for (double d = 0; d < 5; d++) {

			Number1 = random.nextDouble() * 10 - 5;
			Number2 = random.nextDouble() * 10 - 5;

			log.info("testting testAdd: " + Number1 + " " + Number2);
			assertEquals(Number1 + Number2, bc.add(Number1, Number2));
		}
		log.info("testting testAdd with zero: ");
		assertEquals(0.0, bc.add(0.0, 0.0));
	}

	@Test
	public void testSubtract() {
		for (double d = 0; d < 5; d++) {
			Number1 = random.nextDouble() * 10 - 5;
			Number2 = random.nextDouble() * 10 - 5;

			log.info("testting testSubtract: " + Number1 + " " + Number2);
			assertEquals(Number1 - Number2, bc.subtract(Number1, Number2));

		}
		log.info("testting testSubtract with zero: ");
		assertEquals(0.0, bc.subtract(0.0, 0.0));
	}

	@Test
	public void testMultiply() {

		for (double d = 0; d < 5; d++) {

			Number1 = random.nextDouble() * 10 - 5;
			Number2 = random.nextDouble() * 10 - 5;

			log.info("testting testMultiply: " + Number1 + " " + Number2);
			assertEquals(Number1 * Number2, bc.multiply(Number1, Number2));
		}
		log.info("testting testSubtract with zero: ");
		assertEquals(0.0, bc.multiply(6.0, 0.0));
	}

	@Test
	public void testDivide() {

		for (double d = 0; d < 5; d++) {

			Number1 = random.nextDouble() * 10 - 5;
			Number2 = random.nextDouble() * 10 - 5;

			log.info("testting testDivide: " + Number1 + " " + Number2);
			assertEquals(Number1 / Number2, bc.divide(Number1, Number2));
		}
		log.info("testting testDivide with zero: ");
		assertEquals(-999999.9999, bc.divide(6.0, 0.0));
		
	}

}
