package exercise_04;

public class FoodProduct {
	private double weight;

	protected FoodProduct(double weight) {
		this.weight = weight;
	}

	private void setWeight(double weight) {
		this.weight = weight;
	}

	public double calculateCalories() {
		return this.weight * 2;
	}
}
