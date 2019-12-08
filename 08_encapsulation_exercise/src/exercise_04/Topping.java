package exercise_04;

public class Topping extends FoodProduct {
	private ToppingType toppingType;

	protected Topping(String toppingType, double weight) {
		super(weight);
		this.setToppingType(toppingType);
		Validator.validateToppingWeight(weight, toppingType);
	}

	private void setToppingType(String toppingType) {
		try {
			this.toppingType = ToppingType.valueOf(toppingType.toUpperCase());
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
		}

	}
	
	@Override
	public double calculateCalories() {
		double calories = super.calculateCalories();

		calories *= this.toppingType.getModifier();

		return calories;
	}

}
