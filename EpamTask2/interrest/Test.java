import static org.junit.jupiter.api.Assertions.*;

import Interest.InterestCalculate;

class Test {

	@org.junit.jupiter.api.Test
	void test()
	{
		InterestCalculate Ic=new InterestCalculate();
		double output=Ic.simpleInterest(100,50, 5);
		assertEquals(250,output);
	}

}
