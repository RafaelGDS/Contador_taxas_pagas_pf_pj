package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
	public Company(String name, Float anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Float tax() {
		if(numberOfEmployees > 10) {
			return (float) (getAnualIncome() * 0.14);
		}
		else {
			return (float) (getAnualIncome() * 0.16);
		}
	}
}
