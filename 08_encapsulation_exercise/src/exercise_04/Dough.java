package exercise_04;

public class Dough extends FoodProduct {
	private FlourType flourType;
	private BakingTechnique bakingTechnique;

	protected Dough(String flourType, String bakingTechnique, double weight) {
		super(weight);
		Validator.validateDoughWeight(weight);
		this.setDough(flourType);
		this.bakingTechnique = BakingTechnique.valueOf(bakingTechnique.toUpperCase());
	}

	private void setDough(String flourType) {
		try {
			this.flourType = FlourType.valueOf(flourType.toUpperCase());
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException("Invalid type of dough.");
		}
	}

	@Override
	public double calculateCalories() {
		double calories = super.calculateCalories();

		calories *= this.flourType.getModifier();
		calories *= this.bakingTechnique.getModifier();

		return calories;
	}

}
