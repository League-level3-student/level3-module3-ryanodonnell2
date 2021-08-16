package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		System.out.println(population*growthRate);
		return population*(growthRate*1.5);
		//return 3896480;
	}
	
}
