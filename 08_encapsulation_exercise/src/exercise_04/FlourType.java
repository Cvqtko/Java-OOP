package exercise_04;

public enum FlourType {

	WHITE(1.5), WHOLEGRAIN(1.0);

	private double modifier;

	private FlourType(double modifier) {
		this.modifier = modifier;
	}

	public double getModifier() {
		return this.modifier;
	}
}
