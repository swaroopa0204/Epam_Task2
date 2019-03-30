import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ConstructionCost.Cost;

class Testing {

	@Test
	void test()
	{
		Cost cs=new Cost();
		double output=cs.CostOfHoseConstruction("Srandard",5,false);
		assertEquals(12500,output);
		
		
	}

}
