package entities;

public abstract class TaxPayer {

	private String name;
	private Float anualIncome;
	
	public TaxPayer(String name, Float anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Float anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Float tax();
}
