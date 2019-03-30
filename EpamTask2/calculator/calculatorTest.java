package epamtask;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	public void TestingCalculator() {
		int output=Calculator.AddTwoNumbwers(2,3);
		assertEquals(5,output);
		output=Calculator.MultiplyTwoNumbers(5, 6);
		assertEquals(30,output);
		output=Calculator.DivisionOfTwoNumbers(12, 2);
		assertEquals(6,output);
		
		
	}

}