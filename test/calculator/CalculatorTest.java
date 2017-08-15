package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	StringCalculator cal;

	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void split() throws Exception {
		int result = cal.calculator("1,2:3,4");
		assertEquals(10, result);
	}
	@Test
	public void testName() throws Exception {
		int result = cal.calculator("//!\n1:2!3");
		assertEquals(6,result);
	}
	
	@Test
	public void stringCal() throws Exception {
		int result = cal.calculator("1 + 2 + 3 - 2 - 3 * 4 / 2");
		assertEquals(2, result);
	}
	
	@Test
	public void add() {
		int result = cal.calculator("3 + 4");
		assertEquals(7, result);
	}

	@Test
	public void minus() throws Exception {
		int result = cal.calculator("4 - 3");
		assertEquals(1, result);
	}

	@Test
	public void multiple() throws Exception {
		int result = cal.calculator("2 * 3");
		assertEquals(6, result);
	}

	@Test
	public void division() throws Exception {
		int result = cal.calculator("6 / 2");
		assertEquals(3, result);
	}
}