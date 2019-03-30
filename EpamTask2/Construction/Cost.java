package ConstructionCost;

public class Cost 
{
	public  double CostOfHoseConstruction(String MaterialStandard,double HouseArea,boolean Automated)
	{
		if(MaterialStandard.equals("Standard") && Automated==false)
			return 1200*HouseArea;
		else if(MaterialStandard.equals("AboveStandard") && Automated==false)
			return 1500*HouseArea;
		else if(MaterialStandard.equals("HighStandard") && Automated==false)
			return 1800*HouseArea;
		else 
			return 2500*HouseArea;
		
	}
		
	}

