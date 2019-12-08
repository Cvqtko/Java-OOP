package exercise_03;

public class Product {
	private String name;
	private double cost;

	public Product(String name, double cost) {
		this.setName(name);
		this.setCost(cost);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		Validator.validateNonEmptyString(name);
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	private void setCost(double cost) {
		Validator.validateMoneyAmount(cost);
		this.cost = cost;
	}

}
