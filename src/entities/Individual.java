package entities;

public class Individual extends TaxPayer{

	private Float healthExpenditures;
	
	public Individual(String name, Float anualIncome, Float healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Float getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Float healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Float tax() {
		if(getAnualIncome() < 20000.0) {
			return (float) (getAnualIncome() * 0.15 - healthExpenditures * 0.5);
		}
		else {
			return (float) (getAnualIncome() * 0.25 - healthExpenditures * 0.5);
		}
	}
	
	
}
