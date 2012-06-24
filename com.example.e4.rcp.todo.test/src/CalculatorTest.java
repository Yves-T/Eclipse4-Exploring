import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void multiplyTest() {
		Calculator calculator = new Calculator();
		assertEquals(new Integer(10), calculator.multiply(5, 2));
	}
}
